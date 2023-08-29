package com.lithodat.api.client.csvimporter;

import java.util.Arrays;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Fundings {

	private final String fundingUrl;

	public Fundings(String endpoint, String username, String password) {

		super();

		this.fundingUrl = endpoint + "/api/core/fundings";

	}

	public JsonNode getAllFundings(String token) throws Exception {
		HttpHeaders headers = new HttpHeaders();

		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.setBearerAuth(token);

		ResponseEntity<String> result = new RestTemplate().exchange(fundingUrl, HttpMethod.GET,
				new HttpEntity<String>(headers), String.class);

		ObjectMapper objectMapper = new ObjectMapper();

		JsonNode jsonNode = objectMapper.readTree(result.getBody());

		return jsonNode;
	}

	public void putAllFundings(String token, JsonNode fundings) throws Exception {
		HttpHeaders headers = new HttpHeaders();

		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.setBearerAuth(token);

		int sucessCount = 0;

		for (JsonNode funding : fundings) {
			// Convert the list of JsonNode to a single JSON string
			String jsonString = funding.toString();

			HttpEntity<String> entity = new HttpEntity<>(jsonString, headers);

			ResponseEntity<String> result = new RestTemplate().exchange(fundingUrl, HttpMethod.PUT, entity,
					String.class);

			// Read response code and body
			int responseCode = result.getStatusCodeValue();
			String responseBody = result.getBody();

			if (responseCode == 200) {
				sucessCount++;
			} else {
				System.out.println("Error: " + responseCode + " " + responseBody);
			}
		}

		System.out.println("Total number of fundings: " + fundings.size());
		System.out.println("Total number of fundings successfully updated: " + sucessCount);
	}

	public static void main(String[] args) {
		LithoAuth lithoAuth = new LithoAuth("https://testapp.lithodat.com", "kimberlyz", "Kimberly1234");
		String authenticationKey = null;
		try {
			authenticationKey = lithoAuth.authenticateAndGetJWT();
			System.out.println("Authentication Key: " + authenticationKey);
		} catch (Exception e) {
			e.printStackTrace();
		}
		if (authenticationKey != null) {
			try {
				Fundings fundings = new Fundings("https://testapp.lithodat.com", "kimberlyz", "Kimberly1234");
				JsonNode fundingsJsonNode = fundings.getAllFundings(authenticationKey);
				// Start processing funds
				fundingsJsonNode = FundingProcessor.processJsonFile(fundingsJsonNode);
				fundings.putAllFundings(authenticationKey, fundingsJsonNode);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
