package Testcases;

import org.testng.annotations.Test;

import Pageobject.Dashboard;
import Pageobject.Loginpage;

public class Tc_Dashboard extends Baseclass{
	
	@Test
	public void Logintest1() {
		
		Loginpage lp=new Loginpage(driver);
		lp.setUsername(username);
		lp.setpassword(password);
		lp.click();
		
		Dashboard hm=new Dashboard(driver);
		hm.clickPatient();
		hm.registerPatient();
	}
	
}


