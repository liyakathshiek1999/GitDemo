package seleniumwebdriver3;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Draganddrop {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver","C:\\New folder\\chromedriver-win64\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
		 WebElement drag=driver.findElement(By.id("draggable"));
		 WebElement drop=driver.findElement(By.id("droppable"));
		      Actions act= new Actions(driver);
		   act.dragAndDrop(drag, drop).perform();
		act.contextClick(drag).build().perform();
		    
		      
		 
		
		
		

	}

}
