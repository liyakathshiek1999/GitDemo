package Selenium.Automation;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class standAloneTest {

	@Test
	public void test() {

		ChromeDriver driver= new ChromeDriver();
		driver.get("https://magento.softwaretestingboard.com/");
	}

}
