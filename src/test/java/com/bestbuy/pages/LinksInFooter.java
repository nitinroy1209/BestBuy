package com.bestbuy.pages;
import java.util.List;

import org.openqa.selenium.By;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.bestbuy.utils.SeWrappers;


public class LinksInFooter extends SeWrappers {
	
	
	

	
	 @FindBy(xpath="//div[@class='flex justify-content-start']")
	 WebElement flexJustifyContentStart;
	 
	 
	 
	public void footerLinks( ) throws InterruptedException {
	 
	 List<WebElement> anchorElements = flexJustifyContentStart.findElements(By.tagName("a"));
	 
	 
	 

     //Print the href attribute of each anchor element
     for (WebElement anchor : anchorElements) {
         String link = anchor.getAttribute("href");
         System.out.println("Link: " + link);
         
         Assert.assertNotNull(link, "Link is not null");
     }
     
     

	}
}
	
	 
	 
	/*public List<String> footerLinks() throws InterruptedException {
		    List<WebElement> anchorElements = flexJustifyContentStart.findElements(By.tagName("a"));
		    List<String> links = new List<>();

		    // Collect the href attributes of each anchor element
		    for (WebElement anchor : anchorElements) {
		        String link = anchor.getAttribute("href");
		        System.out.println("Link: " + link);
		        links.add(link); // Add the link to the list
		    }

		    return links; // Return the list of links
		}

	 
	 
	 */
	 
	 
	 
	 
	 
	 

	 
	 
	 
	/* public boolean isLinkPresent(List<WebElement> anchorElements, String expectedLink) {
		    for (WebElement anchor : anchorElements) {
		        String actualLink = anchor.getAttribute("href");
		        if (actualLink != null && actualLink.equals(expectedLink)) {
		            return true; // Link is present
		        }
		    }
		    return false; // Link is not present
		}
}
*/