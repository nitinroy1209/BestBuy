package com.bestbuy.pages;
import org.openqa.selenium.By;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;







import org.openqa.selenium.support.FindBy;

import com.bestbuy.utils.SeWrappers;


public class Menu extends SeWrappers {




	@FindBy(xpath="//button[@aria-label='Menu']//*[name()='svg']")
	 WebElement svg;

	
	@FindBy(xpath="//span[@class='hamburger-back-button-text']")
	WebElement backButton;//for back button


	@FindBy(xpath="//button[normalize-space()='Deals']")
	WebElement deals;
	@FindBy(xpath="//button[normalize-space()='Support & Services']")
	WebElement Services;

	@FindBy(xpath="//button[normalize-space()='Brands']")
	WebElement Brands;


	@FindBy(xpath="//button[normalize-space()='Appliances']")
	WebElement appliances;


	@FindBy(xpath="//*[@id=\"shop-header-25468753\"]/div/div[1]/header/div[1]/div/nav/div/div/ul/li[6]/button")
	WebElement Theatre;


	@FindBy(xpath="//*[@id=\"shop-header-25468753\"]/div/div[1]/header/div[1]/div/nav/div/div/ul/li[7]/button")
	WebElement Tablet;



	@FindBy(xpath="//button[normalize-space()='Cell Phones']")
	WebElement Phones;

	@FindBy(xpath="//button[normalize-space()='Audio']")
	WebElement Audio;

	@FindBy(xpath="//button[normalize-space()='Video Games']")
	WebElement videoGamesButton;

	@FindBy(xpath="//button[normalize-space()='Cameras, Camcorders & Drones']")
	WebElement videogames;

	@FindBy(xpath="//button[normalize-space()='Cameras, Camcorders & Drones']")
	WebElement camerasButton;


	@FindBy(xpath="//button[normalize-space()='Home, Furniture & Office']")
	WebElement homeFurnitureOfficeButton;


	@FindBy(xpath="//button[normalize-space()='Smart Home, Security & Wi-Fi']")
	WebElement smartHomeButton; 



	@FindBy(xpath="//button[normalize-space()='Car Electronics & GPS']")
	WebElement carElectronicsButton;


	@FindBy(xpath="//button[normalize-space()='Movies & Music']")
	WebElement moviesMusicButton;


	@FindBy(xpath="//button[normalize-space()='Movies & Music']")
	WebElement mo;

	@FindBy(xpath="//button[normalize-space()='Wearable Technology']")
	WebElement wearableTechnologyButton;


	@FindBy(xpath="//button[normalize-space()='Health, Wellness & Fitness']")
	WebElement healthWellnessButton;

	@FindBy(xpath="//button[normalize-space()='Outdoor Living']")
	WebElement outdoorLivingButton;
	@FindBy(xpath="//button[normalize-space()='Toys, Games & Collectibles']")
	WebElement toysGamesButton;
	@FindBy(xpath="//button[normalize-space()='Electric Transportation']")
	WebElement electricTransportationButton;

	@FindBy(xpath="//button[normalize-space()='New & Featured']")
	WebElement newFeaturedButton;
	

	@FindBy(xpath="//button[normalize-space()='Close']")
	WebElement closeButton;
	
	
	@FindBy(xpath="//button[@class='c-button-unstyled close-button-sidecar']")
	WebElement closeButton1;

	
	
	
	
	
	
	// after selecting deals
	@FindBy(xpath="//a[contains(@data-lid,'ubr_dls_td_topdeals')]")
	WebElement topDeals;
	
	@FindBy(xpath="//a[@data-lid='ubr_dls_dod']")
	WebElement dealOfTheDay;
	
	@FindBy(xpath="//a[normalize-space()='Exclusive Member Deals']")
	WebElement exclusiveMemberDeals;
	
	@FindBy(xpath="//a[@data-lid='ubr_dls_gift_ideas']")
	WebElement giftIdeas;
	
	@FindBy(xpath="//a[@data-lid='ubr_dls_bbo']")
	WebElement bestBuyOutlet;
	
	@FindBy(xpath="//a[normalize-space()='Apple Shopping Event']")
	WebElement appleShoppingEvent;
	
	//DealsByCategory Webelements
	@FindBy(xpath="//a[normalize-space()='TVs & Projectors']")
	WebElement tvsProjectors;
	
	@FindBy(xpath="//a[normalize-space()='Laptops & Computers']")
	WebElement laptopsComputers;
	
	@FindBy(xpath="//a[normalize-space()='Tablets & E-Readers']")
	WebElement tabletsEreaders;
	
	
	@FindBy(xpath="//a[normalize-space()='Video Games & VR']")
	WebElement videoGamesVR;
	
	
	@FindBy(xpath="//a[normalize-space()='Headphones']")
	WebElement headphones;
	
	
	@FindBy(xpath="//a[normalize-space()='Cell Phones']")
	WebElement cellPhones;
	
