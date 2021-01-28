package Packages;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

@Test
public class HomePage extends Base{

	public WebDriver driver ;
	
	
public void pageNavigation() throws IOException
{
	driver =   intializer();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	LandingPage l =new LandingPage(driver);
	l.AccountList().click();
	LoginPage lp = new LoginPage(driver);
	lp.UserID().sendKeys("mishrabrijesh612@gmail.com");
	lp.Submit().click();
	lp.Password().sendKeys("Gyan$123");
	lp.SigninSubmit().click();
	System.out.println("updated github")
	
}

public validate
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	HomePage pn = new HomePage();
	pn.pageNavigation();
	
	
	

		

	}
	

}
