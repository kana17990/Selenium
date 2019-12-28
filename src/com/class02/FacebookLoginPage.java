package com.class02;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLoginPage {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "/Users/assel/eclipse-workspace/Selenium/drivers/chromedriver");

		WebDriver driver=new ChromeDriver();

		driver.get("https://www.facebook.com/");

		driver.findElement(By.id("email")).sendKeys("kanaussenov@yahoo.com");
		driver.findElement(By.id("pass")).sendKeys("kana17990");
		driver.findElement(By.id("u_0_b")).click();

		driver.close();
	}

}

