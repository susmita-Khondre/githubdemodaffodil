package com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Keyword;
import com.utils.WaitFor;

import static com.utils.WaitFor.*;

import static com.base.Keyword.*;



public class HomePage {
 //By LoginSignupCloseButtonPopup=By.xpath("//span[@class=\"logSprite icClose\"]");
By FromInputCityBox=By.xpath("//input[@id=\"fromCity\"]");
By FromCityTextBox = By.xpath("//input[@placeholder=\"From\"]");
By cityName_1=By.xpath("(//div[@class=\"revampedSearchSuggestionMain\"])[1]");

By To_InputCityBox =By.xpath("//div[@class=\"flt_fsw_inputBox searchToCity inactiveWidget \"]//input");
By To_CityTextBox = By.xpath("//input[@autocomplete=\"off\"]");
By To_SelectCityName1 =By.xpath("(//div[@class=\"revampedSuggestionContent\"])[1]/p[contains(text(),\"Shirdi Airport\")]");
By Departure_Date= By.xpath("(//div[@class=\"DayPicker-Month\"])[1]//div[@class=\"DayPicker-Body\"]//div[@aria-label=\"Tue Jan 20 2026\"]");

//By Search_Button= By.xpath("//a[contains(text(),\"Search\")]\"");

@FindBy(xpath="//a[contains(text(),'Search')]")
WebElement Search_Button;

@FindBy(xpath="//span[@class=\"logSprite icClose\"]")
WebElement LoginSignupCloseButtonPopup;

public HomePage() {
	PageFactory.initElements(driver, this);
}

public void clickOnLoginSignupCloseButtonPopup() {	
	LoginSignupCloseButtonPopup.click();
}

public void clickOnFromCityInputBox() {
	clickOnElement(FromInputCityBox);
}

public void enterTextFromCityTextBox(String textToEnter) {
	WaitFor.elementToBeClickable(FromCityTextBox);
	enterText(FromCityTextBox, textToEnter);

}
public void clickOnCityName() {
	WaitFor.elementToBeClickable(cityName_1);
	clickOnElement(cityName_1);

}
public void clickOnToInputCityBox() {
	clickOnElement(To_InputCityBox);

}
public void enterTextToCityTextBox(String textToEnter) {
	
	enterText(To_CityTextBox, textToEnter);

}
public void clickOnToCityName() {
	WaitFor.elementTopresent(To_SelectCityName1);;
	clickOnElement(To_SelectCityName1);

}
public void clickOnDepartureDate() {
	WaitFor.elementToBeClickable(Departure_Date);
	clickOnElement(Departure_Date);

}
public void clickOnSearchButton() throws InterruptedException {
Thread.sleep(3000);
	Search_Button.click();

}

}
