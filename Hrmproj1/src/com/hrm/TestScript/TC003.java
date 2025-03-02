package com.hrm.TestScript;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.hrm.pages.Configureleavepage;
import com.hrm.pages.loginpage;
import com.hrm.utils.CommonMethod;

public class TC003 {
	
	WebDriver driver;
	@BeforeClass
	
	public void setup() {
		driver = CommonMethod.launchbrowser();
				
	}
	@Test(priority=1)
	public void verifyloginpage() {
		loginpage obj = new loginpage(driver);
		obj.verify();
		CommonMethod.verifyoutput("dashboard");
	}
	@Test(priority=2)
	public void verifyConfigureleavepage() throws AWTException {
		Configureleavepage obj = new Configureleavepage(driver);
		obj.verify2();
		CommonMethod.verifyoutput("leaveTypeList");	
	}
	//@AfterClass
	//public void teardown() {
		//CommonMethod.closebrowser();
	//}
	

	
}
