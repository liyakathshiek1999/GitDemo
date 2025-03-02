package com.hrm.utils;

import org.openqa.selenium.chrome.ChromeDriver;

public class CommonMethods {
	public  void launchbrowser() {
		System.setProperty("webdriver.chrome.driver","C:\\New folder\\chromedriver-win64\\chromedriver.exe");
		    driver=new ChromeDriver();
	}

	

}
