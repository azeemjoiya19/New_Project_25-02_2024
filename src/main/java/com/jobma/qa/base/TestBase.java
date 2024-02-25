package com.jobma.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.jobma.qa.pages.Dashboard;
import com.jobma.qa.pages.LoginPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public  class TestBase {
	
	public static Properties prop;
	public static WebDriver driver;
	public static LoginPage lp;
	public static Dashboard db;
	
	
	public TestBase()
	{
		try {
			System.out.println("test1");
			 prop = new Properties();
			FileInputStream fs = new FileInputStream("D:\\Java_Selenium_Project\\src\\main\\java\\com\\jobma\\qa\\config\\config.properties");
			prop.load(fs);
			System.out.println("test2");
			
			
			
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
		Thread.sleep(3000);
		
		
	}
	
	public static void exit()
	{
		driver.quit();
	}
	
	
	
	
	

}
