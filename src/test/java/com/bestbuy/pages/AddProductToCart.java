package com.bestbuy.pages;
import org.openqa.selenium.WebElement;


import org.openqa.selenium.support.FindBy;

import com.bestbuy.utils.SeWrappers;



public class AddProductToCart extends SeWrappers {
	
	//SeWrappers drd = new SeWrappers();
	
	
	@FindBy(xpath="//input[@id='gh-search-input']")
	WebElement searchInput;// here we can write

	@FindBy(xpath="//span[@class='header-search-icon']//*[name()='svg']")
	WebElement searchIcon;//we can click on search item
	//@FindBy(xpath="//div[@id='fulfillment-add-to-cart-button-90586412']//div[@class='fulfillment-add-to-cart-button']//div//div//*[@role='img']//*[name()='svg']//*[name()='path' and contains(@d,'M31.75 7.3')]")
	//WebElement addToCartIcon;
	//@FindBy(xpath="//div[@id='fulfillment-add-to-cart-button-44445156']//div[@class='fulfillment-add-to-cart-button']//div//div//button[@type='button'][normalize-space()='Add to Cart']")
	//WebElement addToCartButton;
	
	@FindBy(xpath = "/html[1]/body[1]/div[5]/main[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[5]/div[1]/div[4]/ol[1]/li[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/button[1]")
	WebElement addToCartButton;
	@FindBy(xpath = "//a[@href='/cart']")
	 WebElement cartButton;
	
	@FindBy(xpath = "//*[@id='quantity-4yofgy7eidtri-4klyxrxcxo25n']")
	 WebElement quantityDropdown; //DropDown
	
	
	@FindBy(xpath = "//button[normalize-space()='Checkout']")
    WebElement checkoutButton;
	
	//@FindBy(xpath = "(//div[@class='fulfillment-add-to-cart-button'])[1]")
    //WebElement addToCartButtonAnother;
	
	
	
	
	public void clickSearch () throws InterruptedException 
	
	{
		click(searchInput);
		Thread.sleep(3000);
		

    }
	
	public void setIphone(String p) throws InterruptedException
	{
		typeText(searchInput,p);
		click(searchIcon);
		//click(addToCartButtonAnother);
		click(addToCartButton);
	
		click(cartButton);//go to cart
		//click(quantityDropdown);
		
		//selectByValue(checkoutButton,"s");
		
		click(checkoutButton);
		//selectByValue(checkoutButton,s);
		//drd.selectByValue(checkoutButton,"2");
		Thread.sleep(30000);
		
	
		//selectByValue(quantityDropdown,s);
		//click(shippingRadioButton);
		//click(storePickupRadioButton);
		}
	
	/*public void radioButton() {
		
		click(storePickupRadioButton);
		}
	*/


}




