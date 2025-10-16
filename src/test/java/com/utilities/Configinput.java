package com.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Configinput {

	    private Properties properties;
	 
	    public Configinput() {

	        properties = new Properties();

	        try (FileInputStream fis = new FileInputStream("./MajorSeleniumProject/src/test/resources/login.config")) {

	            properties.load(fis);

	        } catch (IOException e) {

	            e.printStackTrace();

	            throw new RuntimeException("Failed to load config.properties file.");

	        }

	    }
	 
	    public String getProperty(String key) {

	        return properties.getProperty(key);

	    }

	}
