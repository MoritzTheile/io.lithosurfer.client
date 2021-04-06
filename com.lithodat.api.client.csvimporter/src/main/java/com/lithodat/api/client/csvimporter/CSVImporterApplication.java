package com.lithodat.api.client.csvimporter;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import com.lithodat.api.client.csvimporter.Arguments.IMPORT_TYPE;
import com.lithodat.api.client.csvimporter.literature.LiteratureDTO;
import com.lithodat.api.client.csvimporter.literature.LiteratureImporter;
import com.lithodat.api.client.csvimporter.material.MaterialDTO;
import com.lithodat.api.client.csvimporter.material.MaterialImporter;

@SpringBootApplication
public class CSVImporterApplication {

	public static void main(String[] args) {
		SpringApplication.run(CSVImporterApplication.class, args);

	}

	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}

	/**
	 * Command Line Syntax: CSVImporter <endpoint[0]> <username[1]> <password[2]> <tableName[3]> <csvFile[4]>
	 */
	@Bean
	public CommandLineRunner run(RestTemplate restTemplate) throws Exception {

		return args -> {

			// Wrapping command line arguments in an object.
			Arguments arguments = new Arguments(args);

			// Making source data available.
			CSVFileReader csvFileReader = new CSVFileReader(arguments.getCsvFile(), ',');
			csvFileReader.loadData();

			// Authenticating to get an JSON Web Token.
			String jwtToken = new LithoAuth(arguments.getEndpoint(), arguments.getUsername(), arguments.getPassword()).authenticateAndGetJWT();

			// Only literature is supported. In future there might be additional if clauses.
			if (IMPORT_TYPE.LITERATURE.equals(arguments.getImportType())) {

				// Initializing the literature importer.
				LiteratureImporter literatureImporter = new LiteratureImporter(jwtToken, arguments.getEndpoint());

				// Uploading each row:
				for (Map<String, String> rowAsMap : csvFileReader.getAllRowsAsMap()) {

					LiteratureDTO literatureDTO = mapRowToLiteratureDTO(rowAsMap);

					// The API will be called:
					literatureImporter.upload(literatureDTO);

				}

			}

			if (IMPORT_TYPE.MATERIAL.equals(arguments.getImportType())) {
				MaterialImporter importer = new MaterialImporter(jwtToken, arguments.getEndpoint());

				Map<String, MaterialDTO> sourceId2MaterialDTO = new HashMap<String, MaterialDTO>();
				// Uploading each row:
				for (Map<String, String> rowAsMap : csvFileReader.getAllRowsAsMap()) {

					MaterialDTO dto = mapRowToMaterialDTO(rowAsMap);

					// The API will be called for create:
					sourceId2MaterialDTO.put(dto.getSourceId(), importer.createOrUpdate(dto));

				}

				for (MaterialDTO dto : sourceId2MaterialDTO.values()) {

					MaterialDTO parent1 = sourceId2MaterialDTO.get(dto.getRockParent());
					if (parent1 != null) {
						dto.setParent1Id(parent1.getId());
					}

					MaterialDTO parent2 = sourceId2MaterialDTO.get(dto.getRockParent2());
					if (parent2 != null) {
						dto.setParent2Id(parent2.getId());
					}

				}

				for (MaterialDTO dto : sourceId2MaterialDTO.values()) {
					// The API will be called for update:
					importer.createOrUpdate(dto);
				}
			}

			{// Brute force shutdown is used to make things not more complicated than necessary...
				System.out.println("shutting down with System.exit(0)");
				System.exit(0);
			}

		};
	}

	/**
	 * Mapping the values of each row to a new data transfer object. Could be moved to an extra class...
	 */
	private LiteratureDTO mapRowToLiteratureDTO(Map<String, String> rowAsMap) {

		// The data transfer object has to be in sync with the API (e.g. attribute names). So if the API changes the DTO has to be changed too.
		LiteratureDTO dto = new LiteratureDTO();

		dto.setAuthor(rowAsMap.get("author"));
		dto.setTitle(rowAsMap.get("title"));
		dto.setYear(toInteger(rowAsMap.get("year")));
		dto.setNumber(rowAsMap.get("number"));
		dto.setJournal(rowAsMap.get("journal"));
		dto.setVolume(rowAsMap.get("volume"));
		dto.setPages(toInteger(rowAsMap.get("pages")));
		dto.setPublisher(rowAsMap.get("publisher"));
		dto.setDoi(rowAsMap.get("doi"));
		dto.setMonth(toInteger(rowAsMap.get("month")));
		dto.setInstitution(rowAsMap.get("institution"));
		dto.setType(rowAsMap.get("type"));
		dto.setNote(rowAsMap.get("note"));
		dto.setSchool(rowAsMap.get("school"));
		dto.setBooktitle(rowAsMap.get("booktitle"));
		dto.setEditor(rowAsMap.get("editor"));
		dto.setKeywords(rowAsMap.get("keywords"));
		dto.setAbstr(rowAsMap.get("abstract"));
		dto.setLanguage(rowAsMap.get("language"));
		dto.setSeries(rowAsMap.get("series"));
		dto.setChapter(rowAsMap.get("chapter"));
		dto.setHowpublished(rowAsMap.get("howpublished"));
		dto.setOrganization(rowAsMap.get("organization"));
		dto.setOtherId(rowAsMap.get("otherId"));

		return dto;

	}

	/**
	 * Mapping the values of each row to a new data transfer object. Could be moved to an extra class...
	 */
	private MaterialDTO mapRowToMaterialDTO(Map<String, String> rowAsMap) {

		// The data transfer object has to be in sync with the API (e.g. attribute names). So if the API changes the DTO has to be changed too.
		MaterialDTO dto = new MaterialDTO();

		dto.setSourceId(shortTo256(rowAsMap.get("id")));
		dto.setName(shortTo256(rowAsMap.get("name")));
		dto.setDescription(shortTo256(rowAsMap.get("description")));
		dto.setEntrytype(shortTo256(rowAsMap.get("entrytype")));
		dto.setDispformulasimple(shortTo256(rowAsMap.get("dispformulasimple")));
		dto.setImpurities(shortTo256(rowAsMap.get("impurities")));
		dto.setElements(shortTo256(rowAsMap.get("elements")));
		dto.setSigelements(shortTo256(rowAsMap.get("sigelements")));
		dto.setTlform(shortTo256(rowAsMap.get("tlform")));
		dto.setLanguage(shortTo256(rowAsMap.get("language")));
		dto.setLanguagemain(shortTo256(rowAsMap.get("languagemain")));
		dto.setOccurrence(shortTo256(rowAsMap.get("occurrence")));
		dto.setOtheroccurrence(shortTo256(rowAsMap.get("otheroccurrence")));
		dto.setDiapheny(shortTo256(rowAsMap.get("diapheny")));
		dto.setCleavage(shortTo256(rowAsMap.get("cleavage")));
		dto.setParting(shortTo256(rowAsMap.get("parting")));
		dto.setTenacity(shortTo256(rowAsMap.get("tenacity")));
		dto.setColour(shortTo256(rowAsMap.get("colour")));
		dto.setOpticalextinction(shortTo256(rowAsMap.get("opticalextinction")));
		dto.setFracture(shortTo256(rowAsMap.get("fracture")));
		dto.setHmin(shortTo256(rowAsMap.get("hmin")));
		dto.setHmax(shortTo256(rowAsMap.get("hmax")));
		dto.setLustre(shortTo256(rowAsMap.get("lustre")));
		dto.setLustretype(shortTo256(rowAsMap.get("lustretype")));
		dto.setSpecificgravity(shortTo256(rowAsMap.get("specificgravity")));
		dto.setStreak(shortTo256(rowAsMap.get("streak")));
		dto.setVarietyof(shortTo256(rowAsMap.get("varietyof")));
		dto.setSynid(shortTo256(rowAsMap.get("synid")));
		dto.setPolytypeof(shortTo256(rowAsMap.get("polytypeof")));
		dto.setCrystalform(shortTo256(rowAsMap.get("crystalform")));
		dto.setTrans(shortTo256(rowAsMap.get("trans")));
		dto.setStrunz1(shortTo256(rowAsMap.get("strunz1")));
		dto.setStrunz2(shortTo256(rowAsMap.get("strunz2")));
		dto.setStrunz3(shortTo256(rowAsMap.get("strunz3")));
		dto.setStrunz4(shortTo256(rowAsMap.get("strunz4")));
		dto.setStrunz9ed1(shortTo256(rowAsMap.get("strunz9ed1")));
		dto.setStrunz9ed2(shortTo256(rowAsMap.get("strunz9ed2")));
		dto.setStrunz9ed3(shortTo256(rowAsMap.get("strunz9ed3")));
		dto.setStrunz9ed4(shortTo256(rowAsMap.get("strunz9ed4")));
		dto.setStrunz10ed1(shortTo256(rowAsMap.get("strunz10ed1")));
		dto.setStrunz10ed2(shortTo256(rowAsMap.get("strunz10ed2")));
		dto.setStrunz10ed3(shortTo256(rowAsMap.get("strunz10ed3")));
		dto.setStrunz10ed4(shortTo256(rowAsMap.get("strunz10ed4")));
		dto.setSeries1(shortTo256(rowAsMap.get("series1")));
		dto.setSeries2(shortTo256(rowAsMap.get("series2")));
		dto.setSeries3(shortTo256(rowAsMap.get("series3")));
		dto.setDana1(shortTo256(rowAsMap.get("dana1")));
		dto.setDana2(shortTo256(rowAsMap.get("dana2")));
		dto.setDana3(shortTo256(rowAsMap.get("dana3")));
		dto.setDana4(shortTo256(rowAsMap.get("dana4")));
		dto.setDana8ed1(shortTo256(rowAsMap.get("dana8ed1")));
		dto.setDana8ed2(shortTo256(rowAsMap.get("dana8ed2")));
		dto.setDana8ed3(shortTo256(rowAsMap.get("dana8ed3")));
		dto.setDana8ed4(shortTo256(rowAsMap.get("dana8ed4")));
		dto.setSpacing(shortTo256(rowAsMap.get("spacing")));
		dto.setCsystem(shortTo256(rowAsMap.get("csystem")));
		dto.setCclass(shortTo256(rowAsMap.get("cclass")));
		dto.setSpacegroup(shortTo256(rowAsMap.get("spacegroup")));
		dto.setA(shortTo256(rowAsMap.get("a")));
		dto.setB(shortTo256(rowAsMap.get("b")));
		dto.setC(shortTo256(rowAsMap.get("c")));
		dto.setAlpha(shortTo256(rowAsMap.get("alpha")));
		dto.setBeta(shortTo256(rowAsMap.get("beta")));
		dto.setGamma(shortTo256(rowAsMap.get("gamma")));
		dto.setAerror(shortTo256(rowAsMap.get("aerror")));
		dto.setBerror(shortTo256(rowAsMap.get("berror")));
		dto.setCerror(shortTo256(rowAsMap.get("cerror")));
		dto.setAlphaerror(shortTo256(rowAsMap.get("alphaerror")));
		dto.setBetaerror(shortTo256(rowAsMap.get("betaerror")));
		dto.setGammaerror(shortTo256(rowAsMap.get("gammaerror")));
		dto.setVa3(shortTo256(rowAsMap.get("va3")));
		dto.setZ(shortTo256(rowAsMap.get("z")));
		dto.setDmeas(shortTo256(rowAsMap.get("dmeas")));
		dto.setDmeas2(shortTo256(rowAsMap.get("dmeas2")));
		dto.setDcalc(shortTo256(rowAsMap.get("dcalc")));
		dto.setDmeaserror(shortTo256(rowAsMap.get("dmeaserror")));
		dto.setDcalcerror(shortTo256(rowAsMap.get("dcalcerror")));
		dto.setCleavagetype(shortTo256(rowAsMap.get("cleavagetype")));
		dto.setFracturetype(shortTo256(rowAsMap.get("fracturetype")));
		dto.setMorphology(shortTo256(rowAsMap.get("morphology")));
		dto.setOpticalbireferror(shortTo256(rowAsMap.get("opticalbireferror")));
		dto.setSpecdispm(shortTo256(rowAsMap.get("specdispm")));
		dto.setSpacegroupset(shortTo256(rowAsMap.get("spacegroupset")));
		dto.setFormulanotes(shortTo256(rowAsMap.get("formulanotes")));
		dto.setImaStatus(shortTo256(rowAsMap.get("ima_status")));
		dto.setRockParent(shortTo256(rowAsMap.get("rock_parent")));
		dto.setRockParent2(shortTo256(rowAsMap.get("rock_parent2")));
		dto.setRockRoot(shortTo256(rowAsMap.get("rock_root")));
		return dto;

	}

	private String shortTo256(String string) {
		if (string.length() > 255) {
			return string.substring(0, 254);
		}
		return string;
	}

	public static Integer toInteger(String string) {
		if (string == null) {
			return null;
		}
		Integer result = null;
		try {
			result = Integer.parseInt(string);
		} catch (Exception e) {
			System.out.println("could not be parsed to int: " + string);
		}
		return result;

	}

}
