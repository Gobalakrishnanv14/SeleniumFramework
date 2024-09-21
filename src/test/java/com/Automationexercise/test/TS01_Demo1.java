package com.Automationexercise.test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.Automationexercise.TestBase;
import com.Automationexercise.pages.Demo1;

public class TS01_Demo1 extends TestBase {

	Demo1 demo1;

	TestBase Login;

	@Test
	public void initializePageFactory() {

		demo1 = PageFactory.initElements(driver, Demo1.class);

		Login = PageFactory.initElements(driver, TestBase.class);

	}

	@Test
	public void test1() throws Exception {

		Login.test1();
	}

	@Test
	public void cart() throws Exception {

		demo1.cart();
	}

}
