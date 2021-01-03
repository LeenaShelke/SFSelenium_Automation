package com.training.Selenium_SFAT;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class Testcase_23 extends setUtility {

	
		public static void main(String[] args) throws Exception {
			// TODO Auto-generated method stub
			launchBrowser();
			gotoSalesforceURL();
			gotoLoginSF();
			waitExplicitly1(driver,driver.findElement(By.xpath("//a[contains(text(),'Leads')]")));
			driver.findElement(By.xpath("//a[contains(text(),'Leads')]")).click();
			handleLightenningwindow();
			validateTodaysLeads();
		//	logoutSF();
			quitBrowser();
			
		}
	public static void validateTodaysLeads() throws InterruptedException {
		waitExplicitly(driver,driver.findElement(By.xpath("//select[@id='fcf']")));
		Select se = new Select(driver.findElement(By.xpath("//select[@id='fcf']")));
		se.selectByVisibleText("Today's Leads");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@value=' Go! ']")).click();
		Thread.sleep(4000);
		System.out.println("Test Pass: Todays Leads displayed");
	}
	//Today's Leads

}
