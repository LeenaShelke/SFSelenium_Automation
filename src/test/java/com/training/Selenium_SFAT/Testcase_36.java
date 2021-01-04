package com.training.Selenium_SFAT;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Testcase_36 extends setUtility {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		launchBrowser();
		gotoSalesforceURL(); 
		gotoLoginSF();
		gotoHometab();
		handleLightenningwindow();
		waitExplicitly1(driver,driver.findElement(By.xpath("//a[@href='/00U/c?md3=3&md0=2021']")));
		driver.findElement(By.xpath("//a[@href='/00U/c?md3=3&md0=2021']")).click();
		waitExplicitly1(driver,driver.findElement(By.linkText("8:00 PM")));
		driver.findElement(By.linkText("8:00 PM")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//tbody/tr[2]/td[2]/div[1]/a[1]/img[1]")).click();
		ArrayList<String> windows = new ArrayList<String>(driver.getWindowHandles());
		System.out.println(windows.size());
		driver.switchTo().window(windows.get(1));
		driver.findElement(By.xpath("//a[contains(text(),'Other')]")).click();
	
		Thread.sleep(3000);
	
		driver.switchTo().window(windows.get(0));
		
	
		WebElement Intractions = driver.findElement(By.xpath("//input[@id='EndDateTime_time']"));
	   // mouseOver(driver, Intractions);
	    clickObj(Intractions,"9:00 PM");
	 
	    waitExplicitly1(driver,driver.findElement(By.xpath("//input[@class='btn']")));
		driver.findElement(By.xpath("//input[@class='btn']")).click();//Save button
	
		Thread.sleep(6000);
		quitBrowser();
	}

}
