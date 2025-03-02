package UserRegistrationPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountCreationandDeletionConfirmation {
	
	//String Text3 = driver.findElement(By.cssSelector("h2[data-qa=\"account-created\"]")).getText();
	 private @FindBy(css = "h2[data-qa='account-created']") WebElement ConfirmationText;
//	driver.findElement(By.cssSelector(".btn.btn-primary")).click();
	 private @FindBy(css = ".btn.btn-primary") WebElement ContinueButton;

	//String text4 = driver.findElement(By.cssSelector("li:nth-child(10) a:nth-child(1)")).getText();
	 private @FindBy(css = "li:nth-child(10) a:nth-child(1)") WebElement LoginText;

	//driver.findElement(By.linkText("Delete Account")).click();
	 private @FindBy(linkText = "Delete Account") WebElement DeleteButton;

	//String text5 = driver.findElement(By.xpath("//h2[@data-qa=\"account-deleted\"]")).getText();
	 private @FindBy(xpath = "//h2[@data-qa='account-deleted']") WebElement AccountDeletedText;

	//driver.findElement(By.xpath("//a[@data-qa=\"continue-button\"]")).click();
	 private @FindBy(xpath = "//a[@data-qa='continue-button']") WebElement Button;
	public WebDriver driver;
	 
	 public AccountCreationandDeletionConfirmation(WebDriver driver) {
		 
		 this.driver=driver;
		 PageFactory.initElements(driver, this);
	}
	 

	public String AccountCreationConfirmation()
	 {
		 String Text3 = ConfirmationText.getText();
		 ContinueButton.click();
		 return Text3;
	 }
	 
	 public String LoginUserValidation()
	 {
		String Text4=  LoginText.getText();
		DeleteButton.click();
		return Text4;
	 }
	 
	 public String DeleteAccount()
	 {
		String Text5= AccountDeletedText.getText(); 
		Button.click();
		return Text5;
	 }

}
