package com.jobma.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.jobma.qa.pages.Dashboard;
import com.jobma.qa.pages.LoginPage;
import com.jobma.qa.util.Utils;

import io.github.bonigarcia.wdm.WebDriverManager;

public  class TestBase {
	
	public static Properties prop;
	public static WebDriver driver;
	public static LoginPage lp;
	public static Dashboard db;
	
	
	public TestBase()
	{
		try {
	           System.out.println("properties try block");
			 prop = new Properties();
			FileInputStream fs = new FileInputStream("/Users/apple/Documents/jobma_Self/New_Project_25-02_2024/src/main/java/com/jobma/qa/config/config.properties");
			prop.load(fs);
		
			
			
			
		}
		 catch (IOException e) {
			 System.out.println("catch");
	            e.printStackTrace();
	        }
	}
	
	public static void  initialize() throws InterruptedException
	{
		String browser = prop.getProperty("browser");
		
		if(browser.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(prop.getProperty("url"));
		Thread.sleep(1000);
		
		
		// Utils.wait(driver, lp.usernamefield);
		
		
	}
	
	public static void exit()
	{
		driver.quit();
	}
	
	
	
	
	

}
