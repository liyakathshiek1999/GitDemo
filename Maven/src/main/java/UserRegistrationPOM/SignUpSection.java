package UserRegistrationPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpSection {

	// driver.findElement(By.linkText("Signup / Login")).click();
	private @FindBy(linkText = "Signup / Login") WebElement SignInorLoginButton;
	// String Text =
	// driver.findElement(By.xpath("//div[@class='signup-form']/h2")).getText();
	private @FindBy(xpath = "//div[@class='signup-form']/h2") WebElement Tittle1;
	// driver.findElement(By.cssSelector("input[placeholder='Name']")).sendKeys(UserName);
	private @FindBy(css = "input[placeholder='Name']") WebElement UserNames;
	// driver.findElement(By.xpath("//input[@data-qa='signup-email']")).sendKeys("abcd4321@gmail.com");
	private @FindBy(xpath = "//input[@data-qa='signup-email']") WebElement EmailId;
	// driver.findElement(By.cssSelector("button[data-qa=\"signup-button\"]")).click();
	private @FindBy(css = "button[data-qa='signup-button']") WebElement SignUpButton;
	//p[text()='Email Address already exist!']
	private @FindBy(xpath = "//p[text()='Email Address already exist!']") WebElement ErrorMessage;

	public WebDriver driver;

	public SignUpSection(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public String NewUserSignUp(String UserName, String Email) {
		SignInorLoginButton.click();
		String Text1 = Tittle1.getText();
		UserNames.sendKeys(UserName);
		EmailId.sendKeys(Email);
		SignUpButton.click();
		return Text1;
	}
	
	public String ExestingUserSignUp(String UserName, String Email) {
		SignInorLoginButton.click();
		UserNames.sendKeys(UserName);
		EmailId.sendKeys(Email);
		SignUpButton.click();
		String Text1 = ErrorMessage.getText();
		return Text1;
	}

}
