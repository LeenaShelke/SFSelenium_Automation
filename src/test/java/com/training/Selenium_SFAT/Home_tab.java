package com.training.Selenium_SFAT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Home_tab extends setUtility {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		launchBrowser();
		gotoSalesforceURL(); 
		gotoLoginSF();
		gotoHometab();
		Thread.sleep(6000);
		driver.findElement(By.xpath("//p[contains(text(),'Lightning Experience is the next generation of Salesforce.')]"));
		driver.findElement(By.xpath("//a[@id='tryLexDialogX']")).click();
		//driver.switchTo().frame(driver.findElement(By.id("mce_0_ifr")));
		//span[normalize-space()='Post']
//		Thread.sleep(3000);
//		waitExplicitly(driver,driver.findElement(By.xpath("span[normalize-space()='Post']")));
//		driver.findElement(By.xpath("span[normalize-space()='Post']")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//span[normalize-space()='Post']")).sendKeys("hello world");
//		waitExplicitly(driver,driver.findElement(By.xpath("//input[@id='publishersharebutton']")));
//		driver.findElement(By.xpath("//input[@id='publishersharebutton']")).click();
		editProfileAbout();
	}
	public static void editProfileAbout() throws Exception{
		WebElement username=driver.findElement(By.xpath("//a[contains(text(),'Leena sh')]"));
		clickObj(username,"Leena Sh");
		//img[@title='Edit Profile']
		WebElement useredit= driver.findElement(By.xpath("//img[@title='Edit Profile']"));
		clickObj(useredit,"Edit Profile");
		Thread.sleep(3000);
		int size = driver.findElements(By.tagName("iframe")).size();
		System.out.println(size);
		driver.switchTo().frame(2);
		//driver.switchTo().frame(driver.findElement(By.id("//iframe[@id='contactInfoContentId']")));
		//System.out.println(driver.findElement(By.xpath("//body[@data-id='mce_0']/p")).getText());
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(text(),'Contact')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='cell']")).clear();
		driver.findElement(By.xpath("//input[@id='cell']")).sendKeys("4086789404");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='city']")).clear();
		driver.findElement(By.xpath("//input[@id='city']")).sendKeys("Sanjose");
		Thread.sleep(2000);
		System.out.println("Clicked on About tab");
		driver.findElement(By.xpath("//a[contains(text(),'About')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='lastName']")).clear();
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("sh1");
		driver.findElement(By.xpath("//input[@value='Save All']")).click();
		driver.switchTo().defaultContent();
		System.out.println("Username information is updated");
		System.out.println(driver.findElement(By.xpath("//span[@id='userNavLabel']")).getText());
		
	}
}
