package io.lithosurfer.client.deduplication.funding;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class FundingProcessor {
    public static JsonNode processJsonFile(JsonNode jsonNode) {
        for (JsonNode itemNode : jsonNode) {
            ObjectNode objectNode = (ObjectNode) itemNode;

            String name = objectNode.hasNonNull("name") ? objectNode.get("name").asText() : null;
            String grandNumber = objectNode.hasNonNull("grandNumber") ? objectNode.get("grandNumber").asText()
                    : null;

            if (name == null) {
                if (grandNumber != null) {
                    objectNode.put("name", grandNumber);
                }
            } else {
                if (grandNumber != null && !name.contains(grandNumber))
                    objectNode.put("name", name + " " + grandNumber);
            }
        }
        return jsonNode;
    }
}
