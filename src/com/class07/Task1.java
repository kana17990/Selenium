package com.class07;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.utils.CommonMethods;
import com.utils.Constants;
public class Task1 extends CommonMethods {
	/* 
	* TC 1: Verify element is present
	* 1.Open chrome browser
	*2.Go to “https://the-internet.herokuapp.com/”
	*Click on “Click on the “Dynamic Loading” link
	*Click on “Example 1...” and click on “Start”
	*Verify element with text “Hello World!” is displayed
	*Close the browser
	*/
	public static void main(String[] args)throws InterruptedException {
setUp("chrome", "https://the-internet.herokuapp.com//");

driver.findElement(By.linkText("Dynamic Loading")).click();
driver.findElement(By.linkText("Example 1")).click();
driver.findElement(By.xpath("//button[text()=Start']")).click();

WebDriverWait wait = new WebDriverWait(driver,30);
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h4[text()='Hello World!']")));
boolean isDisplayed=driver.findElement(By.xpath("//h4[text]()='Hello World!']")).isDisplayed();

if(isDisplayed) {
	System.out.println("Text displayed.Test case passed");
}
else {
	System.out.println("Text is not displayed.Test case failed");
}	
	Thread.sleep(2000);	
	driver.quit();
	}

	
	}
	
	
	
	
	
	
	

