package com.bestbuy.tests;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.bestbuy.utils.SeWrappers;
import com.bestbuy.utils.Reports;
import com.bestbuy.utils.BeWrappers;

public class BottomLinksFooter  extends SeWrappers{
	
	
	BeWrappers bb= new BeWrappers();
	SeWrappers se= new SeWrappers();
	
	@Test
	
	public void bottomLinks() {
		
		 
		 launchBrowser("https://www.bestbuy.com/");
			bb.clikingOnUnitedStates();
			
		
	}
	
	
	
	

}
