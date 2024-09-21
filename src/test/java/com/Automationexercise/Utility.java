package com.Automationexercise;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Utility {

	public static void main(String[] args) {

		Properties properties = new Properties();

		try {

			FileInputStream input = new FileInputStream("config.properties");
			properties.load(input);
			input.close();

			// Access properties
			String url = properties.getProperty("testURL");

			System.out.println("Database URL: " + url);

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
