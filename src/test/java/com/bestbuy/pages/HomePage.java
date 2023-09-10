package com.bestbuy.pages;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;

import com.bestbuy.utils.SeWrappers;

public class HomePage extends SeWrappers {

	
	 @FindBy(xpath="//h2[contains(text(),'Shop by category')]")
	    WebElement shopByCategory;
	    
	 
	 public void waitForShopByCategory() // validation
		{
			waitForMe(shopByCategory,20);
		}

	}
	 


