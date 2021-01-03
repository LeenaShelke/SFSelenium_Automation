package com.training.Selenium_SFAT;

import org.openqa.selenium.By;

public class Testcase_25 extends setUtility{

	public static void main(String[] args) throws Exception {
	
			// TODO Auto-generated method stub
			launchBrowser();
			gotoSalesforceURL();
			gotoLoginSF();
			waitExplicitly1(driver,driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")));
			driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();
			handleLightenningwindow();
			createNewContact();
			quitBrowser();
	}
	public static void createNewContact() throws InterruptedException
	{
		driver.findElement(By.xpath("//input[@value=' New ']")).click();
		waitExplicitly1(driver,driver.findElement(By.xpath("//input[@id='name_lastcon2']")));
		driver.findElement(By.xpath("//input[@id='name_lastcon2']")).sendKeys("Zoya");
		
		driver.findElement(By.xpath("//img[@alt='Account Name Lookup (New Window)']")).click();
		Thread.sleep(4000);
		driver.switchTo().frame(driver.findElement(By.xpath("//frame[@title='Search']")));
		
	//	waitExplicitly1(driver,driver.findElement(By.xpath("//input[@id='con4']")));
		driver.findElement(By.xpath("//input[@id='lksrch']")).sendKeys("Vibha");
		driver.findElement(By.xpath("//input[@value=' Save ']")).click();
		Thread.sleep(4000);
		
	}

}
