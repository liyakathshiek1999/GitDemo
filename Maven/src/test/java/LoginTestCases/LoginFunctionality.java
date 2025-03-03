package LoginTestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import BrowserInitialization.Initialization;
import LoginPagePOM.LoginFunctions;

public class LoginFunctionality extends Initialization {
	
	
	@Test
	public void LoginUserWithCorrectEmailandPassword()
	{
		LoginFunctions LoginFunctions =new LoginFunctions(driver);
		String[] Text= LoginFunctions.correctCredentials("abcd54321@gmail.com", "Liyakath123");
		Assert.assertTrue(Text[0].equalsIgnoreCase("Login to your account"));
		Assert.assertTrue(Text[1].contains("Logged in  "));
	}
	
	@Test(groups= {"Invalid"})
	public void LoginUserWithWrongEmailandPassword()
	{
		LoginFunctions LoginFunctions =new LoginFunctions(driver);
		String[] Text = LoginFunctions.wrongCredentials("abcd521@gmail.com", "Liyakath123");
		Assert.assertTrue(Text[0].equalsIgnoreCase("Login to your account"));
		Assert.assertTrue(Text[1].equalsIgnoreCase("Your email or password is incorrect!"));
	}

}
