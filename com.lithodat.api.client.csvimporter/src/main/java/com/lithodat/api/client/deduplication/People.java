package com.lithodat.api.client.deduplication;

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
import com.lithodat.api.client.LithoAuth;

public class People {
    private static final int PAGE_SIZE = 1000;
    private final String peopleUrl;

    public People(String endpoint, String username, String password) {

        super();

        this.peopleUrl = endpoint + "/api/core/people";

    }

    public JsonNode getAllPeople(String token) throws Exception {

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
                People people = new People("https://testapp.lithodat.com", "kimberlyz", "Kimberly1234");

                JsonNode peopleJsonNode = people.getAllPeople(authenticationKey);

                List<String> duplicateIds = people.getDuplicateIds(peopleJsonNode);

                System.out.println("Total duplicates: " + duplicateIds.size());
                System.out.println("Duplicate IDs: " + duplicateIds);

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}