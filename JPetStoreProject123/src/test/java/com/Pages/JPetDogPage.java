package com.Pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JPetDogPage {
Logger LOG = Logger.getLogger(JPetReptilesPage.class.getName());
	
	@FindBy(xpath = "//*[@id=\"MainImageContent\"]/map/area[3]")
	WebElement Dogimage;
	@FindBy(xpath = "//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[1]/a")
	WebElement productid;
	@FindBy(xpath = "//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[1]/a")
	WebElement itemid;
	@FindBy(xpath = "//*[@id=\"Catalog\"]/table/tbody/tr[7]/td/a")
	WebElement addcart;
	@FindBy(xpath = "//*[@id=\"Cart\"]/a")
	WebElement proceed;
	
	
	public JPetDogPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
		public void Dog_Dogimage()
		{
			Dogimage.click();	
			LOG.info("clicked on Dog image");
		}
		public void Dog_productid()
		{
			productid.click();
			LOG.info("clicked on productid");
		}
		public void Dog_itemid()
		{
			itemid.click();
			LOG.info("clicked on itemid");
		}
		public void Dog_addcart()
		{
			addcart.click();
			LOG.info("clicked on addcart");
		}
		public void Dog_proceed()
		{
			proceed.click();
			LOG.info("clicked on proceed");
		}


}



