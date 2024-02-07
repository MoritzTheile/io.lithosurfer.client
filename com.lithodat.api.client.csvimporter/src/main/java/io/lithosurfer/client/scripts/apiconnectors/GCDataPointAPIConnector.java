package io.lithosurfer.client.scripts.apiconnectors;



import io.lithosurfer.client.scripts.AbstractAPIConnector;
import modelGeneratedFromSwagger.GCDataPointLithoDTO;

public class GCDataPointAPIConnector extends AbstractAPIConnector<GCDataPointLithoDTO> {
	
	
	public GCDataPointAPIConnector(String endpoint) {
		super(endpoint);
	}

	protected String getFingerprint(GCDataPointLithoDTO entityDTO) {

		return entityDTO.getId()+"";

	}

	@Override
	protected Class<GCDataPointLithoDTO[]> getServiceReturnClass() {
		return GCDataPointLithoDTO[].class;
	}

	@Override
	protected String getServicePath() {
		return "/api/geochem/GCDataPoint";
	}


}