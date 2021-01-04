package com.training.Selenium_SFAT;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class Testcase_35 extends setUtility{

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		launchBrowser();
		gotoSalesforceURL(); 
		gotoLoginSF();
		//Thread.sleep(4000);
		waitExplicitly1(driver,driver.findElement(By.xpath("//img[@alt='All Tabs']")));
		driver.findElement(By.xpath("//img[@alt='All Tabs']")).click();
		Thread.sleep(4000);
		waitExplicitly1(driver,driver.findElement(By.className("btnImportant")));
		driver.findElement(By.className("btnImportant")).click();
		Thread.sleep(4000);
		Select se= new Select(driver.findElement(By.xpath("//select[@id='duel_select_1']")));
		se.selectByVisibleText("Libraries");
		waitExplicitly1(driver,driver.findElement(By.xpath("//div[@class='zen-mbs text']/following-sibling::div")));
		driver.findElement(By.xpath("//div[@class='zen-mbs text']/following-sibling::div")).click();
		waitExplicitly1(driver,driver.findElement(By.xpath("//input[@class='btn primary']")));
		driver.findElement(By.xpath("//input[@class='btn primary']")).click();
		logoutSF();
		quitBrowser();
		System.out.println("Test Pass");
	}

}
