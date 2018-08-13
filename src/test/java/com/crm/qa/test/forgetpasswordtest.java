package com.crm.qa.test;

import org.testng.annotations.Test;
import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.Baseclass;
import com.crm.qa.pages.Loginpage;
import com.crm.qa.pages.forgetpassword;
import com.crm.qa.utility.Brokenlinks;
import com.crm.qa.utility.Runner;

public class forgetpasswordtest extends Baseclass{
Runner run;
Brokenlinks link;
Loginpage login;
forgetpassword foregetpassword;
	public forgetpasswordtest() throws IOException {
		super();
		run = new Runner();
		 link =new Brokenlinks();
	}

	@BeforeMethod
	public  void start() throws Exception {
		Initiate();	
		login = new Loginpage();
		 foregetpassword = login.foregetpassword();
		
	}
	
	@Test
	   public void verifytitle() throws Exception{
	 foregetpassword.title();
		
		}
	
	@Test
   public void checkbrokenlinks() throws Exception{
		
		System.out.println("mayank");
		link.verify_brokenlinks();
		
	}
	
	/*@AfterMethod
	public  void End() {
		driver.quit();
		//run.run();
	}*/
	
}
