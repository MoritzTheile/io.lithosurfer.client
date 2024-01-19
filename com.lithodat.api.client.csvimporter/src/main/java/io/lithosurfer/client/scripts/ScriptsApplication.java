package io.lithosurfer.client.scripts;

import java.io.IOException;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import io.lithosurfer.client.LithoAuth;
import io.lithosurfer.client.scripts.ScriptsArguments.MODE;
import io.lithosurfer.client.scripts.apiconnectors.FundingAPIConnector;
import io.lithosurfer.client.scripts.apiconnectors.GCDataPointAPIConnector;
import io.lithosurfer.client.scripts.apiconnectors.LiteratureAPIConnector;
import io.lithosurfer.client.scripts.apiconnectors.PeopleAPIConnector;
import io.lithosurfer.client.scripts.dtos.GCDataPointDTO;

@SpringBootApplication
public class ScriptsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ScriptsApplication.class, args);

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
				ScriptsArguments arguments = new ScriptsArguments(args);

				// Authenticating to get an JSON Web Token.
				LithoAuth lithoAuth = new LithoAuth(arguments.getEndpoint(), arguments.getUsername(), arguments.getPassword());
				String authenticationKey = lithoAuth.authenticateAndGetJWT();

				if (MODE.report.equals(arguments.getMode())) {
					report(lithoAuth, authenticationKey);
				}else if(MODE.merge.equals(arguments.getMode())) {
					merge(lithoAuth, authenticationKey);
				}else if(MODE.script1.equals(arguments.getMode())) {
					script1(lithoAuth, authenticationKey);
				}


			} catch (Exception e) {

				e.printStackTrace();

			} finally {
				System.out.println("shutting down with System.exit(0)");
				System.exit(0);
			}

		};
	}

	private void report(LithoAuth lithoAuth, String authenticationKey) throws Exception, IOException {
		{// reporting Funding
			FundingAPIConnector apiConnector = new FundingAPIConnector(lithoAuth.endpoint);
			apiConnector.findDuplicatesAndReport(authenticationKey);
		}
		{// reporting Literature
			LiteratureAPIConnector apiConnector = new LiteratureAPIConnector(lithoAuth.endpoint);
			apiConnector.findDuplicatesAndReport(authenticationKey);
		}
		{ // reporting People
			PeopleAPIConnector apiConnector = new PeopleAPIConnector(lithoAuth.endpoint);
			apiConnector.findDuplicatesAndReport(authenticationKey);
		}
	}

	private void merge(LithoAuth lithoAuth, String authenticationKey) throws Exception, IOException {
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
	}


	/**
	 * This script deletes all GCDataPoints in a given package. 
	 */
	private void script1(LithoAuth lithoAuth, String authenticationKey) throws Exception, IOException {
		
		// change this to target package
		int id = -1;

		String query = "&dataPointLithoCriteria.dataPackageId.equals=" + id;
		
		GCDataPointAPIConnector apiConnector = new GCDataPointAPIConnector(lithoAuth.endpoint);
		
		List<GCDataPointDTO> dtos = apiConnector.find(authenticationKey, query);
		
		System.out.println("dtos.size() " + dtos.size());
		int i = 1;
		for(GCDataPointDTO dto : dtos) {
			apiConnector.deleteById(authenticationKey, dto.getId());
			System.out.println(i++ +" deleted GCDataPoint with id " + dto.getId());
		}
	}
}
