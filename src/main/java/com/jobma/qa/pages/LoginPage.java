package com.jobma.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.jobma.qa.base.TestBase;

public class LoginPage extends TestBase {
	@FindBy(xpath="//input[contains(@id,'jobma_user_name')]")
	WebElement usernamefield;
	
	@FindBy(xpath="//input[contains(@id,'password')]")
	WebElement passwordfield;
	
	@FindBy(xpath="//span[contains(text(),'Login to your account')]")
	WebElement loginbtn;
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public Dashboard login() throws InterruptedException
	{  
		usernamefield.sendKeys(prop.getProperty("username"));
		
		passwordfield.sendKeys(prop.getProperty("password"));
	
		Thread.sleep(2000);
		loginbtn.click();
		return new Dashboard();
		
		
	}
	
	
	
	
	
	
	
	
	
	
	

}
