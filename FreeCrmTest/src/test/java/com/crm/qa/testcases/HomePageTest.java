package com.crm.qa.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

public class HomePageTest extends TestBase {
	
	LoginPage login;
	HomePage home;
	
	public HomePageTest() throws IOException {
		super();
	}
	
	@BeforeMethod
	public void setup() throws IOException
	{
		init();
		login = new LoginPage();
		home  = new HomePage();
		home  = login.loginTest(prop.getProperty("email"), prop.getProperty("password"));
		
	}
	
	@Test(priority=1)
	 public void HomePageTitleTest()
	 {
		home.checkHomePageTitle();
	 }
	@Test(priority=2)
	 public void HomePageDashboardTest()
	 {
		home.homePageDashboard();
	 }
	
	@Test(priority=3)
	 public void HomePageDistributiveTest()
	 {
		home.homePageDistributive();
	 }

	@Test(priority=3)
	 public void HomePageAppTest()
	 {
		home.appSign();
	 }
	@Test(priority=4)
	 public void AppReviewTest()
	 {
		 home.appReview();
	 }
	@Test(priority=5)
	 public void AppRejectTest()
	 {
		 home.appReject();
	 }
	@Test(priority=6)
	 public void logoutTest()
	 {
		 home.Logout();
	 }
	@Test(priority=7)
	 public void nologoutTest()
	 {
		 home.noLogout();
	 }
	
	@AfterMethod
	public void close()
	{
		driver.quit();
	}



}


