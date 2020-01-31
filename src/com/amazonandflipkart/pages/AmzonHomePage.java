package com.amazonandflipkart.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazonandflipkart.driverscript.DriverScript;

public class AmzonHomePage extends DriverScript {
	
	public AmzonHomePage(WebDriver oBrowser)
	{
		
		PageFactory.initElements(oBrowser, this);
		System.out.println("entered into constructor");
	}
	
	
	
	@FindBy(xpath="//*[@class='nav-search-field ']")
	private WebElement searchbox;
	public WebElement getsearch()
	{
		return searchbox;
	}
	private WebElement twotabsearchtextbox;
	public WebElement getsearchsendkeys()
	{
		return twotabsearchtextbox;
	}
	@FindBy(xpath="//input[@type='submit' and @class='nav-input']")
	private WebElement osearchbutton;
	public WebElement getclickOnSearchButton()
	{
		return osearchbutton;
	}
	public void searchInAmazon()
	{
		try
		{
			getsearch().click();
			System.out.println("clicked on search");
			getsearchsendkeys().sendKeys("iPhone XR (64GB) - Yellow");
			System.out.println("searching for iphone"); 
			getclickOnSearchButton().click();
			
			Thread.sleep(5000);
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
