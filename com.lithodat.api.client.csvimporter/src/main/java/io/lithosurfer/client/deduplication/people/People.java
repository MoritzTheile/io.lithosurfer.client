package io.lithosurfer.client.deduplication.people;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;

public class People {
    private static final int PAGE_SIZE = 1000;

    public JsonNode getAllPeople(String token, String peopleUrl) throws Exception {

        HttpHeaders headers = new HttpHeaders();

        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.setBearerAuth(token);

        ObjectMapper objectMapper = new ObjectMapper();

        int page = 0;

        ArrayNode allNodes = objectMapper.createArrayNode();

        JsonNode jsonNode = null;

        while (jsonNode == null || jsonNode.size() == PAGE_SIZE) {

            ResponseEntity<String> result = new RestTemplate().exchange(
                    peopleUrl + "?page=" + page + "&size=" + PAGE_SIZE, HttpMethod.GET,
                    new HttpEntity<String>(headers), String.class);

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

    public List<String> getDuplicateIds(JsonNode allPeople) {
        Map<String, List<JsonNode>> nameFirstNameMap = new HashMap<>();

        if (allPeople.isArray()) {
            for (JsonNode person : allPeople) {
                String name = person.get("name").asText();
                String firstName = person.get("firstName").asText();
                String key = name + "_" + firstName;

                if (!nameFirstNameMap.containsKey(key)) {
                    nameFirstNameMap.put(key, new ArrayList<>());
                }
                nameFirstNameMap.get(key).add(person);
            }
        }

        List<String> duplicateIds = new ArrayList<>();
        for (List<JsonNode> nodes : nameFirstNameMap.values()) {
            if (nodes.size() > 1) {
                for (JsonNode node : nodes) {
                    duplicateIds.add(node.get("id").asText());
                }
            }
        }
        return duplicateIds;
    }
}