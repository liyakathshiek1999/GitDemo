package com.hrm.TestScript;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.hrm.pages.Addemployeepage;
import com.hrm.pages.loginpage;
import com.hrm.utils.CommonMethod;

public class TC002 {
	
WebDriver driver;

    @BeforeClass
	public void setup() {
		driver= CommonMethod.launchbrowser();
		
	}
	
	@Test(priority=1)
	public void verifyloginpage() {
		loginpage obj = new loginpage(driver);
		obj.verify();
		CommonMethod.verifyoutput("dashboard");
	}
	@Test(priority=2)
	public void verifyAddemployeepage() {
		Addemployeepage obj= new Addemployeepage(driver);
		obj.verify1();
		CommonMethod.verifyoutput("viewPersonalDetails");
		
	}
	
	 @AfterClass
	  public void teardown() { 
		  CommonMethod.closebrowser();
	  
	  }
	 
	 
	 
		
	
	

}
