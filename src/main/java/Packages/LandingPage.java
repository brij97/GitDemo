package Packages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
	
	WebDriver driver;
	
	//By signin = By.cssSelector("a._1_3w1N");
      By AccList=By.id("nav-link-accountList");
  
	
	public LandingPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}


	public WebElement AccountList()
	{
		return driver.findElement(AccList);
	}
	
	
}