	@FindBy(xpath="//a[normalize-space()='PC Gaming']")
	WebElement pcGaming;
	
	
	@FindBy(xpath="//a[normalize-space()='Sound Bars & Speakers']")
	WebElement soundBarsSpeakers;
	
	
	@FindBy(xpath="//a[normalize-space()='Video & Streaming Media Players']")
	WebElement videoStreamingMediaPlayers;
	
	@FindBy(xpath="//a[normalize-space()='Smart Home & Networking']")
	WebElement smartHomeNetworking;

	@FindBy(xpath="//a[normalize-space()='Toys, Games & Collectibles']")
	WebElement toysGamesCollectibles;
	
	@FindBy(xpath="//a[contains(text(),'Cameras, Camcorders & Drones')]")
	WebElement camerasCamcordersDrones;
	
	@FindBy(xpath="//a[normalize-space()='Wearable Technology']")
	WebElement wearableTechnology;

	
	@FindBy(xpath="//a[normalize-space()='Major Appliances']")
	WebElement majorAppliances;
	
	@FindBy(xpath="//a[normalize-space()='Small Appliances']")
	WebElement smallAppliances;
	
	@FindBy(xpath="//a[normalize-space()='Movies, TV Shows & Music']")
	WebElement moviesTVShowsMusic;
	
	@FindBy(xpath="//a[normalize-space()='Printers & Home Office']")
	WebElement printersHomeOffice;
	
	@FindBy(xpath="//a[normalize-space()='Home & Outdoor']")
	WebElement homeOutdoor;
	
	
	@FindBy(xpath="//a[normalize-space()='Car Electronics & GPS']")
	WebElement carElectronicsGPS;
	
	@FindBy(xpath="//a[normalize-space()='Electric Transportation']")
	WebElement electricTransportation;

	@FindBy(xpath="//a[normalize-space()='Sales & Promotions']")
	WebElement salesPromotions;

	@FindBy(xpath="//a[normalize-space()='Clearance & More']")
	WebElement clearanceMore;
	
	// weblements under support and services
	
	
	@FindBy(xpath="//a[@data-lid='ubr_svc_help']")
	WebElement help;



	@FindBy(xpath="//a[normalize-space()='Repair & Tech Services']")
	WebElement repairTechServices;



	@FindBy(xpath="//a[normalize-space()='Remote Support']")
	WebElement remoteSupport;



	@FindBy(xpath="//a[@data-lid='ubr_svc_manage_appointment']")
	WebElement manageAppointment;



	@FindBy(xpath="//a[normalize-space()='Check Repair Status']")
	WebElement checkRepairStatus;
	
	@FindBy(xpath="//button[normalize-space()='Deals & Outlet']")
	WebElement dealsOutlet;//dealoutlet button
	
	
	

	
	

	
	// convert all interaction into methods
	
	
	
	


	
	

	
	

	
	
	
	
	


	//convert all interaction into methods



public void openMenu() throws InterruptedException {
	
	click(svg);
	
	Thread.sleep(3000);
	//click(Brands);
	
	
	
	
	}


	
		 
	

	


	public void selectDeals() {
		
        click(deals);
        
        click(clearanceMore);
        
       
        
        
        
        
        
        
        
        
	}
	
	
	public void selectDeals1()
	{
		click (deals);
		click(cellPhones);
		
	}

	
	
	public void selectServices() {

		
		click(Services);
		click(remoteSupport);
	}
	
	
	
	
	
	
	
	
	
	public void selectAnyoneByIndex()
	{
	
		click(Brands);
	}
	
	
	

	public void selectAppliances()
	{

		
		click(appliances);
		
	}


	public void selectTheatre()
	{

		
		click(Theatre);
	}


	public void selectTablet()
	{
		
		click(Tablet);
		
	}



	public void selectPhones()
	{
		
		click(Phones);
	}




	public void selectAudio()
	{
		click(Audio);
	}


	public void selectVideoGamesButton() {
		click(videoGamesButton);
	}


	public void selectCamerasButton()
	{
		click(camerasButton);
	}


	public void selectSmartHomeButton()
	{
		click(smartHomeButton);
	}



	public void selectCarElectronicsButton() {
		click(carElectronicsButton);
	}


	public void selectMo() {

		click(mo);
	}

	public void selectWearableTech() {

		
		click(wearableTechnologyButton);
	}


	public void select()
	{

		click(outdoorLivingButton);
	}
	public void selectHealth() {

	click(healthWellnessButton);
	}
	public void selectToys()
	{
		click(toysGamesButton);
	}


	public void selectElectric() {
		click(electricTransportationButton);
	}
	public void selectNewFeature() throws InterruptedException
	{
		
		
		click(newFeaturedButton);
		Thread.sleep(30000);
		click(backButton);
		Thread.sleep(50000);
		click(outdoorLivingButton);
		click(dealsOutlet);
		
		Thread.sleep(30000);
		click(closeButton1);
		Thread.sleep(30000);
		click(closeButton);
		
		
		
		
	}

	public void selectCloseButton()
	{


		click(closeButton);


	}













}
