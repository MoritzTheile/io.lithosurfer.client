package com.lithodat.api.client.csvimporter;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class IdentifyProcessor {

    public static class ProcessedData {
        public String name;
        public String id;
        public String year;
        public String fundingBodyName;

        @Override
        public String toString() {
            return "{" +
                    "name='" + name + '\'' +
                    ", id='" + id + '\'' +
                    ", year='" + year + '\'' +
                    ", fundingBodyName='" + fundingBodyName + '\'' +
                    '}';
        }
    }

    public static void main(String[] args) {
        String jsonString = "[{ \"name\":\"example<<id>>name\", \"id\":\"123\", \"year\":\"2023\", \"fundingBodyName\":\"ABC Corp\" }]";
        ObjectMapper mapper = new ObjectMapper();
        try {
            JsonNode jsonNode = mapper.readTree(jsonString);
            List<IdentifyProcessor.ProcessedData> dataList = IdentifyProcessor.processJsonNode(jsonNode);
            List<List<Integer>> duplicates = IdentifyProcessor.findDuplicates(dataList);
            Map<String, Object> report = IdentifyProcessor.generateReport(duplicates);
            String reportJson = mapper.writeValueAsString(report);
            System.out.println(reportJson);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static List<ProcessedData> processJsonNode(JsonNode jsonArray) {
        List<ProcessedData> processedDataList = new ArrayList<>();

        for (JsonNode jsonObject : jsonArray) {
            ProcessedData data = new ProcessedData();
            data.name = jsonObject.get("name").asText().replaceAll("<<.*?>>", "");
            data.id = jsonObject.get("id").asText();
            data.year = jsonObject.get("year").asText();
            data.fundingBodyName = jsonObject.get("fundingBodyName").asText();
            processedDataList.add(data);
        }
        return processedDataList;
    }

    public static List<List<Integer>> findDuplicates(List<ProcessedData> dataList) {
        Map<String, List<String>> map = new HashMap<>();
        for (ProcessedData data : dataList) {
            String key = data.fundingBodyName + "|" + data.name + "|" + data.year;
            List<String> ids = map.getOrDefault(key, new ArrayList<>());
            ids.add(data.id);
            map.put(key, ids);
        }

        List<List<Integer>> result = new ArrayList<>();
        for (List<String> ids : map.values()) {
            if (ids.size() > 1) {
                // Convert ids to integers
                List<Integer> intIds = new ArrayList<>();
                for (String id : ids) {
                    intIds.add(Integer.parseInt(id));
                }
                result.add(intIds);
            }
        }
        return result;
    }

    public static Map<String, Object> generateReport(List<List<Integer>> duplicates) {
        int totalSets = duplicates.size();
        int biggestSize = duplicates.stream().mapToInt(List::size).max().orElse(0);
        int totalIds = duplicates.stream().mapToInt(List::size).sum();

        Map<String, Object> report = new LinkedHashMap<>();
        report.put("total_sets", totalSets);
        report.put("total_ids", totalIds);
        report.put("biggest_size", biggestSize);
        report.put("sets", duplicates);
        return report;
    }

    public static String generateReportFromJson(String jsonString) throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode jsonNode = mapper.readTree(jsonString);
        List<IdentifyProcessor.ProcessedData> dataList = IdentifyProcessor.processJsonNode(jsonNode);
        List<List<Integer>> duplicates = IdentifyProcessor.findDuplicates(dataList);
        Map<String, Object> report = IdentifyProcessor.generateReport(duplicates);
        return mapper.writeValueAsString(report);
    }
}
