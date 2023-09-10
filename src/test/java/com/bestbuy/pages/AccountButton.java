package com.bestbuy.pages;
import org.openqa.selenium.WebElement;




import org.openqa.selenium.support.FindBy;

import com.bestbuy.utils.SeWrappers;

public class AccountButton extends SeWrappers 

{

	@FindBy(xpath="//span[@class='v-p-right-xxs line-clamp']")
	WebElement clamp;  // for clicking on account button

	@FindBy(xpath="//a[normalize-space()='Sign In']")
	WebElement In; // signin button


	@FindBy(xpath="//a[normalize-space()='Create Account']")
	WebElement createAccount;
	
	
	/* public void clickOnAccountButton()
	 {
		 click(clamp);
	 }
	 
	 public void chooseDropDownValue(int index)
	 {
	selectByIndex(createAccount,index);
	
	 }
	 
	 public void clickDropDownValue()
	 {
		 click(In);
		 click(createAccount);
	 }
	 */

	
	 
	 
	 
	 
	 
	 
	 public void accountButtonLike() {
		
		click(clamp);//account button of dropdown
		In.click();// signin button of dropwdown
		//createAccount.click();//create account button of dropdown


	




	 }
}
