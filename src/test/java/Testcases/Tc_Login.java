package Testcases;

import org.testng.annotations.Test;

import Pageobject.Loginpage;

public class Tc_Login  extends Baseclass{
	@Test
	public void LoginTest()   
	 {                                  
		  
		Loginpage lp = new Loginpage(driver);
		lp.setUsername(password);
		lp.setpassword(username);
         lp.click();
	}
}   


