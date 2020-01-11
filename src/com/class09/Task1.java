package com.class09;

import org.openqa.selenium.By;

import com.utils.CommonMethods;
import com.utils.Constants;

public class Task1 extends CommonMethods {

	public static void main(String[] args)throws InterruptedException {
		
		setUp("chrome", Constants.HRMS_URL);
		// login into HRMS
		String userName = "Admin";
		String password = "Hum@nhrm123";
		driver.findElement(By.id("txtUsername")).sendKeys(userName);
		driver.findElement(By.id("txtPassword")).sendKeys(password);
		driver.findElement(By.id("btnLogin")).click();		
		
		
		
		
		
		
	}
}
