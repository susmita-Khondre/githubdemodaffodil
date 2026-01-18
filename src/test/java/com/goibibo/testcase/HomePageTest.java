package com.goibibo.testcase;
import static com.base.LocatorType.*;

import com.Pages.HomePage;
import static com.Pages.HomePage.*;
import com.base.*;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import static com.base.LocatorType.*;
import com.base.Keyword;
import com.base.LocatorType;
import com.base.TestBase;
import static com.utils.FileUtility.*;
import static com.base.Locators.*;

public class HomePageTest extends TestBase{
@Test
	public void VerifySearchButtonForFlights() throws InterruptedException {

		driver.get("https://www.goibibo.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class=\"logSprite icClose\"]")).click();
		
		driver.findElement(By.xpath("//input[@id=\"fromCity\"]")).click();//from input box
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder=\"From\"]")).sendKeys("Pune");//from text box
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class=\"react-autosuggest__section-container react-autosuggest__section-container--first\"]//ul//li)[1]")).click();//SelectCityFromDropdown	
		driver.findElement(By.xpath("//div[@class=\"flt_fsw_inputBox searchToCity inactiveWidget \"]//input")).click();//To input box
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@autocomplete=\"off\"]")).sendKeys("Mumbai");//to text box
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class=\"makeFlex column flexOne\"])[1]")).click();//Select To City From Dropdowmn
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class=\"DayPicker-Month\"])[1]//div[@class=\"DayPicker-Body\"]//div[@aria-label=\"Mon Jan 08 2026\"]")).click();
		
		Actions action=new Actions(driver);
		action.scrollByAmount(0, 300);
		action.perform();
		driver.findElement(By.xpath("//a[contains(text(),\"Search\")]")).click();	
	}

@Test
public  void VerifySearchButtonForFlightsUsingKeyword() {
	
	openUrl("https://www.goibibo.com/");
	clickOnElement(XPATH,Login_Signup_Close_Button_Popup);
	clickOnElement(XPATH,From_InputBox);
	enterText(XPATH,From_TextBox, "Mumbai");
	clickOnElement(XPATH,From_CityName);
	clickOnElement(XPATH,To_InputBox );
	clickOnElement(XPATH,To_TextBox);
	enterText(XPATH,To_TextBox, "Pune");
	clickOnElement(XPATH,To_CityName);
	clickOnElement(XPATH, Departure_Date);
	clickOnElement(XPATH, Search_Button);
	

}
@Test
public void VerifySearchButtonForFlightsUsingPOM() throws InterruptedException {
	
	HomePage homepage=new HomePage();
	homepage.clickOnLoginSignupCloseButtonPopup();//@FindBy
	homepage.clickOnFromCityInputBox();
	
	homepage.enterTextFromCityTextBox("Mumbai");
	homepage.clickOnCityName();
	
	homepage.clickOnToInputCityBox();
	homepage.enterTextToCityTextBox("Shirdi");
	homepage.clickOnToCityName();
	
	homepage.clickOnDepartureDate();
	homepage.clickOnSearchButton();//@FindBy
	
}

	
}



















