package com.bestbuy.pages;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;

import com.bestbuy.utils.SeWrappers;


public class MainPage extends SeWrappers {
	
	
	@FindBy(xpath="/html/body/div[2]/div/div/div/div[1]/div[2]/a[2]/img")
	WebElement img;
	
	@FindBy(xpath="//div[@lang='en']//img[@alt='Canada']")
	WebElement Canada ;
	
	
	
	// now interaction into methods
	
	
	
	
	public void clickUnitedStates()  
	{
	img.click();
	}
	
	
	
	//public void clickCanada()  
		//{
		//Canada.click();
		//}
	
	
	
	
	

}
