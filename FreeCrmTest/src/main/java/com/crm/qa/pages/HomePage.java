package com.crm.qa.pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class HomePage extends TestBase {
	
	public HomePage() throws IOException
	{
		PageFactory.initElements(driver, this);
	}
	
	public String checkHomePageTitle() {
		String title = driver.getTitle();
		System.out.println("The title is" +title);
		return title;
	
	}


 



}