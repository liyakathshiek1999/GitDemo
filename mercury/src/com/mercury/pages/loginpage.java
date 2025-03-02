package com.mercury.pages;

import org.openqa.selenium.WebDriver;

import com.mercury.locators.loginpagelocators;

public class loginpage  extends loginpagelocators{
	
	WebDriver driver;
	public loginpage(WebDriver driver) {
	
		this.driver = driver;
	}

	public void enterusername (){
		driver.findElement(usernameLocator).sendKeys("mercury");
	}
	public void enterpassword() {
		driver.findElement(passwordLocator).sendKeys("mercury123");
			
	}
	
		public void clicksubmit() {
		driver.findElement(submitBTNLocator).click();
			
		}
		public void verify() {
			this.enterusername();
			this.enterpassword();
			this.clicksubmit();
			
		}
		
		
	}


