package com.training.Selenium_SFAT;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class Testcase_22 extends setUtility{

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		launchBrowser();
		gotoSalesforceURL();
		gotoLoginSF();
		waitExplicitly1(driver,driver.findElement(By.xpath("//a[contains(text(),'Leads')]")));
		driver.findElement(By.xpath("//a[contains(text(),'Leads')]")).click();
		handleLightenningwindow();
		validateUnreadLeads();
		logoutSF();
		gotoLoginSF1();
		waitExplicitly1(driver,driver.findElement(By.xpath("//a[contains(text(),'Leads')]")));
		driver.findElement(By.xpath("//a[contains(text(),'Leads')]")).click();
		//handleLightenningwindow();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@value=' Go! ']")).click();
		Thread.sleep(4000);
		System.out.println("Test Pass");
		quitBrowser();
//		
	}
public static void validateUnreadLeads() throws InterruptedException {
	waitExplicitly(driver,driver.findElement(By.xpath("//select[@id='fcf']")));
	Select se = new Select(driver.findElement(By.xpath("//select[@id='fcf']")));
	se.selectByVisibleText("Today's Leads");
	Thread.sleep(3000);
	//driver.findElement(By.xpath("//input[@value=' Go! ']")).click();
	//Thread.sleep(4000);
	System.out.println("Test Pass: Todays Leads displayed");
	Select se1 = new Select(driver.findElement(By.xpath("//select[@id='hotlist_mode']")));
	se1.selectByVisibleText("My Unread Leads");
	Thread.sleep(4000);
	
}
public static void 	gotoLoginSF1() throws Exception{
	Thread.sleep(4000);
	driver.findElement(By.xpath("//input[@id='username']")).sendKeys("coco@abc.com");
	
	driver.findElement(By.xpath("//input[@class='input r4 wide mb16 mt8 password']")).clear();
		
	driver.findElement(By.xpath("//input[@class='input r4 wide mb16 mt8 password']")).sendKeys("rohini123");
			
	driver.findElement(By.xpath("//input[@class='button r4 wide primary']")).click();
	waitExplicitly(5, driver.findElement(By.xpath("//img[@id='phHeaderLogoImage']")));
}
}
