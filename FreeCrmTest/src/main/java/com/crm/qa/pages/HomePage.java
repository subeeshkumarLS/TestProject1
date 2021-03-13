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
	public void homePageDashboard() {
		driver.findElement(By.name("/dashboard")).click();
		System.out.println(driver.findElement(By.xpath("//p[text()='Global Data Report']")).getText());
	}
	public void homePageDistributive() {
		driver.findElement(By.name("/market-survey")).click();
		driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("sub");
		System.out.println(driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div[2]/div[2]/div[2]/div/div/table/tbody")).getText());
	}

    public void appSign() {
    	driver.findElement(By.name("/application-sign")).click();
    	System.out.println(driver.findElement(By.xpath("//p[@class='application-sign-table-none-text']")).getText());
    }
    
    public void appReview() {
    	driver.findElement(By.name("/application-review")).click();
    	System.out.println(driver.findElement(By.xpath("//td[text()='No matching records found']")).getText());
    }
    public void appReject() {
    	driver.findElement(By.name("/application-review")).click();
    	System.out.println(driver.findElement(By.xpath("//td[text()='No matching records found']")).getText());
    }
    public void Logout()
    {
    	driver.findElement(By.xpath("//div[text()='LOGOUT']")).click();
    	System.out.println(driver.switchTo().alert().getText());
    	driver.switchTo().alert().accept();
    	
    	
    }
    
    public void noLogout()
    {
    	driver.findElement(By.xpath("//div[text()='LOGOUT']")).click();
    	System.out.println(driver.switchTo().alert().getText());
    	driver.switchTo().alert().dismiss();
    }
 



}