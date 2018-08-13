package com.crm.qa.test;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.crm.qa.base.Baseclass;
import com.crm.qa.pages.Homepage;
import com.crm.qa.pages.Loginpage;
import com.crm.qa.pages.forgetpassword;
import com.crm.qa.pages.signup;
import com.crm.qa.utility.Runner;

public class loginpagetest extends Baseclass{

	Homepage home;
	forgetpassword forget;
	 signup sign;
Loginpage login;
public loginpagetest() throws IOException {
		super();
	}

@BeforeMethod
public  void start() throws Exception {
	Initiate();	
	login = new Loginpage();

}

@Test(priority =1)
public void VerifyTitle() {
	String Title = login.title();
	System.out.println("Page Title>"+Title);
	AssertJUnit.assertEquals(login.title(), "Free CRM software in the cloud powers sales and customer service"," Page title is not mached");
}

@Test(priority =2)
public void VerifyLogin() throws IOException, Exception {
 home = login.login();
 String tittle=home.title();
 System.out.println("Home Page Title"+tittle);
 AssertJUnit.assertEquals(tittle, "CRMPRO"," Page title is not mached");
}

@Test(priority =3)
public void VerifySignuplink() throws IOException, Exception {
sign =	login.signup();
String tittle=sign.title();
System.out.println("Signup Page Title"+tittle);
AssertJUnit.assertEquals(tittle, "CRMPRO - CRM Pro for customer relationship management, sales, and support"," Page title is not mached");
}

@Test(priority =4)
 
public void VerifyForgetpasswordlink() throws IOException, Exception {
	forget =login.foregetpassword();
	String tittle=forget.title();
	System.out.println("foregetpassword Page Title"+tittle);
	 AssertJUnit.assertEquals(tittle, "CRMPRO Log In Screen"," Page title is not mached");
}

@AfterMethod
public  void End() {
	driver.quit();
	//run.run();
}
}
