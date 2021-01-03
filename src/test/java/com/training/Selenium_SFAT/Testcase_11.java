package com.training.Selenium_SFAT;

import org.openqa.selenium.By;

public class Testcase_11 extends setUtility {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		launchBrowser();
		gotoSalesforceURL();
		gotoLoginSF();
		waitExplicitly1(driver,driver.findElement(By.xpath("//a[contains(text(),'Accounts')]")));
		driver.findElement(By.xpath("//a[contains(text(),'Accounts')]")).click();
		handleLightenningwindow();
		createNewView();
		quitBrowser();
	}
	public static void createNewView() throws Exception{
		waitExplicitly1(driver,driver.findElement(By.xpath("//a[contains(text(),'Create New View')]")));
		driver.findElement(By.xpath("//a[contains(text(),'Create New View')]")).click();
		driver.findElement(By.xpath("//input[@id='fname']")).sendKeys("Aviation");
		waitExplicitly1(driver,driver.findElement(By.xpath("//input[@id='devname']")));
		driver.findElement(By.xpath("//input[@id='devname']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value=' Save ']")).click();
		Thread.sleep(6000);
		System.out.println("Test Pass :Accounts View is created");
	}

}
