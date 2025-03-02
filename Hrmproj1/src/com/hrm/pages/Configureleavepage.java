package com.hrm.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.hrm.locators.Applyleavelocator;




public class Configureleavepage extends Applyleavelocator {

	WebDriver driver;
	WebDriverWait wait;
	
     public Configureleavepage(WebDriver driver2) {
		this.driver = driver2;
		wait= new WebDriverWait(driver2, 30);
	}
	private void clickleavelocator() {
		wait.until(ExpectedConditions.urlContains("dashboard"));
	 driver.findElement(leavelocator).click();
	
}
     private void clickconfigurelocator() {
    	 driver.findElement(configurelocator).click();
     }

		/*
		 * private void clickrightsidearrow() {
		 * driver.findElement(clickrighsidearrow).click();
		 * 
		 * }
		 */
     private void  clickleaveperiod() {
    	 driver.findElement(leaveperiod).click();
    	 //wait.until(ExpectedConditions.urlContains("leaveTypeList"));
     }
     

		/*
		 * private void clickdownarrow() throws AWTException {
		 * 
		 * Robot robo=new Robot(); robo.keyPress(KeyEvent.VK_DOWN);
		 * robo.keyRelease(KeyEvent.VK_ENTER );
		 * }
		 */
     
     
  public void verify2() throws AWTException {
	  this.clickleavelocator();
	  this.clickconfigurelocator();
	  
	  this.clickleaveperiod();
	  
	  
  }
     
	

}
