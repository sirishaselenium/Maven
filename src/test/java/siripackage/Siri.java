package siripackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Siri {
	WebDriver driver;
	@Test
	public void m(){
		driver = new FirefoxDriver();
		
		
	}
	@Test
	public void s()
	{
		driver.get("https://www.google.com/?gws_rd=ssl");
	}

}
