package com.mercury.textscript;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import org.testng.annotations.Test;

import com.mercury.pages.Registerpage;
import com.mercury.pages.loginpage;
import com.mercury.utils.CommonMethods;

public class TC002 {
	WebDriver driver;
	@BeforeClass
	public void setup() {
		driver = CommonMethods.launchBrowser();
		
	}
	@Test(priority=1)
	public void verifyloginpage() {
		loginpage obj = new loginpage(driver);
		obj.verify();
		
		CommonMethods.verifyoutput("login_sucess");
	}
	@Test(priority=2)
	public void verifyregistration() {
		 Registerpage obj = new  Registerpage(driver);
		 obj.verifyregister();
		 CommonMethods.verifyoutput("register_sucess");	
	}
	@AfterClass
	public void teardown() {
	driver.close();
   }
	
}

