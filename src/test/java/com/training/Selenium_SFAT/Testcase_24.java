package com.training.Selenium_SFAT;

import org.openqa.selenium.By;

public class Testcase_24 extends setUtility {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		launchBrowser();
		gotoSalesforceURL();
		gotoLoginSF();
		waitExplicitly1(driver,driver.findElement(By.xpath("//a[contains(text(),'Leads')]")));
		driver.findElement(By.xpath("//a[contains(text(),'Leads')]")).click();
		handleLightenningwindow();
		createNewView();
	//	logoutSF();
		quitBrowser();
		
	}
	
public static void createNewView() throws Exception {
	waitExplicitly1(driver,driver.findElement(By.xpath("//input[@value=' New ']")));
	driver.findElement(By.xpath("//input[@value=' New ']")).click();
	waitExplicitly1(driver,driver.findElement(By.xpath("//input[@id='name_lastlea2']")));
	driver.findElement(By.xpath("//input[@id='name_lastlea2']")).sendKeys("ABCD");
	waitExplicitly1(driver,driver.findElement(By.xpath("//input[@id='lea3']")));
	driver.findElement(By.xpath("//input[@id='lea3']")).sendKeys("ABCD");
	driver.findElement(By.xpath("//input[@value=' Save ']")).click();
	Thread.sleep(3000);
	System.out.println("Test Pass: New Lead is created");
}
}
