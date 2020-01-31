package com.amazonandflipkart.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazonandflipkart.driverscript.DriverScript;

public class FlipkartHomePage extends DriverScript {
	public FlipkartHomePage(WebDriver oBrowser) {
		PageFactory.initElements(oBrowser, this);
	}
	
	@FindBy(xpath="//*[@class='_2AkmmA _29YdH8']")
	private WebElement loginclose;
	public WebElement logincloseofflipkart()
	{
		return loginclose;
	}
	@FindBy(xpath="//*[@title='Search for products, brands and more']")
	private WebElement searchinflipkart;
	public WebElement searchflipkart()
	{
		return searchinflipkart;
	}
	@FindBy(xpath="//*[@class='vh79eN']")
	private WebElement searchbuttoninflipkart;
	public WebElement searchbuttoninflipkart()
	{
		return searchbuttoninflipkart;
	}
	
	public void searchInFlipkart() {
		try
		{
			logincloseofflipkart().click();
			searchflipkart().click();
			searchflipkart().sendKeys("iPhone XR (64GB) - Yellow");
			System.out.println("searching for iphone in flipkart"); 
			
			
			searchbuttoninflipkart().click();
		
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	
	
	
	

}
