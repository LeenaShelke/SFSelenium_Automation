package com.training.Selenium_SFAT;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class Testcase_10 extends setUtility {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		launchBrowser();
		gotoSalesforceURL();
		gotoLoginSF();
		waitExplicitly1(driver,driver.findElement(By.xpath("//a[contains(text(),'Accounts')]")));
		driver.findElement(By.xpath("//a[contains(text(),'Accounts')]")).click();
		handleLightenningwindow();
		createAccount();
		quitBrowser();
	}
	public static void createAccount() throws Exception
	{
		driver.findElement(By.xpath("//tbody/tr[1]/td[2]/input[1]")).click();
		driver.findElement(By.xpath("//input[@id='acc2']")).clear();
		driver.findElement(By.xpath("//input[@id='acc2']")).sendKeys("Vibha");
		Thread.sleep(2000);
		Select se = new Select(driver.findElement(By.xpath("//select[@id='acc6']")));
		se.selectByVisibleText("Technology Partner");
		Select se1 = new Select(driver.findElement(By.xpath("//select[@id='00N4x000005QUU5']")));
		se1.selectByVisibleText("High");
		
		waitExplicitly1(driver,driver.findElement(By.xpath("//input[@value=' Save ']")));
		driver.findElement(By.xpath("//input[@value=' Save ']")).click();
		Thread.sleep(3000);
		System.out.println("Test Pass: Vibha Account Created");
		
	}
}
