package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Actions_Manager 
{
	WebDriver driver;
	@Test
	public void mouse_hover_activity(WebElement element)
	{		
		Actions action=new Actions(driver);
		action.moveToElement(element).build().perform();
	}

}
