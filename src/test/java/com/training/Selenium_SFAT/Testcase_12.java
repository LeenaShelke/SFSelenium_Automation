package com.training.Selenium_SFAT;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class Testcase_12 extends setUtility{

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		launchBrowser();
		gotoSalesforceURL();
		gotoLoginSF();
		waitExplicitly1(driver,driver.findElement(By.xpath("//a[contains(text(),'Accounts')]")));
		driver.findElement(By.xpath("//a[contains(text(),'Accounts')]")).click();
		handleLightenningwindow();
	
		editView();
		quitBrowser();
	}
	public static void editView() throws Exception{
		waitExplicitly1(driver,driver.findElement(By.xpath("//select[@id='fcf']")));
		Select se = new Select(driver.findElement(By.xpath("//select[@id='fcf']")));
		se.selectByVisibleText("Aviation1");
		driver.findElement(By.linkText("Edit")).click();
		waitExplicitly1(driver,driver.findElement(By.xpath("//input[@id='fname']")));
		driver.findElement(By.xpath("//input[@id='fname']")).sendKeys("Aviation2");
		driver.findElement(By.xpath("//input[@id='devname']")).click();
		Select se1 = new Select(driver.findElement(By.xpath("//select[@id='fcol1']")));
		se1.selectByVisibleText("Account Name");
		Select se2 = new Select(driver.findElement(By.xpath("//select[@id='fop1']")));
		se2.selectByVisibleText("contains");
		waitExplicitly1(driver,driver.findElement(By.xpath("//input[@id='fval1']")));
		driver.findElement(By.xpath("//input[@id='fval1']")).sendKeys("a");
		driver.findElement(By.xpath("//input[@value=' Save ']")).click();
		Thread.sleep(5000);
		System.out.println("Test Pass:View is Edited");
	}

}
