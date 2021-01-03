package com.training.Selenium_SFAT;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Testcase_3 extends setUtility {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		launchBrowser();
		gotoSalesforceURL();
		waitExplicitly(5,driver.findElement(By.xpath("//div[@class='dropdown']")));
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//div[@class='dropdown']"))).build().perform();
		waitExplicitly(5,driver.findElement(By.xpath("//h2[@id='login']")));
		driver.findElement(By.xpath("//h2[@id='login']")).click();
		Thread.sleep(2000);
		waitExplicitly1(driver,driver.findElement(By.xpath("//input[@id='username']")));
		
		//waitExplicitly(10,driver.findElement(By.xpath("//input[@id='username']")));
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("coco@abc.com");
		
		driver.findElement(By.xpath("//input[@class='input r4 wide mb16 mt8 password']")).clear();
		driver.findElement(By.xpath("//input[@class='input r4 wide mb16 mt8 password']")).sendKeys("rohini123");
		driver.findElement(By.xpath("//input[@id='rememberUn']")).isSelected();
		driver.findElement(By.xpath("//input[@id='rememberUn']")).click();	
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@class='button r4 wide primary']")).click();
	
		logoutSF();
		Thread.sleep(3000);
		waitExplicitly1(driver,driver.findElement(By.xpath("//span[@id='idcard-identity']")));
		String usernm=driver.findElement(By.xpath("//span[@id='idcard-identity']")).getText();
		System.out.println("Test Passed displaying username " +usernm);
		quitBrowser();
	}

}
