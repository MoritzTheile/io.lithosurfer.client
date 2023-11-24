package io.lithosurfer.client.util;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class StaticUtils {
    public static void writeObjectToFile(Object object, String filename) throws IOException {
		ObjectMapper mapper = new ObjectMapper();
		try {
			String reportJson = mapper.writeValueAsString(object);
			Files.write(Paths.get(filename), reportJson.getBytes());
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
	}

}
