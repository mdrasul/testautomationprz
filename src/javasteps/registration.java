package javasteps;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class registration 
{
	
	public static void main(String[] args)
	{
		//System.out.println("My Project :  Hello to Computer ");
		
		// We have to Tell Java that Open the Chrome browser from my computer 
		// 1. Because There is a JAva Project Already Developed to Open Chrome/FX/IE 
		//    Which is Selenium - we have to download that project into our machine 
		//2.  we have to make a Connection with Our Project To selenium Peoject
		
		//3.  Depending On the Browser we need to download one more driver file from that provider  
		//    Chrome.exec   chrome  for mac 
		//	  Firefox  Firefox Driver .exec
		//4.  we have to make a connection with Chrome/FX/IE driver with our code      
		
		System.out.println("My Project :  I am Going to Open Chrome Browwser ");
		System.out.println("");
		System.out.println("");


		// **********Open Browser and Go to Application 	
		 WebDriver driver;
		 System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//chromedriver");
		 driver = new ChromeDriver();
		 driver.get("https://www.demo.iscripts.com/multicart/demo/");
		 //driver.get("https://www.youtube.com");
		 
		 

		//==>> Control A Web Elements 
		 /*
		  	* all Below elements is a HTML Representation of a page 
		  	* when we request a page from a server [www.facebook.com] the page load inside a DOM (Document Object MOdel) in my machine  	
		  		* image <img 
		  		* Links <a
		  		* Division <div
		  		* Span <span
		  		* ListBox <ul> <ol>
		  		* Dropdown <option
		  */
		 
		 //==> To get a COntrol to one(1) web-element we can use driver.findelemnt() method of selenium webdriver 
		 //==>> Each web Element has a Address or Location associated with it 
		 //==>> There are different kind of location for each elments they are called    ** locators ** 
		 //===>>  Locator Type 1 : Xpath
		 //===>>  Locator Type 2 : CSS
		 //===>>  Locator Type 3 : ID or Name or Class 
		 
		
		// **********Click Signup / Registration Button And Navigate to Registration Page  	
		 driver.findElement(By.xpath("//*[@id=\"dLabellogin\"]")).click();
		 driver.findElement(By.xpath("//*[@id=\"jqSignup\"]")).click();

		// **********Registration Process   	
		 driver.findElement(By.xpath("//*[@id=\"txtEmail\"]")).sendKeys("sample_4@gmail.com");
		 driver.findElement(By.xpath("//*[@id=\"txtUserName\"]")).sendKeys("sample_4");
		 driver.findElement(By.xpath("//*[@id=\"txtPassword\"]")).sendKeys("Dhaka_1986");
		 driver.findElement(By.xpath("//*[@id=\"txtCnfPassword\"]")).sendKeys("Dhaka_1986");
		 driver.findElement(By.xpath("//*[@id=\"txtFirstName\"]")).sendKeys("Fname");
		 driver.findElement(By.xpath("//*[@id=\"txtLastName\"]")).sendKeys("Lname");
		 driver.findElement(By.xpath("//*[@id=\"item_details\"]/div[2]/div[4]/div/div[1]/div[7]/input")).sendKeys("1234 New York ");
		 driver.findElement(By.xpath("//*[@id=\"btnRegister\"]")).click();

		// **********Validate Registration Successfull   	
 
		 	String registered_user_name;
		 	registered_user_name =  driver.findElement(By.xpath(".//*[@id='dLabel']")).getText();

		 	
		 	
		 	
		 	
		 	
		 	
		 //==> To get a COntrol to Multiple  web-element we can use driver.findelemnts() method of selenium webdriver 

		 //List<WebElement> alltitle = driver.findElements(By.xpath(".//*[@id='video-title']"));
		 //alltitle.get(0).click();

		 //System.out.println(alltitle.get(0).click(););
		 //System.out.println(alltitle.get(1).getText());
		 //System.out.println(alltitle.get(2).getText());

		
		 
		
		
	}
	
}



