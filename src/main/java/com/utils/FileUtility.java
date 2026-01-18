package com.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class FileUtility {

	public static String getLocator(String LocatorKey ) {
		FileInputStream fis=null;
		String baseDir=System.getProperty("user.dir");
		
		try {
			fis = new FileInputStream(baseDir+"/src/test/resources/Locators.properties");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Properties prop=new Properties();
		try {
			prop.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String Value=prop.getProperty(LocatorKey);
		//System.out.println(Value);
		return Value;
	}
	
	
	
	public static void main(String[] args) throws IOException {
	
		
	}
}
