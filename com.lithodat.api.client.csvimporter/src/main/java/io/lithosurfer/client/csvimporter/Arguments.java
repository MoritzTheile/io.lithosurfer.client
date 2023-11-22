package io.lithosurfer.client.csvimporter;

import java.io.File;

public class Arguments {

	// an enumeration to keep track of supported imports
	public static enum IMPORT_TYPE {
		LITERATURE, MATERIAL, FILTER_MATERIAL
	};

	private final String endpoint;
	private final String username;
	private final String password;
	private final IMPORT_TYPE importType;
	private final File csvFile;

	public Arguments(String[] args) throws Exception {

		if (args.length != 5) {
			throw new Exception("arguments required: CSVImporter <endpoint> <username> <password> <importType> <csvFile>");
		}

		endpoint = args[0];
		username = args[1];
		password = args[2];
		importType = toEnum(args[3]);
		csvFile = toFile(args[4]);

	}

	private IMPORT_TYPE toEnum(String importType) throws Exception {

		String stringUpperCase = importType.toUpperCase();

		IMPORT_TYPE table = IMPORT_TYPE.valueOf(stringUpperCase);

		if (table == null) {
			throw new Exception("Import type " + importType + " not supported. Supported types are: " + IMPORT_TYPE.values());
		}

		return table;
	}

	private File toFile(String string) throws Exception {

		File file = new File(string);

		if (!file.exists()) {

			throw new Exception("File " + file.getAbsolutePath() + " does not exist.");

		}

		return file;
	}

	public String getEndpoint() {
		return endpoint;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	public IMPORT_TYPE getImportType() {
		return importType;
	}

	public File getCsvFile() {
		return csvFile;
	}

}
