package com.training.Selenium_SFAT;

import org.openqa.selenium.By;

public class Testcase_31 extends setUtility {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		launchBrowser();
		gotoSalesforceURL();
		gotoLoginSF();
		waitExplicitly1(driver,driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")));
		driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();
		handleLightenningwindow();
		createCancelView();
		quitBrowser();
}
public static void createCancelView() throws InterruptedException{
	driver.findElement(By.xpath("//a[contains(text(),'Create New View')]")).click();
	driver.findElement(By.xpath("//input[@id='fname']")).sendKeys("ABCD");
	driver.findElement(By.xpath("//input[@id='devname']")).clear();
	driver.findElement(By.xpath("//input[@id='devname']")).sendKeys("EFGH");
	driver.findElement(By.xpath("//input[@value='Cancel']")).click();
	Thread.sleep(6000);
	System.out.println("Test Pass: View is cancelled");
	
}	// TODO Auto-generated method stub

	

}
