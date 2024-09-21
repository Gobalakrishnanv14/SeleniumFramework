package com.Automationexercise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class TestBase {

	public static WebDriver driver;

	public TestBase() {

		PageFactory.initElements(driver, this);

	}

	@BeforeTest
	public void test1() throws Exception{

		try {

			System.setProperty("webdriver.edge.driver",
					"C:\\Workspace\\Automation_Framework\\drivers\\msedgedriver.exe");

			driver = new EdgeDriver();
			Thread.sleep(2000);

			driver.get(Readproperty.readURL());
			Thread.sleep(2000);

			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@AfterTest
	public void tearDown() {

		try {

			driver.close();
			driver.quit();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
