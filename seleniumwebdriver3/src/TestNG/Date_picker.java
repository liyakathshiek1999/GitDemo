package TestNG;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Date_picker {

WebDriver driver;
   @BeforeMethod
	public void lunchbrowser() {
		System.setProperty("webdriver.chrome.driver","C:\\New folder\\chromedriver-win64\\chromedriver.exe");
	    driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.globalsqa.com/demo-site/datepicker/");
		
			
	}
   @ Test
	 public void datepicker() {
	   WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
	   driver.switchTo().frame(frame);
		 driver.findElement(By.id("datepicker")).click();
		List<WebElement> dates = driver.findElements(By.tagName("td"));
		for(WebElement D : dates) {
			//System.out.println(D.getText());
			
			  String s = D.getText(); 
			  if (s.equals("3")) { 
				  D.click(); 
				  }
			 
		}
	 }
	

	}

	

