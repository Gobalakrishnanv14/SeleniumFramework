package com.Automationexercise.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Automationexercise.TestBase;

public class Demo1 extends TestBase {

	public Demo1() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[3]/a")
	WebElement cart1;

	public void cart() throws Exception {

		try {

			Thread.sleep(4000);

			cart1.click();
			Thread.sleep(6000);

			System.out.println(driver.getTitle());

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
