package io.lithosurfer.client.deduplication;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import io.lithosurfer.client.LithoAuth;
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
					apiConnector.findDuplicatesAndReport(authenticationKey);
				}
				{// merging Literature
					LiteratureAPIConnector apiConnector = new LiteratureAPIConnector(lithoAuth.endpoint);
					apiConnector.findDuplicatesAndReport(authenticationKey);
				}
				{ // merging People
					PeopleAPIConnector apiConnector = new PeopleAPIConnector(lithoAuth.endpoint);
					apiConnector.findDuplicatesAndReport(authenticationKey);
				}

			} catch (Exception e) {

				e.printStackTrace();

			} finally {
				System.out.println("shutting down with System.exit(0)");
				System.exit(0);
			}

		};
	}

	
}
