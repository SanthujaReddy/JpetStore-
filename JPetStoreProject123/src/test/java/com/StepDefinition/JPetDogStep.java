package com.StepDefinition;

import com.Pages.JPetDogPage;
import com.Pages.JPetLoginPage;
import com.baseclass.LibraryFile;
import com.seleniumutility.UtilityFile;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class JPetDogStep extends LibraryFile {
	JPetLoginPage login;
	UtilityFile util;
	JPetDogPage dogpage;
	@When("^Dog JPetStore Page opened$")
	public void dog_JPetStore_Page_opened() throws InterruptedException 
	{
		login = new JPetLoginPage(driver);
		login.login_username("Reddy2407");
		login.login_password("santhu2407");
		login.login_loginbtn();
		Thread.sleep(1000);
		System.out.println("Login done JPetStore Menu page opened");  
	}

	@Then("^Click The Dog Image$")
	public void click_The_Dog_Image() throws InterruptedException 
	{
		dogpage = new JPetDogPage(driver);
		dogpage.Dog_Dogimage();
		Thread.sleep(1000);
		System.out.println("Dog Image clicked");
	 }

	@Then("^Click The ProductID of Dog$")
	public void click_The_ProductID_of_Dog() throws InterruptedException  
	{
		dogpage.Dog_productid();
		Thread.sleep(1000);
		System.out.println("Dog ProductID clicked");
	}

	@Then("^Click The ItemId of Dog$")
	public void click_The_ItemId_of_Dog() throws InterruptedException   
	{
		dogpage.Dog_itemid();
		Thread.sleep(1000);
		System.out.println("Dog ItemID clicked");
		
		util = new UtilityFile(driver);
		util.takeSnapShot("C:\\Users\\VENKATREDDY\\eclipse-workspace\\JPetStoreProject123\\src\\test\\resources\\ScreenShot\\Dog.png");
		System.out.println("fish page opened and ScreenShot taken");
	}

	@Then("^Click The AddToCart for Dog$")
	public void click_The_AddToCart_for_Dog() throws InterruptedException   
	{
		dogpage.Dog_addcart();
		Thread.sleep(1000);
		System.out.println("AddToCart clicked");
	}

	@Then("^Click The ProceedToCheckOut for Dog$")
	public void click_The_ProceedToCheckOut_for_Dog() throws InterruptedException  
	{
		dogpage.Dog_proceed();
		Thread.sleep(1000);
		System.out.println("Dog added to cart and Proceed clicked");
		System.out.println("Payment Page is opened");
		
		Thread.sleep(2000);
		driver.quit();
	}

}
