package com.amazonandflipkart.driverscript;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.amazonandflipkart.pages.AmazonSearchResultPage;
import com.amazonandflipkart.pages.AmzonHomePage;
import com.amazonandflipkart.pages.FlipkartHomePage;
import com.amazonandflipkart.pages.FlipkartSearchResultPage;
import com.amazonandflipkart.tests.ApplicationDependent;
import com.amazonandflipkart.tests.ExecuteTests;



public class DriverScript {
	
	
	public static WebDriver oBrowser=null;
	public static AmzonHomePage AmazonPage=null;
	public static AmazonSearchResultPage AmazonsearchPage=null;
	public static FlipkartHomePage flipkartPage=null;
	public static FlipkartSearchResultPage flipkartsearchPage=null;
	public static ExecuteTests exectest=null;
	public static ApplicationDependent appDep=null;
	public static String stramountflipkart=null;
	public static String stramount=null;
	
	@BeforeSuite
	public void startAutomationSuite()
	{
		try
		{
		 
		appDep=new ApplicationDependent();
		exectest=new ExecuteTests();
	}catch(Exception e)
		{
		System.out.println(e);
		}}
	
	@Test
	public void executeTestScenarios()
	{
		
	try
	{
		
		exectest.sceanario();
	}catch(Exception e)
	{
		System.out.println(e); 
		
	}
	}
	
	

}
