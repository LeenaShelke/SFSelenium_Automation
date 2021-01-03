package com.training.Selenium_SFAT;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Testcase_15 extends setUtility{

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		launchBrowser();
		gotoSalesforceURL();
		gotoLoginSF();
		waitExplicitly1(driver,driver.findElement(By.linkText("Opportunities")));
		driver.findElement(By.linkText("Opportunities")).click();
		handleLightenningwindow();
		displayOpp();
	//	Thread.sleep(3000);
	//	waitExplicitly1(driver,driver.findElement(By.xpath("//div[@id='createNewButton']")));
		
	//	driver.findElement(By.xpath("//div[@id='createNewButton']")).click();
	//	Thread.sleep(2000);
	//	driver.findElement(By.xpath("//div[@id='createNewMenu']//a[6]")).click();
		
		quitBrowser();
	}
	public static void displayOpp() throws Exception{
	//	waitExplicitly1(driver,driver.findElement(By.linkText("Opportunities")));
		driver.findElement(By.xpath("//select[@id='fcf']")).click();
		Select se = new Select(driver.findElement(By.xpath("//select[@id='fcf']")));
		List<WebElement> le=se.getOptions();
	
		System.out.println(le.size());
		for(int i=0;i<le.size();i++)
		{
			System.out.println(le.get(i).getText());
		}
	//	se.selectByIndex(1);
		Thread.sleep(5000);
		System.out.println("Test Pass");
		
		
	}
	
}
