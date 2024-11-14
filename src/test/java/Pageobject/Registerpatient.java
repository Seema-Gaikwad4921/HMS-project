package Pageobject;

import java.awt.Button;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Registerpatient {

	WebDriver driver;

	 WebDriver ldriver;

	public Registerpatient (WebDriver rdriver) {
		
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
	}
	
	@FindBy(xpath="//*[@id=\"inputEmail4\"]")
	WebElement Firstname;
	
	@FindBy(name="pat_lname")
	WebElement Lastname;
	
	@FindBy(name="pat_dob")
	WebElement dob;
	
	@FindBy(name="pat_age")
 	WebElement age;
	
	@FindBy(name="pat_addr")
	WebElement address;
	
	@FindBy(name="pat_phone")
     WebElement phonenumber;
	
	@FindBy(name="pat_ailment")
	WebElement patient;

	@FindBy (name="pat_type")
	WebElement type;
	
	@FindBy(xpath="//*[@id=\"wrapper\"]/div[3]/div/div/div[2]/div/div/div/form/button")
	WebElement Addpatient;
	
	public void setfirstname(String fname)
	{
		Firstname.sendKeys(fname);
	}
	
	public void setlastname(String lname)
	{
	Lastname.sendKeys(lname);
	}
	public void setDOB(String dob2)
	{
	dob.sendKeys(dob2);
	}

	public void setage (String x)
	{
		age.sendKeys(String.valueOf(x));
	}
	
	public void setaddress (String address2)
	{
		address.sendKeys(address2);
	}
	

	
	public void setphonenumber (String phno)
	{
		phonenumber.sendKeys(phno);
	}
	
	public void patientAliement(String PAL)
	{
		patient.sendKeys(PAL);
	}
	
	public void setpatienttype(int a)
	{
		
		Select ss = new Select(type);
		ss.selectByIndex(a);
		
	}
	
	public void click()
	{
		 Addpatient.click();
	}
}	
	
	
	
	
	
	

	
	
	
	
	
	
	
	
