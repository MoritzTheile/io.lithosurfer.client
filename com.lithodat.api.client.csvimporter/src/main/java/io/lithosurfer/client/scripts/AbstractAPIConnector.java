package io.lithosurfer.client.scripts;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
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

import io.lithosurfer.client.scripts.dtos.Identifyable;
import io.lithosurfer.client.util.StaticUtils;

public abstract class AbstractAPIConnector<T extends Identifyable> {
	private static final int PAGE_SIZE = 20;
	private final String entityUrl;
	private final String mergeUrl;

	public AbstractAPIConnector(String endpoint) {

		this.entityUrl = endpoint + getServicePath();
		this.mergeUrl = entityUrl + "/merge";

	}

	protected abstract String getServicePath();
	
	
	public List<T> getAll(String token) throws Exception {
		 return find(token, "");
	}
	public List<T> find(String token, String queryString) throws Exception {

		HttpHeaders headers = new HttpHeaders();

		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.setBearerAuth(token);

		int pageNumber = 0;

		List<T> entities = new ArrayList<>();

		List<T> page = null;

		while (page == null || page.size() == PAGE_SIZE) {

			System.out.println("calling " + entityUrl);

			String query = "?page=" + pageNumber + "&size=" + PAGE_SIZE +"&"+ queryString;
			System.out.println("query = "+ query);
			ResponseEntity<T[]> result = new RestTemplate().exchange(

					entityUrl + query, HttpMethod.GET, new HttpEntity<T[]>(headers), getServiceReturnClass());
			
			page = Arrays.asList(result.getBody());
			entities.addAll(page);
			pageNumber++;

		}

		return entities;

	}

	
	public void deleteById(String token, long id) throws Exception {
		HttpHeaders headers = new HttpHeaders();

		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.setBearerAuth(token);

		System.out.println("calling " + entityUrl);

		new RestTemplate().exchange(

				entityUrl + "/" + id, HttpMethod.DELETE, new HttpEntity<T[]>(headers), getServiceReturnClass());

	}

	public void findDuplicatesAndMerge(String authenticationKey) throws Exception, IOException {
		System.out.println("-------------------------------------\nstarting findDuplicatesAndMerge for " + getSimplifiedClassName() + " ...");

		Map<Long, List<Long>> duplicateSets = findDuplicates(authenticationKey);

		System.out.println(getSimplifiedClassName() + " count before merging: " + getAll(authenticationKey).size());
		mergeDuplicates(authenticationKey, duplicateSets);
		System.out.println(getSimplifiedClassName() + " count after merging: " + getAll(authenticationKey).size());

		System.out.println("... finished findDuplicatesAndMerge for " + getSimplifiedClassName() + " ...\n-------------------------------------");
	}

	public void findDuplicatesAndReport(String authenticationKey) throws Exception, IOException {
		System.out.println("-------------------------------------\nstarting findDuplicatesAndReport for " + getSimplifiedClassName() + " ...");

		Map<Long, List<Long>> duplicateSets = findDuplicates(authenticationKey);

		int totalSets = duplicateSets.values().size();
		int biggestSize = duplicateSets.values().stream().mapToInt(List::size).max().orElse(0);
		int totalIds = duplicateSets.values().stream().mapToInt(List::size).sum();

		System.out.println("total_sets: " + totalSets);
		System.out.println("total_ids: " + totalIds);
		System.out.println("biggest_size: " + biggestSize);

		String filename = "duplicateSets." + getSimplifiedClassName() + ".json";
		StaticUtils.writeObjectToFile(duplicateSets, filename);
		System.out.println("For all duplicates see file " + filename);

		System.out.println("... finished findDuplicatesAndReport for " + getSimplifiedClassName() + " ...\n-------------------------------------");
	}

	private String getSimplifiedClassName() {
		return getServiceReturnClass().getSimpleName().replaceAll("[\\[\\]]", "");
	}

	private Map<Long, List<Long>> findDuplicates(String authenticationKey) throws Exception {
		List<T> allLiterature = getAll(authenticationKey);

		Map<String, List<T>> findSurvivorWithDuplicates = findSurvivorWithDuplicates(allLiterature);

		Map<Long, List<Long>> duplicateSets = translateToIdMap(findSurvivorWithDuplicates);
		return duplicateSets;
	}

	private void mergeDuplicates(String token, Map<Long, List<Long>> survivorWithDuplicates) {

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

				if (!response.getStatusCode().is2xxSuccessful()) {
					System.out.println("Failed to merge for survivor ID: " + survivorId);
					System.out.println("Response: " + response.getBody());
				}

			} catch (Exception e) {
				e.printStackTrace();
			}

		}

	}

	private Map<String, List<T>> findSurvivorWithDuplicates(List<T> allEntities) {

		Map<String, List<T>> fingerprint2duplicates = new HashMap<>();

		for (T entityDTO : allEntities) {

			String fingerprint = getFingerprint(entityDTO);

			List<T> duplicateList = fingerprint2duplicates.get(fingerprint);

			if (duplicateList == null) {
				duplicateList = new ArrayList<>();
				fingerprint2duplicates.put(fingerprint, duplicateList);
			}

			duplicateList.add(entityDTO);
		}

		return fingerprint2duplicates;

	}

	private Map<Long, List<Long>> translateToIdMap(Map<String, List<T>> fingerprint2duplicates) {

		Map<Long, List<Long>> survivor2duplicates = new HashMap<>();

		for (String key : fingerprint2duplicates.keySet()) {

			List<T> entities = fingerprint2duplicates.get(key);

			if (entities.size() >= 2) {

				Long survivorId = entities.get(0).getId();
				entities.remove(0);
				survivor2duplicates.put(survivorId, entities.stream().map(e -> e.getId()).collect(Collectors.toList()));

			}
		}

		return survivor2duplicates;

	}

	protected abstract String getFingerprint(T entityDTO);

	protected abstract Class<T[]> getServiceReturnClass();
}