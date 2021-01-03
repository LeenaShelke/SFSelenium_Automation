package com.training.Selenium_SFAT;

import org.openqa.selenium.By;

public class TestCase9 extends setUtility{

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		launchBrowser();
		gotoSalesforceURL();
		gotoLoginSF();
		waitExplicitly(10,driver.findElement(By.xpath("//div[@id='userNav']")));
		driver.findElement(By.xpath("//div[@id='userNav']")).click(); //Clicking on username will drop the list
	
		driver.findElement(By.xpath("//a[@title='Logout']")).click(); //it will logout from salesforce application
		System.out.println("Test Pass : Logout from Application");
		quitBrowser();
	}

}
