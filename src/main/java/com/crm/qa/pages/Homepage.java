package com.crm.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/*import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.sikuli.script.SikuliException;*/

import com.crm.qa.base.Baseclass;

public class Homepage extends Baseclass{
	
	@FindBy (xpath="//a[contains(text(),'Contacts')]")
	WebElement contact;
	@FindBy (xpath="//a[contains(text(),'New Contact')]")
	WebElement Newcontact;
	
	public Homepage() throws IOException {
		super();
		PageFactory.initElements(driver, this);

	}
	
	
	
public void click_contactspage() {
		contact.click();
		
	}

public String title() {
	
		return driver.getTitle();
	}

public newcontacts clicknewcontact() throws IOException {
	Actions act = new Actions(driver);
	act.moveToElement(contact).build().perform();
	Newcontact.click();
	return new newcontacts();	
	}

/*public void logout() throws SikuliException {
	
	Screen sc = new Screen();
	Pattern pt	= new Pattern("C:\\Users\\Mayank\\eclipse-workspace\\FREECM\\SikuliScreenshot\\logout.JPG");
	sc.wait(pt,20);
	sc.click();
	
	
}*/
}