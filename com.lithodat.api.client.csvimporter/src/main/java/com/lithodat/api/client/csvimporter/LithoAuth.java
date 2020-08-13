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

public class LithoAuth {

	private final String url;
	private final String username;
	private final String password;

	public LithoAuth(String endpoint, String username, String password) {

		super();

		// this class knows the endpoint to use
		this.url = endpoint + "/api/authenticate";
		this.username = username;
		this.password = password;

	}

	public String authenticateAndGetJWT() throws Exception {

		HttpHeaders headers = new HttpHeaders();

		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		headers.setContentType(MediaType.APPLICATION_JSON);

		HttpEntity<String> entity = new HttpEntity<String>(getUsernameAndPasswordJSON(username, password), headers);

		ResponseEntity<String> result = new RestTemplate().exchange(url, HttpMethod.POST, entity, String.class);

		ObjectMapper objectMapper = new ObjectMapper();

		JsonNode jsonNode = objectMapper.readTree(result.getBody());

		return jsonNode.get("id_token").asText();

	}

	private static String getUsernameAndPasswordJSON(String username, String password) {

		// constructing the JSON via straight forward string manipulation:
		return "{\"username\":\"" + username + "\",\"password\":\"" + password + "\",\"rememberMe\":false}";

	}

}
