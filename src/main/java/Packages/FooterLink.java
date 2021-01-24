package Packages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FooterLink {
	
	By Footer=By.id("navFooter");
 Findby.tagName("a");
	public WebDriver driver;
	
	public FooterLink(WebDriver driver) {
		// TODO Auto-generated constructor stub
	this.driver =driver;
	}
	
	
	public List<WebElement> LinkCount() {
		return driver.findElements(Footer);
	}
	public WebElement click() {
		return (WebElement) Footer.findElements(Link);
	}

}
