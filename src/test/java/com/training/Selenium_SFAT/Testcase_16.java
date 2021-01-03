package com.training.Selenium_SFAT;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Testcase_16 extends setUtility{

	
		public static void main(String[] args) throws Exception {
			// TODO Auto-generated method stub
			launchBrowser();
			gotoSalesforceURL();
			gotoLoginSF();
			waitExplicitly1(driver,driver.findElement(By.linkText("Opportunities")));
			driver.findElement(By.linkText("Opportunities")).click();
			handleLightenningwindow();
			createNewOpp();
			quitBrowser();

	}
public static void createNewOpp() throws Exception{
	
	driver.findElement(By.xpath("(//input[@class='btn'])[3]")).click();
	Thread.sleep(3000);
	waitExplicitly1(driver,driver.findElement(By.name("opp3")));
	driver.findElement(By.name("opp3")).sendKeys("Manager");
	driver.findElement(By.xpath("//img[@alt='Account Name Lookup (New Window)']")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("//input[@id='opp4']")).sendKeys("Vibha");
//	ArrayList<String> windowsTabs = new ArrayList<String>(driver.getWindowHandles());
	//System.out.println(windowsTabs.size());
	//driver.switchTo().window(windowsTabs.get(1));
	//Thread.sleep(2000);
	//driver.switchTo().frame(driver.findElement(By.xpath("//frame[@id='searchFrame']")));
	//driver.findElement(By.xpath("//input[@id='lksrch']")).sendKeys("Vibha");
	//driver.findElement(By.xpath("//input[@title='Go!']")).click();
	//Thread.sleep(8000);
	//driver.switchTo().frame(driver.findElement(By.xpath("//frame[@id='resultsFrame']")));
	//Thread.sleep(2000);
	
	//driver.findElement(By.xpath("//a[contains(text(),'Vibha')]")).click();
	//driver.switchTo().defaultContent();
	Thread.sleep(3000);
	Select se = new Select(driver.findElement(By.name("opp6"))); 
	se.selectByIndex(3);
	Thread.sleep(6000);
	waitExplicitly1(driver,driver.findElement(By.xpath("//a[@tabindex='7']")));
	driver.findElement(By.xpath("//a[@tabindex='7']")).click();
	Thread.sleep(8000);
	waitExplicitly1(driver,driver.findElement(By.xpath("//select[@id='opp11']")));
	//driver.findElement(By.xpath("//select[@id='opp11']")).click();
	//List<WebElement> li = driver.findElements(By.xpath("//select[@id='opp11']"));
	//li.get(1).click();
	Select se1 = new Select(driver.findElement(By.name("opp11"))); 
	se1.selectByIndex(3);
	Thread.sleep(6000);
	waitExplicitly1(driver,driver.findElement(By.xpath("//input[@id='opp12']")));
	driver.findElement(By.xpath("//input[@id='opp12']")).clear();
	driver.findElement(By.xpath("//input[@id='opp12']")).sendKeys("12");
	Thread.sleep(3000);
	driver.findElement(By.xpath("(//input[@value=' Save '])[2]")).click();
	Thread.sleep(3000);
	
	
	
}
}
