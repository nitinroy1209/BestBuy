package com.bestbuy.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.bestbuy.utils.SeWrappers;



public class ShopByDepartment extends SeWrappers {
	
	
	
	 @FindBy(xpath = "//button[@aria-label='Menu']//*[name()='svg']")
     WebElement menuButton;//click on this menu button
	 @FindBy(xpath = "//button[normalize-space()='Appliances']")
     WebElement appliancesButton;// then go to appliancesButton and then click
	 
	 @FindBy(xpath = "//button[normalize-space()='Major Kitchen Appliances']")
     WebElement majorKitchenAppliancesButton;// click on major kitchen appliances
     
	 @FindBy(xpath="//a[normalize-space()='Refrigerators']")
	 WebElement refrigerators;//click on refrigerators
	 
	 @FindBy(xpath="//a[@class='flex-link'][normalize-space()='French door refrigerators']")
	   WebElement  ref;
	 @FindBy(xpath = "/html[1]/body[1]/div[5]/main[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[4]/div[1]/div[5]/ol[1]/li[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/button[1]")
	   WebElement addToCartElement;// webelement for addtocart
	 @FindBy(xpath = "//a[@href='/cart']")
	 WebElement cartButton;
	 @FindBy(xpath ="//span[normalize-space()='No Thanks']")
	 WebElement NoThanks;
	 
	 @FindBy(xpath = "//button[normalize-space()='Checkout']")
	    WebElement checkoutButton;

	 
	 public void shopBymenuFunction() throws InterruptedException
	 {
		 click(menuButton);
		 click(appliancesButton);
		 click(majorKitchenAppliancesButton);
		 click(refrigerators);
		 click( ref);
		 click(addToCartElement);
		 
		 click(cartButton);
		 
		 click(NoThanks);
		 click(checkoutButton);
		 
		 
		 
	 }
	

}
