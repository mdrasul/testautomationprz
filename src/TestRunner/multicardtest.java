package TestRunner;

import AllHtmlPages.homepage;
import AllHtmlPages.registrationpage;
import seleniumactions.Selenium;

public class multicardtest {

	public static void main(String[] args) 
	{
		
			new Selenium();
			new homepage();
			new registrationpage();
		
		//#################### Test 1 : Registration Process Test Created By-Rasul 
		
				// **********Open Browser and Go to Application 	
					Selenium.OpenBrowserAndNavigateToApplication();
					
				// **********Start SignUp Process 
					homepage.StartSignUpProcess();
				
				// **********Registration Process   	
					registrationpage.CompleteRegistation();
				
				// **********Validate Registration 
					String ProfileNameWebElement = ".//*[@id='dLabel']";
					String myExpectedRegistedUserName = registrationpage.sampleUserFname+" "+registrationpage.sampleUserLname;
					Selenium.validateTextOfaElement("Registration Test " , ProfileNameWebElement, myExpectedRegistedUserName);
	}

}
