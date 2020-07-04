package com.test.Utill;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class TestBase {
public static WebDriver driver;
public static Properties prop;
public static EventFiringWebDriver e_driver;
public static WebEventListener eventListener;

	public TestBase() {
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream(
		System.getProperty("user.dir") + "\\src\\test\\java\\com\\test\\config\\config.properties");
		prop.load(ip);
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}	
		}
	public void initialization() {
		String browserName = prop.getProperty("browser");
		
		if (browserName.equals("chrome")) {
		System.setProperty("webdriver.chrome.driver",
			System.getProperty("user.dir") + "\\webDriver\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize();driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtill.PAGE_LOAD_TIMEOUT,
				TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtill.IMPLICIT_WAIT,
		TimeUnit.SECONDS);
		
		}
	}	 
	//public String readProperty(String key) {
		//return prop.getProperty(key);
		
	
	public static void getDriver(String URL) {
		driver.get(prop.getProperty("URL"));
		
		
	}
}
