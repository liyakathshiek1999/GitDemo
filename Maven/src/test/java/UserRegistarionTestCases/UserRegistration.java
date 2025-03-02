package UserRegistarionTestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import BrowserInitialization.Initialization;
import UserRegistrationPOM.AccountCreationandDeletionConfirmation;
import UserRegistrationPOM.AccountInfoSection;
import UserRegistrationPOM.SignUpSection;

public class UserRegistration extends Initialization {

	@Test
	public void UserRegistartion() {

		String UserName = "Liyakath";
		String EmailId = "abcd4321@gmail.com";
		String PASSWORD = "Liyakath123";
		String date = "21";
		String month = "11";
		String year = "1999";
		String firstName = "Liyakath";
		String lastName = "Shaik";
		String company = "CTS";
		String address1 = "Nagvara";
		String address2 = "Manyata Tech Park";
		String country = "India";
		String state = "Karnataka";
		String city = "Bangalore";
		String code = "5150666";
		String number = "9972919637";
		SignUpSection NewRegistration = new SignUpSection(driver);
		String Text1 = NewRegistration.NewUserSignUp(UserName, EmailId);
		Assert.assertTrue(Text1.equalsIgnoreCase("New User Signup!"));
		AccountInfoSection AccountInfoSection = new AccountInfoSection(driver);
		String Text2 = AccountInfoSection.AccountInformation(PASSWORD, date, month, year);
		Assert.assertTrue(Text2.equalsIgnoreCase("Enter Account Information"));
		AccountInfoSection.AddressInformation(firstName, lastName, company, address1, address2, country, state, city,
				code, number);
		AccountCreationandDeletionConfirmation confirmation = new AccountCreationandDeletionConfirmation(driver);
		String Text3 = confirmation.AccountCreationConfirmation();
		Assert.assertTrue(Text3.equalsIgnoreCase("Account Created!"));
		String Text4 = confirmation.LoginUserValidation();
		Assert.assertTrue(Text4.equalsIgnoreCase("Logged in as " + UserName));
		String Text5 = confirmation.DeleteAccount();
		Assert.assertTrue(Text5.equalsIgnoreCase("Account Deleted!"));
	}
	
	@Test(groups= {"Invalid"})
	public void UserRegistrationWithExistingEmail()
	{
		SignUpSection ExistingRegistration = new SignUpSection(driver);
		String message= ExistingRegistration.ExestingUserSignUp("Leu", "abcd54321@gmail.com");
		Assert.assertTrue(message.equalsIgnoreCase("Email Address already exist!"));

	}
}
