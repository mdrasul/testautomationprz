package javasteps;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class registration3 
{
	 public static WebDriver driver;

	
	
	public static void OpenBrowserAndNavigateToApplication()
	{
		 System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//chromedriver");
		 driver = new ChromeDriver();
		 driver.get("https://www.demo.iscripts.com/multicart/demo/");
	}
	
	public static void ClickWebElement(String xpath)
	{
		 driver.findElement(By.xpath(xpath)).click();

	}
	public static void SetTextOnWebElement(String xpath, String value)
	{
		 driver.findElement(By.xpath(xpath)).sendKeys(value);
	}
	
	public static void validateTextOfaElement(String testName, String expElemt, String expValue)
	{
		 //String registered_user_name;
		 String ActualValuefromElement =  driver.findElement(By.xpath(expElemt)).getText();
		 
		 if(ActualValuefromElement.equalsIgnoreCase(expValue))
		 {
			 System.out.println(testName + "  Passed ....");
		 }
		 else
		 {
			 System.out.println(testName + "  Failed ....");
		 }

	}
	
	public static void DriverwaitFiveSecond()
	{
		 //=== Thread.sleep need a Exception Handeling Of Java 
		try 
		{
			Thread.sleep(5000);
		} 
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
	}
	
	
	
	public static void main(String[] args)
	{
		
		
		//**** Test Sample  Data 
		String sampleUserEmail = "sample_18@gmail.com";
		String sampleUserID = "sample_18";
		String sampleUserFname =  "MR";
		String sampleUserLname= "User 18";

		
//#################### Test 1 : Registration Process Test Created By-Rasul 
		
		//********** All Web Locators (X-paths) Needed For Sign-Up Process 
			String loginLink = "//*[@id=\"dLabellogin\"]";
			String SignupButton = "//*[@id=\"jqSignup\"]";
			
			String EmailTextBox = "//*[@id=\"txtEmail\"]";
			String UserNameTextBox = "//*[@id=\"txtUserName\"]";
			String PasswordTextBox = "//*[@id=\"txtPassword\"]";
			String ConfirmPasswordTextBox = "//*[@id=\"txtCnfPassword\"]";
			String FirstNameTextBox = "//*[@id=\"txtFirstName\"]";
			String LastNameTextBox = "//*[@id=\"txtLastName\"]";
			String AddressTextBox = "//*[@id=\"item_details\"]/div[2]/div[4]/div/div[1]/div[7]/input";
			String CreateAccountButton = "//*[@id=\"btnRegister\"]";

			String ProfileNameWebElement = ".//*[@id='dLabel']";
			String myExpectedRegistedUserName = sampleUserFname+" "+sampleUserLname;
			
		// **********Open Browser and Go to Application 	
			OpenBrowserAndNavigateToApplication();
	
		// **********Click Signup/Registration Button And Navigate to Registration Page  	
			ClickWebElement(loginLink);
			ClickWebElement(SignupButton);

		// **********Registration Process   	
			SetTextOnWebElement(EmailTextBox,sampleUserEmail);
			SetTextOnWebElement(UserNameTextBox,sampleUserID);
			SetTextOnWebElement(PasswordTextBox,"Dhaka_1986");
			SetTextOnWebElement(ConfirmPasswordTextBox,"Dhaka_1986");
			SetTextOnWebElement(FirstNameTextBox,sampleUserFname);
			SetTextOnWebElement(LastNameTextBox,sampleUserLname);
			SetTextOnWebElement(AddressTextBox,"1234 New York ");
			ClickWebElement(CreateAccountButton);

		// **********Validate Registration Successfull   	
			validateTextOfaElement("Registration Test " , ProfileNameWebElement, myExpectedRegistedUserName);
		
		 
//#################### Test 2 : Login Test Created By Mr Sam  
			
			//****** Xpath Elements For Login Test Process 
				String LoginIDTextBox = "//*[@id=\"username\"]";
				String LoginPasswordTextBox = "//*[@id=\"password\"]";
				String LoginButton = "//*[@id=\"jqLogin\"]";
			// **********Open Browser and Go to Application 	
				OpenBrowserAndNavigateToApplication();
		 
			// **********Click Login Link 	
				ClickWebElement(loginLink);

			// **********Enter a Valida User ID & Password 	
				SetTextOnWebElement(LoginIDTextBox,sampleUserID);
				SetTextOnWebElement(LoginPasswordTextBox,"Dhaka_1986");
				ClickWebElement(LoginButton);
				DriverwaitFiveSecond();

				validateTextOfaElement("Login Test " , ProfileNameWebElement, myExpectedRegistedUserName);
			 
//#################### Test 3 : Change Password Test   

			// **********Variables Needed For this TEst  	
				String sampleChangedPassword = "Dhaka_18";
				String MyAccountLink = "//*[@id=\"drp_div\"]/ul/li/div/div[1]/a";
				String ChangePasswordLink = "//*[@id=\"item_details\"]/div[3]/div[1]/div/div[4]/a";
				
				String OldPasswordTextBox = "//*[@id=\"item_details\"]/div[2]/div[4]/div/div[1]/div[1]/input";
				String NewPasswordTextBox = "//*[@id=\"item_details\"]/div[2]/div[4]/div/div[1]/div[2]/input";
				String ConfirmNewPasswordTextBox = "//*[@id=\"item_details\"]/div[2]/div[4]/div/div[1]/div[3]/input";

				String CHangePasswordButton = "//*[@id=\"item_details\"]/div[2]/div[4]/div/div[1]/div[4]/div/input[2]";
				
				String LogoutButton = "//*[@id=\"drp_div\"]/ul/li/div/div[2]/a";
				
			// **********Open Browser and Go to Application 	
				OpenBrowserAndNavigateToApplication();		 
			
			// **********Click Login Link 	
				ClickWebElement(loginLink);
			 
		  // **********Enter a Valida User ID & Password & Login to the System  	
				SetTextOnWebElement(LoginIDTextBox,sampleUserID);
				SetTextOnWebElement(LoginPasswordTextBox,"Dhaka_1986");
				ClickWebElement(LoginButton);
				DriverwaitFiveSecond();
			 
			// **********Click My Profile Label & Click on My Account Link
				ClickWebElement(ProfileNameWebElement);
				ClickWebElement(MyAccountLink);
				DriverwaitFiveSecond();
			
			// **********Click Change Password Field 
				ClickWebElement(ChangePasswordLink);
				DriverwaitFiveSecond();
				SetTextOnWebElement(OldPasswordTextBox,"Dhaka_1986");
				SetTextOnWebElement(NewPasswordTextBox,sampleChangedPassword);
				SetTextOnWebElement(ConfirmNewPasswordTextBox,sampleChangedPassword);
				ClickWebElement(CHangePasswordButton);
				DriverwaitFiveSecond();

			// **********Click ProfileName & Click  Log Out Link 
				ClickWebElement(ProfileNameWebElement);
				ClickWebElement(LogoutButton);
				DriverwaitFiveSecond();

				// **********Click Login Link 	
				ClickWebElement(loginLink);
			 
		  // **********Enter a Valida User ID & Password & Login to the System  	
				SetTextOnWebElement(LoginIDTextBox,sampleUserID);
				SetTextOnWebElement(LoginPasswordTextBox,sampleChangedPassword);
				ClickWebElement(LoginButton);
				DriverwaitFiveSecond();
			
				validateTextOfaElement("Changed Password  Test " , ProfileNameWebElement, myExpectedRegistedUserName);

		
//#################### Test 4 : No Order Result As a New Customer Test   Section By ME SMith 

				String myorderlink = "//*[@id='item_details']/div[3]/div[1]/div/div[1]/a";
				String myordertableRow = "//*[@id=\"wrapper\"]/div[2]/div[1]/div[1]/div/form/div[2]/div[1]/div[2]/table/tbody/tr[2]/td";
				
				// **********Open Browser and Go to Application 	
				OpenBrowserAndNavigateToApplication();		 
			
			// **********Click Login Link 	
				ClickWebElement(loginLink);
			 
		  // **********Enter a Valida User ID & Password & Login to the System  	
				SetTextOnWebElement(LoginIDTextBox,sampleUserID);
				SetTextOnWebElement(LoginPasswordTextBox,sampleChangedPassword);
				ClickWebElement(LoginButton);
				DriverwaitFiveSecond();
			 
			// **********Click My Profile Label & Click on My Account Link
				ClickWebElement(ProfileNameWebElement);
				ClickWebElement(MyAccountLink);
				DriverwaitFiveSecond();

			// **********Click On My ORder Link 
				ClickWebElement(myorderlink);
				
			validateTextOfaElement("No Order Result As a New Customer Test  " , myordertableRow, "NO_RESULT_TEXT");
	

				 
				 
	}
	
}



