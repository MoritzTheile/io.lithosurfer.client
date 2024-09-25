package io.lithosurfer.client.scripts.apiconnectors;
import io.lithosurfer.client.scripts.AbstractAPIConnector;
import io.lithosurfer.client.scripts.dtos.DepositModelsDTO;

public class DepositModelAPIConnector extends AbstractAPIConnector<DepositModelsDTO> {

	    private final String servicePath;

	    public DepositModelAPIConnector(String endpoint, String servicePath) {
	        super(endpoint);
	        this.servicePath = servicePath;
	    }

	    @Override
	    protected String getFingerprint(DepositModelsDTO entityDTO) {
	        return entityDTO.getName() + "|" +
	                entityDTO.getPath() + "|" +
	                entityDTO.getDescription() + "|";
	    }

	    @Override
	    protected Class<DepositModelsDTO[]> getServiceReturnClass() {
	        return DepositModelsDTO[].class;
	    }

	    @Override
	    protected String getServicePath() {
	        return servicePath;
	    }
	}
