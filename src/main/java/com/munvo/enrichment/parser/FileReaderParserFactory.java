package com.munvo.enrichment.parser;

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
