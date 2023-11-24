package io.lithosurfer.client.deduplication.apiconnectors;

import io.lithosurfer.client.deduplication.AbstractAPIConnector;
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