package ProductTestCases;

import org.testng.annotations.Test;
import java.util.Arrays;
import java.util.List;

import BrowserInitialization.Initialization;
import ProductCatalogePOM.UnauthenticatedProductssection;

public class productpage extends Initialization {

	/*
	 * @Test public void productsVerificationasUnAuthenticatedUser() {
	 * UnauthenticatedProductssection UnauthenticatedProductssection = new
	 * UnauthenticatedProductssection(driver); String[] Texts =
	 * UnauthenticatedProductssection.productaDetailsPageUnAuthenticated();
	 * Assert.assertTrue(Texts[0].equalsIgnoreCase("All Products"));
	 * System.out.println(Texts[1]);
	 * 
	 * }
	 * 
	 * @Test public void searchProduct() { UnauthenticatedProductssection
	 * UnauthenticatedProductssection = new UnauthenticatedProductssection(driver);
	 * List<String> Names= UnauthenticatedProductssection.searchProducts("Blue");
	 * System.out.println(Names);
	 * Assert.assertTrue(Names.stream().anyMatch(name->name.contains("Blue"))
	 * ,"Expected Blue to present in thr products names"); }
	 */

	@Test
	public void addingProducttoCart() throws InterruptedException {
		String[] products = { "Half Sleeves Top Schiffli Detailing - Pink",
				"Long Maxi Tulle Fancy Dress Up Outfits -Pink", "Soft Stretch Jeans" };
		// String[] products = { "Blue Top", "Men Tshirt" };
		List<String> DesiredProducts = Arrays.asList(products);
		UnauthenticatedProductssection UnauthenticatedProductssection = new UnauthenticatedProductssection(driver);
		UnauthenticatedProductssection.addProductsToCart(DesiredProducts);
	}

}
