package com.crm.qa.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.crm.qa.base.TestBase;

public class SignUpPage extends TestBase {

	public SignUpPage() throws IOException {
		PageFactory.initElements(driver, this);
	}

	public void validateFirstName() {

		driver.findElement(By.name("firstName")).sendKeys("Denver");
		driver.findElement(By.xpath("//span[text()='Sign Up']")).click();
	}

	public void validateLastName() {

		driver.findElement(By.name("lastName")).sendKeys("louis");
		driver.findElement(By.xpath("//span[text()='Sign Up']")).click();
	}

	public void validateEmail() {

		driver.findElement(By.name("email")).sendKeys("ss@gmail.com");
		driver.findElement(By.xpath("//span[text()='Sign Up']")).click();
	}

	public void validatePhoneNo() {

		driver.findElement(By.name("phone")).sendKeys("1234567890");
		driver.findElement(By.xpath("//span[text()='Sign Up']")).click();
	}

	public void validatePassword() {

		driver.findElement(By.name("password")).sendKeys("12345678");
		driver.findElement(By.xpath("//span[text()='Sign Up']")).click();
	}

	public void validateDropDown() {

		driver.findElement(By.id("mui-component-select-role")).click();
		driver.findElement(By.xpath("//li[@data-value='2de8d811-ceb3-4a48-a8f9-7284a4625772']")).click();
		driver.findElement(By.xpath("//span[text()='Sign Up']")).click();

	}

	public void validateWhitespaceFirstName() {

		driver.findElement(By.name("firstName")).sendKeys(Keys.SPACE);
		driver.findElement(By.xpath("//span[text()='Sign Up']")).click();
	}

	public void validateWhitespaceLastName() {

		driver.findElement(By.name("lastName")).sendKeys(Keys.SPACE);
		driver.findElement(By.xpath("//span[text()='Sign Up']")).click();
	}

	public void validateWhitespaceEmail() {

		driver.findElement(By.name("email")).sendKeys(Keys.SPACE);
		driver.findElement(By.xpath("//span[text()='Sign Up']")).click();
	}

	public void validateWhitespacePhoneNo() {

		driver.findElement(By.name("phone")).sendKeys(Keys.SPACE);
		driver.findElement(By.xpath("//span[text()='Sign Up']")).click();
	}

	public void validateWhitespacePassword() {

		driver.findElement(By.name("password")).sendKeys(Keys.SPACE);
		driver.findElement(By.xpath("//span[text()='Sign Up']")).click();
	}

	public void validateFirstNameAlert() {

		driver.findElement(By.name("lastName")).sendKeys("Denver");
		driver.findElement(By.name("email")).sendKeys("ss@gmail.com");
		driver.findElement(By.name("phone")).sendKeys("1234567890");
		driver.findElement(By.name("password")).sendKeys("12345678");
		driver.findElement(By.xpath("//span[text()='Sign Up']")).click();
		System.out.println(driver.findElement(By.xpath("//div[text()='Enter Your Valid First Name']")).getText());

	}
	
	public void validateLastNameAlert() {

		driver.findElement(By.name("firstName")).sendKeys("Denver");
		driver.findElement(By.name("email")).sendKeys("ss@gmail.com");
		driver.findElement(By.name("phone")).sendKeys("1234567890");
		driver.findElement(By.name("password")).sendKeys("12345678");
		driver.findElement(By.xpath("//span[text()='Sign Up']")).click();
		System.out.println(driver.findElement(By.xpath("//div[text()='Enter Your Valid Last Name']")).getText());

	}
	public void validateEmailAlert() {

		driver.findElement(By.name("firstName")).sendKeys("Denver");
		driver.findElement(By.name("lastName")).sendKeys("ss");
		driver.findElement(By.name("phone")).sendKeys("1234567890");
		driver.findElement(By.name("password")).sendKeys("12345678");
		driver.findElement(By.xpath("//span[text()='Sign Up']")).click();
		System.out.println(driver.findElement(By.xpath("//div[text()='Enter Your Valid Email ID']")).getText());

	}
	public void validatePhoneNoAlert() {

		driver.findElement(By.name("firstName")).sendKeys("Denver");
		driver.findElement(By.name("lastName")).sendKeys("ss");
		driver.findElement(By.name("email")).sendKeys("sss@gmail.com");
		driver.findElement(By.name("password")).sendKeys("12345678");
		driver.findElement(By.xpath("//span[text()='Sign Up']")).click();
		System.out.println(driver.findElement(By.xpath("//div[text()='Enter Your Valid Phone Number']")).getText());

	}
	
