package seleniumwebdriver3;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.ClickAction;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Amazon_linkinnewtab2 {

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Downloads\\chromedriver-win64\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://amazon.in");
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//span[text()='Account & Lists']"))).build().perform();
		driver.findElement(By.xpath("//span[text()='Your Recommendations']")).click();
		WebElement profile = driver.findElement(By.xpath("//a[@aria-label='Your Profile']"));
		
		act.contextClick(profile).build().perform();
		//act.contextClick(driver.findElement(By.xpath("//a[text()='Your Profile'"))).build().perform();
		Robot robo = new Robot();
		int i;
		for( i = 1; i<=2; i++) {
			
		
		robo.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		robo.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		}
		robo.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		robo.keyRelease(KeyEvent.VK_ENTER);
		
		
				
		
		
		
		/*
		 * Actions act1 = new Actions(driver); WebElement yourprofile =
		 * driver.findElement(By.xpath("//a[text()='Your Profile']"))).click();
		 */
				
		//act.contextClick(driver.findElement(By.xpath("//div[text()='Account & Lists']"))).build().perform();
		
		
		
		
		

	}

}
