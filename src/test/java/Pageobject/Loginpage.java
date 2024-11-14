package Pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	WebDriver ldriver;
	
	public Loginpage(WebDriver rdriver) {
		
		ldriver= rdriver;
		PageFactory.initElements(rdriver,this);
	}
	
	@FindBy(name="ad_email")
	WebElement username;
	
	@FindBy(id="password")
	WebElement  password; 
	
   @FindBy(name="admin_login")
   WebElement button;
   
   
   public void setUsername(String user)
   {
	  username.sendKeys(user);
   }
   
   public void setpassword(String pwd)
   {
	   password.sendKeys(pwd);
   }
   
   
   public void click() 
   {
	   button.click();
   }
}

