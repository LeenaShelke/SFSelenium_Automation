package com.training.Selenium_SFAT;

import org.openqa.selenium.By;

public class Testcase_5 extends setUtility{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		launchBrowser();
		gotoSalesforceURL();
		gotoLoginSF();
		waitExplicitly(10,driver.findElement(By.xpath("//div[@id='userNav']")));
		driver.findElement(By.xpath("//div[@id='userNav']")).click(); //Clicking on username will drop the list
		System.out.println("Test Passed");
		System.out.println("Drop down with 'My profile', 'My Settings', 'Developer Console','Logout', 'Switching to lightning Experience' is displayed");
	}

}
