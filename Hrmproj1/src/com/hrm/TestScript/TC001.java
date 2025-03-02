package com.hrm.TestScript;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.hrm.pages.loginpage;
import com.hrm.utils.CommonMethod;

public class TC001 {
	WebDriver driver;
	 //TC --> Text script in that
		// setup ---> browser launch
		//@text---> remaining testcase
		//tear down--->browser close
	@BeforeMethod
	public void setup() {
		driver= CommonMethod.launchbrowser();
	}
	@Test
	public void verifyloginpage() {
		loginpage obj = new loginpage(driver);
		obj.verify();
		CommonMethod.verifyoutput("dashboard");
	}
	@AfterMethod
	public void teardown() {
		CommonMethod.closebrowser();
	}
	
	

}
