package Testcases;

import org.testng.annotations.Test;

import Pageobject.Dashboard;
import Pageobject.Loginpage;
import Pageobject.Registerpatient;

public class Tc_RgisterPatient  extends Baseclass{
	@Test
	public void Login()
	{
		  
			Loginpage lp = new Loginpage(driver);
			lp.setUsername(username); 
			lp.setpassword(password);
	         lp.click();
	         
	         Dashboard hm=new Dashboard(driver);
	 		hm.clickPatient();
	 		hm.registerPatient();
	 		
	 		Registerpatient rp=new 	Registerpatient(driver);
	 
	 		rp.setfirstname(Fname1);
	 		rp.setlastname(Lname);
	 		rp.setDOB(dob);
	 	    rp.setage(Age);
	 		rp.setaddress(address);	
	 		rp.setphonenumber(mobno);
	 		rp.patientAliement(PLA);
	 		rp.setpatienttype(1);
	 		
	 			
	}


}
