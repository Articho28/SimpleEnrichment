package com.munvo.enrichment.parser;

import com.munvo.enrichment.model.Subscriber;

public class JSONReaderParser implements FileReaderParser {
	
	@Override
	public Subscriber parseSubscriber(String subline) {
		
		int id;
		String name;
		String phone;
				
		String[] tokens = subline.split(":|,");
		id = Integer.parseInt(tokens[1].replaceAll("\\s", ""));
		name = tokens[3].replaceAll("\\s|\"", "");
		phone = tokens[5].replaceAll("\\s|}|\"", "");
		
		return new Subscriber(id, name, phone);
		
	}	
}
