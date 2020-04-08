package com.StepDefinition;

import com.Pages.JPetLoginPage;
import com.Pages.JPetReptilesPage;
import com.baseclass.LibraryFile;
import com.excelutil.ExcelRead;
import com.seleniumutility.UtilityFile;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class JPetReptilesStep extends LibraryFile 
{
	JPetLoginPage login;
	UtilityFile util;
	JPetReptilesPage reptilespage;
	@When("^Reptiles JPetStore Page opened$")
	public void reptiles_JPetStore_Page_opened() throws InterruptedException 
	{
		login = new JPetLoginPage(driver);
		login.login_username("Reddy2407");
		login.login_password("santhu2407");
		login.login_loginbtn();
		Thread.sleep(1000);
		System.out.println("Login done JPetStore Menu page opened");
	}

	@Then("^Click The Reptile Image$")
	public void click_The_Reptile_Image() throws InterruptedException 
	{
		reptilespage = new JPetReptilesPage(driver);
		reptilespage.reptiles_reptileimage();
		Thread.sleep(1000);
		System.out.println("Reptile Image clicked");
	}

	@Then("^Click The ProductID of Reptile$")
	public void click_The_ProductID_of_Reptile() throws InterruptedException 
	{
		reptilespage.reptiles_productid();
		Thread.sleep(1000);
		System.out.println("Reptile ProductID clicked");
	}

	@Then("^Click The ItemId of Reptile$")
	public void click_The_ItemId_of_Reptile() throws InterruptedException 
	{
		reptilespage.reptiles_itemid();
		Thread.sleep(1000);
		System.out.println("Reptile ItemID clicked");
		
		util = new UtilityFile(driver);
		util.takeSnapShot("C:\\Users\\VENKATREDDY\\eclipse-workspace\\JPetStoreProject123\\src\\test\\resources\\ScreenShot\\Reptiles.png");
		System.out.println("Reptile page opened and ScreenShot taken");
	}

	@Then("^Click The AddToCart of Reptile$")
	public void click_The_AddToCart_of_Reptile() throws InterruptedException 
	{
		reptilespage.reptiles_addcart();
		Thread.sleep(1000);
		System.out.println("AddToCart clicked");
	}

	@Then("^Click The ProceedToCheckOut of Reptile$")
	public void click_The_ProceedToCheckOut_of_Reptile() throws InterruptedException 
	{
		reptilespage.reptiles_proceed();
		Thread.sleep(1000);
		System.out.println("Reptile added to cart and Proceed clicked");
		System.out.println("Payment Page is opened");
		
		Thread.sleep(2000);
		driver.quit();
	}

}
