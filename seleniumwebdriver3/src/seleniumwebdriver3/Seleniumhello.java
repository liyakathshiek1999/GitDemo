package seleniumwebdriver3;
 
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.seleniumhq.jetty9.util.annotation.Name;

public class Seleniumhello {
	
	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\New folder\\chromedriver-win32.zip\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.get("http://google.com");
		 System.out.println(driver.getTitle());
		 driver.findElement(By.name("q")).sendKeys("Hello",Keys.ENTER);
		 //driver.close()
		 
		 
		 
		
		
	
	}

}
