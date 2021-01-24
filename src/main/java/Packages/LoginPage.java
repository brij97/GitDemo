package Packages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

	public WebDriver driver;
	
	By Email =By.id("ap_email");
	By go=By.id("continue");
	By Pass=By.id("ap_password");
    By submit=	By.id("signInSubmit");
    By RePass=By.xpath("//input[@id='ap_password']");
  

	public LoginPage(WebDriver driver) {
			// TODO Auto-generated constructor stub
		this.driver =driver;
		}

	public WebElement UserID()
	{
		return driver.findElement(Email);
	}
	public WebElement Submit() {
		return driver.findElement(go);
	}
	public WebElement Password() {
		return driver.findElement(Pass);
	}
	public WebElement SigninSubmit() {
		return driver.findElement(submit);
	}

	public WebElement ReenterPassword() {
		// TODO Auto-generated method stub
	return driver.findElement(RePass);
	}
	}

