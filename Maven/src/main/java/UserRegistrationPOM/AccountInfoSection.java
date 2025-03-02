package UserRegistrationPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ReUseAbleElements.ReUseFunctions;

public class AccountInfoSection extends ReUseFunctions {
	public WebDriver driver;

	public AccountInfoSection(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// String Text2 =
	// driver.findElement(By.xpath("//div[@class=\"login-form\"]/h2")).getText();

	private @FindBy(xpath = "//div[@class='login-form']/h2") WebElement Tittle2;

	// Assert.assertTrue(Text2.equalsIgnoreCase("Enter Account Information"));
	// driver.findElement(By.id("id_gender1")).click();
	private @FindBy(id = "id_gender1") WebElement GenderRadioButton;

	// driver.findElement(By.id("password")).sendKeys("Liyakath123");
	private @FindBy(id = "password") WebElement PassWord;

	// WebElement days = driver.findElement(By.id("days"));
	private @FindBy(id = "days") WebElement Days;

	// Select selectday = new Select(days);
	// selectday.selectByValue("21");

	// WebElement months = driver.findElement(By.id("months"));
	private @FindBy(id = "months") WebElement Month;

	// Select selectmonth = new Select(months);
	// selectmonth.selectByValue("11");
	// WebElement years = driver.findElement(By.id("years"));
	private @FindBy(id = "years") WebElement Year;
	// Select selectyear = new Select(years);
	// selectyear.selectByValue("1999");
	// JavascriptExecutor js = (JavascriptExecutor) driver;
	// js.executeScript("window.scrollBy(0,1000)");
	// WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	// wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("newsletter"))));
	// driver.findElement(By.id("newsletter")).click();
	private @FindBy(id = "newsletter") WebElement NewsLetterCheckBox;
	// driver.findElement(By.id("optin")).click();
	private @FindBy(id = "optin") WebElement OptionCheckBox;

	// Address Section
	// driver.findElement(By.id("first_name")).sendKeys("Liyakath");
	private @FindBy(id = "first_name") WebElement FirstName;
	// driver.findElement(By.id("last_name")).sendKeys("Shaik");
	private @FindBy(id = "last_name") WebElement LastName;
	// driver.findElement(By.id("company")).sendKeys("CTS");
	private @FindBy(id = "company") WebElement Company;
	// driver.findElement(By.id("address1")).sendKeys("Nagvara");
	private @FindBy(id = "address1") WebElement Address1;
	// driver.findElement(By.id("address2")).sendKeys("Manyata Tech Park");
	private @FindBy(id = "address2") WebElement Address2;
	// WebElement country = driver.findElement(By.id("country"));
	private @FindBy(id = "country") WebElement Country;
	// Select selectcountry = new Select(country);
	// selectcountry.selectByValue("United States");
	// driver.findElement(By.id("state")).sendKeys("Karnataka");
	private @FindBy(id = "state") WebElement State;
	// driver.findElement(By.id("city")).sendKeys("Banglore");
	private @FindBy(id = "city") WebElement City;
	// driver.findElement(By.id("zipcode")).sendKeys("515666");
	private @FindBy(id = "zipcode") WebElement ZipCode;
	// driver.findElement(By.id("mobile_number")).sendKeys("9873247672");
	private @FindBy(id = "mobile_number") WebElement MobileNumber;
	// js.executeScript("window.scrollBy(0,1000)");
	// driver.findElement(By.xpath("//button[@data-qa=\"create-account\"]")).click();
	private @FindBy(xpath = "//button[@data-qa='create-account']") WebElement CreateAccountButton;

	public String AccountInformation(String PASSWORD, String date, String month, String year) {
		String Text2 = Tittle2.getText();
		GenderRadioButton.click();
		PassWord.sendKeys(PASSWORD);
		SelectMethode(Days, date);
		SelectMethode(Month, month);
		SelectMethode(Year, year);
		ScrollDown();
		WaitMechanismClickable(NewsLetterCheckBox);
		NewsLetterCheckBox.click();
		OptionCheckBox.click();
		return Text2;

	}

	public void AddressInformation(String firstName, String lastName, String company, String address1, String address2,
			String country, String state, String city, String code, String number) {
		FirstName.sendKeys(firstName);
		LastName.sendKeys(lastName);
		Company.sendKeys(company);
		Address1.sendKeys(address1);
		Address2.sendKeys(address2);
		SelectMethode(Country, country);
		State.sendKeys(state);
		City.sendKeys(city);
		ZipCode.sendKeys(code);
		MobileNumber.sendKeys(number);
		ScrollDown();
		CreateAccountButton.click();
	}
}
