package com.hrm.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.hrm.locators.Addemployeelocator;

public class Addemployeepage extends Addemployeelocator{
	WebDriver driver;
	WebDriverWait wait;
	
	public Addemployeepage(WebDriver driver) {
		this.driver = driver; 
		wait=new WebDriverWait(driver, 30);
	} 
	
	private void clickPIMlocator() {
		driver.findElement(PIMlocator).click();
		
	}
    private void clickAddemployeelocator() {
		driver.findElement(Addemployeelocator).click();
	}
	private void firstname() {
		driver.findElement(Firstnamelocator).sendKeys("Shaik");
		
	}
	private void Middlename() {
		driver.findElement(Middlenamelocator).sendKeys("Affu");
			
	}
	private void Lastname() {
		driver.findElement(Lastnamelocator).sendKeys("Banu");
	}
	private void clicksaveBTN() {
		driver.findElement(saveBTNlocator).click();
	}
	public void verify1() {
		this.clickPIMlocator();
		this.clickAddemployeelocator();
	    this.firstname();
	    this.Middlename();
	    this.Lastname();
	    this.clicksaveBTN();
	    
	}
}
