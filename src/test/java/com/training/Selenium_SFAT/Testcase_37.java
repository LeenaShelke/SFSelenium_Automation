package com.training.Selenium_SFAT;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Testcase_37 extends setUtility {

	
		public static void main(String[] args) throws Exception{
			// TODO Auto-generated method stub
			launchBrowser();
			gotoSalesforceURL(); 
			gotoLoginSF();
			gotoHometab();
			Thread.sleep(4000);
			handleLightenningwindow();
			waitExplicitly1(driver,driver.findElement(By.xpath("//a[@href='/00U/c?md3=3&md0=2021']")));
			driver.findElement(By.xpath("//a[@href='/00U/c?md3=3&md0=2021']")).click();
			waitExplicitly1(driver,driver.findElement(By.xpath("//a[contains(text(),'4:00 PM')]")));
			driver.findElement(By.xpath("//a[contains(text(),'4:00 PM')]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//tbody/tr[2]/td[2]/div[1]/a[1]/img[1]")).click();
			ArrayList<String> windows = new ArrayList<String>(driver.getWindowHandles());
			System.out.println(windows.size());
			driver.switchTo().window(windows.get(1));
			driver.findElement(By.xpath("//a[contains(text(),'Other')]")).click();
		
			Thread.sleep(3000);
		
			driver.switchTo().window(windows.get(0));
			
		
			WebElement Intractions = driver.findElement(By.xpath("//input[@id='EndDateTime_time']"));
		   // mouseOver(driver, Intractions);
		    clickObj(Intractions,"7:00 PM");
		    driver.findElement(By.xpath("//input[@id='IsRecurrence']")).click();
		    waitExplicitly1(driver,driver.findElement(By.xpath("//input[@id='rectypeftw']")));
		    driver.findElement(By.xpath("//input[@id='rectypeftw']")).click();
		    driver.findElement(By.xpath("//input[@id='RecurrenceEndDateOnly']")).click();
		    Thread.sleep(3000);
			//String sMname="January";
			String sday="16";
			
			//String xpath= "//div[contains(text(),'"+sMname+"')]/..//div[contains(text(),'"+sday+"')]";
			driver.findElement(By.xpath("//td[contains(text(),'"+sday+"')]")).click();
			//waitExplicitly(10,driver.findElement(By.xpath(xpath)));
			//driver.findElement(By.xpath(xpath)).click();
			 waitExplicitly1(driver,driver.findElement(By.xpath("//input[@class='btn']")));
				driver.findElement(By.xpath("//input[@class='btn']")).click();//Save button
				Thread.sleep(4000);
			WebElement monthtooltip=driver.findElement(By.xpath("//tbody/tr[1]/td[2]/div[1]/div[1]/div[2]/span[2]/a[3]/img[1]"));
			
		    Actions act = new Actions(driver);
		     act.moveToElement(monthtooltip).perform(); //to show tooltip for month view
		     Thread.sleep(3000);;
		//     act.moveToElement(monthtooltip).release();
		  //   Thread.sleep(3000);
		     System.out.println("Test Pass");
	}
	

}
