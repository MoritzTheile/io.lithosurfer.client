package com.lithodat.api.client.csvimporter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.io.File;
import java.util.Iterator;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.HttpServerErrorException;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class Literature {
    private static final int PAGE_SIZE = 1000;
    private final String literatureUrl;
    private final String mergeUrl;

    public Literature(String endpoint, String username, String password) {

        super();

        this.literatureUrl = endpoint + "/api/core/literature";
        this.mergeUrl = endpoint + "/api/core/literature/merge";

    }

    public JsonNode getAllLiterature(String token) throws Exception {

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
                    literatureUrl + "?page=" + page + "&size=" + PAGE_SIZE, HttpMethod.GET,
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

    public void cleanNull(String token, JsonNode literatureJsonNode) throws Exception {
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.setBearerAuth(token);

        int successCount = 0;

        for (JsonNode node : literatureJsonNode) {
            if (node.get("litType").isNull() || node.get("litType") == null) {
                String id = node.get("id").asText();
                ObjectNode updatedNode = ((ObjectNode) node).put("litType", "UNKNOWN");

                String specificLiteratureUrl = literatureUrl + "?id.equals=" + id;

                HttpEntity<String> entity = new HttpEntity<>(updatedNode.toString(),
                        headers);
                ResponseEntity<String> response = null;
                try {
                    response = restTemplate.exchange(specificLiteratureUrl, HttpMethod.PUT,
                            entity, String.class);
                } catch (HttpClientErrorException | HttpServerErrorException e) {
                    System.out.println("Error for ID " + id + ": " + e.getMessage());
                    continue;
                }

                if (response.getStatusCodeValue() == 200) {
                    successCount++;
                } else {
                    System.out.println("Failed to update literature with ID " + id);
                    System.out.println("Response code: " + response.getStatusCodeValue());
                    System.out.println("Response body: " + response.getBody());
                }
            }
        }
        System.out.println("Total number of literatures processed: " +
                literatureJsonNode.size());
        System.out.println("Total number of literatures successfully updated: " +
                successCount);
    }

    public void normalizeLitTypes(String token, JsonNode literatureJsonNode) throws Exception {
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.setBearerAuth(token);

        int successCount = 0;

        for (JsonNode node : literatureJsonNode) {
            String litType = node.get("litType").asText();
            String normalizedType = null;

            if ("inproceedings".equalsIgnoreCase(litType)) {
                normalizedType = "conference";
            } else if ("master thesis".equalsIgnoreCase(litType)
                    || "mastersthesis".equalsIgnoreCase(litType)
                    || "masterthesis".equalsIgnoreCase(litType)) {
                normalizedType = "Master Thesis";
            } else if ("BSc Thesis".equalsIgnoreCase(litType)) {
                normalizedType = "Bachelor Thesis";
            } else if ("PhD thesis".equalsIgnoreCase(litType)
                    || "phdthesis".equalsIgnoreCase(litType)) {
                normalizedType = "PhD Thesis";
            } else if ("Bookchapter".equalsIgnoreCase(litType)
                    || "inbook".equalsIgnoreCase(litType)) {
                normalizedType = "Book chapter";
            } else if ("article".equalsIgnoreCase(litType)
                    || "Journal Article".equalsIgnoreCase(litType)) {
                normalizedType = "Article";
            } else if ("book".equalsIgnoreCase(litType)) {
                normalizedType = "Book";
            } else if ("conference".equalsIgnoreCase(litType)) {
                normalizedType = "Conference";
            } else if ("electronic".equalsIgnoreCase(litType)) {
                normalizedType = "Electronic";
            } else if ("incollection".equalsIgnoreCase(litType)) {
                normalizedType = "Book Collection";
            } else if ("proceedings".equalsIgnoreCase(litType)) {
                normalizedType = "Proceedings";
            } else if ("techreport".equalsIgnoreCase(litType)) {
                normalizedType = "Techreport";
            } else if ("unpublished".equalsIgnoreCase(litType)) {
                normalizedType = "Unpublished";
            } else if ("Book chapter".equalsIgnoreCase(litType)) {
                normalizedType = "Book Chapter";
            }

            if (normalizedType != null) {
                ObjectNode updatedNode = ((ObjectNode) node).put("litType", normalizedType);

                String id = node.get("id").asText();
                String specificLiteratureUrl = literatureUrl + "?id.equals=" + id;

                HttpEntity<String> entity = new HttpEntity<>(updatedNode.toString(), headers);
                ResponseEntity<String> response = null;
                try {
                    response = restTemplate.exchange(specificLiteratureUrl, HttpMethod.PUT, entity, String.class);
                } catch (HttpClientErrorException | HttpServerErrorException e) {
                    System.out.println("Error for ID " + id + ": " + e.getMessage());
                    continue;
                }

                if (response.getStatusCodeValue() == 200) {
                    successCount++;
                } else {
                    System.out.println("Failed to update literature with ID " + id);
                    System.out.println("Response code: " + response.getStatusCodeValue());
                    System.out.println("Response body: " + response.getBody());
                }
            }
        }
        System.out.println("Total number of literatures processed: " + literatureJsonNode.size());
        System.out.println("Total number of literatures successfully updated: " + successCount);
    }

    public void analyzeLitType(JsonNode literatureJsonNode) throws Exception {
        if (!literatureJsonNode.isArray()) {
            throw new Exception("Expected literatureJsonNode to be an array");
        }

        Map<String, Integer> litTypeCounts = new HashMap<>();

        for (JsonNode node : literatureJsonNode) {
            String litType = node.get("litType").asText();
            litTypeCounts.put(litType, litTypeCounts.getOrDefault(litType, 0) + 1);
        }

        Comparator<String> customComparator = (str1, str2) -> {
            int compare = String.CASE_INSENSITIVE_ORDER.compare(str1, str2);
            if (compare == 0) {
                return str1.compareTo(str2);
            }
            return compare;
        };

        TreeMap<String, Integer> sortedLitTypeCounts = new TreeMap<>(customComparator);
        sortedLitTypeCounts.putAll(litTypeCounts);

        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode resultNode = objectMapper.valueToTree(sortedLitTypeCounts);

        File outputFile = new File("litTypeCounts.json");
        objectMapper.writerWithDefaultPrettyPrinter().writeValue(outputFile, resultNode);

        System.out.println("Output written to: " + outputFile.getAbsolutePath());
    }

    // public void generateMandatory(JsonNode literatureJsonNode) throws Exception {
    //     if (!literatureJsonNode.isArray()) {
    //         throw new Exception("Expected literatureJsonNode to be an array");
    //     }

    //     HashMap<String, List<JsonNode>> litTypeExamples = new HashMap<>();

    //     for (JsonNode node : literatureJsonNode) {
    //         String litType = node.get("litType").asText();
    //         if (!litTypeExamples.containsKey(litType)) {
    //             litTypeExamples.put(litType, new ArrayList<>());
    //         }
    //         if (litTypeExamples.get(litType).size() < 10) {
    //             litTypeExamples.get(litType).add(node);
    //         }
    //     }

    //     ObjectMapper objectMapper = new ObjectMapper();
    //     ObjectNode reportNode = objectMapper.createObjectNode();

    //     List<String> sortedLitTypes = new ArrayList<>(litTypeExamples.keySet());
    //     Collections.sort(sortedLitTypes, String.CASE_INSENSITIVE_ORDER);

    //     for (String litType : sortedLitTypes) {
    //         ArrayNode arrayNode = objectMapper.createArrayNode();
    //         for (JsonNode exampleNode : litTypeExamples.get(litType)) {
    //             arrayNode.add(exampleNode);
    //         }
    //         reportNode.set(litType, arrayNode);
    //     }

    //     File outputFile = new File("mandatory.json");
    //     objectMapper.writerWithDefaultPrettyPrinter().writeValue(outputFile, reportNode);

    //     System.out.println("Report written to: " + outputFile.getAbsolutePath());
    // }

    // public void countNonNullParams(JsonNode literatureJsonNode) throws Exception {
    //     if (!literatureJsonNode.isArray()) {
    //         throw new Exception("Expected literatureJsonNode to be an array");
    //     }

    //     Map<String, Map<String, Integer>> nonNullParamCounts = new HashMap<>();

    //     for (JsonNode literature : literatureJsonNode) {
    //         String litType = literature.get("litType").asText();

    //         nonNullParamCounts.computeIfAbsent(litType, k -> new HashMap<>());

    //         Map<String, Integer> paramCounts = nonNullParamCounts.get(litType);

    //         Iterator<Map.Entry<String, JsonNode>> fields = literature.fields();

    //         while (fields.hasNext()) {
    //             Map.Entry<String, JsonNode> field = fields.next();
    //             String paramName = field.getKey();
    //             JsonNode paramValue = field.getValue();
    //             if (!paramValue.isNull()) {
    //                 paramCounts.put(paramName, paramCounts.getOrDefault(paramName, 0) + 1);
    //             }
    //         }
    //     }
    //     ObjectMapper objectMapper = new ObjectMapper();
    //     File outputFile = new File("nonnull_param_counts.json");
    //     objectMapper.writerWithDefaultPrettyPrinter().writeValue(outputFile, nonNullParamCounts);

    //     System.out.println("Output written to: " + outputFile.getAbsolutePath());
    // }

    public void mergeDuplicates(String token, List<List<Integer>> duplicates) {
		int initialCount = 0;
		int postMergeCount = 0;

		try {
			JsonNode initialFundings = getAllLiterature(token);
			initialCount = initialFundings.size();
		} catch (Exception e) {
			System.out.println("Error fetching initial fundings count.");
			e.printStackTrace();
		}

		if (duplicates == null || duplicates.isEmpty()) {
			return;
		}

		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.setBearerAuth(token);

		for (List<Integer> duplicateSet : duplicates) {
			if (duplicateSet.size() > 1) {
				Integer survivorId = duplicateSet.get(0);
				List<Integer> toBeDeletedIds = duplicateSet.subList(1, duplicateSet.size());

				Map<String, Object> requestBody = new HashMap<>();
				requestBody.put("survivorId", survivorId);
				requestBody.put("toBeDeletedIds", toBeDeletedIds);

				HttpEntity<Map<String, Object>> entity = new HttpEntity<>(requestBody, headers);

				try {
					ResponseEntity<String> response = new RestTemplate().postForEntity(mergeUrl, entity, String.class);
					// System.out.println("Merging for survivor ID: " + survivorId);

					// if (response.getStatusCode() != HttpStatus.OK) {
					// 	System.out.println("Failed to merge for survivor ID: " + survivorId);
					// 	System.out.println("Response: " + response.getBody());
					// }
				} catch (Exception e) {
					// System.out.println("Error merging for survivor ID: " + survivorId);
					// e.printStackTrace();
				}
			}
		}

		// Get the count after merging
		try {
			JsonNode postMergeFundings = getAllLiterature(token);
			postMergeCount = postMergeFundings.size();
		} catch (Exception e) {
			// System.out.println("Error fetching post merge fundings count.");
			// e.printStackTrace();
		}

		System.out.println("Literature count at start: " + initialCount);
		System.out.println("Literature count after merge: " + postMergeCount);
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
                Literature literature = new Literature("https://testapp.lithodat.com", "kimberlyz", "Kimberly1234");
                JsonNode literatureJsonNode = literature.getAllLiterature(authenticationKey);

                // literature.cleanNull(authenticationKey, literatureJsonNode);
                // literature.normalizeLitTypes(authenticationKey, literatureJsonNode);
                // literatureJsonNode = literature.getAllLiterature(authenticationKey);

                literature.analyzeLitType(literatureJsonNode);

                // literature.generateMandatory(literatureJsonNode);
                // literature.countNonNullParams(literatureJsonNode);

                List<IdentifyProcessor.ProcessedLiterature> dataList = IdentifyProcessor.processLiteratureJsonNode(literatureJsonNode);
                List<List<Integer>> duplicates = IdentifyProcessor.findLiteratureDuplicates(dataList);
                
                Map<String, Object> report = IdentifyProcessor.generateLiteratureReport(duplicates);
                ObjectMapper mapper = new ObjectMapper();
				try {
					String reportJson = mapper.writeValueAsString(report);
					Files.write(Paths.get("report_literature.json"), reportJson.getBytes());
				} catch (JsonProcessingException e) {
					e.printStackTrace();
				}

                literature.mergeDuplicates(authenticationKey, duplicates);

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
