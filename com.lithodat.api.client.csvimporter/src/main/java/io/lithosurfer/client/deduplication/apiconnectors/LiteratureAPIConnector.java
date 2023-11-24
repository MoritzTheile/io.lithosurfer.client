package io.lithosurfer.client.deduplication.apiconnectors;

import io.lithosurfer.client.deduplication.AbstractAPIConnector;
import io.lithosurfer.client.deduplication.dtos.LiteratureDTO;

public class LiteratureAPIConnector extends AbstractAPIConnector<LiteratureDTO> {
	
	
	public LiteratureAPIConnector(String endpoint) {
		super(endpoint);
	}

	protected String getFingerprint(LiteratureDTO entityDTO) {
		
		return entityDTO.getAuthor() + "_" + //
				entityDTO.getTitle() + "_" + //
				entityDTO.getYear() + "_" + //
				entityDTO.getMonth() + "_" + //
				entityDTO.getType() + "_" + //
				entityDTO.getVolume() + "_" + //
				entityDTO.getPublisher() + "_" + //
				entityDTO.getPages() + "_" + //
				entityDTO.getTitle() + "_" + //
				entityDTO.getChapter() + "_" + //
				entityDTO.getDoi() + "_" + //
				entityDTO.getOtherId() + "_" + //
				entityDTO.getJournal() + "_" + //
				entityDTO.getSchool() + "_" + //
				entityDTO.getInstitution() + "_"; //

	}

	@Override
	protected Class<LiteratureDTO[]> getServiceReturnClass() {
		return LiteratureDTO[].class;
	}


}