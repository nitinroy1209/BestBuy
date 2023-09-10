package com.bestbuy.tests;

import org.testng.Assert;


import org.testng.annotations.Test;
import com.bestbuy.utils.SeWrappers;
import com.bestbuy.utils.Reports;
import com.bestbuy.utils.BeWrappers;
import com.bestbuy.pages.Menu;
	
	
	
	public class SignInTests extends SeWrappers{
		
		BeWrappers bb= new BeWrappers();
		SeWrappers se= new SeWrappers();
		
		@Test
		public void ValidClickUnitedStates()
		{
			try
			{
			//Reports.setTCDesc("after clicking on united states it is taking to another page of bestbuy.com ");
			launchBrowser("https://www.bestbuy.com/");
			bb.clikingOnUnitedStates();

			String pageTitle = "Best Buy | Official Online Store | Shop Now & Save";
			String acualTitle = se.getTitle();
			
		    //String actualTitle = "Best Buy | Official Online Store | Shop Now & Save";
		    Assert.assertEquals(acualTitle, pageTitle);	
			
			
			
			bb.accountButton() ;
			
			
			
			
			
			bb.loginBestBuy("nitinroy1209@gmail.com","dXdE.2x7GJdiRBP");// from bewrappers
			

			screenshot(" login valid");
			
			
			
			
		   
			
			//assertion
			//String pageTitle = "Best Buy | Official Online Store | Shop Now & Save";
			//String acualTitle = se.getTitle();
			
		    //String actualTitle = "Best Buy | Official Online Store | Shop Now & Save";
		    //Assert.assertEquals(getTitle(), pageTitle);			
			
		
		
		}
		catch(Exception ex)
		{
			screenshot("not success");
			ex.printStackTrace();
		}
	}
		
		
		
		
	
		
		 
		
		
		
		@Test
		public void loginWithValidCredentials()
		{
			try
			{
				Reports.setTCDesc("Validating login functionality with valid credentials");//reports class and setTCDesc for log
				launchBrowser("https://www.bestbuy.com/");// from se wrappers 
				bb.loginBestBuy("nitinroy1209@gmail.com","dXdE.2x7GJdiRBP");// from bewrappers

				//assertion
				
				String pageTitle = "Best Buy | Official Online Store | Shop Now & Save";
				String acualTitle = se.getTitle();
				
			    String actualTitle = "Best Buy | Official Online Store | Shop Now & Save";
			    Assert.assertEquals(getTitle(), pageTitle);	    
			   // Assert.assertTrue(actualTitle,pageTitle); // string methods operate directly on built in methods
			    
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
		
		@Test
		public void loginWithInvalidEmail()
		{
			try
			{
				Reports.setTCDesc("Valid login functionality with invalid username");
				launchBrowser("https://www.bestbuy.com/");
				
				
				bb.loginBestBuy("nitinroy881209@gmail.com","dXdE.2x0007GJdiRBP");
				/*
				 * write the assertion code to validate for invalid email
				 */
				
				
				screenshot(" login valid");
				
				
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
				Reports.reportStep("FAIL", "Problem while login");
			}
		}

	}
		
		
		

	
	

	
	


