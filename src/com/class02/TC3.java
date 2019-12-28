package com.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC3 {

	public static void main(String[] args) throws Exception {
		
System.setProperty("webdriver.chrome.driver", "/Users/assel/eclipse-workspace/Selenium/drivers/chromedriver");	

WebDriver driver=new ChromeDriver();

driver.findElement(By.xpath("//input[contains(type,'mail')]")).sendKeys("test@gmail.com");;
Thread.sleep(2000);
driver.findElement(By.xpath("//input[starts-with(@data-testid,'royal_pa')]")).sendKeys("test12");
Thread.sleep(2000);
driver.findElement(By.xpath("//a[contains(text(),account?']")).click();


Thread.sleep(2000);
driver.navigate().back();
Thread.sleep(2000);
driver.findElement(By.xpath("//input[starts-with(@data-testid,'royal_pa')]")).sendKeys("test123");;
driver.findElement(By.xpath("//input[starts-with(@value,'Log')]")).click();
driver.close();


	}

}
