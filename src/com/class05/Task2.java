package com.class05;

import org.openqa.selenium.By;

import com.utils.CommonMethods;

public class Task2  extends CommonMethods {

	public static final String SYNTAX_PRACTICE_URL = "http://166.62.36.207/syntaxpractice/index.html";

	public static void main(String[] args) throws InterruptedException {

		//The method is opening syntax Practice website using chrome browser
		CommonMethods.setUp("chrome", SYNTAX_PRACTICE_URL);

		driver.findElement(By.linkText("Others")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Iframe")).click();
		Thread.sleep(2000);
		
		driver.switchTo().frame("FrameOne");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Home")).click();
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		driver.switchTo().frame("FrameTwo");
		Thread.sleep(2000);
		boolean logoIsDisplayed=driver.findElement(By.xpath("//img@width='181']")).isDisplayed();
		System.out.println(logoIsDisplayed);
		Thread.sleep(3000);
		
		driver.quit();
	
}
	
}
