package com.training.Selenium_SFAT;

import org.openqa.selenium.By;

public class username_1 extends setUtility{

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		launchBrowser();
		gotoSalesforceURL();
		gotoLoginSF();
		waitExplicitly(10,driver.findElement(By.xpath("//div[@id='userNav']")));
		driver.findElement(By.xpath("//div[@id='userNav']")).click(); //Clicking on username will drop the list
	
	//	driver.findElement(By.xpath("//a[@title='Logout']")).click(); //it will logout from salesforce application
	//	waitExplicitly(10,driver.findElement(By.xpath("//a[@title='My Profile']")));
	//	driver.findElement(By.xpath("//a[@title='My Profile']")).click(); //My profile page will display
	//	waitExplicitly(10,driver.findElement(By.xpath("//a[@title='My Settings']")));
	//	driver.findElement(By.xpath("//a[@title='My Settings']")).click();// My settings page will display
		
	//	waitExplicitly(10,driver.findElement(By.xpath("//a[@title='Developer Console (New Window)']")));
	//	driver.findElement(By.xpath("//a[@title='Developer Console (New Window)']")).click(); // Developer log window will display
		waitExplicitly(10,driver.findElement(By.xpath("//a[contains(text(),'Switch to Lightning Experience')][1]")));
		driver.findElement(By.xpath("//a[contains(text(),'Switch to Lightning Experience')][1]")).click();  //Personal information is displayed
	}

}
