package com.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC1 {
	public static final String 	URL="http://166.62.36.207/humanresources/symfony/web/index.php/auth/login";
	public static void main (String [] args) throws InterruptedException	{
		

	System.setProperty("webdriver.chrome.driver","/Users/assel/eclipse-workspace/Selenium/drivers/chromedriver");
	WebDriver driver = new ChromeDriver();
	driver.get(URL);
	

	
	driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("VaughnEdward");
	driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("VanceEddie@&12");
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	Thread.sleep(2000);
	
	WebElement logo =driver.findElement(By.xpath("//[id=\"branding\"]/a[1]/img"));
	if(logo.isDisplayed()) {
		System.out.println("Syntax logo is placed");
	}
	Thread.sleep(2000);driver.close();
	
	
	
	
	
	
	
	
}
}