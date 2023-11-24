package io.lithosurfer.client.deduplication._outdated;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class RandomUtils {

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

    public static void test() {
        String jsonString = "[{ \"name\":\"example<<id>>name\", \"id\":\"123\", \"year\":\"2023\", \"fundingBodyName\":\"ABC Corp\" }]";
        ObjectMapper mapper = new ObjectMapper();
        try {
            JsonNode jsonNode = mapper.readTree(jsonString);
            List<RandomUtils.ProcessedData> dataList = RandomUtils.processJsonNode(jsonNode);
            List<List<Integer>> duplicates = RandomUtils.findDuplicates(dataList);
            Map<String, Object> report = RandomUtils.generateReport(duplicates);
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
        result.sort((list1, list2) -> Integer.compare(list2.size(), list1.size()));
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
        List<RandomUtils.ProcessedData> dataList = RandomUtils.processJsonNode(jsonNode);
        List<List<Integer>> duplicates = RandomUtils.findDuplicates(dataList);
        Map<String, Object> report = RandomUtils.generateReport(duplicates);
        return mapper.writeValueAsString(report);
    }

    // literature
    public static class ProcessedLiterature {
        public String id;

        public String author;
        public String title;
        public String pubYear;
        public String pubMonth;
        public String volume;
        public String publisher;
        public String litType;
        public String pages;
        public String booktitle;
        public String chapter;
        public String doi;
        public String url;
        public String journal;
        public String school;
        public String institution;

        @Override
        public String toString() {
            return "{" +
                    "author='" + author + '\'' +
                    ", title='" + title + '\'' +
                    ", pubYear='" + pubYear + '\'' +
                    ", pubMonth='" + pubMonth + '\'' +
                    ", volume='" + volume + '\'' +
                    ", publisher='" + publisher + '\'' +
                    ", pages='" + pages + '\'' +
                    ", booktitle='" + booktitle + '\'' +
                    ", chapter='" + chapter + '\'' +
                    ", doi='" + doi + '\'' +
                    ", url='" + url + '\'' +
                    ", journal='" + journal + '\'' +
                    ", school='" + school + '\'' +
                    ", institution='" + institution + '\'' +
                    ", litType='" + litType + '\'' +
                    ", id='" + id + '\'' +
                    '}';
        }
    }

    public static List<ProcessedLiterature> processLiteratureJsonNode(JsonNode jsonArray) {
        List<ProcessedLiterature> processedDataList = new ArrayList<>();

        for (JsonNode jsonObject : jsonArray) {
            ProcessedLiterature data = new ProcessedLiterature();
            data.author = jsonObject.get("author").asText();
            data.title = jsonObject.get("title").asText();
            data.pubYear = jsonObject.get("pubYear").asText();
            data.pubMonth = jsonObject.get("pubMonth").asText();
            data.volume = jsonObject.get("volume").asText();
            data.publisher = jsonObject.get("publisher").asText();
            data.pages = jsonObject.get("pages").asText();
            data.booktitle = jsonObject.get("booktitle").asText();
            data.chapter = jsonObject.get("chapter").asText();
            data.doi = jsonObject.get("doi").asText();
            data.url = jsonObject.get("url").asText();
            data.journal = jsonObject.get("journal").asText();
            data.school = jsonObject.get("school").asText();
            data.institution = jsonObject.get("institution").asText();
            data.litType = jsonObject.get("litType").asText();
            data.id = jsonObject.get("id").asText();
            processedDataList.add(data);
        }
        return processedDataList;
    }

    public static List<List<Long>> findLiteratureDuplicates(List<ProcessedLiterature> dataList) {
        Map<String, List<String>> map = new HashMap<>();

        for (ProcessedLiterature data : dataList) {
            String key = data.author + "|" + data.title + "|" + data.pubYear + "|"
                    + data.pubMonth + "|" + data.litType + "|" + data.volume + "|"
                    + data.publisher + "|" + data.pages + "|" + data.booktitle + "|"
                    + data.chapter + "|" + data.doi + "|" + data.url + "|" 
                    + data.journal + "|" + data.school + "|" + data.institution;
            List<String> ids = map.getOrDefault(key, new ArrayList<>());
            ids.add(data.id);
            map.put(key, ids);
        }

        List<List<Long>> result = new ArrayList<>();
        for (List<String> ids : map.values()) {
            if (ids.size() > 1) {
                List<Long> intIds = new ArrayList<>();
                for (String id : ids) {
                    intIds.add(Long.parseLong(id));
                }
                result.add(intIds);
            }
        }
        result.sort((list1, list2) -> Integer.compare(list2.size(), list1.size()));
        return result;
    }

    public static Map<String, Object> generateDuplicateReport(Collection<List<Long>> duplicates) {
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

    public static String generateLiteratureReportFromJson(String jsonString) throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode jsonNode = mapper.readTree(jsonString);
        List<RandomUtils.ProcessedLiterature> dataList = RandomUtils.processLiteratureJsonNode(jsonNode);
        List<List<Long>> duplicates = RandomUtils.findLiteratureDuplicates(dataList);
        Map<String, Object> reports = RandomUtils.generateDuplicateReport(duplicates);
        return mapper.writeValueAsString(reports);
    }

}
