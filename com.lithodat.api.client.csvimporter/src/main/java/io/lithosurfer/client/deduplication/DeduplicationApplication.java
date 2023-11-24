package io.lithosurfer.client.deduplication;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.lithosurfer.client.LithoAuth;
import io.lithosurfer.client.deduplication._outdated.Literature;
import io.lithosurfer.client.deduplication._outdated.StaticUtils;
import io.lithosurfer.client.deduplication.apiconnectors.FundingAPIConnector;
import io.lithosurfer.client.deduplication.apiconnectors.LiteratureAPIConnector;
import io.lithosurfer.client.deduplication.apiconnectors.PeopleAPIConnector;

@SpringBootApplication
public class DeduplicationApplication {

	public static void main(String[] args) {
		SpringApplication.run(DeduplicationApplication.class, args);

	}

	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}

	/**
	 * Command Line Syntax: CSVImporter <endpoint[0]> <username[1]> <password[2]>
	 */
	@Bean
	public CommandLineRunner run(RestTemplate restTemplate) throws Exception {

		return args -> {

			try {

				// Wrapping command line arguments in an object.
				DeduplicationArguments arguments = new DeduplicationArguments(args);

				// Authenticating to get an JSON Web Token.
				LithoAuth lithoAuth = new LithoAuth(arguments.getEndpoint(), arguments.getUsername(), arguments.getPassword());
				String authenticationKey = lithoAuth.authenticateAndGetJWT();

				{// merging Funding
					FundingAPIConnector apiConnector = new FundingAPIConnector(lithoAuth.endpoint);
					apiConnector.findDuplicatesAndMerge(authenticationKey);
				}
				{// merging Literature
					LiteratureAPIConnector apiConnector = new LiteratureAPIConnector(lithoAuth.endpoint);
					apiConnector.findDuplicatesAndMerge(authenticationKey);
				}
				{ // merging People
					PeopleAPIConnector apiConnector = new PeopleAPIConnector(lithoAuth.endpoint);
					apiConnector.findDuplicatesAndMerge(authenticationKey);
				}

			} catch (Exception e) {

				e.printStackTrace();

			} finally {// Brute force shutdown is used to make things not more complicated than
						// necessary...
				System.out.println("shutting down with System.exit(0)");
				System.exit(0);
			}

		};
	}

	private void mergeLiterature(LithoAuth lithoAuth, String authenticationKey) throws Exception, IOException {
		Literature helper = new Literature(lithoAuth.endpoint);
		JsonNode literatureJsonNode = helper.getAllLiterature(authenticationKey);
		List<StaticUtils.ProcessedLiterature> dataList = StaticUtils.processLiteratureJsonNode(literatureJsonNode);
		List<List<Long>> duplicates = StaticUtils.findLiteratureDuplicates(dataList);
		Map<String, Object> report = StaticUtils.generateDuplicateReport(duplicates);
		ObjectMapper mapper = new ObjectMapper();
		try {
			String reportJson = mapper.writeValueAsString(report);
			Files.write(Paths.get("report_literature.json"), reportJson.getBytes());
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		{ // merging
			System.out.println("literature count before merging: " + helper.getAllLiterature(authenticationKey).size());
			helper.mergeDuplicates(authenticationKey, duplicates);
			System.out.println("literature count after merging: " + helper.getAllLiterature(authenticationKey).size());
		}
	}

}
