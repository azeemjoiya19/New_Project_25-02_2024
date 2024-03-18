package com.jobma.qa.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.jobma.qa.base.TestBase;
import com.jobma.qa.pages.InterviewProcess;

public class InterviewProcessTest extends TestBase {
	
	
	 @BeforeClass
	 public void setup() throws InterruptedException
	 {
		 TestBase.initialize();
		 
	 }
	 
	 @Test
	 public void interviewProcessTest()
	 {
		 InterviewProcess p = new InterviewProcess();
		 
		 p.clickOnOk();
		 p.clickOnGetStarted();
		 
		
				 
	 }
	 
	 @AfterClass
	 public void close()
	 {
		 driver.quit();
	 }

}
