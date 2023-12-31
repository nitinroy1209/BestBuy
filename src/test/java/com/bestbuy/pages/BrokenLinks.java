import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public
 
class BrokenLinkFinder {

    public static void main(String[] args) {

        // Set up WebDriver
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        WebDriver driver = new ChromeDriver();

        // Open the webpage to test
        driver.get("https://www.example.com");  // Replace with the actual URL

        // Find all links on the page
        List<WebElement> links = driver.findElements(By.tagName("a"));

        // List to store broken links
        List<String> brokenLinks = new ArrayList<>();

        // Iterate through each link and check its status code
        for (WebElement link : links) {
            String linkUrl = link.getAttribute("href");

            try {
                URL url = new URL(linkUrl);
                HttpURLConnection httpURLConnect = (HttpURLConnection) url.openConnection();
                httpURLConnect.setConnectTimeout(5000);  // Set timeout for connection
                httpURLConnect.connect();

                int responseCode = httpURLConnect.getResponseCode();
                if (responseCode >= 400) {
                    brokenLinks.add(linkUrl);
                }
            } catch (MalformedURLException e) {
                System.err.println("Invalid URL: " + linkUrl);
            } catch (IOException e) {
                System.err.println("Error checking link: " + linkUrl);
            }
        }

        // Print the list of broken links
        if (brokenLinks.isEmpty()) {
            System.out.println("No broken links found!");
        } else {
            System.out.println("Broken links:");
            for (String brokenLink : brokenLinks) {
                System.out.println(brokenLink);
            }
        }

        // Close the browser
        driver.quit();
    }
}
