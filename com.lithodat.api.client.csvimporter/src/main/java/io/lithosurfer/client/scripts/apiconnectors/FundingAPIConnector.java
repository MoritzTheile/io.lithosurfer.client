package io.lithosurfer.client.scripts.apiconnectors;

import io.lithosurfer.client.scripts.AbstractAPIConnector;
import io.lithosurfer.client.scripts.dtos.FundingDTO;

public class FundingAPIConnector extends AbstractAPIConnector<FundingDTO> {
	
	
	public FundingAPIConnector(String endpoint) {
		super(endpoint);
	}

	protected String getFingerprint(FundingDTO entityDTO) {

		return entityDTO.getFundingBodyName() + "|" + entityDTO.getName() + "|" + entityDTO.getGrandNumber() + "|"+ entityDTO.getDescription()+ "|" + entityDTO.getYear();

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