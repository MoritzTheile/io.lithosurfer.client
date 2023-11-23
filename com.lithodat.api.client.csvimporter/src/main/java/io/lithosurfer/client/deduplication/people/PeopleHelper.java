package io.lithosurfer.client.deduplication.people;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import io.lithosurfer.client.LithoAuth;
import io.lithosurfer.client.deduplication.StaticUtils;

public class PeopleHelper {
	private static final int PAGE_SIZE = 1000;
	private final String entityUrl;
	private final String mergeUrl;

	public PeopleHelper(String endpoint) {

		this.entityUrl = endpoint + "/api/core/people";
		this.mergeUrl = entityUrl + "/merge";

	}

	public List<PersonDTO> getAllPeople(String token) throws Exception {

		HttpHeaders headers = new HttpHeaders();

		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.setBearerAuth(token);

		int pageNumber = 0;

		List<PersonDTO> entities = new ArrayList<>();

		List<PersonDTO> page = null;

		while (page == null || page.size() == PAGE_SIZE) {

			ResponseEntity<PersonDTO[]> result = new RestTemplate().exchange(

					entityUrl + "?page=" + pageNumber + "&size=" + PAGE_SIZE, HttpMethod.GET, new HttpEntity<PersonDTO[]>(headers), PersonDTO[].class);
			page = Arrays.asList(result.getBody());
			entities.addAll(page);
			pageNumber++;

		}

		return entities;

	}
	
	
	public void mergePeople(LithoAuth lithoAuth, String authenticationKey) throws Exception, IOException {

		PeopleHelper helper = new PeopleHelper(lithoAuth.endpoint);

		List<PersonDTO> allPeople = helper.getAllPeople(authenticationKey);

		Map<String, List<PersonDTO>> findSurvivorWithDuplicates = PeopleHelper.findSurvivorWithDuplicates(allPeople);

		Map<Long, List<Long>> duplicateSets = PeopleHelper.translateToIdMap(findSurvivorWithDuplicates);
		
		StaticUtils.writeObjectToFile(duplicateSets, "duplicateSets.json");

		{ // merging
						System.out.println("entity count before merging: " + getAllPeople(authenticationKey).size());
						mergeDuplicates(authenticationKey, duplicateSets);
						System.out.println("entity count after merging: " + getAllPeople(authenticationKey).size());
		}
	}

	private void mergeDuplicates(String token, Map<Long,List<Long>> survivorWithDuplicates) {
		
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.setBearerAuth(token);

		for (Long survivorId : survivorWithDuplicates.keySet()) {
			
			List<Long> toBeDeletedIds = survivorWithDuplicates.get(survivorId);

			Map<String, Object> requestBody = new HashMap<>();
				requestBody.put("survivorId", survivorId);
				requestBody.put("toBeDeletedIds", toBeDeletedIds);

				HttpEntity<Map<String, Object>> entity = new HttpEntity<>(requestBody, headers);

				try {
					
					ResponseEntity<String> response = new RestTemplate().postForEntity(mergeUrl, entity, String.class);

					if (!HttpStatus.OK.equals(response.getStatusCode())) {
					 	System.out.println("Failed to merge for survivor ID: " + survivorId);
					 	System.out.println("Response: " + response.getBody());
					 }
					
				} catch (Exception e) {
					 e.printStackTrace();
				}

		}

	}

	private static Map<String, List<PersonDTO>> findSurvivorWithDuplicates(List<PersonDTO> allPeople) {

		Map<String, List<PersonDTO>> fingerprint2duplicates = new HashMap<>();

		for (PersonDTO entityDTO : allPeople) {

			String fingerprint = getFingerprint(entityDTO);

			List<PersonDTO> duplicateList = fingerprint2duplicates.get(fingerprint);

			if (duplicateList == null) {
				duplicateList = new ArrayList<>();
				fingerprint2duplicates.put(fingerprint, duplicateList);
			}

			duplicateList.add(entityDTO);
		}

		return fingerprint2duplicates;

	}

	private static String getFingerprint(PersonDTO entityDTO) {

		return entityDTO.getTitle()+ "_" + entityDTO.getFirstName() + "_" + entityDTO.getName() + "_" + entityDTO.getOrcId();

	}

	private static Map<Long, List<Long>> translateToIdMap(Map<String, List<PersonDTO>> fingerprint2duplicates) {

		Map<Long, List<Long>> survivor2duplicates = new HashMap<>();

		for (String key : fingerprint2duplicates.keySet()) {

			List<PersonDTO> entities = fingerprint2duplicates.get(key);

			if (entities.size() >= 2) {

				Long survivorId = entities.get(0).getId();
				entities.remove(0);
				survivor2duplicates.put(survivorId, entities.stream().map(e -> e.getId()).collect(Collectors.toList()));

			}
		}

		return survivor2duplicates;

	}
}