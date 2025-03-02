package seleniumwebdriver3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.ImplicitlyWait;
import org.openqa.selenium.remote.server.handler.SendKeys;

public class Spicejetoneway {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\New folder\\chromedriver-win64\\chromedriver.exe");
		 ChromeDriver driver = new ChromeDriver();
		 driver.get("https://www.spicejet.com/");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
		 driver.findElement(By.xpath("//div[text()='one way']")).click();
		 driver.findElement(By.xpath("//div[text()='From']")).click();
		 driver.findElement(By.xpath("//div[text()='From']")).sendKeys("hyd");
		 driver.findElement(By.xpath("//div[text()='Hyderabad']")).click();
		  Thread.sleep(2000);
		 driver.findElement(By.xpath("//div[text()='Chennai']")).click();

		 driver.findElement(By.xpath("//div[text()='10']")).click();
		 driver.findElement(By.xpath("//div[text()='Passengers']")).click();
		 driver.findElement(By.xpath("//div[@data-testid='Adult-testID-plus-one-cta']")).click();
		 driver.findElement(By.xpath("//div[text()='Currency']")).click();
		 driver.findElement(By.xpath("//div[text()='USD']")).click();
		 driver.findElement(By.xpath("//div[@data-testid='home-page-flight-cta']")).click();
		
		
	}
}	


