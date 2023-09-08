package com.raghib.selenium;

/** REFERENCE
 * C:\STUDY_DATA\TESTING\New folder_2\1-B_SELANIUM\
 * 0.1Udemy - Selenium WebDriver with Java -Basics to Advanced+Frameworks\
 * 14. Miscellaneous topics in Selenium WebDriver
 * 
 * https://www.youtube.com/watch?v=KtSguNmZ5hA
 */

import java.time.Duration;

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
