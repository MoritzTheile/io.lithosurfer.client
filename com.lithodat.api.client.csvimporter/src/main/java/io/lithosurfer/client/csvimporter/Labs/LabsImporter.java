package io.lithosurfer.client.csvimporter.Labs;

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

public class LabsImporter {

    private HttpHeaders httpHeaders;
    private ObjectMapper objectMapper;
    private String url;

    public LabsImporter(String jwtToken, String endpoint) {
        super();

        httpHeaders = new HttpHeaders();
        httpHeaders.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        httpHeaders.setContentType(MediaType.APPLICATION_JSON);
        httpHeaders.set("Authorization", "Bearer " + jwtToken);

        objectMapper = new ObjectMapper();
        objectMapper.configure(SerializationFeature.INDENT_OUTPUT, true);

        this.url = endpoint + "/api/core/labs";
    }

    public void upload(LabDTO labDTO) throws Exception {
        // Check if a record with the same name exists and if it  `inLithodat` value
        boolean exists = recordExists(labDTO.getName());
        
        // If the record exists and has `inLithodat` set to 1, skip uploading
        if (!exists || (labDTO.getInLithodat() != null && labDTO.getInLithodat() != 1)) {
            HttpEntity<String> entity = new HttpEntity<>(objectMapper.writeValueAsString(labDTO), httpHeaders);
            ResponseEntity<String> result = new RestTemplate().exchange(url, HttpMethod.POST, entity, String.class);

            if (result.getStatusCodeValue() < 200 || result.getStatusCodeValue() > 299) {
                System.out.println("Error posting entity: " + objectMapper.writeValueAsString(labDTO));
                System.out.println(result.getBody());
            }
        } else {
            System.out.println("Record already exists  in Lithodat : " + labDTO.getName());
        }
    }

    private boolean recordExists(String name) throws Exception {
        String searchUrl = url + "?name.equals=" + name;

        try {
            ResponseEntity<LabDTO[]> response = new RestTemplate().exchange(
                searchUrl,
                HttpMethod.GET,
                new HttpEntity<>(httpHeaders),
                LabDTO[].class
            );

            LabDTO[] existingRecords = response.getBody();
            if (existingRecords != null) {
                for (LabDTO record : existingRecords) {
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
