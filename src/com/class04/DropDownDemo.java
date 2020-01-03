package com.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.utils.CommonMethods;

public class DropDownDemo extends CommonMethods {

public static final String SYNTAX_PRACTICE_URL="http://166.62.36.207/syntaxpractice/index.html";	
	
	public static void main(String[] args, WebElement weekDropDown) throws InterruptedException{
		
		CommonMethods.setUp("chrome",SYNTAX_PRACTICE_URL);
		driver.findElement(By.linkText("Input Forms")).click();
        Thread.sleep(1000);
        driver.findElement(By.linkText("Select Dropdown List")).click();
        WebElement weekDropdDown=driver.findElement(By.id("select-demo"));
        
        //we can use select class only if the DD tag strats with select tag
		Select select =new Select(weekDropDown);
		
		/*we can select values from dd in 3 ways
		 * 1.by index
		 * 2.by visible text
		 * 3.by value attribute and you have to pass the value
		 */
		select.selectByIndex(4);
		Thread.sleep(2000);
		select.selectByVisibleText("Sunday");
		Thread.sleep(2000);
		select.selectByValue("Friday");
		//select.deselectByIndex(4);with single select dd you cant deselect a value
		
		System.out.println("Is this DD Multi Select= "+select.isMultiple());
		System.out.println("****************");
     
		WebElement multiDD=driver.findElement(By.id("multi-select"));
		Select select2=new Select(multiDD);
		
		select2.selectByIndex(2);
		select2.selectByIndex(3);
		select2.selectByIndex(4);
		Thread.sleep(2000);
		select2.deselectByIndex(3);
        
        
	}

}
