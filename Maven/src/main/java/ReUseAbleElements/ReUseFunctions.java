package ReUseAbleElements;

import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ReUseFunctions {
	WebDriver driver;

	public ReUseFunctions(WebDriver driver) {

		this.driver = driver;
	}

	public void SelectMethode(WebElement element, String Value) {
		Select select = new Select(element);
		select.selectByValue(Value);
	}

	public void WaitMechanismClickable(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}

	public void WaitMechanismVisible(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	public void WaitMechanismInVisible(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.invisibilityOf(element));
	}

	public void ScrollDown() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
	}

	public WebElement ShadowElement() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement ShadowRoot= (WebElement) js.executeScript("document.querySelector('.grippy-host')");
		return ShadowRoot;
	}
	public void tryCatchBlock(List<WebElement> list) {
		try {
			if (list!= null && !list.isEmpty() && list.get(0).isDisplayed())
			{
				list.get(0).click();
			}
		} catch (NoSuchElementException | TimeoutException e) {
			System.out.print("Element not found"+e.getMessage());
		}
	}

}
