package com.Pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JPetLoginPage {
Logger LOG = Logger.getLogger(JPetLoginPage.class.getName());
	
	@FindBy(name = "username")
	WebElement username;
	@FindBy(name = "password")
	WebElement password;
	@FindBy(id = "login")
	WebElement loginbtn;

	public JPetLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
		public void login_username(String uname)
		{
			username.sendKeys(uname);	
			LOG.info("entered username");
		}
		public void login_password(String pass)
		{
			password.sendKeys(pass);	
			LOG.info("entered password");
		}
		public void login_loginbtn()
		{
			loginbtn.click();
			LOG.info("clicked login");
		}

}
