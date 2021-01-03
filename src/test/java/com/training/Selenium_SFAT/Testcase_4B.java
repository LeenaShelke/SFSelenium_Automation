package com.training.Selenium_SFAT;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

public class Testcase_4B extends setUtility {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//div[@id='error']
		launchBrowser();
		gotoSalesforceURL();
		waitExplicitly(5,driver.findElement(By.xpath("//div[@class='dropdown']")));
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//div[@class='dropdown']"))).build().perform();
		waitExplicitly(5,driver.findElement(By.xpath("//h2[@id='login']")));
		driver.findElement(By.xpath("//h2[@id='login']")).click();
		//driver.findElement(By.xpath("//input[@id='username']")).clear();
		Thread.sleep(3000);
		//waitExplicitly(10,driver.findElement(By.xpath("//input[@id='username']")));
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("123");
		
		driver.findElement(By.xpath("//input[@class='input r4 wide mb16 mt8 password']")).clear();
			
		driver.findElement(By.xpath("//input[@class='input r4 wide mb16 mt8 password']")).sendKeys("22131 ");
				
		driver.findElement(By.xpath("//input[@class='button r4 wide primary']")).click();
		waitExplicitly1(driver,driver.findElement(By.xpath("//div[@id='error']")));
		String errMsg=driver.findElement(By.xpath("//div[@id='error']")).getText();
		System.out.println("Test passed "+errMsg);
		quitBrowser();
	}

}
