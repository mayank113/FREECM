package com.crm.qa.utility;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

import com.crm.qa.base.Baseclass;

public class Brokenlinks extends Baseclass{
 List<WebElement>  links;
 List<WebElement>  image;
	
	ArrayList<WebElement> Arr = new ArrayList<WebElement>();
	ArrayList<String> finalArr = new ArrayList<String>();
	
	public Brokenlinks() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	
	@Test
	public void verify_brokenlinks() throws Exception {
	links =driver.findElements(By.tagName("a"));
	Arr.addAll(links);
	image =driver.findElements(By.tagName("img"));
	Arr.addAll(image);
	System.out.println(Arr.size());
	for(int i =0;i<Arr.size();i++) {
		
		if(Arr.get(i).getAttribute("href")!=null) {
			finalArr.add(Arr.get(i).getAttribute("href"));
			
		}
		
		}
	System.out.println("Final linsk available"+finalArr.size());
	for (int i=0;i<finalArr.size();i++)
	{
		try {
		URL ul = new URL(finalArr.get(i));
		HttpURLConnection connection  = (HttpURLConnection)ul.openConnection();
		connection.connect();
		System.out.println(finalArr.get(i)+">>" +connection.getResponseMessage());
		connection.disconnect();
		}
		catch(Exception e) {
			
			System.out.println("Exception occor"+e);
		}
		}
	}
}
