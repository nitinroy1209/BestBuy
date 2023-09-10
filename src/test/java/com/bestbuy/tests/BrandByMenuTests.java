package com.bestbuy.tests;
import org.testng.Assert;





import org.testng.annotations.Test;
import com.bestbuy.utils.SeWrappers;
import com.bestbuy.utils.Reports;
import com.bestbuy.utils.BeWrappers;
import com.bestbuy.pages.Menu;
import com.bestbuy.pages.BrandMenu;	


public class BrandByMenuTests extends SeWrappers{
	
	BeWrappers bm4= new BeWrappers();
	SeWrappers se= new SeWrappers();
	
	@Test
	public void testOfBrandByMenu()
	{
		launchBrowser("https://www.bestbuy.com/");
		bm4.clikingOnUnitedStates();

		bm4.brandByMenu();
		
	}

}
