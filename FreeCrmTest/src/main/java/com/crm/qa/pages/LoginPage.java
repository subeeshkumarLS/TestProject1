package com.crm.qa.pages;

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

	@FindBy(name = "/market-survey")
	WebElement pD;

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	public String validateLoginPageTitle() {
		return driver.getTitle();
	}

	public HomePage login(String em, String pwd) {
		email.sendKeys(em);
		password.sendKeys(pwd);
		loginBtn.click();
		pD.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement disr = driver.findElement(By.xpath("//div[@class='combutton noMarginRight']"));
		disr.click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement add = driver.findElement(By.xpath("//input[@value='New One']"));
		add.click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement submit = driver.findElement(By.xpath("//div[@class='combutton flexCenterLabel']"));
		submit.click();
		WebElement logout = driver.findElement(By.xpath("//div[contains(text(),'LOGOUT')]"));
		logout.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement newuser = driver.findElement(By.xpath("//div[contains(text(),'New user?')]"));
		newuser.click();
		WebElement source = driver.findElement(By.name("firstName"));
		source.click();
		source.sendKeys("subi");
		source.sendKeys(Keys.TAB);
		WebElement dest = driver.findElement(By.name("lastName"));
		dest.sendKeys("kumar");
		dest.sendKeys(Keys.TAB);
		WebElement ema = driver.findElement(By.name("email"));
		ema.sendKeys("subi5@gmail.com");
		ema.sendKeys(Keys.TAB);
		WebElement phn = driver.findElement(By.name("phone"));
		phn.sendKeys("8675832915");
		phn.sendKeys(Keys.TAB);
		WebElement pwsd = driver.findElement(By.name("password"));
		pwsd.sendKeys("12345678");
		pwsd.sendKeys(Keys.TAB);
		WebElement slt = driver.findElement(By.id("mui-component-select-role"));
		slt.sendKeys(Keys.ENTER);
		WebElement dropdwn = driver.findElement(By.xpath("//li[@data-value='6aac7b66-7864-4c83-beee-2bd4e5cfd21e']"));
		dropdwn.sendKeys(Keys.ENTER);
		dropdwn.sendKeys(Keys.TAB);
		WebElement sign = driver.findElement(By.className("MuiButton-label"));
		sign.click();

		return new HomePage();
	}
}
