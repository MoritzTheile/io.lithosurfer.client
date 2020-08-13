package com.lithodat.api.client.csvimporter;

import java.util.Map;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import com.lithodat.api.client.csvimporter.Arguments.IMPORT_TYPE;
import com.lithodat.api.client.csvimporter.literature.LiteratureDTO;
import com.lithodat.api.client.csvimporter.literature.LiteratureImporter;

@SpringBootApplication
public class CSVImporterApplication {

	public static void main(String[] args) {
		SpringApplication.run(CSVImporterApplication.class, args);

	}

	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}

	/**
	 * Command Line Syntax: CSVImporter <endpoint[0]> <username[1]> <password[2]> <tableName[3]> <csvFile[4]>
	 */
	@Bean
	public CommandLineRunner run(RestTemplate restTemplate) throws Exception {

		return args -> {

			// Wrapping command line arguments in an object.
			Arguments arguments = new Arguments(args);

			// Making source data available.
			CSVFileReader csvFileReader = new CSVFileReader(arguments.getCsvFile(), ';');
			csvFileReader.loadData();

			// Authenticating to get an JSON Web Token.
			String jwtToken = new LithoAuth(arguments.getEndpoint(), arguments.getUsername(), arguments.getPassword()).authenticateAndGetJWT();

			// Only literature is supported. In future there might be additional if clauses.
			if (IMPORT_TYPE.LITERATURE.equals(arguments.getImportType())) {

				// Initializing the literature importer.
				LiteratureImporter literatureImporter = new LiteratureImporter(jwtToken, arguments.getEndpoint());

				// Uploading each row:
				for (Map<String, String> rowAsMap : csvFileReader.getAllRowsAsMap()) {

					LiteratureDTO literatureDTO = mapRowToDTO(rowAsMap);

					// The API will be called:
					literatureImporter.upload(literatureDTO);

				}

			}

			{// Brute force shutdown is used to make things not more complicated than necessary...
				System.out.println("shutting down with System.exit(0)");
				System.exit(0);
			}

		};
	}

	/**
	 * Mapping the values of each row to a new data transfer object. Could be moved to an extra class...
	 */
	private LiteratureDTO mapRowToDTO(Map<String, String> rowAsMap) {

		// The data transfer object has to be in sync with the API (e.g. attribute names).
		LiteratureDTO literatureDTO = new LiteratureDTO();

		literatureDTO.setAuthor(rowAsMap.get("author"));
		literatureDTO.setTitle(rowAsMap.get("title"));
		literatureDTO.setYear(toInteger(rowAsMap.get("year")));
		literatureDTO.setNumber(rowAsMap.get("number"));
		literatureDTO.setJournal(rowAsMap.get("journal"));
		literatureDTO.setVolume(rowAsMap.get("volume"));
		literatureDTO.setPages(toInteger(rowAsMap.get("pages")));
		literatureDTO.setPublisher(rowAsMap.get("publisher"));
		literatureDTO.setDoi(rowAsMap.get("doi"));
		literatureDTO.setMonth(toInteger(rowAsMap.get("month")));
		literatureDTO.setInstitution(rowAsMap.get("institution"));
		literatureDTO.setType(rowAsMap.get("type"));
		literatureDTO.setNote(rowAsMap.get("note"));
		literatureDTO.setSchool(rowAsMap.get("school"));
		literatureDTO.setBooktitle(rowAsMap.get("booktitle"));
		literatureDTO.setEditor(rowAsMap.get("editor"));
		literatureDTO.setKeywords(rowAsMap.get("keywords"));
		literatureDTO.setAbstr(rowAsMap.get("abstract"));
		literatureDTO.setLanguage(rowAsMap.get("language"));
		literatureDTO.setSeries(rowAsMap.get("series"));
		literatureDTO.setChapter(rowAsMap.get("chapter"));
		literatureDTO.setHowpublished(rowAsMap.get("howpublished"));
		literatureDTO.setOrganization(rowAsMap.get("organization"));
		literatureDTO.setOtherId(rowAsMap.get("otherId"));

		return literatureDTO;

	}

	public static Integer toInteger(String string) {
		if (string == null) {
			return null;
		}
		Integer result = null;
		try {
			result = Integer.parseInt(string);
		} catch (Exception e) {
			System.out.println("could not be parsed to int: " + string);
		}
		return result;

	}

}
