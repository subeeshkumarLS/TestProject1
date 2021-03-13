package com.crm.qa.pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase {

	@FindBy(name = "email")
	WebElement email;

	@FindBy(name = "password")
	WebElement password;

	@FindBy(className = "MuiButton-label")
	WebElement loginBtn;

	

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	public String validateLoginPageTitle() {
		return driver.getTitle();
	}

	public HomePage loginTest(String em, String pwd) throws IOException {
		email.sendKeys(em);
		password.sendKeys(pwd);
		loginBtn.click();
	

		return new HomePage();

	}

	
	public void emptyEmailLogin() throws InterruptedException {
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123");
		driver.findElement(By.xpath("//span[text()='Login']")).click();	
	    Thread.sleep(4000);	
	}
	
	public void emptyEmailLoginAlert() throws InterruptedException {
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123");
		driver.findElement(By.xpath("//span[text()='Login']")).click();	
	    Thread.sleep(4000);	
	    String alert= driver.findElement(By.xpath("//div[text()='Enter Your Valid Email ID']")).getText();
	    System.out.println("The Alert is:"+alert);
	}
	public void emptyPasswordLogin() throws InterruptedException {
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("testase@gmail.com");
		driver.findElement(By.xpath("//span[text()='Login']")).click();	
	    Thread.sleep(4000);	
	}
	
	public void whiteSpaceEmailLogin() throws InterruptedException {
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys(Keys.SPACE);
		driver.findElement(By.xpath("//span[text()='Login']")).click();	
		Thread.sleep(4000);
	}
	public void whiteSpacePasswordLogin() throws InterruptedException {
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(Keys.SPACE);
		driver.findElement(By.xpath("//span[text()='Login']")).click();	
		Thread.sleep(4000);
	}
	public void wrongPasswordLogin() throws InterruptedException {
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("testase@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("12345678");
		driver.findElement(By.xpath("//span[text()='Login']")).click();	
		Thread.sleep(4000);
	}
	public void wrongPasswordLoginAlert() throws InterruptedException {
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("testase@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("12345678");
		driver.findElement(By.xpath("//span[text()='Login']")).click();	
		Thread.sleep(3000);
		String alert1=driver.findElement(By.xpath("//div[@class='MuiAlert-message']")).getAttribute("value");
		System.out.println("The Alert is:"+alert1);
		
	}
	public void noUserCredentials() throws InterruptedException {
		driver.findElement(By.xpath("//span[text()='Login']")).click();	
		Thread.sleep(4000);
	}
	

}
