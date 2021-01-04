package com.training.Selenium_SFAT;

import org.openqa.selenium.By;

public class Testcase_34 extends setUtility {
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		launchBrowser();
		gotoSalesforceURL(); 
		gotoLoginSF();
		gotoHometab();
		handleLightenningwindow();
		//quitBrowser();
		driver.findElement(By.xpath("//a[contains(text(),'Leena sh1')]")).click();
		editProfile();
		quitBrowser();
	}
	public static void editProfile() throws Exception {
		// TODO Auto-generated method stub
		driver.findElement(By.xpath("//img[@title='Edit Profile']")).click();
		//iframe[@id='contactInfoContentId']
		 int size = driver.findElements(By.tagName("iframe")).size();
	      
			System.out.println(size);
			driver.switchTo().frame(2);
			//driver.switchTo().frame(driver.findElement(By.id("//iframe[@id='contactInfoContentId']")));
			//System.out.println(driver.findElement(By.xpath("//body[@data-id='mce_0']/p")).getText());
			waitExplicitly1(driver,driver.findElement(By.xpath("//a[contains(text(),'About')]")));
			driver.findElement(By.xpath("//a[contains(text(),'About')]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@id='lastName']")).clear();
			driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Abcd");
			driver.findElement(By.xpath("//input[@value='Save All']")).click();
			driver.switchTo().defaultContent();
			System.out.println("Test Pass :Lastname is updated to Abcd");
	}

}
