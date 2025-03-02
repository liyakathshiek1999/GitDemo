package com.mercury.textscript;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.mercury.pages.loginpage;
import com.mercury.utils.CommonMethods;

public class TC001 {
	 //TC --> Text script in that
	// setup ---> browser launch
	//@text---> remaining testcase
	//tear down--->browser close
	WebDriver driver;
	
    @BeforeMethod
	public void setup() {
		
		driver =CommonMethods.launchBrowser();//lunch,driver initiate (for without nullpoint expection)
		
	}
    @Test
	public void verifyloginpage() {
		loginpage obj = new loginpage(driver);
		obj.verify();
		
		CommonMethods.verifyoutput("login_sucess");
		
		
		
	}
    @AfterMethod
	public void teardown() {
		CommonMethods.closebrowser();
	}
	

}
