package com.jobma.qa.test;

import static org.testng.Assert.assertEquals;

import org.bouncycastle.jcajce.provider.symmetric.util.PBE.Util;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.jobma.qa.base.TestBase;
import com.jobma.qa.pages.Dashboard;
import com.jobma.qa.pages.LoginPage;
import com.jobma.qa.util.Utils;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
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
		db =  lp.login();
		
		 db = new Dashboard();
		 Utils.wait(driver, db.dashboardtitle );
		String s = db.dashboardTitle();
		assertEquals(s, "Dashboard");
		
		
	}
	
	
	
	
	
		
		
	
	
	@AfterTest()
	public void close()
	{
		TestBase.exit();
	}
	
	

}
