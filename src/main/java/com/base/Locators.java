package com.base;

public interface Locators {

String Login_Signup_Close_Button_Popup = "//span[@class=\"logSprite icClose\"]";
String	From_InputBox = "//input[@id=\"fromCity\"]";
String From_TextBox = "//input[@placeholder=\"From\"]";
String From_CityName= "//div[@class=\"react-autosuggest__section-container react-autosuggest__section-container--first\"]//ul//li)[1]";
String To_InputBox = "//div[@class=\"flt_fsw_inputBox searchToCity inactiveWidget \"]//input";
String To_TextBox = "//input[@autocomplete=\"off\"]";
String To_CityName ="//div[@class=\"makeFlex column flexOne\"])[1]";
String Departure_Date= "//div[@class=\"DayPicker-Month\"])[1]//div[@class=\"DayPicker-Body\"]//div[@aria-label=\"Mon Jan 08 2026\"]";
String Search_Button= "//a[contains(text(),\"Search\")]";
}
