package com.bestbuy.tests;
import org.testng.Assert;




import org.testng.annotations.Test;
import com.bestbuy.utils.SeWrappers;
import com.bestbuy.utils.Reports;
import com.bestbuy.utils.BeWrappers;
import com.bestbuy.pages.Menu;
import com.bestbuy.pages.ShopByDepartment;	

public class ShopByMenuTests {
	
public class ShopByDepartment extends SeWrappers{
		
		BeWrappers bh= new BeWrappers();
		SeWrappers sh= new SeWrappers();
		
		
		@Test
		public void testForShopByMenu() {
		
			
			launchBrowser("https://www.bestbuy.com/");
			bh.clikingOnUnitedStates();
			bh.forShopByMenu();
			screenshot("success");

		

}
}
}
