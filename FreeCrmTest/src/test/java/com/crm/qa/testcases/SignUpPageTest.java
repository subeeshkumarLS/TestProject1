package com.crm.qa.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.pages.SignUpPage;

public class SignUpPageTest extends TestBase {
	
	LoginPage login;
	SignUpPage sign;
	
	public SignUpPageTest() throws IOException {
		super();
	}
	
	@BeforeMethod
	public void setup() throws IOException
	{
		init();
		login = new LoginPage();
		sign  = new SignUpPage();
		
	}

	@Test(priority = 1)
	public void newUserTest() {
		sign.newUser();
		
	}

}
