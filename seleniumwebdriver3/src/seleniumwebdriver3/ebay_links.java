package seleniumwebdriver3;

import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ebay_links {
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\New folder\\chromedriver-win64\\chromedriver.exe");
		  driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		List<WebElement> listoflinks =driver.findElements(By.tagName("a"));
		for(WebElement links: listoflinks) {
			System.out.println(links.getText());
		}
			Scanner scan=new Scanner(System.in);
			System.out.println("select the element");
			String text = scan.nextLine();
			driver.findElement(By.xpath("//a[text()='"+text+"']")).click();
			String title = driver.getTitle();
			   System.out.println(title);
			
		}
}


