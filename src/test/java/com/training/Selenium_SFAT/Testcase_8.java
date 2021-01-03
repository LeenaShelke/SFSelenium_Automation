package com.training.Selenium_SFAT;

import java.util.ArrayList;

import org.openqa.selenium.By;

public class Testcase_8 extends setUtility {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		launchBrowser();
		gotoSalesforceURL();
		gotoLoginSF();
		waitExplicitly(10,driver.findElement(By.xpath("//div[@id='userNav']")));
		driver.findElement(By.xpath("//div[@id='userNav']")).click(); //Clicking on username will drop the list
		waitExplicitly(10,driver.findElement(By.xpath("//a[@title='Developer Console (New Window)']")));
		driver.findElement(By.xpath("//a[@title='Developer Console (New Window)']")).click(); // Developer log window will display
		ArrayList<String> windows = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(windows.get(1));
		driver.close();
		quitBrowser();	
		System.out.println("Test Pass: Developer console window closed");
	}

}
