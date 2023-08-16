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

    
    public String getAllFundings(String token) throws Exception {
		HttpHeaders headers = new HttpHeaders();

		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.setBearerAuth(token);

		ResponseEntity<String> result = new RestTemplate().exchange(fundingUrl, HttpMethod.GET, new HttpEntity<String>(headers), String.class);

		ObjectMapper objectMapper = new ObjectMapper();

		JsonNode jsonNode = objectMapper.readTree(result.getBody());

		return jsonNode.toString();
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
				String fundingStr = fundings.getAllFundings(authenticationKey);
				System.out.println("Fundings: " + fundingStr);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
