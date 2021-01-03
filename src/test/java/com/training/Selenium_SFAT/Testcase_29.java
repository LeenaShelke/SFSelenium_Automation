package com.training.Selenium_SFAT;

import org.openqa.selenium.By;

public class Testcase_29 extends setUtility {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		launchBrowser();
		gotoSalesforceURL();
		gotoLoginSF();
		waitExplicitly1(driver,driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")));
		driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();
		handleLightenningwindow();
	
		driver.findElement(By.xpath("//a[contains(text(),'Joshi')]")).click();
		Thread.sleep(3000);
		System.out.println("Test Pass");
	
	}

}
