package com.training.Selenium_SFAT;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Testcase_13 extends setUtility {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		launchBrowser();
		gotoSalesforceURL();
		gotoLoginSF();
		waitExplicitly1(driver,driver.findElement(By.xpath("//a[contains(text(),'Accounts')]")));
		driver.findElement(By.xpath("//a[contains(text(),'Accounts')]")).click();
		handleLightenningwindow();
		Testcase_10 ts = new Testcase_10();
	//	ts.createAccount();
		mergeAccts();
		quitBrowser();
	}
	public static void mergeAccts() throws Exception{
		waitExplicitly1(driver,driver.findElement(By.xpath("//a[contains(text(),'Merge Accounts')]")));
		driver.findElement(By.xpath("//a[contains(text(),'Merge Accounts')]")).click();
		driver.findElement(By.xpath("//input[@id='srch']")).sendKeys("Vibha");
		driver.findElement(By.xpath("//input[@value='Find Accounts']")).click();
		List<WebElement> rowheaders = driver.findElements(By.xpath("//tbody/tr[1]/th[1]"));
		printlistofWebElements(rowheaders,true);
		Boolean isBoolean1,isBoolean2;
		Thread.sleep(4000);
		isBoolean1=driver.findElement(By.xpath("//input[@id='cid0']")).isSelected();
		if(!isBoolean1)
		{
			driver.findElement(By.xpath("//input[@id='cid0']")).click();
		}
		isBoolean2=driver.findElement(By.xpath("//input[@id='cid1']")).isSelected();
		if(!isBoolean1)
		{
			driver.findElement(By.xpath("//input[@id='cid1']")).click();
		}
		if(isBoolean1 &&isBoolean2)
{
			driver.findElement(By.xpath("//input[@value=' Next ']")).click();
}
		
		driver.findElement(By.xpath("//input[@value=' Merge ']")).click();
		Alert Ok_Alert = driver.switchTo().alert();
		 String alertText = Ok_Alert.getText();
		 System.out.println("Alert text is " + alertText);
		 Thread.sleep(2000);
		 Ok_Alert.accept();
		 System.out.println("Test Pass : Account Vibha is merged");
//		List<>
	//	List<WebElement> getFrow = driver.findElements(By.xpath("//tr[2]/td"));
	//	printlistofWebElements(getFrow,true);
	//	driver.findElement(By.xpath("//input[@value=' Next '")).click();
		
	}

}
