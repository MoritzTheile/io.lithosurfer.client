package io.lithosurfer.client.deduplication.apiconnectors;

import io.lithosurfer.client.deduplication.AbstractAPIConnector;
import io.lithosurfer.client.deduplication.dtos.FundingDTO;

public class FundingAPIConnector extends AbstractAPIConnector<FundingDTO> {
	
	
	public FundingAPIConnector(String endpoint) {
		super(endpoint);
	}

	protected String getFingerprint(FundingDTO entityDTO) {

		return entityDTO.getFundingBodyName() + "|" + entityDTO.getName() + "|" + entityDTO.getName() + "|" + entityDTO.getYear();

	}

	@Override
	protected Class<FundingDTO[]> getServiceReturnClass() {
		return FundingDTO[].class;
	}

	@Override
	protected String getServicePath() {
		return "/api/core/fundings";
	}


}