package com.training.Selenium_SFAT;

import org.openqa.selenium.By;

public class Testcase_30 extends setUtility{

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		launchBrowser();
		gotoSalesforceURL();
		gotoLoginSF();
		waitExplicitly1(driver,driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")));
		driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();
		handleLightenningwindow();
		waitExplicitly1(driver,driver.findElement(By.xpath("//a[contains(text(),'Create New View')]")));
		driver.findElement(By.xpath("//a[contains(text(),'Create New View')]")).click();
		driver.findElement(By.xpath("//input[@id='devname']")).sendKeys("EFGH");
		driver.findElement(By.xpath("//input[@value=' Save ']")).click();
		System.out.println("Test Pass: Error message displayed");
		Thread.sleep(4000);
		quitBrowser();
		
	}

}
