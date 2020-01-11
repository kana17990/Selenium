package com.class10;
/*TC 1: HRMS Login

/* Navigate to “http://166.62.36.207/humanresources/symfony/web/index.php/auth”

/*Login to the application by writing xpath based on “parent and child relation”

*/

import org.openqa.selenium.By;

import com.utils.CommonMethods;
import com.utils.Constants;

public class ParentToChildRelation extends CommonMethods {

public static void main(String[] args)throws InterruptedException {
	
	setUp("chrome", Constants.HRMS_URL);

	driver.findElement(By.xpath("//div[@id='divUsername']/input")).sendKeys("Admin");
	driver.findElement(By.xpath("//span[text()='Password']/preceding-sibling::input")).sendKeys("Hum@nhrm123");

	driver.findElement(By.xpath("//div[@id='divLoginButton']/input")).click();
	Thread.sleep(2000);
	driver.close();
	
	
	
	
	
	
	
	
	
}	
}
