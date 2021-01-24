package Packages;

import java.io.FileInputStream;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.*;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Base{
	
	public WebDriver driver;
	public Properties prop;
	public WebDriver intializer() throws IOException
	{
       Properties prop = new Properties();
       FileInputStream fis = new FileInputStream("C:\\Users\\91829\\eclipse-workspace\\MyProject\\Data.properties");
       prop.load(fis);
    String BrowserName=   prop.getProperty("browser");
    
    if(BrowserName.equals("chrome"))
    {
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\91829\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		 driver =  new ChromeDriver();
    }
       return driver;
       
	
	}

}
