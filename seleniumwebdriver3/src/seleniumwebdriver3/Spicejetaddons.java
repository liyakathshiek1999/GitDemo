package seleniumwebdriver3;

import java.awt.Desktop.Action;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.FindActiveElement;
import org.openqa.selenium.remote.server.handler.FindElement;

public class Spicejetaddons {

	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver","C:\\New folder\\chromedriver-win64\\chromedriver.exe");
		
		System.setProperty("webdriver.chrome.driver","C:\\New folder\\chromedriver-win64\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.spicejet.com/");
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		 Actions act=new Actions(driver);
		 WebElement addonhotel=driver.findElement(By.xpath("//div[text()='Add-ons']"));
		 act.moveToElement(addonhotel).build().perform();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//div[text()='Friends and Family']")).click();
		 System.out.println(driver.getWindowHandle());
	       Set<String> windows=driver.getWindowHandles();
	       for (String str : windows) {
			System.out.println(str);
		}
		// driver.findElement(By.xpath("//a[text()='Flight Schedules']")).click();
	}
		
		 
		 
		 
		 
	

	}


