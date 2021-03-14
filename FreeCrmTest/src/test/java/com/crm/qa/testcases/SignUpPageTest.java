package com.crm.qa.testcases;

import java.io.IOException;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
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
		sign  = login.navigateToSignUp();
		
	}

	
	@Test(priority = 1)
	public void firstNameTest() {
		sign.validateFirstName();
		
	}
	
	@Test(priority = 2)
	public void lastNameTest() {
		sign.validateLastName();
		
	}
	@Test(priority = 3)
	public void emailTest() {
		sign.validateEmail();
		
	}
	@Test(priority = 4)
	public void phoneNoTest() {
		sign.validatePhoneNo();
		
	}
	@Test(priority = 5)
	public void passwordTest() {
		sign.validatePassword();
		
	}
	@Test(priority = 6)
	public void dropDownTest() {
		sign.validateDropDown();
		
	}
	@Test(priority = 7)
	public void whiteSpaceFirstNameTest() {
		sign.validateWhitespaceFirstName();
		
	}
	@Test(priority = 8)
	public void whiteSpacealastNameTest() {
		sign.validateWhitespaceLastName();
		
	}
	@Test(priority = 9)
	public void whiteSpaceEmailTest() {
		sign.validateWhitespaceEmail();
		
	}
	@Test(priority = 10)
	public void whiteSpacePhoneNoTest() {
		sign.validateWhitespacePhoneNo();
		
	}
	
	@Test(priority = 11)
	public void whiteSpacePasswordTest() {
		sign.validateWhitespacePassword();
		
	}
	
	@Test(priority = 12)
	public void firstNameAlertTest() {
		sign.validateFirstNameAlert();
		
	}
	@Test(priority = 13)
	public void LastNameAlertTest() {
		sign.validateLastNameAlert();
		
	}
	@Test(priority = 14)
	public void EmailAlertTest() {
		sign.validateEmailAlert();
		
	}
	@Test(priority = 15)
	public void PhoneNoAlertTest() {
		sign.validatePhoneNoAlert();
		
	}
	@Test(priority = 16)
	public void PasswordAlertTest() {
		sign.validatePasswordAlert();
		
	}
	@Test(priority = 17)
	public void verifyFirstNameAlertTest() {
		sign.verifyFirstNameAlert();
		
	}
	@Test(priority = 18)
	public void verifyLastNameAlertTest() {
		sign.verifyLastNameAlert();
		
	}
	@Test(priority = 19)
	public void verifyEmailAlertTest() {
		sign.verifyEmailAlert();
		
	}
	@Test(priority = 20)
	public void verifyPhoneNoAlertTest() {
		sign.verifyPhoneNoAlert();
		
	}
	@Test(priority = 21)
	public void verifyPasswordAlertTest() {
		sign.verifyPasswordAlert();
		
	}
	@Test(priority = 22)
	public void firstNameUncheckAgreeTest() {
		sign.firstNameandUncheckAgree();
		
	}
	@Test(priority = 23)
	public void lasstNameUncheckAgreeTest() {
		sign.lastNameandUncheckAgree();
		
	}
	@Test(priority = 24)
	public void emailUncheckAgreeTest() {
		sign.emailandUncheckAgree();
		
	}
	@Test(priority = 25)
	public void phoneUncheckAgreeTest() {
		sign.phoneandUncheckAgree();
		
	}
	@Test(priority = 26)
	public void passwordUncheckAgreeTest() {
		sign.passwordandUncheckAgree();
		
	}
	@Test(priority = 27)
	public void UncheckAgreeCheckboxTest() {
		sign.uncheckAgreeCheckbox();
		
	}
	@Test(priority = 28)
	public void UncheckAgreeCheckboxAlertTest() {
		sign.uncheckAgreeCheckboxAlert();
		
	}
	@Test(priority = 29)
	public void FirstAndLastNameTest() {
		sign.firstNameandLastName();
		
	}
	@Test(priority = 30)
	public void FirstAndEmailTest() {
		sign.firstNameandEmail();
		
	}
	@Test(priority = 31)
	public void FirstAndPhoneNoTest() {
		sign.firstNameandPhoneNo();
		
	}
	@Test(priority = 32)
	public void FirstAndPasswordTest() {
		sign.firstNameandPassword();
		
	}
	@Test(priority = 33)
	public void LastAndEmailTest() {
		sign.lastNameandEmail();
		
	}
	@Test(priority = 34)
	public void LastAndPhoneNoTest() {
		sign.lastNameandPhoneNo();
		
	}
	@Test(priority = 35)
	public void LastAndPasswordTest() {
		sign.lastNameandPassword();
		
	}
	@Test(priority = 36)
	public void SuccessSignUpTest() {
		sign.SuccesfullSignup();
		
	}
	@Test(priority = 37)
	public void RegistrationSucessAlertTest() {
		sign.RegistrationSuccessAlert();
		
	}
	@Test(priority = 38)
	public void EmptySignUpTest() {
		sign.emptyFieldSignUp();
		
	}
	

}

