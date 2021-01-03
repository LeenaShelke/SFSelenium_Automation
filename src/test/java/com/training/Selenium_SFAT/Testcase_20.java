package com.training.Selenium_SFAT;

import org.openqa.selenium.By;

public class Testcase_20 extends setUtility {
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		launchBrowser();
		gotoSalesforceURL();
		gotoLoginSF();
		waitExplicitly1(driver,driver.findElement(By.xpath("//a[contains(text(),'Leads')]")));
		driver.findElement(By.xpath("//a[contains(text(),'Leads')]")).click();
		handleLightenningwindow();
		logoutSF();
		quitBrowser();
		System.out.println("Test Pass: Leads Tab page is displayed");
	}
	
		
	

}
