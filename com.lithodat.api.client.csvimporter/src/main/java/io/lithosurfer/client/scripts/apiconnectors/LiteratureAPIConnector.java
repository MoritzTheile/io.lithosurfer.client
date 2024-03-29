package io.lithosurfer.client.scripts.apiconnectors;

import io.lithosurfer.client.scripts.AbstractAPIConnector;
import io.lithosurfer.client.scripts.dtos.LiteratureDTO;

public class LiteratureAPIConnector extends AbstractAPIConnector<LiteratureDTO> {
	
	
	public LiteratureAPIConnector(String endpoint) {
		super(endpoint);
	}

	protected String getFingerprint(LiteratureDTO entityDTO) {
		
		return entityDTO.getAuthor() + "|" + //
				entityDTO.getTitle() + "|" + //
				entityDTO.getPubYear() + "|" + //
				entityDTO.getPubMonth() + "|" + //
				entityDTO.getLitType() + "|" + //
				entityDTO.getVolume() + "|" + //
				entityDTO.getPublisher() + "|" + //
				entityDTO.getPages() + "|" + //
				entityDTO.getTitle() + "|" + //
				entityDTO.getChapter() + "|" + //
				entityDTO.getDoi() + "|" + //
				entityDTO.getOtherId() + "|" + //
				entityDTO.getJournal() + "|" + //
				entityDTO.getSchool() + "|" + //
				entityDTO.getInstitution() + "|"; //

	}

	@Override
	protected Class<LiteratureDTO[]> getServiceReturnClass() {
		return LiteratureDTO[].class;
	}

	@Override
	protected String getServicePath() {
		return "/api/core/literature";
	}


}