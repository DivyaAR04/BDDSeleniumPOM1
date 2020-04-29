package com.QA.stepDefinations;

import com.QA.Pages.HomePage;
import com.QA.Pages.LoginPage;
import com.QA.Util.TestBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import junit.framework.Assert;

public class HomePageSteps extends TestBase
{
	LoginPage loginpage;
	HomePage homepage;
	
	@Given("^user opens browser$")
	public void user_opens_browser() throws Throwable 
	{
	 TestBase.initialization();  
	}

	@Then("^user is on login Page$")
	public void user_is_on_login_Page() throws Throwable 
	{
		loginpage=new LoginPage();
		String title=loginpage.validateLoginPage();
		System.out.println(loginpage.validateCRMImage());
		Assert.assertEquals("CRMPRO - CRM software for customer relationship management, sales, and support.",title);
	}

	@Then("^user logs into login app$")
	public void user_enters_username_and_password() throws Throwable 
	{
		homepage=loginpage.login(prop.getProperty("username"),prop.getProperty("password"));	
	}

	@Then("^validate Home page Title$")
	public void validate_Home_page_Title() throws Throwable 
	{
		Thread.sleep(1000);
		String homeTitle=homepage.varifyHomePageTitle();
		Assert.assertEquals("CRMPRO", homeTitle);
	}

	@Then("^validate Loggin username$")
	public void validate_Loggin_username() throws Throwable 
	{
		boolean flag=homepage.verifyCorrectUserName();
		Assert.assertTrue(flag);
	}
}
