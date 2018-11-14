package com.munvo.enrichment.parser;

import com.munvo.enrichment.model.Subscriber;

public class CSVReaderParser implements FileReaderParser{
	
	@Override
	public Subscriber parseSubscriber(String subline) {
		
		int id;
		String name;
		String phone;
		
		String[] tokens = subline.split(",");
		id = Integer.parseInt(tokens[0]);
		name = tokens[1].replaceAll("\"", "");
		phone = tokens[2].replaceAll("\"", "");
		
		return new Subscriber(id, name, phone);
	}
	
}
