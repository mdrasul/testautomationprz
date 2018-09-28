package AllHtmlPages;

import seleniumactions.Selenium;

public class myaccountpage extends Selenium
{
	
	
	static String ChangePasswordLink = "//*[@id=\"item_details\"]/div[3]/div[1]/div/div[4]/a";
	static String myorderlink = "//*[@id='item_details']/div[3]/div[1]/div/div[1]/a";

	public static void startchangepasswordProcess()
	{
		ClickWebElement(ChangePasswordLink);
		DriverwaitFiveSecond();
	}
	public static void gotoMyorderSection()
	{
		ClickWebElement(myorderlink);
		DriverwaitFiveSecond();

	}



}
