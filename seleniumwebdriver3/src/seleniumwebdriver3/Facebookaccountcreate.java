package seleniumwebdriver3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebookaccountcreate {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\New folder\\chromedriver-win64\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.get("http://facebook.com");
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);//<----Implicity wait
		 driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		 //Thread.sleep(4000);
		 driver.findElement(By.name("firstname")).sendKeys("Affu");
		 driver.findElement(By.name("lastname")).sendKeys("Banu");
		 driver.findElement(By.name("reg_email__")).sendKeys("shaikaffu0403@gmail.com");
		 driver.findElement(By.name("reg_email_confirmation__")).sendKeys("shaikaffu0403@gmail.com");
		 driver.findElement(By.name("reg_passwd__")).sendKeys("affu0403");
		 Select day=new Select(driver.findElement(By.name("birthday_day")));
		 day.selectByIndex(3);
		 Select month=new Select(driver.findElement(By.id("month")));
		 month.selectByValue("3");
		 Select year=new Select(driver.findElement(By.name("birthday_year")));
		 year.selectByVisibleText("1998");
		
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	}

}
