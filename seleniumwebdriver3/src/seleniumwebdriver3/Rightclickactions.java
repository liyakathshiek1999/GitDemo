package seleniumwebdriver3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Rightclickactions {
	static WebDriver driver;
	
     public static void main(String[] args) {
		
	
    		System.setProperty("webdriver.chrome.driver","C:\\New folder\\chromedriver-win64\\chromedriver.exe");
   		 driver=new ChromeDriver();
   		 driver.manage().window().maximize();
   		 driver.get("https://www.google.com/");
   		 
			
			  WebElement gmail = driver.findElement(By.xpath("//a[text()='Gmail']")); 
			 Actions act= new Actions(driver); 
			act.contextClick(gmail).perform();
			 
   		 
   		 
   		
   		 
      
}
}
