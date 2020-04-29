package com.QA.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.QA.Util.TestBase;

public class HomePage extends TestBase 
{
	@FindBy(xpath="//td[@class='headertext']")
	@CacheLookup
	WebElement userNameLabel;
	
	@FindBy(xpath="//a[contains(text(),'Contacts')]")
	WebElement contactLink;
	
	@FindBy(xpath="//a[contains(text(),'New Contact')]")
	WebElement newContactLink;
	
	@FindBy(xpath="//a[contains(text(),'Deals')]")
	WebElement dealsLink;
	
	@FindBy(xpath="//a[contains(text(),'Tasks')]")
	WebElement tasksLink;
	
	public HomePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public String varifyHomePageTitle()
	{
		return driver.getTitle();
	}
	
	public boolean verifyCorrectUserName()
	{
		System.out.println(userNameLabel.getText());
		return userNameLabel.isDisplayed();
	}
	
	public void clickOnContactsLink()
	{
		Actions action=new Actions(driver);
		action.moveToElement(contactLink).build().perform();
		newContactLink.click();
	}
	

	
	}
	

