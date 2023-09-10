package com.bestbuy.pages;

	
	
	import org.openqa.selenium.WebElement;

	import org.openqa.selenium.support.FindBy;

import com.bestbuy.utils.SeWrappers;
import com.bestbuy.utils.BeWrappers;

	public class CreateAccountPage extends SeWrappers 
  {

		
		// storing all the webelement of create an account page
	    @FindBy(xpath="//input[@name='firstName']")
	    WebElement firstName;

	    @FindBy(xpath="//input[@name='lastName']")
	    WebElement lastName;

	    @FindBy(xpath="//input[@name='email']")
	    WebElement email;

	    @FindBy(xpath="//input[@name='fld-p1']")
	    WebElement p1;// password
	    
	    @FindBy(xpath="//input[@name='reenterPassword']")
	    WebElement reenterPassword; // confirm password
	    
	    @FindBy(xpath="//input[@name='phone']")
	    WebElement phone ; // mobile number
	    
	     @FindBy(xpath="//button[@type='submit']")
	    WebElement submit ; // create an account button webelement 
	     
	     
	     //Now convert all the interaction into methods
	     
	     
	     public void enterFirstName(String firstNameValue) {
	         typeText(firstName, firstNameValue);
	     }
	     
	     
	  public void enterLastName(String LastNameValue) {
	         typeText(lastName, LastNameValue);
	     }
	     
	     
	     
	     public void enterEmail(String emailValue) {
	         typeText(email, emailValue);
	     }

	     public void enterPassword(String passwordValue) {
	         typeText(p1,passwordValue);
	     }
	     
	     
	     public void confirmPassword(String confirmPasswordValue)
	     {
	    	 typeText(reenterPassword,confirmPasswordValue);
	     }
	     
	     
	     public void enterMobileNumber(String mobileNumberValue) 
	     {
	    	 
	    	 typeText( phone,mobileNumberValue);
	     }
	     
	     
	     

	     public void clickOnCreateAccountButton() {
	         click(submit);
	     }
	     
	     

	 }
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     

