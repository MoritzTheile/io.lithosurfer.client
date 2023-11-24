package io.lithosurfer.client.deduplication.apiconnectors;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import io.lithosurfer.client.deduplication.AbstractAPIConnector;
import io.lithosurfer.client.deduplication._outdated.StaticUtils;
import io.lithosurfer.client.deduplication.dtos.FundingDTO;

public class FundingAPIConnector extends AbstractAPIConnector<FundingDTO> {
	
	
	public FundingAPIConnector(String endpoint) {
		super(endpoint);
	}

	protected String getFingerprint(FundingDTO entityDTO) {

		return entityDTO.getFundingBodyName() + "_" + entityDTO.getName() + "_" + entityDTO.getName() + "_" + entityDTO.getYear();

	}

	@Override
	protected Class<FundingDTO[]> getServiceReturnClass() {
		return FundingDTO[].class;
	}


}