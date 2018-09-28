package AllHtmlPages;

import seleniumactions.Selenium;

public class homepage extends Selenium
{
	
	
	static String loginLink = "//*[@id=\"dLabellogin\"]";
	static String SignupButton = "//*[@id=\"jqSignup\"]";
	static String LoginIDTextBox = "//*[@id=\"username\"]";
	static String LoginPasswordTextBox = "//*[@id=\"password\"]";
	static String LoginButton = "//*[@id=\"jqLogin\"]";
	static  String LogoutButton = "//*[@id=\"drp_div\"]/ul/li/div/div[2]/a";
		
	public static void StartSignUpProcess()
	{
		ClickWebElement(loginLink);
		ClickWebElement(SignupButton);
	}
	public static void login(String ID, String loginpassword)
	{
		// **********Click Login Link 	
			ClickWebElement(loginLink);
	
		// **********Enter a Valida User ID & Password 	
			SetTextOnWebElement(LoginIDTextBox,ID);
			SetTextOnWebElement(LoginPasswordTextBox,loginpassword);
			ClickWebElement(LoginButton);
			DriverwaitFiveSecond();
	}

	

}
