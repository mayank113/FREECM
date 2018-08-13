package com.crm.qa.test;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.io.IOException;
import java.util.List;

import org.apache.http.util.Asserts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
//import org.sikuli.script.SikuliException;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.Baseclass;
import com.crm.qa.pages.Homepage;
import com.crm.qa.pages.Loginpage;

public class homepagetest extends Baseclass{

	Loginpage login;
	Homepage home;
	public homepagetest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	
	@BeforeMethod
	public  void start() throws Exception {
		Initiate();
		login = new Loginpage();
		home = new  Homepage();
		login.login();
		driver.switchTo().frame("mainpanel");
		}
	
	@Test(priority=1)
   public void verifytitle() {
		String title =home.title();
		AssertJUnit.assertEquals(title, "CRMPRO","Title is not matched");
		
	}
	
	@Test(priority=2)
	   public void clickcontacts() throws InterruptedException {
		Thread.sleep(2000);
		home.click_contactspage();
		}
	
	@Test(priority=3)
	   public void clicknewcontacts() throws IOException, InterruptedException {
		Thread.sleep(2000);
		home.clicknewcontact();
		}
	
	@AfterMethod
	public  void End(){
		//home.logout();
		//driver.quit();
		//run.run();
	}
}
