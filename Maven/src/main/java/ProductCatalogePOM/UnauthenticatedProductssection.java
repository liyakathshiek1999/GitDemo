package ProductCatalogePOM;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ReUseAbleElements.ReUseFunctions;

public class UnauthenticatedProductssection extends ReUseFunctions {

	public WebDriver driver;

	public UnauthenticatedProductssection(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// driver.findElement(By.linkText(" Products")).click();
	private @FindBy(xpath = "//a[text()=' Products']") WebElement ProductsButton;

	private @FindBy(css = ".title") WebElement ProductTittle;

	private @FindBy(linkText = "View Product") WebElement ViewProductButton;

	private @FindBy(css = ".product-information") WebElement productinformation;

	public String[] productaDetailsPageUnAuthenticated() {
		ProductsButton.click();
		String Text1 = ProductTittle.getText();
		ScrollDown();
		ViewProductButton.click();
		String Text2 = productinformation.getText();
		return new String[] { Text1, Text2 };

	}

	private @FindBy(id = "search_product") WebElement ProductSearch;

	private @FindBy(id = "submit_search") WebElement SearchButton;

	private @FindBy(css = ".single-products") List<WebElement> ProductsList;

	public List<String> searchProducts(String product) {
		ProductsButton.click();
		ProductSearch.sendKeys(product);
		SearchButton.click();
		// String Text1 = ProductTittle.getText();
		List<String> names = ProductsList.stream()
				.map(s -> s.findElement(By.xpath(".//div[@class='productinfo text-center']/p")).getText())
				.collect(Collectors.toList());

		return names;

	}

	@FindBy(xpath = "//div[@class='grippy-host']")
	WebElement Shadowhost;

	public void addProductsToCart(List<String> DesiredProducts) throws InterruptedException {
		try {
			WebElement Frame1 = driver.findElement(By.id("google_esf"));
			WaitMechanismVisible(Frame1);
			driver.switchTo().frame(Frame1);

			WebElement Frame2 = driver.findElement(By.id("aswift_6"));
			driver.switchTo().frame(Frame2);

			driver.findElement(By.id("dismiss-button")).click();
			driver.switchTo().defaultContent();

		} catch (NoSuchElementException | TimeoutException e2) {
			System.out.print("Element is not displayed" + e2.getMessage());
		}

		ProductsButton.click();
		try {
			
			WaitMechanismVisible(driver.findElement(By.cssSelector(".grippy-host")));
			driver.findElement(By.cssSelector(".grippy-host")).click();
			WaitMechanismInVisible(driver.findElement(By.cssSelector(".grippy-host")));

		} catch (NoSuchElementException | TimeoutException e) {
			System.out.print("ShadowHost is not displayed" + e.getMessage());
		}
		// if there is a shadow element then we need to handle it with java executor,
		// selenium cant handle it
		WaitMechanismVisible(ProductTittle);
		DesiredProducts.forEach(desiredproduct -> {

			WebElement ProductName = ProductsList.stream()
					.filter(product -> product.findElement(By.xpath(".//div[@class='productinfo text-center']/p"))
							.getText().trim().equalsIgnoreCase(desiredproduct))
					.findAny().orElse(null);
			if (ProductName != null) {
				int maxScrolls = 10;
				int scrollCount = 0;
				while (!ProductName.findElement(By.cssSelector(".add-to-cart")).isDisplayed()
						&& scrollCount < maxScrolls) {
					ScrollDown();
					scrollCount++;
				}

				if (ProductName.isDisplayed()) {
					Actions a = new Actions(driver);
					WaitMechanismVisible(ProductName.findElement(By.cssSelector(".add-to-cart")));
					a.moveToElement(ProductName.findElement(By.cssSelector(".add-to-cart"))).click().build().perform();
					WaitMechanismClickable(ProductName.findElement(By.xpath(".//div[@class='product-overlay']/div/a")));
					ProductName.findElement(By.xpath(".//div[@class='product-overlay']/div/a")).click();
					try {
						WaitMechanismVisible(driver.findElement(By.cssSelector(".close-modal")));
						WaitMechanismClickable(driver.findElement(By.cssSelector(".close-modal")));
						driver.findElement(By.cssSelector(".close-modal")).click();
						WaitMechanismInVisible(driver.findElement(By.cssSelector(".close-modal")));
					} catch (NoSuchElementException | TimeoutException e1) {
						System.out.print("Model is still visible" + e1.getMessage());
					}
				} else {
					System.out.print("Model did not disappear" + DesiredProducts);
				}
			} else {
				System.out.println("Product not found");
			}

		});
		WaitMechanismClickable(driver.findElement(By.cssSelector(".fa-angle-up")));
		driver.findElement(By.cssSelector(".fa-angle-up")).click();
		WaitMechanismClickable(driver.findElement(By.xpath("//a[text()=' Cart']")));
		driver.findElement(By.xpath("//a[text()=' Cart']")).click();

	}
}
