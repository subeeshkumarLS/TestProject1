package com.crm.qa.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

public class LoginPageTest extends TestBase {
	LoginPage loginPage;
	HomePage homePage;

	public LoginPageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		init();
		loginPage = new LoginPage();
	}

	@Test(priority = 1)
	public void loginPageTitleTest() {
		String title = loginPage.validateLoginPageTitle();
		Assert.assertEquals(title, "Britannia Industries");
	}

	@Test(priority = 2)
	public void loginTest() throws IOException, InterruptedException {
		homePage = loginPage.loginTest(prop.getProperty("email"), prop.getProperty("password"));
	}
	
	
	@Test(priority=3)
	public void withoutEmailTest() throws InterruptedException {
		loginPage.emptyEmailLogin();
	}
	
	@Test(priority=4)
	public void emptyEmailLoginAlertTest() throws InterruptedException {
		loginPage.emptyEmailLoginAlert();
	}
	@Test(priority=5)
	public void emptyPasswordTest() throws InterruptedException {
		loginPage.emptyPasswordLogin();
	}
	@Test(priority=6)
	public void whiteSpaceEmailTest() throws InterruptedException {
		loginPage.whiteSpaceEmailLogin();
	}
	@Test(priority=7)
	public void whiteSpacePasswordTest() throws InterruptedException {
		loginPage.whiteSpacePasswordLogin();
	}
	@Test(priority=8)
	public void wrongPasswordTest() throws InterruptedException {
		loginPage.wrongPasswordLogin();
	}
	@Test(priority=9)
	public void wrongPasswordTestAlert() throws InterruptedException {
		loginPage.wrongPasswordLogin();
	}
	@Test(priority=10)
	public void noCredentials() throws InterruptedException {
		loginPage.noUserCredentials();
	}
	

	
	@AfterMethod
	public void close() {
		driver.quit();
	}

}
