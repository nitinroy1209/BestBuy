package com.bestbuy.utils;

import org.openqa.selenium.support.PageFactory;







import org.testng.Assert;
import com.bestbuy.pages.SignInPage;
import com.bestbuy.pages.CreateAccountPage;
import com.bestbuy.pages.HomePage;
import com.bestbuy.pages.MainPage;
import com.bestbuy.pages.AccountButton;
import com.bestbuy.pages.LinksInFooter;
import com.bestbuy.pages.AddProductToCart;
import com.bestbuy.pages.ShopByDepartment;
import com.bestbuy.pages.BrandMenu;
import com.bestbuy.pages.Menu;
import com.bestbuy.pages.ProceedToPaymentCheckout;




public class BeWrappers extends SeWrappers {

	SeWrappers se = new SeWrappers();

	// initialize page factory for all the reusable methods like Sign In for bestbuy site




	public void loginBestBuy (String mailid, String pwd) 

	{

		try
		{
			SignInPage lpPage= PageFactory.initElements(driver, SignInPage.class);//all the webelemnts and methods have been initialized of SignInpage with help of initelement method 

			lpPage.setEmail(mailid);// now i have called it using object,setemail method was there in SignInpage
			// here i can pass the email id
System.out.println(mailid);
			lpPage.setPassword(pwd);
			System.out.println(pwd);
	
			lpPage.clickLogin();// once clicking on login button i am going to put assertion
Thread.sleep(30000);
			// to bring in scope of the homepage i need to initialize HomePage

			HomePage home = PageFactory.initElements(driver,HomePage.class);

			home.waitForShopByCategory();// calling the function from homepage

		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}


	public void clikingOnUnitedStates()
	{


		try
		{
			MainPage p1 = PageFactory.initElements(driver,MainPage.class);
			p1.clickUnitedStates();
		}

		catch(Exception ex) {
			ex.printStackTrace();
		}
	}
	
	
	
	public void verifyLinkFooter() 
	{
		
		try
		{
			
			LinksInFooter l1 = PageFactory.initElements(driver,LinksInFooter.class); 
			l1.footerLinks();
			
		}

		catch(Exception ex) {
			ex.printStackTrace();
		}
	}
	
	

	
	public void addingInCart( String iphone)
	
	{
		
		
		try
		{
			
			AddProductToCart a1 = PageFactory.initElements(driver,AddProductToCart.class); 
	       a1.clickSearch();
	       
	       a1.setIphone(iphone);
	       
}

		catch(Exception ex) {
			ex.printStackTrace();
		}
	}

		
	
	
	
	
	
	public void forShopByMenu() {
		
		
		try
		{
			
			ShopByDepartment sh = PageFactory.initElements(driver, ShopByDepartment.class); 
			
			sh.shopBymenuFunction();
			
		}

		catch(Exception ex) {
			ex.printStackTrace();
		}
	}

	
	

public void brandByMenu() {
	
	
	try
	{
		BrandMenu bm=  PageFactory.initElements(driver, BrandMenu.class); 
		bm.brandMenuFunction();
	}
	
	catch(Exception ex) {
		ex.printStackTrace();
	}
}



public void proceedToPaymentSection(String o, String e, String ph, String cr, String va, String fs, String la, String ad, String cit,String y, String v, String s, String zip, String ss)
{
	try
	{
		ProceedToPaymentCheckout	bm=  PageFactory.initElements(driver, ProceedToPaymentCheckout.class); 
		
		bm.setIphoneXr(o,e,ph,cr,va,fs,la,ad,cit,y,v,s,zip,ss);
	}
	
	catch(Exception ex) {
		ex.printStackTrace();
	}
}
	
	


	
	
	
	/*public void clickAccount()
	{
		
		try
		{
			DropDown acbt = PageFactory.initElements(driver,DropDown.class);
			acbt.clickOnAccountButton();
		}
		
	

		catch(Exception ex) {
			ex.printStackTrace();
		}
	}	
	*/
	
	
	
	
	
	public void accountButton() {
		
		try
		{
		
		
		AccountButton dd= PageFactory.initElements(driver,AccountButton.class);
		dd.accountButtonLike();
	}

		catch(Exception ex) {
			ex.printStackTrace();
		}
	}
	
	
	
	public void menuButton() throws InterruptedException
	{
		
		try
		{
		Menu mn =PageFactory.initElements(driver,Menu.class);
		mn.openMenu();
		mn.selectDeals();
		mn.openMenu();
		mn.selectDeals1();
		mn.openMenu();
		mn.selectServices();
		mn.openMenu();
		mn.selectNewFeature();
		
		
		
		Thread.sleep(10000);
		
		}

		catch(Exception ex) {
			ex.printStackTrace();
		}
	}
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


	public void createAccount(String firstNameValue,String lastNameValue,String emailValue,String passwordValue,String confirmPasswordValue,String mobileNumberValue)


	{
		try {
			CreateAccountPage caPage= PageFactory.initElements(driver, CreateAccountPage.class);

			caPage.enterFirstName(firstNameValue);

			caPage.enterLastName(lastNameValue);

			caPage.enterEmail(emailValue);

			caPage.enterPassword(passwordValue);

			caPage.confirmPassword(confirmPasswordValue);

			caPage.enterMobileNumber(mobileNumberValue);

			caPage.clickOnCreateAccountButton();


		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
	}




}




