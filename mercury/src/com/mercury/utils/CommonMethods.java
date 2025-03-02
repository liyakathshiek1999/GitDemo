package com.mercury.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class CommonMethods {
	static WebDriver driver;
 
         public static WebDriver launchBrowser() {
        		System.setProperty("webdriver.chrome.driver","C:\\New folder\\chromedriver-win64\\chromedriver.exe");
       		    driver=new ChromeDriver();
       		    driver.get("https://demo.guru99.com/test/newtours/");
       		    driver.manage().window().maximize();
				return driver;
       	  }
      
         public static void closebrowser() {
        	 driver.close();
        	 
         }
         public static void verifyoutput(String expectedURL ) {
        	 
        	 boolean status= driver.getCurrentUrl().contains(expectedURL);//true ,false check
        	 Assert.assertEquals(status, true);
        	
        	 
        	 
        	
        	 
        	 
        	 
         }
         
         
}

