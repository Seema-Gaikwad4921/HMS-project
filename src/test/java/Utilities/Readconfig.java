package Utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class Readconfig {
	 Properties pro;
	  String path= "C:\\Users\\thomb\\eclipse-workspace\\HMS\\configuration\\config.properties";
	  
	  public Readconfig() {
		  
		  pro=new Properties();
		  
		 try {
			 
			 FileInputStream fis = new  FileInputStream(path);
					 pro.load(fis);
		 }
			catch(Exception e)
		 {
				System.out.println("Exception is"+e.getMessage());
			}  
	  }
	  public String getapplicationUrl() 
	  {
		String Url = pro.getProperty("Baseurl");
		return Url;
	  }
	  
	  public String getusername()
	  {
		String uname1 = pro.getProperty("username");
		return uname1;
	  }
	  
	  public String getpaassword() 
	{
		String pwd1 =pro.getProperty("password");
		return pwd1;
		
		
	}
	  public String getFirstname() 
	  {
		  String fname=pro.getProperty("Firstname");
		  return fname;
	  }
	  public String getLasttname() 
	  {
		  String lname=pro.getProperty("Lastname");
		  return lname;
	  }
	  public String getDob() 
	  {
		  String dob1=pro.getProperty("dob");
		  return dob1;
	  }
	  public String getage() 
	  {
		  String age1=pro.getProperty("Age");
		  return age1;
	  }
	  public String getAdress() 
	  {
		  String address=pro.getProperty("Address");
		  return address;
	  }
	  public String getmobno() 
	  {
		  String mobno=pro.getProperty("mobno");
		  return mobno;
	  }
	  public String getpatientAliement() 
	  {
		  String paliement=pro.getProperty("patientAliement");
		  return paliement;
	  }
	  public String getpatienttype()
	  {
		  String type=pro.getProperty("patienttype");
		  return type;
	  }
	}

		
		