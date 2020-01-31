package com.amazonandflipkart.pages;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazonandflipkart.driverscript.DriverScript;

public class AmazonSearchResultPage extends DriverScript {
	public  AmazonSearchResultPage(WebDriver oBrowser) 
	{
		PageFactory.initElements(oBrowser, this);
		
	}
	@FindBy(xpath="//*[text()='Apple iPhone XR (64GB) - Yellow']")
	private WebElement oprice;
	public WebElement priceofphone()
	{
		return oprice;
	}
	@FindBy(xpath="//table[@class='a-lineitem']/tbody/tr[2]/td[2]/span")
	private WebElement opriceamount;
	public WebElement priceofphoneamount()
	{
		return opriceamount;
	}
	public void getpriceinamazon()
	{
		
		priceofphone().click();
		String sParent = oBrowser.getWindowHandle();
		System.out.println("Parent: "+sParent);
		try
		{
			
			Set<String> s1=oBrowser.getWindowHandles();		
	        Iterator<String> i1=s1.iterator();		
	        		
	        while(i1.hasNext())			
	        {		
	            String ChildWindow=i1.next();		
	            		
	            if(!sParent.equalsIgnoreCase(ChildWindow))			
	            {    		
	                 
	                    // Switching to Child window
	                    oBrowser.switchTo().window(ChildWindow);
	                    Thread.sleep(4000);
	                    
	                    System.out.println("new window");
	                    System.out.println("URL: "+oBrowser.getCurrentUrl());
	                    oBrowser.findElement(By.xpath("//*[@class='a-icon a-accordion-radio a-icon-radio-active']")).click();
	                    String stramount=priceofphoneamount().getText();
	                    System.out.println(stramount);
	                    }			
		}}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	

}
