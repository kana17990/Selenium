package com.class05;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.utils.CommonMethods;

public class DropDownRecap extends CommonMethods{

	public static final String SYNTAX_PRACTICE_URL="http://166.62.36.207/syntaxpractice/index.html";
	
	public static void main(String[] args) throws InterruptedException {
	
	//The method is openning Syntax Practice website using chrome browser	
	CommonMethods.setUp("chrome",SYNTAX_PRACTICE_URL);	
	
	//find the element input form and click on it
	driver.findElement(By.linkText("Input Forms")).click();
	Thread.sleep(2000);
	//find the element select dropdown list and click on it
    driver.findElement(By.linkText("Select Dropdown List")).click();
	
    WebElement dd = driver.findElement(By.id("select-demo"));
    
    //to work with dd, if the tagname starts with select ,then we have to create a class
    Select select = new Select(dd);
    //select 3 index
    select.selectByIndex(3);
    select.selectByVisibleText("Friday");
    //selecting an item from dd using value attribute
    select.selectByValue("Sunday");
    
    //how to get the count of dropdown items
    List<WebElement>options=select.getOptions();
    //this will give the number of items presents in dd
    System.out.println(options.size());
    
    //storing the list of option in iterator so we can loop through
    Iterator <WebElement> it=options.iterator();
    while(it.hasNext()) {
    	it.next().click();
    	Thread.sleep(2000);
    }
    
    
    
    
    
    
    
    
    
    

	}

}
