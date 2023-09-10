package com.bestbuy.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.bestbuy.utils.SeWrappers;


public class BrandMenu  extends SeWrappers {
	
	 @FindBy(xpath = "//button[@aria-label='Menu']//*[name()='svg']")
     WebElement menuButton;//click on this menu button(1)
	 
	 @FindBy(xpath="//button[normalize-space()='Brands']")//(2)
	   WebElement brands;
	 
	 @FindBy(xpath="//a[normalize-space()='Samsung']")
	   WebElement samsung;//3
	//a[@class='esg-link']//img[@alt='TV']
	 
	 @FindBy(xpath="//a[@class='esg-link']//img[@alt='TV']")
	   WebElement tv;//4
	 
	 @FindBy(xpath=" /html[1]/body[1]/div[5]/main[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[4]/div[1]/div[5]/ol[1]/li[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/button[1]")
	 WebElement addingtocart;  //5
	 
	 @FindBy(xpath = "//a[@href='/cart']")
	 WebElement cartButtons;//6
	 
	 @FindBy(xpath="//button[normalize-space()='Checkout']")
	   WebElement checkout1;//7
	 
	/* 
	 @FindBy(xpath="//a[contains(text(),'Apple')]")
	   WebElement apple;
	 @FindBy(xpath="//a[@class='flex-link'][normalize-space()='iPhone']")
	   WebElement iphone;
	 @FindBy(xpath="//a[@class='btn btn-secondary v-small']")
	   WebElement compare;
	 
	 @FindBy(xpath="//a[normalize-space()='Shop iPhone 14']")
	   WebElement shopiphone;
	 @FindBy(xpath="//button[normalize-space()='Add to Cart']")
	   WebElement addtocart;
	 
	 
	 @FindBy(xpath="//span[contains(text(),'Letʼs Get Started')]")
	   WebElement letsgetstarted;
	 
	 @FindBy(xpath="//label[@for='transactions-page__no']//span//span[contains(text(),'No')]")
	   WebElement no;
	 
	 @FindBy(xpath="//button[@class='c-button c-button-secondary c-button-lg c-button-block transactions-page__continue-button']")
	   WebElement continuebutton;
	 
	 
	 @FindBy(xpath="//span[normalize-space()='No, thanks']")
	   WebElement nothanks;
	 
	 
	 @FindBy(xpath="//span[normalize-space()='Continue without Trade-in']")
	   WebElement continuwithouttradein;
	   
	 
	 @FindBy(xpath="//a[@class='flex-link'][normalize-space()='iPhone 14 Pro Max']")
	   WebElement iphone14promax;//impt
	 @FindBy(xpath="//button[normalize-space()='Add to Cart']")
	   WebElement addtocart1;//after impt
*/
	 
	 
	 public void brandMenuFunction() {
		 
		 click(menuButton);
		 click(brands);
		 click( samsung);
		 click(tv);
		 click(addingtocart);
		 click(cartButtons);
		 click(checkout1);
		 
		 
		 
	 }
	   
	
	
	

}
