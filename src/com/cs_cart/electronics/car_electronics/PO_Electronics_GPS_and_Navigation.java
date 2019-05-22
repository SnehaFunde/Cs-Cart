package com.cs_cart.electronics.car_electronics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PO_Electronics_GPS_and_Navigation 
{
	
	WebDriver driver;
	
	public PO_Electronics_GPS_and_Navigation(WebDriver driver)
	{
		this.driver=driver;
	}
	
	@FindBy(how=How.XPATH,using="(//a[contains(text(),'Electronics')])[3]")
	private WebElement electronics_link;
	
	public void click_Electronics()
	{
		Actions action=new Actions(driver);
		WebDriverWait wait=new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//a[contains(text(),'Electronics')])[3]")));
		action.moveToElement(electronics_link).click().perform();
	
	}
	
	

}
