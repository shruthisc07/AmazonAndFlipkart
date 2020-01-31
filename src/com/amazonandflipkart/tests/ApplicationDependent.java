package com.amazonandflipkart.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.amazonandflipkart.driverscript.DriverScript;



public class ApplicationDependent extends DriverScript {
	public static WebDriver oBrowser;
	/**
	 * @param args
	 * Created By:
	 * Created Date:
	 * Modified By:
	 * Reviewed By:
	 * Return Value:
	 * Parameters:
	 * Description:
	 */
	static WebDriver launchApp(String strBrowser)
	{
		
		try {
			switch(strBrowser.toLowerCase())
			{
				case "chrome":
					System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Library\\drivers\\chromedriver.exe");
					oBrowser = new ChromeDriver();
					break;
				case "ie":
					System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+"\\Library\\drivers\\IEDriverServer.exe");
					oBrowser = new InternetExplorerDriver();
					break;
				case "ff":
					System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\Library\\drivers\\geckodriver.exe");
					oBrowser = new FirefoxDriver();
					break;
				default:
					System.out.println("Fail,Executing 'launchApp' method Invalid browser name '"+strBrowser);
			}
			
			
			if(oBrowser!=null)
			{
				oBrowser.manage().window().maximize();
				
			}else {
				System.out.println("invalid"); 
				
			}
		}catch(Exception e)
		{
			System.out.println("Fail,Executing 'launchApp' method Exception while executing 'launchApp' method. "+e.getMessage());
			
		}
		return oBrowser;
	}
	
	/**
	 * @param args
	 * Created By:
	 * Created Date:
	 * Modified By:
	 * Reviewed By:
	 * Return Value:
	 * Parameters:
	 * Description:
	 */

	static void navigatetoAmazon()
	{
		try
		{
			oBrowser.get("https://www.amazon.in");
			Thread.sleep(5000);
			System.out.println("page navigated successfully"); 
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void navigatetoflipkart()
	{
		try
		{
			oBrowser.get("https://www.flipkart.com/");
			Thread.sleep(5000);
			System.out.println("flikart page navigated successfully"); 
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	 public static void comparePrice()
		{
			int str1=Integer.parseInt(stramount);  
			int str2=Integer.parseInt(stramountflipkart);  
			
			if(str1>str2)
			{
				System.out.println("the price of iphone is less in amazon"+str1);
			}else
			{
				System.out.println("the price of iphone is less in flipkart"+str2);
			}
			
			}
		
		 public static void closeApp()
			{
				oBrowser.quit();
			}
	
}
