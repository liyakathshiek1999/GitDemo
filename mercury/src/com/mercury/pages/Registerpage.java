package com.mercury.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.mercury.locators.Registerlocator;

public class Registerpage extends Registerlocator {
	WebDriver driver;
	
	
	
	private void clickregister() {
		driver.findElement(registerBTNlocator).click();	
	}
	private void enterfirstname() {
		 driver.findElement( firstnamelocator).sendKeys("banu");
		 
	}
	
	private void lastnamelocator() {
		 driver.findElement(lastnamelocator).sendKeys("bindu");
		 		 
	}
	private void selectcountry() {
		
	WebElement  dropdown = driver.findElement(Dropdownlocator);
	Select s = new Select(dropdown);
	s.selectByVisibleText("INDIA"); 	
	}
	
	private void clickSubmit() {
		driver.findElement(submitlocator).click();
	}
	public void verifyregister() {
		this.clickregister();
		this.enterfirstname();
		this.lastnamelocator();
		this.clickSubmit();	
	}
	
	public Registerpage(WebDriver driver) {
	
		this.driver = driver;
	}
}	
	
	
	

