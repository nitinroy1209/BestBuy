package com.bestbuy.pages;
import org.openqa.selenium.WebElement;


import org.openqa.selenium.support.FindBy;

import com.bestbuy.utils.SeWrappers;



public class ProceedToPaymentCheckout extends SeWrappers {
	
	//SeWrappers drd = new SeWrappers();
	
	
	@FindBy(xpath="//input[@id='gh-search-input']")
	WebElement searchInput;// here we can write 1)

	@FindBy(xpath="//span[@class='header-search-icon']//*[name()='svg']")
	WebElement searchIcon;//we can click seach icon 2)
	//@FindBy(xpath="//div[@id='fulfillment-add-to-cart-button-90586412']//div[@class='fulfillment-add-to-cart-button']//div//div//*[@role='img']//*[name()='svg']//*[name()='path' and contains(@d,'M31.75 7.3')]")
	//WebElement addToCartIcon;
	//@FindBy(xpath="//div[@id='fulfillment-add-to-cart-button-44445156']//div[@class='fulfillment-add-to-cart-button']//div//div//button[@type='button'][normalize-space()='Add to Cart']")
	//WebElement addToCartButton;
	
	@FindBy(xpath = "/html[1]/body[1]/div[5]/main[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[5]/div[1]/div[4]/ol[1]/li[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/button[1]")
	WebElement addToCartButton; //click on addtocart button3
	@FindBy(xpath = "//a[@href='/cart']")
	 WebElement cartButton;// click on goto cartbutton4
	
	/*@FindBy(xpath = "//*[@id='quantity-4yofgy7eidtri-4klyxrxcxo25n']")
	 WebElement quantityDropdown; //DropDown? not sure about it*/
	
	
	@FindBy(xpath = "//button[normalize-space()='Checkout']")
    WebElement checkoutButton; //click on checkoutbutton5
	
	//@FindBy(xpath = "(//div[@class='fulfillment-add-to-cart-button'])[1]")
    //WebElement addToCartButtonAnother;
	
	@FindBy(xpath="//button[normalize-space()='Continue as Guest']")
    WebElement continueasguest;//as a guest click6
	
	@FindBy(xpath="//input[@id='user.emailAddress']")
    WebElement emailaddress;// type  email id type in7
	@FindBy(xpath="//input[@id='user.phone']")
    WebElement phone;// type in phone no8
	
	 @FindBy(xpath="//span[normalize-space()='Continue to Payment Information']")
	    WebElement continuetoPaymentInformation;//click on continue 9
	
	    
	    //input[@id='number'] 

	    @FindBy(xpath="//input[@id='number']")
	    WebElement creditcardnumber;//10 type in 



	    //select[@id='expMonth']

	    @FindBy(xpath="//select[@id='expMonth']")
	    WebElement expMonth; // dropdown

	    
	    
	  //select[@id='expYear']
	    
	    
	    @FindBy(xpath ="//select[@id='expYear']")
	    WebElement expYear; //year dropdown
	    
	    @FindBy(xpath="//div//button[@class='c-button c-button-outline c-button-lg stnd-modal__keepButton']")
	    WebElement keepadress;//





	    //input[@id='cvv'] 

	    @FindBy(xpath="//input[@id='cvv']")
	    WebElement cvv; //type in cvv




	    //input[@id='first-name']

	    @FindBy(xpath="//input[@id='first-name']")
	    WebElement firstname;//type




	    //input[@id='last-name']

	    @FindBy(xpath="//input[@id='last-name']")
	    WebElement lastname;//type


	    //input[@id='address-input']

	    @FindBy(xpath="//input[@id='address-input']")
	    WebElement address;// type


	    //input[@id='city']


	    @FindBy(xpath="//input[@id='city']")
	    WebElement city;//city
	    
	    @FindBy (xpath="//select[@name='state']")

	    WebElement state;// is a dropdown

	    //input[@id='postalCode']

	    @FindBy(xpath="//input[@id='postalCode']")
	    WebElement postalcode;//type


	    //button[normalize-space()='Other payment options']

	   


	    //input[@id='create-account-password-form-show-password']

	    @FindBy(xpath="//input[@id='create-account-password-form-show-password']")
	    WebElement showpassword;//type in createpassword


	    
	    //span[normalize-space()='Place Your Order']
	    @FindBy(xpath="//span[normalize-space()='Place Your Order']")
	    WebElement placeyourorder;//click on place order


	    //div//button[@class='c-button c-button-outline c-button-lg stnd-modal__keepButton']
	    @FindBy(xpath="//div//button[@class='c-button c-button-outline c-button-lg stnd-modal__keepButton']")
	    WebElement keepadress1;

	   /* // Create object of the Select class
	//Select se = new Select(driver.findElement(By.xpath("//*[@id='oldSelectMenu']")));
				
	// Select the option with value "6"
	//se.selectByValue("6");*/
	    
	    
	    
	    
	    
	    
	 
	 
	    
    
	
	
	
	public void setIphoneXr(String p, String em, String phn, String crd, String val, String yr,String cv,String fsnm, String lasnam, String addre, String cit, String st, String zipcd, String ps) throws InterruptedException
	{
		
		click(searchInput);
		
		
		
		typeText(searchInput,p);
		click(searchIcon);
		//click(addToCartButtonAnother);
		click(addToCartButton);
	
		click(cartButton);//go to cart
		//click(quantityDropdown);
		
		//selectByValue(checkoutButton,"s");
		
		click(checkoutButton);
		click(continueasguest);
		
		
		
		

		click(emailaddress);
		typeText(emailaddress,em);
		
		
		click(phone);
		typeText(phone, phn);
		
		click(continuetoPaymentInformation);
		
		click(creditcardnumber);
		typeText(creditcardnumber,crd);//370175300288281
		
		
		click(expMonth);
		selectByValue(expMonth, val);
		
		
		click( expYear);
		selectByValue( expYear, yr);
		
		click(cvv);
		typeText(cvv, cv);
		
		click(firstname);
		typeText(firstname, fsnm);
		click(lastname);
		typeText(lastname, lasnam);
		
		click(address);
		typeText(lastname, addre);
		
		click(city);
		typeText(city, cit);

		
		click(state);
		selectByValue(state, st);
		
		click(postalcode);
		typeText(postalcode, zipcd);
		
		click(showpassword);
		typeText(showpassword, ps);
		
		click(placeyourorder);
		click(keepadress1);
		
		
		
		
		
		
		
		}
	
	/*public void radioButton() {
		
		click(storePickupRadioButton);
		}
	*/


}




