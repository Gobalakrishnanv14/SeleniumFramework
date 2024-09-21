package com.Automationexercise;

import java.util.Properties;

public class Readproperty {

	public static String URL;

	static Properties prop = new Properties();
	static String propFileName = "config.properties";

	public static String readURL() throws Exception {
		try {
			prop.load(Thread.currentThread().getContextClassLoader().getResourceAsStream(propFileName));

			if (prop.getProperty("Environment").equalsIgnoreCase("Test")) {
				URL = prop.getProperty("testURL");
			} else if (prop.getProperty("Environment").equalsIgnoreCase("IFT")) {
				URL = prop.getProperty("IFTURL");
			}
			return URL;

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

}
