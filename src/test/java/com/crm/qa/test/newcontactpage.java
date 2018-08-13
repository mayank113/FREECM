package com.crm.qa.test;

import org.testng.annotations.Test;
import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.Baseclass;
import com.crm.qa.datasource.datasource_reader;
import com.crm.qa.pages.Homepage;
import com.crm.qa.pages.Loginpage;
import com.crm.qa.pages.newcontacts;
import com.crm.qa.utility.Brokenlinks;


public class newcontactpage extends Baseclass{
Loginpage login;
Homepage home;
newcontacts newcontactsobj;
	public newcontactpage() throws IOException {
		super();
		// TODO Auto-generated constructor stub

	}

	@BeforeMethod
	public  void start() throws Exception {
		Initiate();	
		 login = new Loginpage();
		 login.login();
		home = new Homepage();
		driver.switchTo().frame("mainpanel");
		newcontactsobj = home.clicknewcontact();
		

	}
@Test
public void verify_broken_links() throws Exception {
	Thread.sleep(2000);
Brokenlinks bk = new Brokenlinks();	
	bk.verify_brokenlinks();
}

@Test(dataProvider= "datasource",dataProviderClass=datasource_reader.class)
public void createnewcontact(String title,String firstname, String lastname,String Email) throws Exception {
Thread.sleep(2000);
newcontactsobj.createcontacts(title, firstname, lastname, Email);
	
}
	/*@AfterMethod
	public  void End() {
		driver.quit(s);
		//run.run();
	}*/
}
