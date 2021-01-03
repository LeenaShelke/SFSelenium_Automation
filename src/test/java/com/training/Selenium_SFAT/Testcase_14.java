package com.training.Selenium_SFAT;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class Testcase_14 extends setUtility {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		launchBrowser();
		gotoSalesforceURL();
		gotoLoginSF();
		gotoAccountsTab();
		handleLightenningwindow();
		gnerateReports();	
		quitBrowser();
	}
	public static void gnerateReports() throws Exception{
		waitExplicitly1(driver,driver.findElement(By.xpath("//a[contains(text(),'Accounts with last activity > 30 days')]")));
		driver.findElement(By.xpath("//a[contains(text(),'Accounts with last activity > 30 days')]")).click();
	//	waitExplicitly1(driver,driver.findElement(By.xpath("//img[@id='ext-gen152']")));
		
		driver.findElement(By.xpath("//img[@id='ext-gen152']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//button[contains(text(),'Today')])[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//img[@id='ext-gen154']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//button[contains(text(),'Today')])[2]")).click();
		Thread.sleep(3000);
	
		driver.findElement(By.xpath("//input[@id='duration-ext-gen17']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[contains(text(),'All Time')]")).click();
		driver.findElement(By.xpath("//button[@id='ext-gen49']")).click();
	//	Alert al = driver.switchTo().alert();
		waitExplicitly1(driver,driver.findElement(By.xpath("//input[@id='saveReportDlg_reportNameField']")));
		driver.findElement(By.xpath("//input[@id='saveReportDlg_reportNameField']")).sendKeys("accts2");
		waitExplicitly1(driver,driver.findElement(By.xpath("//input[@id='saveReportDlg_DeveloperName']")));
		driver.findElement(By.xpath("//input[@id='saveReportDlg_DeveloperName']")).click();
		Thread.sleep(4000);
		waitExplicitly1(driver,driver.findElement(By.xpath("//button[contains(text(),'Save and Run Report')]")));
		driver.findElement(By.xpath("//button[contains(text(),'Save and Run Report')]")).click();
		//driver.findElement(By.xpath("//button[text()='Save and Run Report']")).click();
		Thread.sleep(3000);
		String str =driver.findElement(By.xpath("//h1[contains(text(),'accts')]")).getText();
		System.out.println("Test Pass : Report is generated with name "+str);
	}
	
}