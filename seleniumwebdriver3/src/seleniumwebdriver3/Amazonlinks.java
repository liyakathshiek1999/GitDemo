package seleniumwebdriver3;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazonlinks {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\New folder\\chromedriver-win64\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
		 driver.manage().window().maximize();
		 driver.get("http://amazon.in");
		 List<WebElement> links =driver.findElements(By.tagName("a"));
				 for(WebElement link : links) {
					String s = link.getTagName();
					 
					 System.out.println(link.getText());
					 
					 
					 
					 
					 
				 }
				 
				
			
		 
		 
		 
		 
		 
	 /*
			 * List<WebElement>
			 * alllinks=driver.findElements(By.xpath("//a[@class='nav-a' ]")); int
			 * rowCount=alllinks.size(); System.out.println(rowCount); String
			 * beforeXpath="//a[@data-csa-c-slot-id='nav_cs_"; String afterXpath="']"; for (
			 * int i=0; i<=rowCount; i++) { String ActualXpath = beforeXpath+ i +afterXpath;
			 * WebElement element=driver.findElement(By.xpath(ActualXpath));
			 * Thread.sleep(3000); if(i==8); break; } System.out.println("Out of Loop");
			 */
	    	 
	     }
	}



	


		 
				 
		 
		 
		 
			
		 
		
		


