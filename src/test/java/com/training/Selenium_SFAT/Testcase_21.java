package com.training.Selenium_SFAT;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Testcase_21 extends setUtility{

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		launchBrowser();
		gotoSalesforceURL();
		gotoLoginSF();
		waitExplicitly1(driver,driver.findElement(By.xpath("//a[contains(text(),'Leads')]")));
		driver.findElement(By.xpath("//a[contains(text(),'Leads')]")).click();
		handleLightenningwindow();
		validateView();
		logoutSF();
		quitBrowser();
		
	}
	
public static void validateView() throws Exception {
	Select se = new Select(driver.findElement(By.xpath("//select[@id='fcf']")));
	List<WebElement> le=se.getOptions();

	System.out.println(le.size());
	for(int i=0;i<le.size();i++)
	{
		System.out.println(le.get(i).getText());
	}
	System.out.println("Test Pass: View list Validated");
	
}
}
