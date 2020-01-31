package com.amazonandflipkart.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazonandflipkart.driverscript.DriverScript;

public class FlipkartSearchResultPage extends DriverScript {
	public FlipkartSearchResultPage(WebDriver oBrowser) {
		PageFactory.initElements(oBrowser, this);
	}

	@FindBy(xpath="//*[@class='_1vC4OE _2rQ-NK']")
	private WebElement opriceamountflipkart;
	public WebElement priceofphoneamountflipkart()
	{
		return opriceamountflipkart;
	}
	
	public void getpriceinflipkart()
	{
		
		stramountflipkart=priceofphoneamountflipkart().getText();
		
		
		System.out.println(stramountflipkart);
		
	}
}
