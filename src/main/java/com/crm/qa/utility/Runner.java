package com.crm.qa.utility;

import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;

public class Runner {

	public void run(){
		TestNG runner = new TestNG();
		List<String> li = new ArrayList<String>();
		li.add("C:\\Users\\Mayank\\eclipse-workspace\\FREECM\\test-output\\Default suite\\testng-failed.xml");
		runner.setTestSuites(li);
		runner.run();
	}

}