	public void validatePasswordAlert() {

		driver.findElement(By.name("firstName")).sendKeys("Denver");
		driver.findElement(By.name("lastName")).sendKeys("ss");
		driver.findElement(By.name("email")).sendKeys("sss@gmail.com");
		driver.findElement(By.name("phone")).sendKeys("1234567890");
		driver.findElement(By.xpath("//span[text()='Sign Up']")).click();
		System.out.println(driver.findElement(By.xpath("//div[text()='Password Letters Should be Greater Than 8 Digits']")).getText());

	}
	
	public void verifyFirstNameAlert() {

		driver.findElement(By.name("lastName")).sendKeys("Denver");
		driver.findElement(By.name("email")).sendKeys("ss@gmail.com");
		driver.findElement(By.name("phone")).sendKeys("1234567890");
		driver.findElement(By.name("password")).sendKeys("12345678");
		driver.findElement(By.xpath("//span[text()='Sign Up']")).click();
		String FirstNameAlert=driver.findElement(By.xpath("//div[text()='Enter Your Valid First Name']")).getText();
		Assert.assertEquals(FirstNameAlert, "Enter Your Valid First Name");
		System.out.println("The alert message is:"+FirstNameAlert);

	}
	
	public void verifyLastNameAlert() {

		driver.findElement(By.name("firstName")).sendKeys("Denver");
		driver.findElement(By.name("email")).sendKeys("ss@gmail.com");
		driver.findElement(By.name("phone")).sendKeys("1234567890");
		driver.findElement(By.name("password")).sendKeys("12345678");
		driver.findElement(By.xpath("//span[text()='Sign Up']")).click();
		String LastNameAlert=driver.findElement(By.xpath("//div[text()='Enter Your Valid Last Name']")).getText();
		Assert.assertEquals(LastNameAlert, "Enter Your Valid Last Name");
		System.out.println("The alert message is:"+LastNameAlert);

	}
	
	public void verifyEmailAlert() {

		driver.findElement(By.name("firstName")).sendKeys("Denver");
		driver.findElement(By.name("lastName")).sendKeys("sscom");
		driver.findElement(By.name("phone")).sendKeys("1234567890");
		driver.findElement(By.name("password")).sendKeys("12345678");
		driver.findElement(By.xpath("//span[text()='Sign Up']")).click();
		String EmailAlert=driver.findElement(By.xpath("//div[text()='Enter Your Valid Email ID']")).getText();
		Assert.assertEquals(EmailAlert, "Enter Your Valid Email ID");
		System.out.println("The alert message is:"+EmailAlert);

	}
	
	public void verifyPhoneNoAlert() {

		driver.findElement(By.name("firstName")).sendKeys("Denver");
		driver.findElement(By.name("lastName")).sendKeys("sscom");
		driver.findElement(By.name("email")).sendKeys("si@gmail.com");
		driver.findElement(By.name("password")).sendKeys("12345678");
		driver.findElement(By.xpath("//span[text()='Sign Up']")).click();
		String PhoneAlert=driver.findElement(By.xpath("//div[text()='Enter Your Valid Phone Number']")).getText();
		Assert.assertEquals(PhoneAlert, "Enter Your Valid Phone Number");
		System.out.println("The alert message is:"+PhoneAlert);

	}
	

	public void verifyPasswordAlert() {

		driver.findElement(By.name("firstName")).sendKeys("Denver");
		driver.findElement(By.name("lastName")).sendKeys("sscom");
		driver.findElement(By.name("email")).sendKeys("si@gmail.com");
		driver.findElement(By.name("phone")).sendKeys("1234567890");
		driver.findElement(By.xpath("//span[text()='Sign Up']")).click();
		String PasswordAlert=driver.findElement(By.xpath("//div[text()='Password Letters Should be Greater Than 8 Digits']")).getText();
		Assert.assertEquals(PasswordAlert, "Password Letters Should be Greater Than 8 Digits");
		System.out.println("The alert message is:"+PasswordAlert);

	}
	
