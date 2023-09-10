package com.bestbuy.tests;

import org.testng.Assert;




import com.bestbuy.utils.SeWrappers;
import com.bestbuy.utils.Reports;
import com.bestbuy.utils.BeWrappers;





import org.testng.annotations.Test;
import com.bestbuy.pages.Menu;

public class MenuTest extends SeWrappers{ 
	
	BeWrappers b= new BeWrappers();
	SeWrappers s= new SeWrappers();
	



	
	
	 @Test
	    public void testBrandsMenuItem() throws InterruptedException  {
		 
		 launchBrowser("https://www.bestbuy.com/");
			b.clikingOnUnitedStates();
			b.menuButton();
			// title validation
			
			String pageTitle = "Top Deals on Cell Phones and Accessories - Best Buy";
			String acualTitle = s.getTitle();
		    Assert.assertEquals(acualTitle, pageTitle);	
			
			
	 }	
			
			//Menu sd = new Menu();
			
			
			
			
	
			//DropDownMenu dropDownMenu = new DropDownMenu();
		
	        //dropDownMenu.openMenu(); // Open the menu
	        


@Test

public void testBrandsMenuItem1() throws InterruptedException  {
	 
	 launchBrowser("https://www.bestbuy.com/");
		b.clikingOnUnitedStates();
		b.menuButton();
		// title validation
		
		String pageTitle = "Remote Support: Geek Squad - Best Buy";
		String acualTitle = s.getTitle();
		
		Assert.assertTrue(driver.getTitle().equals(pageTitle));
	   // Assert.assertEquals(acualTitle, pageTitle);	

}
}


