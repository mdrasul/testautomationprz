package javasteps;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class registration4 
{
	 public static WebDriver driver;

		//**** Test Sample  Data 
		static String sampleUserEmail = "sample_22@gmail.com";
		static String sampleUserID = "sample_22";
		static String sampleUserFname =  "MR";
		static String sampleUserLname= "User 22";
	 
	
	/********************************************** SELENIUM ACTIONS ****************************************            
	 	* ------------------------------------ 
	 	* 
 	*/

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
		
	/********************************************** Home Page Related Functions ****************************************            
	 	* ------------------------------------ 
	 	* StartSignUpProcess()
	 	* login() 
	 	* 
	*/
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


	/********************************************** Logged-In User Page Related Functions	 ****************************************  	  
	 	* ------------------------------------ 
	 	* gotoMyAccount()
	 	* LogOut()
	 	* 
	*/
	static String ProfileNameWebElement = ".//*[@id='dLabel']";
	static String MyAccountLink = "//*[@id=\"drp_div\"]/ul/li/div/div[1]/a";

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
	

	/********************************************** My-Account Page Related Functions **********************************************    
	 	* ------------------------------------ 
	 	* startchangepasswordProcess()
	 	* gotoMyorderSection()
	 	* 
 	*/
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

	
	/******************************************* Change Password Page Related Functions *******************************************  
	 	* ------------------------------------ 
	 	* CompleteChangePassword()
	 	* 
	*/
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

		
	/****************************************** Registration Page Related Functions *********************************************
	 	* ------------------------------------ 
	 	* CompleteRegistation()
	 	* 
 	*/
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
	
	
	
	
	
	
	/****************************************** Test Driver MAIN() Functions  *********************************************
 	* ------------------------------------ 
 	* 
	*/
		
	public static void main(String[] args)
	{
		
//#################### Test 1 : Registration Process Test Created By-Rasul 
		
		// **********Open Browser and Go to Application 	
			OpenBrowserAndNavigateToApplication();
			
		// **********Start SignUp Process  	
			StartSignUpProcess();
		
		// **********Registration Process   	
			CompleteRegistation();
		
		// **********Validate Registration 
			String ProfileNameWebElement = ".//*[@id='dLabel']";
			String myExpectedRegistedUserName = sampleUserFname+" "+sampleUserLname;
			validateTextOfaElement("Registration Test " , ProfileNameWebElement, myExpectedRegistedUserName);

		 
//#################### Test 2 : Login Test Created By Mr Sam  
			
		// **********Open Browser and Go to Application 	
			OpenBrowserAndNavigateToApplication();
		
		// **********Login To Application  	
			login(sampleUserID,"Dhaka_1986");
		
		// **********Validate Login Succes  	
		String loggedinProfileNameLabel = ".//*[@id='dLabel']";
		String myExpectedRLoggedInUserName = sampleUserFname+" "+sampleUserLname;
		validateTextOfaElement("Login Test " , ProfileNameWebElement, myExpectedRLoggedInUserName);
			 
//#################### Test 3 : Change Password Test   

			// **********Variables Needed For this TEst  	
				String sampleChangedPassword = "Dhaka_18";
				
			// **********Open Browser and Go to Application 	
				OpenBrowserAndNavigateToApplication();		 
			
				// **********Login To Application  	
				login(sampleUserID,"Dhaka_1986");
				gotoMyAccount();
				startchangepasswordProcess();
				CompleteChangePassword(sampleChangedPassword);
				LogOut();

				//***** Re- Log Agin & Validate 
				login(sampleUserID,sampleChangedPassword);
				validateTextOfaElement("Changed Password  Test " , ProfileNameWebElement, myExpectedRegistedUserName);

		
//#################### Test 4 : No Order Result As a New Customer Test   Section By ME SMith 

				
			// **********Open Browser and Go to Application 	
				OpenBrowserAndNavigateToApplication();		 
				login(sampleUserID,sampleChangedPassword);
				gotoMyAccount();
				gotoMyorderSection();
				
				//**** Validate No Result is in Order Table 
				String myordertableRow = "//*[@id=\"wrapper\"]/div[2]/div[1]/div[1]/div/form/div[2]/div[1]/div[2]/table/tbody/tr[2]/td";
				validateTextOfaElement("No Order Result As a New Customer Test  " , myordertableRow, "NO_RESULT_TEXT");
	
//#################### Test 5 : LOGIN & LOG OUT
				OpenBrowserAndNavigateToApplication();		 
				login(sampleUserID,sampleChangedPassword);
				LogOut();

				 
				 
	}
	
}



