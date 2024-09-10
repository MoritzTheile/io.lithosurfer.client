package io.lithosurfer.client.scripts.apiconnectors;
import io.lithosurfer.client.scripts.AbstractAPIConnector;
import io.lithosurfer.client.scripts.dtos.LabDTO;

public class LabsAPIConnector extends AbstractAPIConnector<LabDTO> {

    public LabsAPIConnector(String endpoint) {
        super(endpoint);
    }

    @Override
    protected String getFingerprint(LabDTO entityDTO) {
        return entityDTO.getName() + "|" +
                entityDTO.getOrganisation() + "|" +
                entityDTO.getCity() + "|" +
                entityDTO.getCountryName() + "|" +
                (entityDTO.getCountryId() != null ? entityDTO.getCountryId() : "") + "|" +
                entityDTO.getInLithodat() + "|" +
                entityDTO.getDescription() + "|";
    }

    @Override
    protected Class<LabDTO[]> getServiceReturnClass() {
        return LabDTO[].class;
    }

    @Override
    protected String getServicePath() {
        return "/api/core/labs";
    }
    
}
