package AllHtmlPages;

import seleniumactions.Selenium;

public class registrationpage extends Selenium
{
	
	
	//**** Test Sample  Data 
	public static String sampleUserEmail = "sample_22@gmail.com";
	public static String sampleUserID = "sample_22";
	public static String sampleUserFname =  "MR";
	public static String sampleUserLname= "User 22";
 
	
	static String EmailTextBox = "//*[@id=\"txtEmail\"]";
	static String UserNameTextBox = "//*[@id=\"txtUserName\"]";
	static String PasswordTextBox = "//*[@id=\"txtPassword\"]";
	static String ConfirmPasswordTextBox = "//*[@id=\"txtCnfPassword\"]";
	static String FirstNameTextBox = "//*[@id=\"txtFirstName\"]";
	static String LastNameTextBox = "//*[@id=\"txtLastName\"]";
	static String AddressTextBox = "//*[@id=\"item_details\"]/div[2]/div[4]/div/div[1]/div[7]/input";
	static String CreateAccountButton = "//*[@id=\"btnRegister\"]";

	public static void CompleteRegistation()
	{
		SetTextOnWebElement(EmailTextBox,sampleUserEmail);
		SetTextOnWebElement(UserNameTextBox,sampleUserID);
		SetTextOnWebElement(PasswordTextBox,"Dhaka_1986");
		SetTextOnWebElement(ConfirmPasswordTextBox,"Dhaka_1986");
		SetTextOnWebElement(FirstNameTextBox,sampleUserFname);
		SetTextOnWebElement(LastNameTextBox,sampleUserLname);
		SetTextOnWebElement(AddressTextBox,"1234 New York ");
		ClickWebElement(CreateAccountButton);
		DriverwaitFiveSecond();

	}
	

}
