package com.raghib.selenium;

/* REFERENCE
https://www.youtube.com/watch?v=KtSguNmZ5hA
 */

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class HTTPSCertificate {
	
	public static void main(String[] args) throws InterruptedException {
		
		// general chrome profile
		// Create object of DesiredCapabilities class
		//DesiredCapabilities ch = DesiredCapabilities.chrome();
		ChromeOptions c = new ChromeOptions();
		// Set ACCEPT_INSECURE_CERTS  variable to true
		c.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		
		// Set ACCEPT_SSL_CERTS  variable to true
		//c.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);

		// Below to your local browser
		//ChromeOptions c = new ChromeOptions();
		//c.merge(ch);
		
		// Set the driver path
		System.setProperty("webdriver.chrome.driver", "C:\\SELENIUM\\browser-driver\\chromedriver_win32\\chromedriver.exe");
		
		// Open browser with capability
		WebDriver driver = new ChromeDriver(c);
		
		driver.get("https://www.cacert.org/");
		
		Thread.sleep(5000);
		driver.quit();

	}

}
