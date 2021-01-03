package com.training.Selenium_SFAT;

import org.openqa.selenium.By;

public class Testcase_18 extends setUtility{

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		launchBrowser();
		gotoSalesforceURL();
		gotoLoginSF();
		waitExplicitly1(driver,driver.findElement(By.linkText("Opportunities")));
		driver.findElement(By.linkText("Opportunities")).click();
		handleLightenningwindow();
	//	Thread.sleep(6000);
		waitExplicitly1(driver,driver.findElement(By.xpath("//a[contains(text(),'Stuck Opportunities')]")));
		driver.findElement(By.xpath("//a[contains(text(),'Stuck Opportunities')]")).click();
		System.out.println("Test Pass : Report page is displayed");
		quitBrowser();
	}

}
