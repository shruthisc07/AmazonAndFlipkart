package com.amazonandflipkart.tests;

import com.amazonandflipkart.driverscript.DriverScript;
import com.amazonandflipkart.pages.AmazonSearchResultPage;
import com.amazonandflipkart.pages.AmzonHomePage;
import com.amazonandflipkart.pages.FlipkartHomePage;
import com.amazonandflipkart.pages.FlipkartSearchResultPage;

public class ExecuteTests extends DriverScript {
	public void sceanario()
	{
		oBrowser=ApplicationDependent.launchApp("Chrome");
		ApplicationDependent.navigatetoAmazon();
		AmazonPage=new AmzonHomePage(oBrowser);
		AmazonPage.searchInAmazon();
		AmazonsearchPage=new AmazonSearchResultPage(oBrowser);
		AmazonsearchPage.getpriceinamazon();
		ApplicationDependent.navigatetoflipkart();
		
		flipkartPage=new FlipkartHomePage(oBrowser);
		
		flipkartPage.searchInFlipkart();
		flipkartsearchPage=new FlipkartSearchResultPage(oBrowser);
		flipkartsearchPage.getpriceinflipkart();
		ApplicationDependent.comparePrice();
		ApplicationDependent.closeApp();
		
		
		
	}

}
