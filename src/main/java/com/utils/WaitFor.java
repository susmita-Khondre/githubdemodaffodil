package com.utils;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.base.Keyword;

public class WaitFor {
	public static WebDriverWait wait;
	
	static{
	 wait=new WebDriverWait(Keyword.driver,Duration.ofSeconds(60));
	 
	 wait.pollingEvery(Duration.ofMillis(500));
	 wait.withMessage("Element is not present");
	 
	}
	
	public static void elementToBeClickable(By locator) {
		wait.until(ExpectedConditions.elementToBeClickable(locator));

	}
	public static void elementTopresent(By locator) {
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));

	}
	public void elementToBevisble(By locator) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));

	}
	
	
}
