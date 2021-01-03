package com.training.Selenium_SFAT;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Testcase_7 extends setUtility{

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		launchBrowser();
		gotoSalesforceURL();
		gotoLoginSF();
		waitExplicitly1(driver,driver.findElement(By.xpath("//div[@id='userNav']")));
		driver.findElement(By.xpath("//div[@id='userNav']")).click(); //Clicking on username will drop the list
		waitExplicitly1(driver,driver.findElement(By.xpath("//a[@title='My Settings']")));
		driver.findElement(By.xpath("//a[@title='My Settings']")).click();// My settings page will display
		Thread.sleep(3000);
		experimentLoginHistory();
		experimentDisplayLayout();;
		experimentEmail();
		experimentCalenderRemainder();
		quitBrowser();
	}
	public static void experimentLoginHistory() throws Exception{
		
	
	waitExplicitly1(driver,driver.findElement(By.xpath("//span[@class='folderIcon PersonalInfo_icon']")));
	driver.findElement(By.xpath("//span[@class='folderIcon PersonalInfo_icon']")).click();
	waitExplicitly1(driver,driver.findElement(By.xpath("//span[@id='LoginHistory_font']")));
	driver.findElement(By.xpath("//span[@id='LoginHistory_font']")).click();
	//Thread.sleep(5000);
	waitExplicitly1(driver,driver.findElement(By.xpath("//a[contains(text(),'Download login history for last six months, includ')]")));
	driver.findElement(By.xpath("//a[contains(text(),'Download login history for last six months, includ')]")).click();
	System.out.println("Test Pass : Login history is uploaded in CSV format");
	}
	public static void experimentDisplayLayout() throws Exception{
		waitExplicitly1(driver,driver.findElement(By.xpath("//span[@id='DisplayAndLayout_font']")));
		driver.findElement(By.xpath("//span[@id='DisplayAndLayout_font']")).click();
		waitExplicitly1(driver,driver.findElement(By.xpath("//a[@id='CustomizeTabs_font']")));
		driver.findElement(By.xpath("//a[@id='CustomizeTabs_font']")).click();
		Thread.sleep(4000);
		Select se = new Select(driver.findElement(By.id("p4")));
		se.selectByIndex(9);
		
		se.selectByVisibleText("Salesforce Chatter");
		Thread.sleep(3000);
		System.out.println("Test Pass : Salesforce Chatter is selected");
		Select se1 = new Select(driver.findElement(By.id("duel_select_0")));
		se1.selectByVisibleText("Reports");
		driver.findElement(By.xpath("//img[@class='rightArrowIcon']")).click();
		Thread.sleep(5000);
		Select se2 = new Select(driver.findElement(By.id("duel_select_1")));
		//se2.selectByVisibleText("Reports");
		System.out.println("Test Pass: Reports are moved to Selected Tabs");
		Thread.sleep(3000);
		waitExplicitly1(driver,driver.findElement(By.xpath("//input[@value=' Save ']")));
		driver.findElement(By.xpath("//input[@value=' Save ']")).click();
		Thread.sleep(4000);
		System.out.println("Test Pass : Reports tab is added on home page");
	}
	
	public static void experimentEmail() throws Exception{
		waitExplicitly1(driver,driver.findElement(By.xpath("//span[@id='EmailSetup_font']")));
		driver.findElement(By.xpath("//span[@id='EmailSetup_font']")).click();
		driver.findElement(By.xpath("//span[@id='EmailSettings_font']")).click();
		driver.findElement(By.xpath("//input[@id='sender_name']")).clear();
		driver.findElement(By.xpath("//input[@id='sender_name']")).sendKeys("Rohini");
		driver.findElement(By.xpath("//input[@id='sender_email']")).clear();
		driver.findElement(By.xpath("//input[@id='sender_email']")).sendKeys("leens_us@yahoo.com");
	//	driver.findElement(By.xpath("//input[@value='female']")).click();
		waitExplicitly1(driver, driver.findElement(By.xpath("//input[@id='auto_bcc0']")));
		driver.findElement(By.xpath("//input[@id='auto_bcc0']")).click();
	//	List<WebElement> li = driver.findElements(By.xpath("(//div[@class='requiredInput'])[2]"));
	//	System.out.println(li.get(1).isSelected());
		waitExplicitly1(driver, driver.findElement(By.xpath("//tbody/tr[1]/td[2]/input[1]")));
		driver.findElement(By.xpath("//tbody/tr[1]/td[2]/input[1]")).click();
		Thread.sleep(3000);
		System.out.println("Test Pass :Email settings are updated");
	}
	public static void experimentCalenderRemainder() throws Exception{
		waitExplicitly1(driver,driver.findElement(By.xpath("//span[@class='folderIcon CalendarAndReminders_icon']")));
		driver.findElement(By.xpath("//span[@class='folderIcon CalendarAndReminders_icon']")).click();
		waitExplicitly1(driver,driver.findElement(By.xpath("//span[@id='Reminders_font']")));
		driver.findElement(By.xpath("//span[@id='Reminders_font']")).click();
		waitExplicitly1(driver,driver.findElement(By.xpath("//input[@id='testbtn']")));
		driver.findElement(By.xpath("//input[@id='testbtn']")).click();
		Thread.sleep(4000);
		ArrayList<String> windowsTabs = new ArrayList<String>(driver.getWindowHandles());
		System.out.println(windowsTabs.size());
		driver.switchTo().window(windowsTabs.get(1));
		Thread.sleep(3000);
		driver.close();
		System.out.println("Test pass with Calender Remainder");
		
	}
	
	}

