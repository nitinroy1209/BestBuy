package com.bestbuy.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.bestbuy.utils.SeWrappers;
import com.bestbuy.utils.Reports;
import com.bestbuy.utils.BeWrappers;
import com.bestbuy.pages.Menu;
public class DummyPaymentCheckout extends SeWrappers {
	

	BeWrappers bb= new BeWrappers();
	SeWrappers se= new SeWrappers();
	
	
	@Test
	public void dummyTestCheckout() {
		
		launchBrowser("https://www.bestbuy.com/");
		bb.clikingOnUnitedStates();
		/*bb.proceedToPaymentSection("iphone xr", "nitin@gmail.com"," 4452317800", " 370175300288281", "01", "2023", "0000", " nitin","roy" ,
				"new york", "newyork","AL" ,"35004,"N@ggg000");*/
				

		bb.proceedToPaymentSection("iphone 12", "ni@gmail.com", "4452317800", "370175300288281", "01", "2024", "0000", "nitin", "roy", "new york", "new york", "AL", "35004", "N@ggg000");
        screenshot("paymentsucced");
		
	}

}
