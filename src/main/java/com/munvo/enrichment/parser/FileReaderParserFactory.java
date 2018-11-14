package com.munvo.enrichment.parser;
/**
 * Factory class to create CSV or JSON parsers.
 * @author artsiomskliar
 *
 */
public class FileReaderParserFactory {
	
	public FileReaderParser makeFileReaderParser(String type) throws IllegalArgumentException { 
		
		switch (type.toUpperCase()) {
		
			case "CSV": 
				return new CSVReaderParser();
			
			case "JSON":
				return new JSONReaderParser();
				
			default :
				throw new IllegalArgumentException("Invalid Format Type.");				
		}
	}

}
