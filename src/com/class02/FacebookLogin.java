package com.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {

	public static void main(String[] args) {
	
System.setProperty("webdriver.chrome.driver", "/Users/assel/eclipse-workspace/Selenium/drivers/chromedriver");		

WebDriver driver = new ChromeDriver();
driver.get("http://gacebook.com");
driver.findElement(By.xpath("//input[@name='email']")).sendKeys("kanat29");
driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("123");		
driver.findElement(By.xpath("//input[@type='submit']")).click();	
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
