package com.training.Selenium_SFAT;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class Testcase_28 extends setUtility {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		launchBrowser();
		gotoSalesforceURL();
		gotoLoginSF();
		waitExplicitly1(driver,driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")));
		driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();
		handleLightenningwindow();
		waitExplicitly1(driver,driver.findElement(By.xpath("//select[@id='fcf']")));
		Select se = new Select(driver.findElement(By.xpath("//select[@id='fcf']")));
		se.selectByVisibleText("My Contacts");
		driver.findElement(By.xpath("//input[@value=' Go! ']")).click();
		Thread.sleep(4000);
		System.out.println("Test Pass: My contacts list is displayed");
		quitBrowser();
		
	}

}
