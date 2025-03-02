package Stepdefinition;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class StepforMercuryApp {
	WebDriver driver;
	WebDriverWait wait;
	WebElement Username;
	WebElement Password;
	WebElement Login;
	
	@Given("User should be on login page")
	public void user_should_be_on_login_page() throws Throwable{
		System.setProperty("webdriver.chrome.driver","C:\\New folder\\chromedriver-win64\\chromedriver.exe");
		    driver=new ChromeDriver();
		    driver.get("https://demo.guru99.com/test/newtours/");
		    driver.manage().window().maximize();
	        wait= new WebDriverWait(driver, Duration.ofSeconds(30));
	}

	@When("user enter username")
	public void user_enter_username()throws Throwable {
		Username = driver.findElement(By.name("userName"));
		Username.sendKeys("Mercury");
		          

	}

	@When("user enter password")
	public void user_enter_password() throws Throwable{
		Password = driver.findElement(By.name("password"));
		Password.sendKeys("Mercury123");
	
	}

	@When("user click on the login btn")
	public void user_click_on_the_login_btn() throws Throwable{
		Login = driver.findElement(By.name("submit"));
		Login.click(); 
	    
	}
	
	 @Then("verify login page") public void verify_login_page()throws Throwable {
	 wait.until(ExpectedConditions.urlContains("login_sucess"));
	 Assert.assertEquals(driver.getCurrentUrl().contains("login_sucess"), true);
	 }
	 

	 
	  
	

	@Then("close the browser")
	public void close_the_browser()throws Throwable {
		driver.close();
	   
	   
	}


}
