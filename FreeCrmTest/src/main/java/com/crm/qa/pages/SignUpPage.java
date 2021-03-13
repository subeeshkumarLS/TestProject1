package com.crm.qa.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

	public class SignUpPage extends TestBase {
		
		public SignUpPage() throws IOException
		{
			PageFactory.initElements(driver, this);
		}
		public void newUser()
		{
			driver.findElement(By.xpath("//div[text()='New user? click here to Sign up']")).click();
			driver.findElement(By.xpath("//span[text()='Sign Up']")).click();
		}
}
