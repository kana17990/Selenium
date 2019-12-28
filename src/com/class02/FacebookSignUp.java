package com.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sun.org.apache.bcel.internal.generic.Select;

public class FacebookSignUp {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/assel/eclipse-workspace/Selenium/drivers/chromedriver");		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.findElement(By.xpath("//input[starts-with(@name,'first')]")).sendKeys("Kanat");
		driver.findElement(By.xpath("//input[starts-with(@name,'last')]")).sendKeys("Ussenov");
		driver.findElement(By.xpath("//input[@name='reg_email_']")).sendKeys("kanaussenov@yahoo.com");
		driver.findElement(By.xpath("//input[@name='reg_email_confirmation_']")).sendKeys("kanaussenov@yahoo.com");
		driver.findElement(By.xpath("//input[@name='reg_passwd_']")).sendKeys("kanat29");
		
		WebElement monthDd=driver.findElement(By.id("month"));
		Select month = new Select(monthDd);
		month.selectByVisibleText("December");
		WebElement dayDd=driver.findElement(By.id("day"));
		Select day=new Select(dayDd);
		
				
		
		
	}

	private static Select new Select(WebElement dayDd) {
		// TODO Auto-generated method stub
		return null;
	}

}
