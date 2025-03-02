package com.hrm.utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class CommonMethod {
	static WebDriver driver;
	public static WebDriver launchbrowser() {
		System.setProperty("webdriver.chrome.driver","C:\\New folder\\chromedriver-win64\\chromedriver.exe");
		    driver=new ChromeDriver();
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		    driver.manage().window().maximize();
			return driver;
		    
	}
	public static void closebrowser() {
		driver.close();
		
	}
	public static void verifyoutput(String ExpectedURL) {
		boolean status =driver.getCurrentUrl().contains(ExpectedURL);
		Assert.assertEquals(status, true);
	}

	
}


