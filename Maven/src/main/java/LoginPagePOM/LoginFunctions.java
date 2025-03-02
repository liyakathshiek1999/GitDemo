package LoginPagePOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginFunctions {
	
	public WebDriver driver;

	public LoginFunctions(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	private @FindBy(linkText = "Signup / Login") WebElement SignInorLoginButton;
	
	private @FindBy(css = "div[class='login-form'] h2") WebElement LoginText;
	
	private @FindBy(xpath = "//input[@data-qa='login-email']") WebElement LoginEmail;
	
	private @FindBy(xpath = "//input[@data-qa='login-password']") WebElement LoginPassword;
	
	private @FindBy(css = "button[data-qa='login-button']") WebElement LogInButton;
	
	 private @FindBy(css = "li:nth-child(10) a:nth-child(1)") WebElement LoggedinText;

	 private @FindBy(xpath = "//p[text()='Your email or password is incorrect!']") WebElement ErrorMesage;


		//abcd54321@gmail.com Liyakath123
	public String[] correctCredentials(String EmailId, String Password)
	{
		SignInorLoginButton.click();
		String Text1=LoginText.getText();
		LoginEmail.sendKeys(EmailId);
		LoginPassword.sendKeys(Password);
		LogInButton.click();
		String Text2=LoggedinText.getText();
		return new String[]{Text1,Text2};
	}
	//abcd521@gmail.com Liyakath123
	public String[] wrongCredentials(String EmailId, String Password)
	{
		SignInorLoginButton.click();
		String Text1=LoginText.getText();
		LoginEmail.sendKeys(EmailId);
		LoginPassword.sendKeys(Password);
		LogInButton.click();
		String Text2=ErrorMesage.getText();
		return new String[] {Text1,Text2};
		
	}
	
	

	
	
	



	


}