	public void firstNameandUncheckAgree() {
		driver.findElement(By.name("firstName")).sendKeys("Denver");
		driver.findElement(By.xpath("//span[text()='I agree with terms and conditions']")).click();
		driver.findElement(By.xpath("//span[text()='Sign Up']")).click();
	}
	public void lastNameandUncheckAgree() {
		driver.findElement(By.name("lastName")).sendKeys("Denver");
		driver.findElement(By.xpath("//span[text()='I agree with terms and conditions']")).click();
		driver.findElement(By.xpath("//span[text()='Sign Up']")).click();
	}
	public void emailandUncheckAgree() {
		driver.findElement(By.name("email")).sendKeys("Denver@gmail.com");
		driver.findElement(By.xpath("//span[text()='I agree with terms and conditions']")).click();
		driver.findElement(By.xpath("//span[text()='Sign Up']")).click();
	}
	public void phoneandUncheckAgree() {
		driver.findElement(By.name("phone")).sendKeys("1245678903");
		driver.findElement(By.xpath("//span[text()='I agree with terms and conditions']")).click();
		driver.findElement(By.xpath("//span[text()='Sign Up']")).click();
	}
	public void passwordandUncheckAgree() {
		driver.findElement(By.name("password")).sendKeys("1245678903");
		driver.findElement(By.xpath("//span[text()='I agree with terms and conditions']")).click();
		driver.findElement(By.xpath("//span[text()='Sign Up']")).click();
	}
	public void uncheckAgreeCheckbox() {

		driver.findElement(By.name("firstName")).sendKeys("Denver");
		driver.findElement(By.name("lastName")).sendKeys("sscom");
		driver.findElement(By.name("email")).sendKeys("si@gmail.com");
		driver.findElement(By.name("phone")).sendKeys("1234567890");
		driver.findElement(By.name("password")).sendKeys("12345678");
		driver.findElement(By.xpath("//span[text()='I agree with terms and conditions']")).click();
		driver.findElement(By.xpath("//span[text()='Sign Up']")).click();

	}
	public void uncheckAgreeCheckboxAlert() {

		driver.findElement(By.name("firstName")).sendKeys("Denver");
		driver.findElement(By.name("lastName")).sendKeys("sscom");
		driver.findElement(By.name("email")).sendKeys("si@gmail.com");
		driver.findElement(By.name("phone")).sendKeys("1234567890");
		driver.findElement(By.name("password")).sendKeys("12345678");
		driver.findElement(By.xpath("//span[text()='I agree with terms and conditions']")).click();
		driver.findElement(By.xpath("//span[text()='Sign Up']")).click();
		System.out.println(driver.findElement(By.xpath("//div[text()='Kindly Accept the Terms and Conditions']")).getText());

	}
	public void firstNameandLastName() {
		driver.findElement(By.name("firstName")).sendKeys("Denver");
		driver.findElement(By.name("lastName")).sendKeys("loi");
		driver.findElement(By.xpath("//span[text()='Sign Up']")).click();
	}
	public void firstNameandEmail() {
		driver.findElement(By.name("firstName")).sendKeys("Denver");
		driver.findElement(By.name("email")).sendKeys("loi@gmail.com");
		driver.findElement(By.xpath("//span[text()='Sign Up']")).click();
	}
	public void firstNameandPhoneNo() {
		driver.findElement(By.name("firstName")).sendKeys("Denver");
		driver.findElement(By.name("phone")).sendKeys("9994256789");
		driver.findElement(By.xpath("//span[text()='Sign Up']")).click();
	}
	public void firstNameandPassword() {
		driver.findElement(By.name("firstName")).sendKeys("Denver");
		driver.findElement(By.name("password")).sendKeys("loi34567");
		driver.findElement(By.xpath("//span[text()='Sign Up']")).click();
	}
	public void lastNameandEmail() {
		driver.findElement(By.name("lastName")).sendKeys("Denver");
		driver.findElement(By.name("email")).sendKeys("loi@gmail.com");
		driver.findElement(By.xpath("//span[text()='Sign Up']")).click();
	}
	public void lastNameandPhoneNo() {
		driver.findElement(By.name("lastName")).sendKeys("Denver");
		driver.findElement(By.name("phone")).sendKeys("9999955555");
		driver.findElement(By.xpath("//span[text()='Sign Up']")).click();
	}
	public void lastNameandPassword() {
		driver.findElement(By.name("lastName")).sendKeys("Denver");
		driver.findElement(By.name("password")).sendKeys("loi@gmailcom");
		driver.findElement(By.xpath("//span[text()='Sign Up']")).click();
	}
	public void SuccesfullSignup()
	{
		driver.findElement(By.name("firstName")).sendKeys("Denver");
		driver.findElement(By.name("lastName")).sendKeys("sscom");
		driver.findElement(By.name("email")).sendKeys("si@gmail.com");
		driver.findElement(By.name("phone")).sendKeys("1234567890");
		driver.findElement(By.name("password")).sendKeys("12345678");
		driver.findElement(By.xpath("//span[text()='Sign Up']")).click();
	}
 
	public void RegistrationSuccessAlert()
	{
		driver.findElement(By.name("firstName")).sendKeys("Denver");
		driver.findElement(By.name("lastName")).sendKeys("sscom");
		driver.findElement(By.name("email")).sendKeys("si@gmail.com");
		driver.findElement(By.name("phone")).sendKeys("1234567890");
		driver.findElement(By.name("password")).sendKeys("12345678");
		driver.findElement(By.xpath("//span[text()='Sign Up']")).click();
		System.out.println(driver.findElement(By.xpath("//div[text()='Registration successful!']")).getText());
	}
	public void emptyFieldSignUp() {

		driver.findElement(By.xpath("//span[text()='Sign Up']")).click();
	}

}
