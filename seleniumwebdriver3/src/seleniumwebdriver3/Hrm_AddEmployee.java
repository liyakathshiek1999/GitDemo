package seleniumwebdriver3;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;


public class Hrm_AddEmployee {
	
   @Test()
	public void addEmployee() {
		// TODO Auto-generated method stub
		WebDriverWait wait;
		System.setProperty("webdriver.chrome.driver", "C:\\New folder\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		wait=new WebDriverWait(driver,30);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	   // WebElement user =driver.findElement(By.name("username"));
		//wait.until(ExpectedConditions.visibilityOf(user));
		//wait.until(ExpectedConditions.urlContains("login"));
	    driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
	    driver.findElement(By.name("password")).sendKeys("admin123");
	    driver.findElement(By.xpath("//button[text()=' Login ']")).click();
	    driver.findElement(By.xpath("//span[text()='PIM']")).click();
	    driver.findElement(By.xpath("//a[text()='Add Employee']")).click();
	    driver.findElement(By.name("firstName")).sendKeys("Banu");
	    driver.findElement(By.name("lastName")).sendKeys("Bindu");
	    driver.findElement(By.xpath(" //button[text()=' Save ']")).click();
	    wait.until(ExpectedConditions.urlContains("empNumber"));
	   org.testng.Assert.assertEquals(driver.getCurrentUrl().contains("empNumber"), true);
	    
	    
	    
		

	}

}
