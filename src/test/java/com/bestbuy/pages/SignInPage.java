package com.bestbuy.pages;



import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import com.bestbuy.utils.SeWrappers;

public class SignInPage extends SeWrappers


{
	
	/*
	@FindBy(name="fld-e")
	WebElement e;
	*/
	
	//store all the webelmeent using pagefactory
	 @FindBy (xpath="//input[@name='fld-e']")
	 WebElement e;
	 
	 
	 
	 @FindBy(xpath="//input[@id='fld-p1']")
	 WebElement p1;
	 
	 @FindBy(xpath="//button[text()='Sign In']")
	 WebElement In;
	 
	 // convert all the interactions into methods using pagefactory
	 public void setEmail(String emailId)  // sendkeys using typetext method in Wrapper class
		{
			typeText(e,emailId);//here email is webelement and emailid we will pass dynamically and here it accepts two arguments weblelemnt and string
		}
	    
	 public void setPassword(String pwd)
		{
			typeText(p1,pwd);
		}
		
		public void clickLogin() throws InterruptedException
		{
			Thread.sleep(10000);
			click(In);
			Thread.sleep(30000);
			
		}
	 
	    
	 
	 
	 

	 
}

