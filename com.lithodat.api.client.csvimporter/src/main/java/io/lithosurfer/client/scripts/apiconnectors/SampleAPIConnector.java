package io.lithosurfer.client.scripts.apiconnectors;

import io.lithosurfer.client.scripts.AbstractAPIConnector;
import io.lithosurfer.client.scripts.dtos.SampleWithLocationDTO;

public class SampleAPIConnector extends AbstractAPIConnector<SampleWithLocationDTO> {
	
	
	public SampleAPIConnector(String endpoint) {
		super(endpoint);
	}

	protected String getFingerprint(SampleWithLocationDTO entityDTO) {
		
		return entityDTO.getSampleDTO().getId()+""; //

	}

	@Override
	protected Class<SampleWithLocationDTO[]> getServiceReturnClass() {
		return SampleWithLocationDTO[].class;
	}

	@Override
	protected String getServicePath() {
		return "/api/core/sample-with-locations";
	}


}