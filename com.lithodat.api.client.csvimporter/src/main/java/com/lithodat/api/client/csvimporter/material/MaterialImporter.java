package com.lithodat.api.client.csvimporter.material;

import java.util.Arrays;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

public class MaterialImporter {

	private HttpHeaders httpHeaders;

	private ObjectMapper objectMapper;

	private String url;

	public MaterialImporter(String jwtToken, String endpoint) {

		super();

		httpHeaders = new HttpHeaders();
		httpHeaders.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		httpHeaders.setContentType(MediaType.APPLICATION_JSON);
		httpHeaders.set("Authorization", "Bearer " + jwtToken);

		objectMapper = new ObjectMapper();
		objectMapper.configure(SerializationFeature.INDENT_OUTPUT, true);

		this.url = endpoint + "/api/materials";
	}

	public void upload(MaterialDTO literatureDTO) throws Exception {

		HttpEntity<String> entity = new HttpEntity<String>(

				objectMapper.writeValueAsString(literatureDTO), httpHeaders

		);

		ResponseEntity<String> result = new RestTemplate().exchange(url, HttpMethod.POST, entity, String.class);

		if (result.getStatusCodeValue() < 200 || result.getStatusCodeValue() > 299) {
			System.out.println("Error posting entity: " + objectMapper.writeValueAsString(literatureDTO));
			System.out.println(result.getBody());
		} else {
			System.out.println("Uploaded entity: " + objectMapper.writeValueAsString(literatureDTO));
		}

	}

}
