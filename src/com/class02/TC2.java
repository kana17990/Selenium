package com.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC2 {
/*TC 2: Mercury Tours Registration: 
Open chrome browser
Go to “http://newtours.demoaut.com/”
Click on Register Link
Fill out all required info
Click Submit
User successfully registered
(Create 2 scripts using different locators)
 */
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","/Users/assel/eclipse-workspace/Selenium/drivers/chromedriver");
		WebDriver dr = new ChromeDriver();
		dr.get("http://newtours.demout.com/");
		dr.findElement(By.linkText("REGISTER")).click();
		dr.findElement(By.name("firstName")).sendKeys("Kanat");
		dr.findElement(By.name("lastname")).sendKeys("Ussenov");
		dr.findElement(By.name("phone")).sendKeys("3476353125");
		dr.findElement(By.id("username")).sendKeys("kanaussenov@gmail.com");
		dr.findElement(By.name("adress1")).sendKeys("123 Oak ln");
		dr.findElement(By.name("city")).sendKeys("Brooklyn");
		dr.findElement(By.name("state")).sendKeys("NY");
		dr.findElement(By.name("postalCode")).sendKeys("11235");
		dr.findElement(By.id("email")).sendKeys("kanaussenov@gmail.com");
		dr.findElement(By.name("passsword")).sendKeys("kanat29");
		dr.findElement(By.name("confirmPassword")).sendKeys("kanat29");
		dr.findElement(By.name("register")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
}
