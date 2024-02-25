package com.jobma.qa.test;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.jobma.qa.base.TestBase;
import com.jobma.qa.pages.Dashboard;
import com.jobma.qa.pages.LoginPage;

public class LoginPageTest extends TestBase {
	
	
	
	@BeforeTest()
	public void setup() throws InterruptedException
	{
		TestBase.initialize();
		 lp = new LoginPage();
		
		
	}
	
	@Test()
	public void loginPageTest() throws InterruptedException
	{
		 lp.login();
		
		 
		 Thread.sleep(5000);
		Dashboard db = new Dashboard();
		String s = db.dashboardTitle();
		assertEquals(s, "Dashboard");
		
		
	}
	
	@Test()
	public void loginPageTest1() throws InterruptedException
	{
		 lp.login();
		
		 
		 Thread.sleep(5000);
		Dashboard db = new Dashboard();
		String s = db.dashboardTitle();
		assertEquals(s, "Dashboard");
		
		
	}
	
	@AfterTest()
	public void close()
	{
		TestBase.exit();
	}
	
	

}
