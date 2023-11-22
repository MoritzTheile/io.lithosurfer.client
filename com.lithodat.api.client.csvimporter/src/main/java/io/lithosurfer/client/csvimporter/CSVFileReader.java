package io.lithosurfer.client.csvimporter;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.databind.MappingIterator;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvParser;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;

public class CSVFileReader {

	private List<String> columnNames;

	private List<String[]> rows = new ArrayList<>();

	private File file;

	private Character columnSeperator;

	public CSVFileReader(File file, Character columnSeperator) throws Exception {

		this.file = file;
		this.columnSeperator = columnSeperator;

	}

	public void loadData() throws Exception {

		CsvMapper mapper = new CsvMapper();

		mapper.enable(CsvParser.Feature.WRAP_AS_ARRAY);

		CsvSchema schema = CsvSchema.emptySchema().withColumnSeparator(columnSeperator);

		MappingIterator<String[]> it = mapper.readerFor(String[].class).with(schema).readValues(file);

		// reading whole file into memory
		while (it.hasNext()) {

			String[] row = it.next();

			// the first row is the header
			if (columnNames == null) {

				columnNames = Arrays.asList(row);

			} else {

				rows.add(row);

			}

		}

	}

	public List<String> getColumnNames() {

		return columnNames;

	}

	private Map<String, String> getRowAsMap(String[] row) {

		Map<String, String> rowAsMap = new HashMap<>();

		for (int i = 0; i < columnNames.size(); i++) {

			rowAsMap.put(columnNames.get(i), row[i]);

		}

		return rowAsMap;
	}

	public List<Map<String, String>> getAllRowsAsMap() {

		List<Map<String, String>> allRowsAsMap = new ArrayList<>();

		for (String[] row : rows) {

			allRowsAsMap.add(getRowAsMap(row));

		}

		return allRowsAsMap;

	}

}
