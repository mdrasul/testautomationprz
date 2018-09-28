package AllHtmlPages;

import seleniumactions.Selenium;

public class loggedinpage extends Selenium 
{

	static String ProfileNameWebElement = ".//*[@id='dLabel']";
	static String MyAccountLink = "//*[@id=\"drp_div\"]/ul/li/div/div[1]/a";
	static  String LogoutButton = "//*[@id=\"drp_div\"]/ul/li/div/div[2]/a";

	public static void gotoMyAccount()
	{
		ClickWebElement(ProfileNameWebElement);
		ClickWebElement(MyAccountLink);
		DriverwaitFiveSecond();

	}
	public static void LogOut()
	{
		ClickWebElement(ProfileNameWebElement);
		ClickWebElement(LogoutButton);
		DriverwaitFiveSecond();

	}	
	
}
