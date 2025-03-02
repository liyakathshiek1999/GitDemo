package com.hrm.pages;

import org.openqa.selenium.WebDriver;

import com.hrm.locators.loginpagelocator;



public class loginpage extends loginpagelocator{
	WebDriver driver;

	public loginpage(WebDriver driver) {
		this.driver = driver;
	}
	public void enterusername() {
		driver.findElement(usernamelocator).sendKeys("Admin");
		
	}
	public void enterpassword() {
		driver.findElement(passwordlocator).sendKeys("admin123");
	}
	public void clicksubmit() {
		driver.findElement(submitbuttonlocator).click();
	}
    public void verify()
    {
    this.enterusername();
    this.enterpassword();
    this.clicksubmit();
    }
}
