package com.training.Selenium_SFAT;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

public class Testcase_4A extends setUtility{

	public static void main(String[] args) throws InterruptedException {
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
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("coco@abc.com");
		waitExplicitly1(driver,driver.findElement(By.xpath("//a[@id='forgot_password_link']")));
		driver.findElement(By.xpath("//a[@id='forgot_password_link']")).click();
		waitExplicitly1(driver,driver.findElement(By.xpath("//input[@id='continue']")));
		driver.findElement(By.xpath("//input[@id='un']")).sendKeys("coco@abc.com");
		System.out.println("EmailID coco@abc.com is displayed to reset password");
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		String str=driver.findElement(By.xpath("//p[contains(text(),'We’ve sent you an email with a link to finish rese')]")).getText();
		System.out.println("Test Passed\n" +str);
		quitBrowser();
	}

}
