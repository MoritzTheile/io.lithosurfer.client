package io.lithosurfer.client.csvimporter.DepositModels;

import java.util.Arrays;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

public class DepositModelsImporter {
	  private HttpHeaders httpHeaders;
	    private ObjectMapper objectMapper;
	    private String url;

	    public DepositModelsImporter(String jwtToken, String endpoint,String URL) {
	        super();

	        httpHeaders = new HttpHeaders();
	        httpHeaders.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
	        httpHeaders.setContentType(MediaType.APPLICATION_JSON);
	        httpHeaders.set("Authorization", "Bearer " + jwtToken);

	        objectMapper = new ObjectMapper();
	        objectMapper.configure(SerializationFeature.INDENT_OUTPUT, true);

	        this.url = endpoint + URL;
	    }

	    public void upload(DepositModelsDTO depositModelsDTO) throws Exception {
	        // Check if a record with the same name exists
	        boolean exists = recordExists(depositModelsDTO.getName());
	        
	        // If the record exists, skip uploading
	        if (!exists) {
	            HttpEntity<String> entity = new HttpEntity<>(objectMapper.writeValueAsString(depositModelsDTO), httpHeaders);
	            ResponseEntity<String> result = new RestTemplate().exchange(url, HttpMethod.POST, entity, String.class);

	            if (result.getStatusCodeValue() < 200 || result.getStatusCodeValue() > 299) {
	                System.out.println("Error posting entity: " + objectMapper.writeValueAsString(depositModelsDTO));
	                System.out.println(result.getBody());
	            }
	        } else {
	            System.out.println("Record is already exists : " + depositModelsDTO.getName());
	        }
	    }

	    private boolean recordExists(String name) throws Exception {
	        String searchUrl = url + "?name.equals=" + name;

	        try {
	            ResponseEntity<DepositModelsDTO[]> response = new RestTemplate().exchange(
	                searchUrl,
	                HttpMethod.GET,
	                new HttpEntity<>(httpHeaders),
	                DepositModelsDTO[].class
	            );

	            DepositModelsDTO[] existingRecords = response.getBody();
	            if (existingRecords != null) {
	                for (DepositModelsDTO record : existingRecords) {
	                    if (record.getName().equals(name)) {
	                        return true; // Record exists
	                    }
	                }
	            }
	            return false; // Record does not exist
	        } catch (HttpClientErrorException e) {
	            // Handle specific error if needed
	            System.out.println("Error during record existence check: " + e.getMessage());
	            throw e;
	        }
	    }
	}
