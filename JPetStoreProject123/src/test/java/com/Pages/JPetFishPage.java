package com.Pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JPetFishPage {
	Logger LOG = Logger.getLogger(JPetReptilesPage.class.getName());
	
	@FindBy(xpath = "//*[@id=\"MainImageContent\"]/map/area[2]")
	WebElement Fishimage;
	@FindBy(xpath = "//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[1]/a")
	WebElement productid;
	@FindBy(xpath = "//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[1]/a")
	WebElement itemid;
	@FindBy(xpath = "//*[@id=\"Catalog\"]/table/tbody/tr[7]/td/a")
	WebElement addcart;
	@FindBy(xpath = "//*[@id=\"Cart\"]/a")
	WebElement proceed;
	
	
	public JPetFishPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
		public void Fish_Fishimage()
		{
			Fishimage.click();	
			LOG.info("clicked on Fish image");
		}
		public void Fish_productid()
		{
			productid.click();
			LOG.info("clicked on productid");
		}
		public void Fish_itemid()
		{
			itemid.click();
			LOG.info("clicked on itemid");
		}
		public void Fish_addcart()
		{
			addcart.click();
			LOG.info("clicked on addcart");
		}
		public void Fish_proceed()
		{
			proceed.click();
			LOG.info("clicked on proceed");
		}


}
