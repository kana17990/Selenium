package com.class05;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import com.utils.CommonMethods;

public class Task1 extends CommonMethods{

	public static final String SYNTAX_PRACTICE_URL= "http://jiravm.centralus.cloudapp.azure.com:8081/index.html";
	public static void main(String[] args) throws InterruptedException {
	CommonMethods.setUp("chrome",SYNTAX_PRACTICE_URL);
	
	Thread.sleep(2000);
    
    driver.findElement(By.xpath("//a@href='#' and text ()=Alerts&Modals']")).click();
    //finding Jacascript Alerts and clicking on it
    driver.findElement(By.linkText("Javascript Alerts")).click();
    //finding the button and click on it
    driver.findElement(By.xpath("//button@onclick='myAlertFunction()']")).click();
    //get the text from the UI or main window
    Alert alert=driver.switchTo().alert();
    Thread.sleep(3000);
    System.out.println("Alert text: "+alert.getText());
    alert.accept();
    Thread.sleep(2000);
    String text=driver.findElement(By.xpath("//p[text()='Click the button to display an alert box']")).getText();
    System.out.println(text);
    
}
	
}
