package com.class07;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import com.utils.CommonMethods;

public class PageLoadandImplicitWait extends CommonMethods {

	public static void main(String[] args) {
		
setUp("chrome","https://cnn.com");

//page load waits until all the elements on the page gets fully loaded

//if element won't load within 30 seconds you will get TimeoutException

driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

//tell webdriver to wait for the element before throwing NoSuchElementException
driver.findElement(By.name("wrongName")).sendKeys("iPhone");

driver.quit();


	}
}
