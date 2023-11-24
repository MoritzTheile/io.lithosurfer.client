package io.lithosurfer.client.deduplication.apiconnectors;

import io.lithosurfer.client.deduplication.AbstractAPIConnector;
import io.lithosurfer.client.deduplication.dtos.PersonDTO;

public class PeopleAPIConnector extends AbstractAPIConnector<PersonDTO> {

	public PeopleAPIConnector(String endpoint) {
		super(endpoint);
	}

	@Override
	protected Class<PersonDTO[]> getServiceReturnClass() {
		return PersonDTO[].class;
	}

	protected String getFingerprint(PersonDTO entityDTO) {

		return entityDTO.getTitle() + "_" + entityDTO.getFirstName() + "_" + entityDTO.getName() + "_" + entityDTO.getOrcId();

	}
}