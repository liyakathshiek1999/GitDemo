package com.hrm.locators;

import org.openqa.selenium.By;

public class Addemployeelocator {
	
	protected By PIMlocator = By.xpath("//span[text()='PIM']");
	protected By Addemployeelocator = By.xpath("//a[text()='Add Employee']");
	protected By Firstnamelocator = By.name("firstName");
	protected By Middlenamelocator = By.name("middleName");
	protected By Lastnamelocator = By.name("lastName");
	protected By saveBTNlocator = By.xpath("//button[@type='submit']");
	

}
