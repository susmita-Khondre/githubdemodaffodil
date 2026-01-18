package com.base;

import org.testng.annotations.BeforeMethod;

public class TestBase extends Keyword{

	@BeforeMethod
	public void luanchBrowser() {
	openBrowser("Chrome");
	  System.out.println("Browser is luanched sucessfully");
	  driver.get("https://www.goibibo.com/");
		driver.manage().window().maximize();
	}
	
}
