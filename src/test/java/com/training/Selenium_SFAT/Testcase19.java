package com.training.Selenium_SFAT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Testcase19 extends setUtility{

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		launchBrowser();
		gotoSalesforceURL();
		gotoLoginSF();
		waitExplicitly1(driver,driver.findElement(By.linkText("Opportunities")));
		driver.findElement(By.linkText("Opportunities")).click();
		handleLightenningwindow();
	
		
		System.out.println("Test Pass : Report page is displayed");
		runCurrentNextAll();
		runCurrentAll();
		driver.navigate().back();	
		runCurrentOpen();
//		Thread.sleep(3000);
//		driver.navigate().back();
//		Thread.sleep(3000);
//		runCurrentClose();
//		driver.navigate().back();
//		Thread.sleep(3000);
		
		quitBrowser();
	}

	public static void runCurrentAll() throws Exception{
		waitExplicitly1(driver,driver.findElement(By.xpath("//select[@id='quarter_q']")));
		Select se = new Select(driver.findElement(By.xpath("//select[@id='quarter_q']"))); 
		se.selectByVisibleText("Current FQ");
		Thread.sleep(6000);
		Select se1 = new Select(driver.findElement(By.xpath("//select[@id='open']")));
	//	se1.selectByIndex(1);
		se1.selectByVisibleText("All Opportunities");
	//	Thread.sleep(7000);
		waitExplicitly1(driver,driver.findElement(By.xpath("//input[@value='Run Report']")));
		driver.findElement(By.xpath("//input[@value='Run Report']")).click();
		System.out.println("Test Pass : Report run for Current FQ and All Opp");
		
	}
	public static void runCurrentOpen() throws Exception{
		
		waitExplicitly1(driver,driver.findElement(By.xpath("//select[@id='quarter_q']")));
		Select se = new Select(driver.findElement(By.xpath("//select[@id='quarter_q']"))); 
		se.selectByVisibleText("Current FQ");
		
		Select se1 = new Select(driver.findElement(By.xpath("//select[@id='open']")));
		se1.selectByVisibleText("Open Opportunities");
		Thread.sleep(5000);
		waitExplicitly1(driver,driver.findElement(By.xpath("//input[@value='Run Report']")));
		driver.findElement(By.xpath("//input[@value='Run Report']")).click();
		System.out.println("Test Pass : Report run for Current FQ and Open Opp");
		Thread.sleep(3000);
	}
	public static void runCurrentClose() throws Exception{
		waitExplicitly1(driver,driver.findElement(By.xpath("//select[@id='quarter_q']")));
		Select se = new Select(driver.findElement(By.xpath("//select[@id='quarter_q']"))); 
		se.selectByVisibleText("Current FQ");
		Select se1 = new Select(driver.findElement(By.xpath("//select[@id='open']")));
		se1.selectByVisibleText("Closed Opportunities");
		waitExplicitly1(driver,driver.findElement(By.xpath("//input[@value='Run Report']")));
		driver.findElement(By.xpath("//input[@value='Run Report']")).click();
		System.out.println("Test Pass : Report run for Current FQ and All Opp");
		Thread.sleep(3000);
	}
public static void runCurrentNextAll() throws Exception{
		
		waitExplicitly1(driver,driver.findElement(By.xpath("//select[@id='quarter_q']")));
		Select se = new Select(driver.findElement(By.xpath("//select[@id='quarter_q']"))); 
		se.selectByVisibleText("Current and Next FQ");
		
		Select se1 = new Select(driver.findElement(By.xpath("//select[@id='open']")));
		se1.selectByVisibleText("All Opportunities");
		Thread.sleep(5000);
		waitExplicitly1(driver,driver.findElement(By.xpath("//input[@value='Run Report']")));
		driver.findElement(By.xpath("//input[@value='Run Report']")).click();
		System.out.println("Test Pass : Report run for Current and Next FQ for all Opp");
		Thread.sleep(3000);
	}
	
}
