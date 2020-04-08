package com.StepDefinition;

import com.Pages.JPetFishPage;
import com.Pages.JPetLoginPage;
import com.baseclass.LibraryFile;
import com.seleniumutility.UtilityFile;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class JPetFishStep extends LibraryFile{
	JPetLoginPage login;
	UtilityFile util;
	JPetFishPage fishpage;
	@When("^Fish JPetStore Page opened$")
	public void fish_JPetStore_Page_opened() throws InterruptedException 
	{
		login = new JPetLoginPage(driver);
		login.login_username("Reddy2407");
		login.login_password("santhu2407");
		login.login_loginbtn();
		Thread.sleep(1000);
		System.out.println("Login done JPetStore Menu page opened"); 
	}

	@Then("^Click The Fish Image$")
	public void click_The_Fish_Image() throws InterruptedException  
	{
		fishpage = new JPetFishPage(driver);
		fishpage.Fish_Fishimage();
		Thread.sleep(1000);
		System.out.println("fish Image clicked");
	}

	@Then("^Click The ProductID of Fish$")
	public void click_The_ProductID_of_Fish() throws InterruptedException
	{
		fishpage.Fish_productid();
		Thread.sleep(1000);
		System.out.println("fish ProductID clicked");
	}

	@Then("^Click The ItemId of Fish$")
	public void click_The_ItemId_of_Fish() throws InterruptedException 
	{
		fishpage.Fish_itemid();
		Thread.sleep(1000);
		System.out.println("fish ItemID clicked");
		
		util = new UtilityFile(driver);
		util.takeSnapShot("C:\\Users\\VENKATREDDY\\eclipse-workspace\\JPetStoreProject123\\src\\test\\resources\\ScreenShot\\Fish.png");
		System.out.println("fish page opened and ScreenShot taken");
	}

	@Then("^Click The AddToCart for Fish$")
	public void click_The_AddToCart_for_Fish() throws InterruptedException  
	{
		fishpage.Fish_addcart();
		Thread.sleep(1000);
		System.out.println("AddToCart clicked");
	}

	@Then("^Click The ProceedToCheckOut for Fish$")
	public void click_The_ProceedToCheckOut_for_Fish() throws InterruptedException
	{
		fishpage.Fish_proceed();
		Thread.sleep(1000);
		System.out.println("fish added to cart and Proceed clicked");
		System.out.println("Payment Page is opened");
		
		Thread.sleep(2000);
		driver.quit();
	}

}
