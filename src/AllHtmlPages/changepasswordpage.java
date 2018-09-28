package AllHtmlPages;

import seleniumactions.Selenium;

public class changepasswordpage extends Selenium
{
	
	static String OldPasswordTextBox = "//*[@id=\"item_details\"]/div[2]/div[4]/div/div[1]/div[1]/input";
	static String NewPasswordTextBox = "//*[@id=\"item_details\"]/div[2]/div[4]/div/div[1]/div[2]/input";
	static String ConfirmNewPasswordTextBox = "//*[@id=\"item_details\"]/div[2]/div[4]/div/div[1]/div[3]/input";
	static String CHangePasswordButton = "//*[@id=\"item_details\"]/div[2]/div[4]/div/div[1]/div[4]/div/input[2]";

	public static void CompleteChangePassword(String withNewPassword)
	{
		SetTextOnWebElement(OldPasswordTextBox,"Dhaka_1986");
		SetTextOnWebElement(NewPasswordTextBox,withNewPassword);
		SetTextOnWebElement(ConfirmNewPasswordTextBox,withNewPassword);
		ClickWebElement(CHangePasswordButton);
		DriverwaitFiveSecond();
	
	}



}
