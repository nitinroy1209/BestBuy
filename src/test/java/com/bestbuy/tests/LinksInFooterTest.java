package com.bestbuy.tests;
import org.testng.Assert;




import com.bestbuy.utils.SeWrappers;
import com.bestbuy.utils.Reports;
import com.bestbuy.utils.BeWrappers;

import java.util.List;
import org.openqa.selenium.WebElement;






import org.testng.annotations.Test;
import com.bestbuy.pages.Menu;
import com.bestbuy.pages.LinksInFooter;

	
	public class LinksInFooterTest  extends SeWrappers{ 
		
		BeWrappers b= new BeWrappers();
		SeWrappers s= new SeWrappers();
		LinksInFooter linksInFooter = new LinksInFooter();
		
		

		 @Test
		 
		    public void validateLinkBottomTest () throws InterruptedException {
			 
			 launchBrowser("https://www.bestbuy.com/");
				b.clikingOnUnitedStates();
				
				//List<WebElement> actualLinks = linksInFooter.getFooterLinks();
				
				
				//linksInFooter.footerLinks();
				b.verifyLinkFooter() ;
				
				
			/*
				   String[] expectedLinks = {
				            "https://www.bestbuy.com/site/help-topics/accessibility/pcmcat1496336482680.c?id=pcmcat1496336482680",
				            "https://www.bestbuy.com/site/help-topics/terms-and-conditions/pcmcat204400050067.c?id=pcmcat204400050067",
				           " https://www.bestbuy.com/site/help-topics/privacy-policy/pcmcat204400050062.c?id=pcmcat204400050062",
				           "https://www.bestbuy.com/site/privacy-policy/interest-based-ads/pcmcat204400050066.c?id=pcmcat204400050066",
				           "https://www.bestbuy.com/site/privacy-policy/state-privacy-rights/pcmcat204400050063.c?id=pcmcat204400050063",
				           "https://www.bestbuy.com/site/help-topics/privacy-policy/pcmcat204400050062.c?id=pcmcat204400050062",
				           
				           "https://www.bestbuy.com/sentry/landing?type=ca_donotsell",
				           "https://www.bestbuy.com/sentry/landing?type=optout","https://www.bestbuy.com/sentry/landing?type=donottarget",
				           "https://www.bestbuy.com/site/help-topics/ca-transparency-act/pcmcat263000050003.c?id=pcmcat263000050003"

				   };*/
				   
				           
				   
				   
				   
				  /* 
				   String pageTitle = "Best Buy | Official Online Store | Shop Now & Save";
					String acualTitle = se.getTitle();
					
				    //String actualTitle = "Best Buy | Official Online Store | Shop Now & Save";
				    Assert.assertEquals(acualTitle, pageTitle);	
				   
				   */
				   
				 //  Assert.assertEquals(link,expectedLinks );
				           
				   
				/*for (String expectedLink : expectedLinks) {
			            Assert.assertTrue((expectedLink),
			                "Expected link '" + expectedLink + "' is not present.");
			        }
		 }*/
				
	
	
		 }
	}
	
	
	
	


