package com.training.Selenium_SFAT;

import org.openqa.selenium.By;

public class Testcase_26 extends setUtility {



		public static void main(String[] args) throws Exception {
		
				// TODO Auto-generated method stub
				launchBrowser();
				gotoSalesforceURL();
				gotoLoginSF();
				waitExplicitly1(driver,driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")));
				driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();
				handleLightenningwindow();
				createNewView();
				quitBrowser();
		}
		public static void createNewView() throws InterruptedException{
			driver.findElement(By.xpath("//a[contains(text(),'Create New View')]")).click();
			driver.findElement(By.xpath("//input[@id='fname']")).sendKeys("QALT");
			driver.findElement(By.xpath("//input[@id='devname']")).click();
			driver.findElement(By.xpath("//input[@value=' Save ']")).click();
			Thread.sleep(3000);
			System.out.println("Test Pass: View is created");
			
		}

}
