package seleniumwebdriver3;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Openamazonlinks_usingmethod {
	static WebDriver driver;
	public WebElement openURL(String text) {
		WebElement l =driver.findElement(By.xpath("//a[text()='"+text+"']"));
		return l;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\New folder\\chromedriver-win64\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://amazon.in");
		List<WebElement> listoflinks=driver.findElements(By.tagName("a"));
	    for(WebElement link : listoflinks) {
	    	System.out.println(link.getText());
	    	
	    }
	    Scanner scan=new Scanner(System.in);
	    System.out.println("which link do you want to open");
	    String text=scan.nextLine();
	    Openamazonlinks_usingmethod obj=new  Openamazonlinks_usingmethod();
	    obj.openURL(text).click();
	    
	   // driver.findElement(By.xpath("//a[text()='"+text+"']")).click();
	    //(By.xpath("//a[text()='" + text + "']"
	   String title = driver.getTitle();
	   System.out.println(title);
	    
	    
		

	

}
}
