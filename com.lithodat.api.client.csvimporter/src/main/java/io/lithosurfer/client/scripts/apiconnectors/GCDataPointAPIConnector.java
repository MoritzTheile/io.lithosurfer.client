package io.lithosurfer.client.scripts.apiconnectors;

import io.lithosurfer.client.scripts.AbstractAPIConnector;
import io.lithosurfer.client.scripts.dtos.GCDataPointDTO;

public class GCDataPointAPIConnector extends AbstractAPIConnector<GCDataPointDTO> {
	
	
	public GCDataPointAPIConnector(String endpoint) {
		super(endpoint);
	}

	protected String getFingerprint(GCDataPointDTO entityDTO) {

		return entityDTO.getId()+"";

	}

	@Override
	protected Class<GCDataPointDTO[]> getServiceReturnClass() {
		return GCDataPointDTO[].class;
	}

	@Override
	protected String getServicePath() {
		return "/api/geochem/GCDataPoint";
	}


}