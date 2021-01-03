package com.training.Selenium_SFAT;

import org.openqa.selenium.By;

public class Testcase_33 extends setUtility {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		launchBrowser();
		gotoSalesforceURL(); 
		gotoLoginSF();
		gotoHometab();
		handleLightenningwindow();
		//quitBrowser();
		driver.findElement(By.xpath("//a[contains(text(),'Leena sh1')]")).click();
		Thread.sleep(5000);
		System.out.println("Test Pass: My settings page is displayed");
		quitBrowser();
	}
      
}
