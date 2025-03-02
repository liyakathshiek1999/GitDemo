package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotationpractice {
	WebDriver driver;
	@BeforeMethod
	public void launchbrowser() {
		System.setProperty("webdriver.chrome.driver","C:\\New folder\\chromedriver-win64\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		 driver.manage().window().maximize();
	}	 
	@Test	 
	public void loginhomepage() {
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[text()=' Login ']")).click();	
		this.validateloginpage();
		driver.findElement(By.className("oxd-userdropdown-name")).click();
		driver.findElement(By.linkText("Logout")).click();
	}
	
	
	
	  public void validateloginpage() { 
		  boolean status = driver.getCurrentUrl().contains("dashboard"); 
		  Assert.assertEquals(status,true); 
		  }
	  
	 
   // @AfterMethod
	//public void closebrowser() {
	   
		//driver.close();
	//}

		
	
  
  }

