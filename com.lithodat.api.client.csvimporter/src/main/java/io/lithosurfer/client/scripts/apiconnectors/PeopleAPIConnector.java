package io.lithosurfer.client.scripts.apiconnectors;

import io.lithosurfer.client.scripts.AbstractAPIConnector;
import io.lithosurfer.client.scripts.dtos.PersonDTO;

public class PeopleAPIConnector extends AbstractAPIConnector<PersonDTO> {

	public PeopleAPIConnector(String endpoint) {
		super(endpoint);
	}

	@Override
	protected Class<PersonDTO[]> getServiceReturnClass() {
		return PersonDTO[].class;
	}

	protected String getFingerprint(PersonDTO entityDTO) {

		return entityDTO.getTitle() + "|" + entityDTO.getFirstName() + "|" + entityDTO.getName() + "|" + entityDTO.getOrcId();

	}

	@Override
	protected String getServicePath() {
		return "/api/core/people";
	}
}