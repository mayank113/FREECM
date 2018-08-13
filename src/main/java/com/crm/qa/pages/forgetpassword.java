package com.crm.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.crm.qa.base.Baseclass;

public class forgetpassword extends Baseclass{

	public forgetpassword() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath="//form[contains(text(),'Enter your username or your email address:')]//input")
	WebElement Email;
	@FindBy(xpath="//form[contains(text(),'Enter your username or your email address:')]//input[@value='Get Password']")
	WebElement getpassword;
	@FindBy(xpath="//div[@id='message']")
	WebElement confirm;
	
	
	public String title() {
		return driver.getTitle();	
	}

	
	public void verifyforgetpassword(String email) {
		Email.sendKeys(email);
		getpassword.click();
		
	}
	public String Verifyconfirmation(){
		
	return confirm.getText();	
	}
}
