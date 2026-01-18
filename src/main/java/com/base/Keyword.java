package com.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.exceptions.InvalidBrowserNameException;

public class Keyword {

	public static  RemoteWebDriver driver;


	public static void openBrowser(String browserName) {

		if (browserName.equalsIgnoreCase("Chrome")) {
			 driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("Edge")) {
			driver = new EdgeDriver();

		} else if (browserName.equalsIgnoreCase("Firefox")) {
			driver = new FirefoxDriver();

		} else {
			throw new InvalidBrowserNameException(browserName);
		}

	}
	public static void openUrl(String url) {
		driver.get(url);

	}
	
	public static void clickOnElement(String locatorType,String locator) {
		getElement(locatorType, locator).click();
		
	}
	
	public static void enterText(String locatorType,String locator,String text) {
		getElement(locatorType, locator).sendKeys(text);
	}
	
	public static WebElement getElement(String locatorType,String locator ) {
		 WebElement e=null;
		 
		 if(locatorType.equalsIgnoreCase("id")) {
				e=driver.findElement(By.id(locator));
			}else if(locatorType.equalsIgnoreCase("name")) {
				e=driver.findElement(By.name(locator));
			}else if(locatorType.equalsIgnoreCase("classname")) {
				e=driver.findElement(By.className(locator));
			}else if(locatorType.equalsIgnoreCase("tagname")) {
				e=driver.findElement(By.tagName(locator));
			}else if(locatorType.equalsIgnoreCase("linktext")) {
				e=driver.findElement(By.linkText(locator));
			}else if(locatorType.equalsIgnoreCase("partiallinktext")) {
				e=driver.findElement(By.partialLinkText(locator));
			}else if(locatorType.equalsIgnoreCase("xpath")) {
				e=driver.findElement(By.xpath(locator));
			}else if(locatorType.equalsIgnoreCase("cssselector")) {
				e=driver.findElement(By.cssSelector(locator));
			}
		 
		return e;

	}
	
	
	public static void closeWindow() {
		driver.close();

	}
	public static void quiteAllWindow() {
		driver.quit();

	}
	public static void clickOnElement(By locator) {
		driver.findElement(locator).click();
		
	}
	public static void enterText(By locator, String textToEnter) {
		driver.findElement(locator).sendKeys(textToEnter);
		
	}

	

	
}
	

