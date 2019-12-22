package com.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChromeDriver {

	public static void main(String[] args) {
//                           Key                            value
		System.setProperty("webdriver.chrome.driver", "/Users/assel/eclipse-workspace/Selenium/drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		//http-->hypertext transfer protocol
		driver.get("https://google.com");
        driver.get("https://www.facebook.com");
	}
}
