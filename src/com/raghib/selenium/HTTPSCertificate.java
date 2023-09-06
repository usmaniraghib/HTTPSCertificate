package com.raghib.selenium;

import java.time.Duration;

/* REFERENCE
https://www.youtube.com/watch?v=KtSguNmZ5hA
 */

import org.openqa.selenium.WebDriver;

public class HTTPSCertificate extends BaseClass {

	public static WebDriver driver;
	public static String browserName = "chrome";
	public static String browserVersion = "116";	
	public static String url = "https://www.cacert.org/";
	
	public static void main(String[] args) throws InterruptedException {
		// Chrome Browser
		driver = BaseClass.getDriver(browserName, browserVersion);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get(url);
		Thread.sleep(5000);
		BaseClass.quitDriver();
	}
}
