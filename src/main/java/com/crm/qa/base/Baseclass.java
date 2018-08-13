package com.crm.qa.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.crm.qa.utility.WebEventListener;

public class Baseclass {
public static Properties prop;
public static WebDriver e_driver;
public static EventFiringWebDriver driver;
public static WebEventListener eventListener;


	public  Baseclass() throws IOException {
	File f = new File("./src\\main\\java\\com\\crm\\qa\\config\\config.properties");
	FileInputStream IP = new FileInputStream(f);
	 prop = new Properties();
	prop.load(IP);
	}
	
	
	public void Initiate() throws Exception {
		
		
		if(prop.getProperty("browser").equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./Drivers\\chromedriver.exe");
			e_driver =new ChromeDriver();
			driver = new EventFiringWebDriver(e_driver);
			 eventListener = new WebEventListener();
			driver.register(eventListener);

		}
		else if(prop.getProperty("browser").equals("headlesschrome")) {
			
			ChromeOptions ch = new ChromeOptions();
			 ch.addArguments("headless");
		     ch.addArguments("window-size=1200x600");
		     System.setProperty("webdriver.chrome.driver", "./Drivers\\chromedriver.exe");
			e_driver = new ChromeDriver(ch);
			
			
		} 
		
		else{
			System.setProperty("webdriver.gecko.driver", "./Drivers\\geckodriver.exe");
			e_driver = new FirefoxDriver();
		}
		
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(prop.getProperty("url"));
	/*	driver.manage().timeouts().pageLoadTimeout(2000, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);*/
		Thread.sleep(2000l);
		
		}

		
		
	}
	
