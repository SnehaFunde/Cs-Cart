package com.cs_cart.electronics.car_electronics_TC;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.cs_cart.electronics.car_electronics.PO_Electronics_GPS_and_Navigation;

import utility.BrowserManager;

public class TC_Electronics_GPS_and_Nevigation 
{
	static WebDriver driver;
	PO_Electronics_GPS_and_Navigation gps_navigation=new PO_Electronics_GPS_and_Navigation(driver);
	BrowserManager brwser=new BrowserManager();
	@BeforeMethod
	public void open_url()
	{
		brwser.invokeBrowser();
	}
	
	@Test
	public void validate_Electronics()
	{
		gps_navigation=PageFactory.initElements(driver,PO_Electronics_GPS_and_Navigation.class);
		gps_navigation.click_Electronics();
	}
	
	/*@AfterMethod
	public void close_url()
	{
		brwser.close_Browser();
	}*/
	
	

}
