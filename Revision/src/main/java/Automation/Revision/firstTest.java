package Automation.Revision;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class firstTest {

	public static void main(String[] args) { 
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://magento.softwaretestingboard.com/");
		driver.findElement(By.linkText("Create an Account")).click();
		driver.findElement(By.id("firstname")).sendKeys("Liyakath");
		driver.findElement(By.id("lastname")).sendKeys("shiak");
		driver.findElement(By.id("email_address")).sendKeys("testpractice321@gmail.com");
		driver.findElement(By.name("password")).sendKeys("8328192377@Ls");
		driver.findElement(By.id("password-confirmation")).sendKeys("8328192377@Ls");
		driver.findElement(By.cssSelector("button[class='action submit primary']")).click();
		String S= driver.findElement(By.xpath("//div[@class='page messages']/div/div[@role='alert']")).getText();
		System.out.println(S);
		driver.findElement(By.linkText("Sign In")).click();
		driver.findElement(By.id("email")).sendKeys("testpractice321@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("8328192377@Ls");
		driver.findElement(By.id("send2")).click();


	}

}
