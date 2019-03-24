package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase {
	
	@FindBy(name="username")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//input[@type='submit' and @value='Login']")
	WebElement loginbtn;
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public String getTitleTest()
	{
		return driver.getTitle();
	}

	public HomePage Login(String uname, String pwd)
	{
		username.sendKeys(uname);
		password.sendKeys(pwd);
		loginbtn.submit();
		return new HomePage();
	}
	
	
}
