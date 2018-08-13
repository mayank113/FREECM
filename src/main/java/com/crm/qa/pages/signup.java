package com.crm.qa.pages;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.crm.qa.base.Baseclass;

public class signup extends Baseclass{

	public signup() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath="//select[contains(@id,'payment_plan_id')]")
	WebElement dropdown;
	
	
	public String title() {
		return driver.getTitle();	
	}
		public void selectdropdown(String text) {
			
	Select select = new Select(dropdown);
	select.selectByVisibleText(text);
	}

}
