package com.munvo.enrichment.parser;

import com.munvo.enrichment.model.Subscriber;

/**
 * Class that parses subscriber.json file and returns Subscriber object.. 
 * @author Artsiom Skliar (Github: Articho28)
 *
 */

public class JSONReaderParser implements FileReaderParser {
	
	@Override
	public Subscriber parseSubscriber(String subline) {
		
		int id;
		String name;
		String phone;
				
		//Split the string line into tokens.
		String[] tokens = subline.split(":|,");
		
		//Remove whitespace, double quotes, and curly brackets.
		id = Integer.parseInt(tokens[1].replaceAll("\\s", ""));
		name = tokens[3].replaceAll("\\s|\"", "");
		phone = tokens[5].replaceAll("\\s|}|\"", "");
		
		return new Subscriber(id, name, phone);
	}	
}
