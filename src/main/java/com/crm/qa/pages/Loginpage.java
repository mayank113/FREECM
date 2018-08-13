package com.crm.qa.pages;

import java.io.IOException;
import java.util.regex.Pattern;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.Baseclass;


public class Loginpage extends Baseclass{

	
	
	public Loginpage() throws IOException {
		super();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath="//input[@type='text']")
	@CacheLookup
	WebElement username;
	@FindBy (xpath="//input[@type='password']")
	WebElement password;
	@FindBy (xpath="//input[@value='Login']")
	WebElement login;
	@FindBy (xpath="//a/small[text()='Forgot Password?']")
	WebElement forgetpassword;
	@FindBy (xpath="//a/button[@type='button']")
	WebElement signup;
	
	
	
	public String title() {
		return driver.getTitle();	
	}
	
	public Homepage login() throws IOException {
		username.sendKeys(prop.getProperty("username"));
		password.sendKeys(prop.getProperty("password"));
		login.click();
		return new Homepage();
		
	}
	
	
public forgetpassword foregetpassword() throws IOException {
	
	forgetpassword.click();
	return new forgetpassword();
}

public signup signup() throws IOException {
	
	signup.click();
	return new signup();
}


}
