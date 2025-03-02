package seleniumwebdriver3;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkartmaxprice {
	int max = 0;

	public int maximumprice(Integer p) {
		if (p > max)

		{
			max = p;
		}
		return max;

	}

	public static void main(String[] args) {
		Flipkartmaxprice obj=new Flipkartmaxprice();
		System.setProperty("webdriver.chrome.driver","C:\\New folder\\chromedriver-win64\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://www.flipkart.com/");
		 driver.findElement(By.name("q")).sendKeys("phone",Keys.ENTER);
		 List<WebElement> listofprice=driver.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1']"));
		 for(WebElement price : listofprice) {
			 String s=price.getText().replaceAll("[^0-9]","");
			 System.out.println(s);
			 Integer p=Integer.valueOf(s);
			 obj.maximumprice(p);
			 
			 
			 
					 
		 }
		 System.out.println(obj.max);
	}

}
