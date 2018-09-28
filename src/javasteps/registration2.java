package javasteps;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class registration2 
{
	 public WebDriver driver;

	
	
	public void OpenBrowserAndNavigateToApplication()
	{
		 System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//chromedriver");
		 driver = new ChromeDriver();
		 driver.get("https://www.demo.iscripts.com/multicart/demo/");
	}
	
	
	public void ClickElement(String xpath)
	{
		 driver.findElement(By.xpath(xpath)).click();

	}
	public void SetText(String xpath, String value)
	{
		 driver.findElement(By.xpath(xpath)).sendKeys(value);
	}
	
	
	
	
	public static void main(String[] args)
	{
		
		//#################### Test 1 Registration Process 
		
		//**** Test Data 
		String sampleUserEmail;
		String sampleUserID;
		String sampleUserFname;
		String sampleUserLname;
		
		
		sampleUserEmail = "sample_15@gmail.com";
		sampleUserID = "sample_15";
		sampleUserFname = "MR";
		sampleUserLname = "User 15";

		
		// **********Open Browser and Go to Application 	
		 WebDriver driver;
		 System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//chromedriver");
		 driver = new ChromeDriver();
		 driver.get("https://www.demo.iscripts.com/multicart/demo/");
		 //driver.get("https://www.youtube.com");
		 
	
		// **********Click Signup / Registration Button And Navigate to Registration Page  	
		 driver.findElement(By.xpath("//*[@id=\"dLabellogin\"]")).click();
		 driver.findElement(By.xpath("//*[@id=\"jqSignup\"]")).click();

		// **********Registration Process   	
		 driver.findElement(By.xpath("//*[@id=\"txtEmail\"]")).sendKeys(sampleUserEmail);
		 driver.findElement(By.xpath("//*[@id=\"txtUserName\"]")).sendKeys(sampleUserID);
		 driver.findElement(By.xpath("//*[@id=\"txtPassword\"]")).sendKeys("Dhaka_1986");
		 driver.findElement(By.xpath("//*[@id=\"txtCnfPassword\"]")).sendKeys("Dhaka_1986");
		 driver.findElement(By.xpath("//*[@id=\"txtFirstName\"]")).sendKeys(sampleUserFname);
		 driver.findElement(By.xpath("//*[@id=\"txtLastName\"]")).sendKeys(sampleUserLname);
		 driver.findElement(By.xpath("//*[@id=\"item_details\"]/div[2]/div[4]/div/div[1]/div[7]/input")).sendKeys("1234 New York ");
		 driver.findElement(By.xpath("//*[@id=\"btnRegister\"]")).click();

		// **********Validate Registration Successfull   	
 
		 String registered_user_name;
		 registered_user_name =  driver.findElement(By.xpath(".//*[@id='dLabel']")).getText();
		 
		 if(registered_user_name.equalsIgnoreCase(sampleUserFname+" "+sampleUserLname))
		 {
			 System.out.println("Registration Test Passed Because We successfully Registered ....");
		 }
		 else
		 {
			 System.out.println("Registration Test Failed registered_user_name is not matching with sampleUserFname + sampleUserlname ....");
		 }
		 
		 
		 
		 
		 
			//#################### Test 2 Login

			// **********Open Browser and Go to Application 	
			 WebDriver driver2;
			 System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//chromedriver");
			 driver2 = new ChromeDriver();
			 driver2.get("https://www.demo.iscripts.com/multicart/demo/");
			 //driver.get("https://www.youtube.com");
		 
			// **********Click Login  	
			 driver2.findElement(By.xpath("//*[@id=\"dLabellogin\"]")).click();

			 
			// **********Enter a Valida User ID & Password 	
			 driver2.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys(sampleUserID);
			 driver2.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Dhaka_1986");
			 driver2.findElement(By.xpath("//*[@id=\"jqLogin\"]")).click(); //Clicking Login Need Some Time to Refresh the page 

			 //=== Thread.sleep need a Exception Handeling Of Java 
			 try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			 
			 String Loggedin_user_name =  driver2.findElement(By.xpath(".//*[@id='dLabel']")).getText();
			 if(Loggedin_user_name.equalsIgnoreCase(sampleUserFname+" "+sampleUserLname))
			 {
				 System.out.println("Login Test Passed Because We successfully Logged In with Sample User ID & Password  ....");
			 }
			 else
			 {
				 System.out.println("Login Test Failed Loggedin_user_name is not matching with sampleUserFname + sampleUserlname ....");
			 }
			 
			 
			 
			 
			 
			//#################### Test 3 CHange Password 
			 WebDriver driver3;
			 System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//chromedriver");
			 driver3 = new ChromeDriver();
			 driver3.get("https://www.demo.iscripts.com/multicart/demo/");
			 //driver.get("https://www.youtube.com");
		 
			// **********Click Login  	
			 driver3.findElement(By.xpath("//*[@id=\"dLabellogin\"]")).click();

			 
			// **********Enter a Valida User ID & Password 	
			 driver3.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys(sampleUserID);
			 driver3.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Dhaka_1986");
			 driver3.findElement(By.xpath("//*[@id=\"jqLogin\"]")).click(); //Clicking Login Need Some Time to Refresh the page 
			 
			 //=== Thread.sleep need a Exception Handeling Of Java 
			 try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			 
			// **********Click My Fname & Lname Button & Click on My Account Link 
			 driver3.findElement(By.xpath(".//*[@id='dLabel']")).click();
			 driver3.findElement(By.xpath("//*[@id=\"drp_div\"]/ul/li/div/div[1]/a")).click();

			 //=== Thread.sleep need a Exception Handeling Of Java 
			 try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			// **********Click Change Password Field 
			 driver3.findElement(By.xpath("//*[@id=\"item_details\"]/div[3]/div[1]/div/div[4]/a")).click();

			// **********Enter Change Password Inforamtion 
			 String sampleChangedPassword = "Dhaka_18";
			
			
			 //=== Thread.sleep need a Exception Handeling Of Java 
			 try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			 
			 driver3.findElement(By.xpath("//*[@id=\"item_details\"]/div[2]/div[4]/div/div[1]/div[1]/input")).sendKeys("Dhaka_1986");
			 driver3.findElement(By.xpath("//*[@id=\"item_details\"]/div[2]/div[4]/div/div[1]/div[2]/input")).sendKeys(sampleChangedPassword);
			 driver3.findElement(By.xpath("//*[@id=\"item_details\"]/div[2]/div[4]/div/div[1]/div[3]/input")).sendKeys(sampleChangedPassword);
			 driver3.findElement(By.xpath("//*[@id=\"item_details\"]/div[2]/div[4]/div/div[1]/div[4]/div/input[2]")).click();

			 //=== Thread.sleep need a Exception Handeling Of Java 
			 try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			 

			// **********Click My Fname & Lname Button & Click on Log Out Link 
			 driver3.findElement(By.xpath(".//*[@id='dLabel']")).click();
			 driver3.findElement(By.xpath("//*[@id=\"drp_div\"]/ul/li/div/div[2]/a")).click();
			
			 try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			 
			 

				// **********Click Login  	
				 driver3.findElement(By.xpath("//*[@id=\"dLabellogin\"]")).click();

				 
				// **********Enter a Valida User ID & Password 	
				 driver3.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys(sampleUserID);
				 driver3.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(sampleChangedPassword);
				 driver3.findElement(By.xpath("//*[@id=\"jqLogin\"]")).click(); //Clicking Login Need Some Time to Refresh the page 

				 //=== Thread.sleep need a Exception Handeling Of Java 
				 try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				 
				 String CHangedPassword_user_name =  driver3.findElement(By.xpath(".//*[@id='dLabel']")).getText();
				 if(Loggedin_user_name.equalsIgnoreCase(sampleUserFname+" "+sampleUserLname))
				 {
					 System.out.println("CHanged Password Test Passed Because We successfully Logged In with Sample User ID & Password  ....");
				 }
				 else
				 {
					 System.out.println("CHanged Password Test Failed Loggedin_user_name is not matching with sampleUserFname + sampleUserlname ....");
				 }	
				 
				 
				 
				 
				 
	}
	
}



