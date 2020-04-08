package com.StepDefinition;

import java.io.IOException;

import com.Pages.JPetExcelReadPage;
import com.Pages.JPetLoginPage;
import com.baseclass.LibraryFile;
import com.excelutil.ExcelRead;
import com.seleniumutility.UtilityFile;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class JPetEXcelReadStep extends LibraryFile {
	JPetExcelReadPage excellogin;
	UtilityFile util;
	ExcelRead excel;
	@Given("^JPetStore page is opened$")
	public void jpetstore_page_is_opened() throws IOException 
	{
		launchApplication();
		System.out.println("chrome opened");
	}

	@Then("^Login page is opened$")
	public void login_page_is_opened() 
	{
		 excellogin = new JPetExcelReadPage(driver);
		    excel = new ExcelRead();
		System.out.println("Login page for Username and password");
	}

	@Then("^The <email> and <password> details are given$")
	public void the_email_and_password_details_are_given() throws IOException 
	{
		 excel = new ExcelRead();
	   excellogin.login_username(excel.excel_username(1));
	   excellogin.login_password(excel.excel_userpassword(1));
	   excellogin.login_loginbtn();
	 }

	@Then("^login and quit$")
	public void login_and_quit() throws Throwable 
	{
	   System.out.println("JPetStore get login and quit");
	   Thread.sleep(2000);
		driver.quit();
	}

}
