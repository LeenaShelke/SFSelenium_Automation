package com.training.Selenium_SFAT;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class Testcase_27 extends setUtility {

	public static void main(String[] args) throws Exception {

		// TODO Auto-generated method stub
		launchBrowser();
		gotoSalesforceURL();
		gotoLoginSF();
		waitExplicitly1(driver,driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")));
		driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();
		handleLightenningwindow();
		Select se = new Select(driver.findElement(By.xpath("//select[@id='hotlist_mode']")));
				
		se.selectByVisibleText("Recently Created");
		Thread.sleep(3000);
		System.out.println("Test Pass: View Recently Created Contacts");
	//	createNewView();
		quitBrowser();
}

}
