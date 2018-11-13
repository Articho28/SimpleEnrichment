package com.munvo.enrichment.configuration;

import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;

public class Configuration {

    private String studentName;
    private String type;
    private String fileName;
    
    
    //Static variable that will be the instance.
    private static Configuration configurationInstance = null;
    
    //Public static method that creates instance if it has not yet been created.
    public static Configuration getInstance() { 
    	
    	if (configurationInstance == null) {
    		configurationInstance = new Configuration();
    	}    	
    	return configurationInstance;
    }
    
    //Change constructor to private so new object can only be created by getInstance(). 
    private Configuration() {
        Config config = ConfigFactory.load();
        this.studentName = config.getString("name");
        this.type = config.getString("type");
        this.fileName = config.getString("fileName");
    }

    public String getStudentName() {
        return studentName;
    }

    public String getType() {
        return type;
    }

    public String getFileName() {
        return fileName;
    }
    
    @Override
    public String toString() { 
		return "{\"studentName\":" + studentName + ", \"type\": " + type + ", \"fileName\":" + fileName + "}";
    }
}