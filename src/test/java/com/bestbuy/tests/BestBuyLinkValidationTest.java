package com.bestbuy.tests;

import java.net.HttpURLConnection;


import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.bestbuy.utils.SeWrappers;
import java.io.IOException;
import org.testng.annotations.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BestBuyLinkValidationTest extends SeWrappers {
	
	
	
	
	@Test
	public void validateBrokenLink() {
	    try {
	        String urlToValidate = "https://www.bestbuy.com/";
	        launchBrowser(urlToValidate);

	        URL link = new URL(urlToValidate);
	        HttpURLConnection httpConn = (HttpURLConnection) link.openConnection();
	        httpConn.setConnectTimeout(2000);
	        httpConn.connect();

	        if (httpConn.getResponseCode() == 200) {
	            System.out.println(urlToValidate + " - " + httpConn.getResponseMessage() + " - Not a broken link");
	        } else if (httpConn.getResponseCode() == 404) {
	            System.out.println(urlToValidate + " - " + httpConn.getResponseMessage() + " - Broken link");
	        }
	    } catch (Exception e) {
	        System.out.println("Exception occurred: " + e.getMessage() + " - Broken link");
	    }
	}

	
	
	
	
	
	
	
	
	
	
	
	
	

    // You don't need to create a new instance of SeWrappers because it's already extended

   /* @Test
    public void validateBestBuyURL() {
        String urlToValidate = "https://www.bestbuysha.com/";

        // Launch the browser and navigate to the URL using your SeWrappers method
        launchBrowser(urlToValidate);

        // Get the current URL from the driver
        String currentUrl = driver.getCurrentUrl();

        // Perform validation
        if (currentUrl.equals(urlToValidate)) {
            System.out.println("URL validation passed. Current URL: " + currentUrl);
        } else {
            System.out.println("URL validation failed. Expected URL: " + urlToValidate + ", Actual URL: " + currentUrl);
        }

        // Optionally, you can also check for specific elements on the page to ensure it's the correct page
        // For example, checking for the presence of a logo element:
        // WebElement logoElement = driver.findElement(By.id("logoId"));
        // Assert.assertTrue(logoElement.isDisplayed(), "Logo not found on the page");

        // Close the browser after validation
        closeAllBrowsers();
    }
    */

    // The verifyLink method can remain as is
   /* public static void verifyLink(String url) {
        try {
            URL link = new URL(url);
            HttpURLConnection httpURLConnection = (HttpURLConnection) link.openConnection();
            httpURLConnection.setConnectTimeout(3000); // Set connection timeout to 3 seconds
            httpURLConnection.connect();

            if (httpURLConnection.getResponseCode() == 200) {
                System.out.println(url + " - " + httpURLConnection.getResponseMessage());
            } else {
                System.out.println(url + " - " + httpURLConnection.getResponseMessage() + " - " + "is a broken link");
            }
        } catch (Exception e) {
            System.out.println(url + " - " + "is a broken link");
        }*/
    }

