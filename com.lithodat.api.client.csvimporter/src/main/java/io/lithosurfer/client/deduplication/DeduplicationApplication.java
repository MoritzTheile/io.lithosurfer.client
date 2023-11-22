package io.lithosurfer.client.deduplication;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import io.lithosurfer.client.LithoAuth;

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
				String jwtToken = new LithoAuth(arguments.getEndpoint(), arguments.getUsername(), arguments.getPassword()).authenticateAndGetJWT();
				System.out.println("huhu jwtToken " + jwtToken);
				
				
				
			} catch (Exception e) {
				e.printStackTrace();
			} finally {// Brute force shutdown is used to make things not more complicated than
						// necessary...
				System.out.println("shutting down with System.exit(0)");
				System.exit(0);
			}

		};
	}

}
