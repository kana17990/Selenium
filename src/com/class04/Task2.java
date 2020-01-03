package com.class04;

import org.openqa.selenium.By;

import com.utils.CommonMethods;

public class Task2 extends CommonMethods{

	
	public static final String URL= "https://jiravm.centralus.cloudapp.azure.com:8081/index.html";
	public static void main(String[] args) throws InterruptedException {
		
	/*TC:Syntax demo input boxes count:
	 * 1:Open chrome browser
	 * 2:Go to URL
	 * 3:Click on "Input Forms"link
	 * 4:Click on "Simple Form Demo" links
	 * 5:Get all input boxes from the page
	 * 6:Enter "Hello" to each box
	 * 7:Close browser
	 */
		setUp("chrome",URL);
driver.findElement(By.linkText("Input Forms")).click();
driver.findElement(By.linkText("Simple Form Demo")).click();
driver.findElement(By.id("user-message")).sendKeys("Hello");
driver.findElement(By.id("sum1")).sendKeys("Hello");
driver.findElement(By.id("sum2")).sendKeys("Hello");

Thread.sleep(5000);
driver.quit();




		
	}

}
