package com.QA.Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.QA.Util.TestBase;

public class LoginPage extends TestBase   
{
	@FindBy(name="username")
	WebElement uname;
	 
	@FindBy(name="password")
	WebElement pname;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement bsubmit;

	@FindBy(xpath="//img[@class='img-responsive']")
	WebElement img;
	
	public LoginPage()
	{
		PageFactory.initElements(driver,this);
	}
	
	public HomePage login(String un,String ps)
	{
		uname.sendKeys(un);
		pname.sendKeys(ps);
		
		bsubmit.click();
		
		return new HomePage();
	}
	
	

	public boolean validateCRMImage()
	{
		return img.isDisplayed();
	}
	
	public String validateLoginPage()
	{
		return driver.getTitle();
	}

}

