package com.lithodat.api.client.csvimporter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.HttpServerErrorException.InternalServerError;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class Fundings {

	private static final int PAGE_SIZE = 1000;
	private final String fundingUrl;

	public Fundings(String endpoint, String username, String password) {

		super();

		this.fundingUrl = endpoint + "/api/core/fundings";

	}

	public static JsonNode merge(JsonNode mainNode, JsonNode updateNode) {

		Iterator<String> fieldNames = updateNode.fieldNames();
		while (fieldNames.hasNext()) {

			String fieldName = fieldNames.next();
			JsonNode jsonNode = mainNode.get(fieldName);
			// if field exists and is an embedded object
			if (jsonNode != null && jsonNode.isObject()) {
				merge(jsonNode, updateNode.get(fieldName));
			} else {
				if (mainNode instanceof ObjectNode) {
					// Overwrite field
					JsonNode value = updateNode.get(fieldName);
					((ObjectNode) mainNode).put(fieldName, value);
				}
			}

		}

		return mainNode;
	}

	public JsonNode getAllFundings(String token) throws Exception {

		HttpHeaders headers = new HttpHeaders();

		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.setBearerAuth(token);

		ObjectMapper objectMapper = new ObjectMapper();

		int page = 0;

		ArrayNode allNodes = objectMapper.createArrayNode();

		JsonNode jsonNode = null;

		while (jsonNode == null || jsonNode.size() == PAGE_SIZE) {

			ResponseEntity<String> result = new RestTemplate().exchange(fundingUrl + "?page=" + page + "&size=" + PAGE_SIZE, HttpMethod.GET, new HttpEntity<String>(headers), String.class);

			jsonNode = objectMapper.readTree(result.getBody());

			if (jsonNode.isArray()) {
				
				allNodes.addAll((ArrayNode) jsonNode);
				
			} else {

				throw new Exception("jsonNode is supposed to be an array");

			}
			
			page++;
			
		}
		
		return allNodes;
		
	}

	// System.out.println("page: " + page + ", allNodes: "+allNodes.size());
	// System.out.println(new
	// ObjectMapper().configure(SerializationFeature.INDENT_OUTPUT,
	// true).writeValueAsString(result));

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

			ResponseEntity<String> result = null;
			try {
				result = new RestTemplate().exchange(fundingUrl, HttpMethod.PUT, entity, String.class);
			} catch (InternalServerError e) {
				// If the funding already exists, update the name field
				String id = funding.get("id").toString();
				// Append <<id>> after the name field of the funding
				JsonNode jsonNodeName = funding.get("name");
				if (jsonNodeName != null) {
					String name = jsonNodeName.toString();
					name = name.substring(1, name.length() - 1) + "<<" + id + ">>";
					((com.fasterxml.jackson.databind.node.ObjectNode) funding).put("name", name);
					// post the funding again
					jsonString = funding.toString();
					entity = new HttpEntity<>(jsonString, headers);
					result = new RestTemplate().exchange(fundingUrl, HttpMethod.PUT, entity, String.class);
				}

			}

			// Read response code and body
			int responseCode = result.getStatusCodeValue();
			String responseBody = result.getBody();

			if (responseCode == 200) {
				sucessCount++;
			} else {
				System.out.println("Failed to update funding: " + funding.get("id").toString());
				System.out.println("Response code: " + responseCode);
				System.out.println("Response body: " + responseBody);
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
				// fundingsJsonNode = FundingProcessor.processJsonFile(fundingsJsonNode);
				fundings.putAllFundings(authenticationKey, fundingsJsonNode);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
