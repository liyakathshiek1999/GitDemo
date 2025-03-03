package BrowserInitialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Initialization {
	public WebDriver driver;

	public WebDriver IntailizaBrowser() throws IOException {
		String url = "C:\\Users\\asif\\Desktop\\9pmjavaclass\\Maven\\src\\test\\java\\BrowserInitialization\\Global.properties";
		File file = new File(url);
		FileInputStream input = new FileInputStream(file);
		Properties prop = new Properties();
		prop.load(input);
		String BrowserName = System.getProperty("browser")!=null?System.getProperty("browser"):prop.getProperty("browser");
		if (BrowserName.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else if (BrowserName.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		} else if (BrowserName.equalsIgnoreCase("FireFox")) {
			driver = new FirefoxDriver();
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		return driver;

	}

	@BeforeMethod(alwaysRun = true)
	public void browserLaunch() throws IOException {
		driver = IntailizaBrowser();
		driver.get("http://automationexercise.com");
	}

	@AfterMethod(alwaysRun = true)
	public void quit() {
		driver.close();
	}

	public String screenShotCode(String testcaseName, WebDriver driver2) throws IOException {
		TakesScreenshot ss = (TakesScreenshot) driver;
		File Source = ss.getScreenshotAs(OutputType.FILE);
		File file = new File(System.getProperty("user.dir") + "\\reports"+testcaseName + ".png");
		FileUtils.copyFile(Source, file);
		return System.getProperty("user.dir")+"\\reports"+testcaseName + ".png";

	}
}
