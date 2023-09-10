package com.bestbuy.tests;

import org.testng.Assert;

import org.testng.annotations.Test;
import com.bestbuy.utils.SeWrappers;
import com.bestbuy.utils.Reports;
import com.bestbuy.utils.BeWrappers;
import com.bestbuy.pages.Menu;
import com.bestbuy.pages.AddProductToCart;
	
public class AddingProductsToCartTest extends SeWrappers{

	BeWrappers bb1= new BeWrappers();
	SeWrappers se= new SeWrappers();
	
	@Test
	public void products() 
	{
		
		
		launchBrowser("https://www.bestbuy.com/");
		bb1.clikingOnUnitedStates();
		bb1.addingInCart("Iphone Xr");
		
		
	}
	}


