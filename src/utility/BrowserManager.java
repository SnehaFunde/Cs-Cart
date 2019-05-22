package utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BrowserManager 
{
	WebDriver driver;
	@Test
	public void invokeBrowser()
	{
		try
		{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Webdriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://demo.cs-cart.com/");
		}
		catch(Exception e)
		{
			Assert.assertFalse(false);
		}
	}
	
	@Test
	public void close_Browser()
	{
		driver.close();
	}

}
