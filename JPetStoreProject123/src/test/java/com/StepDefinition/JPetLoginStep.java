package com.StepDefinition;

import java.io.IOException;

import com.Pages.JPetLoginPage;
import com.baseclass.LibraryFile;
import com.seleniumutility.UtilityFile;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class JPetLoginStep extends LibraryFile
{
	JPetLoginPage login;
	UtilityFile util;
	@Given("^Launch the Chrome browser$")
	public void launch_the_Chrome_browser() throws IOException 
	{
		launchApplication();
		System.out.println("chrome opened");
	}

	@When("^Login JPetStore Page opened$")
	public void login_JPetStore_Page_opened() 
	{
		System.out.println("Login page for Username and password");
	}

	@Then("^Enter username as \"([^\"]*)\" and password as\"([^\"]*)\"$")
	public void enter_username_as_and_password_as(String uname, String pass) 
	{
		login = new JPetLoginPage(driver);
		login.login_username(uname);
		login.login_password(pass);
		System.out.println("text is entered and searched");
	}

	@Then("^Clicks the Login button$")
	public void clicks_the_Login_button() throws InterruptedException 
	{
		JPetLoginPage login = new JPetLoginPage(driver);
		login.login_loginbtn();
		System.out.println("clicks on the submit button");
		
		util = new UtilityFile(driver);
		util.takeSnapShot("C:\\Users\\VENKATREDDY\\eclipse-workspace\\JPetStoreProject123\\src\\test\\resources\\ScreenShot\\Login.png");
		System.out.println("Login page opened and ScreenShot taken");
		
		Thread.sleep(2000);
		driver.quit();
	}

}
