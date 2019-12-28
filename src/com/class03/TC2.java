package com.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC2 {
	public static final String 	URL="http://166.62.36.207/humanresources/symfony/web/index.php/auth/login";
	public static void main (String [] args, WebElement error) throws InterruptedException	{
		

	System.setProperty("webdriver.chrome.driver","/Users/assel/eclipse-workspace/Selenium/drivers/chromedriver");
	WebDriver driver = new ChromeDriver();
	driver.get(URL);
	
	
	driver.findElement(By.xpath("//*[@id=\"txtUsername\"]")).sendKeys("VaughnEdward");
	driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys(" ");
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	
	if(error.isDisplayed()) {
		String message=error.getText();
		if(message.equals("Password cannot be empty")) {
			System.out.println("correct error message displayed");
		}else {
			System.out.println("incorrect message is displayed");
		}
	}
		
	}
}
