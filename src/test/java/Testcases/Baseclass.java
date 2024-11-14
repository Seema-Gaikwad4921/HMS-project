package Testcases;


import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import Utilities.Readconfig;

public class Baseclass {
	
		
	 Readconfig readconfig = new Readconfig();

	
	 String Url = readconfig.getapplicationUrl() ;
	 String username =readconfig.getusername();
	 String password=readconfig.getpaassword();
	 String Fname1=readconfig.getFirstname();
	 String Lname=readconfig.getLasttname();
	 String dob=readconfig.getDob();
	 String Age=readconfig.getage();
	 String address=readconfig.getAdress() ;
	 String mobno=readconfig.getmobno();
	 String PLA=readconfig.getpatientAliement();
	 String ptype=readconfig.getpatienttype();
	 
	static	WebDriver driver;
	

		@BeforeClass
		public void setup() throws InterruptedException
		
		{ 


			
			  ChromeOptions options = new ChromeOptions();
			    options.addArguments("--remote-allow-origins=*");
			
			   	driver = new ChromeDriver(options);
				
				driver.manage().window().maximize(); 
				
				driver.get(Url);
				
				
				  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
		}
		
		@AfterClass
		public void tearDown() throws InterruptedException
		{
			Thread.sleep(5000);
			driver.quit();
		}
}
