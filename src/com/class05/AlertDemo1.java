package com.class05;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import com.utils.CommonMethods;

public class AlertDemo1 extends CommonMethods{

	public static final String SYNTAX_PRACTICE_URL="http://166.62.36.207/syntaxpractice/index.html";
	
	public static void main(String[] args) throws InterruptedException {
	
	//The method is openning Syntax Practice website using chrome browser	
	CommonMethods.setUp("chrome",SYNTAX_PRACTICE_URL);	
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[@href='#' and text()='Alerts & Modals']")).click();
	//finding JavaScript alerts and clicking on it
	driver.findElement(By.linkText("Javascript Alerts")).click();
	
	//finding the button and click on it
	driver.findElement(By.xpath("//button[@onclick='myAlertFunction()']")).click();
	Thread.sleep(2000);
	
	Alert alert = driver.switchTo().alert();
	Thread.sleep(2000);
	
	//get the text from alert box . before you hand the alert
	
	System.out.println("Alert text: "+alert.getText());
	
	//get the text from ui or main window
	String text = driver.findElement(By.xpath("//p[text()='Click the button to display an alert box:']")).getText();
	System.out.println(text);
	
	
	
}
}