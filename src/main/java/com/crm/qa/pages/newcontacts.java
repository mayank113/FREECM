package com.crm.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import com.crm.qa.base.Baseclass;

public class newcontacts extends Baseclass{
	
	@FindBy(xpath="//select[@name=\"title\"]")
	WebElement Title;
	@FindBy(xpath="//input[@id=\"first_name\"]")
	WebElement ft_name;
	@FindBy(xpath="//input[@id=\"surname\"]")
	WebElement lt_name;
	@FindBy(xpath="//input[@id=\"email\"]")
	WebElement email;
	@FindBy(xpath="//td[@align=\"center\"]//input[@value=\"Save\"]")
	WebElement save;
	
	public newcontacts() throws IOException {
		super();
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}
	Loginpage login;
	Homepage home;
	newcontacts newcontactsobj;
	@BeforeMethod
	public  void start() throws Exception {
		Initiate();	
		 login = new Loginpage();
		 login.login();
		home = new Homepage();
		driver.switchTo().frame("mainpanel");
		newcontactsobj = home.clicknewcontact();
		

	}
	
	public void createcontacts(String title,String firstname, String lastname,String Email) {
	
		Title.sendKeys(title);
		ft_name.sendKeys(firstname);
		lt_name.sendKeys(lastname);
		email.sendKeys(Email);
		save.click();
	}

}
