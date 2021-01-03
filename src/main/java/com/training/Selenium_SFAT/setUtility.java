package com.training.Selenium_SFAT;

import org.openqa.selenium.Cookie;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class setUtility {

	public static WebDriver driver;
	public static void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	public static void gotoSalesforceURL() {
		driver.get("https://www.salesforce.com/");
		
	//	Cookie cookie= new Cookie("OptanonConsent","isIABGlobal=false&datestamp=Sun+Dec+27+2020+22%3A08%3A47+GMT-0800+(Pacific+Standard+Time)&version=5.11.0&landingPath=NotLandingPage&groups=1%3A1%2C3%3A1%2C4%3A1&hosts=&AwaitingReconsent=false",".salesforce.com");
	//	driver.manage().addCookie(cookie);;
	}  
	public static void mouseOver(WebDriver driver,WebElement obj) {
		
		if(obj.isDisplayed()) {
	   Actions action=new Actions(driver);
	   action.moveToElement(obj).build().perform();
		System.out.println("Pass: "+obj+" is present");
//		logger.log(LogStatus.PASS,  "obj is present" );
		}
	 else {
			System.out.println("Fail:"+obj+" is not present.Please chk application");
//			logger.log(LogStatus.FAIL,  "obj is not present.Please chk application" );
		}
	}
	/* name of the method:   clickobject--->Button
	 * BriefDescription  :   clicking a button
	 * Arguments         :  obj-->object,objName--->object name
	 *  createdby        :  Automation team 
	 *  created date     :02/13/19 
	 *  LastModified Date:02/13/19          
	 */
	public static void waitExplicitly(int iSeconds,WebElement ele)
	{
		WebDriverWait wait = new WebDriverWait(driver,iSeconds);
		wait.until(ExpectedConditions.visibilityOf(ele));
		
	}
	public static void waitExplicitly1(WebDriver driver,WebElement obj )
	{
		
		WebDriverWait wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(obj));
		
	}	
	public static void gotoLoginSF() throws InterruptedException {
		waitExplicitly(5,driver.findElement(By.xpath("//div[@class='dropdown']")));
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//div[@class='dropdown']"))).build().perform();
		waitExplicitly(5,driver.findElement(By.xpath("//h2[@id='login']")));
		driver.findElement(By.xpath("//h2[@id='login']")).click();
		//driver.findElement(By.xpath("//input[@id='username']")).clear();
		Thread.sleep(3000);
		//waitExplicitly(10,driver.findElement(By.xpath("//input[@id='username']")));
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("coco@abc.com");
		
		driver.findElement(By.xpath("//input[@class='input r4 wide mb16 mt8 password']")).clear();
			
		driver.findElement(By.xpath("//input[@class='input r4 wide mb16 mt8 password']")).sendKeys("rohini123");
				
		driver.findElement(By.xpath("//input[@class='button r4 wide primary']")).click();
		waitExplicitly(5, driver.findElement(By.xpath("//img[@id='phHeaderLogoImage']")));
		
	}
	public static void logoutSF() throws Exception{
		waitExplicitly(10,driver.findElement(By.xpath("//div[@id='userNav']")));
		driver.findElement(By.xpath("//div[@id='userNav']")).click(); //Clicking on username will drop the list
		driver.findElement(By.xpath("//a[@title='Logout']")).click(); //it will logout from salesforce application
	}
	public static void gotoHometab() throws Exception{
		driver.findElement(By.xpath("//a[@href='/home/home.jsp']")).click();
		
	}
	public static void gotoChattertab() throws Exception{
		waitExplicitly1(driver,driver.findElement(By.linkText("Chatter")));
	//	driver.findElement(By.xpath("//a[@title='Chatter Tab - Selected']")).click();
		driver.findElement(By.linkText("Chatter")).click();
	}
	public static void handleLightenningwindow() throws Exception{
	//	waitExplicitly1(driver,driver.findElement(By.xpath("//p[contains(text(),'Lightning Experience is the next generation of Salesforce.')]")));
		Thread.sleep(8000);
		waitExplicitly1(driver,driver.findElement(By.xpath("//p[contains(text(),'Lightning Experience is the next generation of Salesforce.')]")));
		driver.findElement(By.xpath("//a[@id='tryLexDialogX']")).click();
	}
	public static void gotoAccountsTab() throws Exception{
	waitExplicitly1(driver,driver.findElement(By.xpath("//a[contains(text(),'Accounts')]")));
	driver.findElement(By.xpath("//a[contains(text(),'Accounts')]")).click();
}
	public static void printlistofWebElements(List<WebElement> li, boolean bisSingleLine) throws Exception
	{
		for(int row=0;row<li.size();row++)
		{
			if(bisSingleLine==true)
			{
				System.out.print(li.get(row).getText()+"\t");
			}
			else
			{
				System.out.println(li.get(row).getText());
			}
			
		}
		if(bisSingleLine)
		{
			System.out.println();
		}
	}
	public static void printListOfWebElements(List<WebElement> li, boolean bPrintSingleLine) throws Exception{
		for(int count = 0 ; count < li.size(); count++)
		{
			if(bPrintSingleLine)
				System.out.print(li.get(count).getText()+"\t");
			else
				System.out.println(li.get(count).getText());
		}
		if(bPrintSingleLine)
			System.out.println();
		
	}
	public static void switchFrameid( WebDriver driver,String obj) {
		 
	     driver.switchTo().frame(obj);
	     System.out.println("Pass: we can switch to the "+obj+ " frame");
	     
	    }
	public static void quitBrowser() {
		driver.quit();
	}
	public void waitTillDisplayUsingHardWait(String xpath) throws Exception{
		int count = 0;
		boolean bRes_Flag=true;
		while(bRes_Flag)
		{
			try {
				if(count == 10)
					bRes_Flag = false;
			driver.findElement(By.xpath(xpath)).isDisplayed();
			bRes_Flag = false;
			}
			catch(Exception a) {
			count++;
			Thread.sleep(1000);}
		}}
			public static void waitExplicitly(WebDriver driver,WebElement obj )
			{
				
				WebDriverWait wait=new WebDriverWait(driver, 10);
				wait.until(ExpectedConditions.visibilityOf(obj));
				
		}
			public static void clickObj(WebElement obj,String objName)
			{
				if(obj.isDisplayed())
				{
					obj.click();
					System.out.println("pass :" +objName + "button is clicked");
//					logger.log(LogStatus.PASS, objName + "button is clicked");
				}
				else
				{
					System.out.println("Fail:" +objName+"button is not displayed ,please check the application");
//					logger.log(LogStatus.FAIL, objName+ "button is not displayed ,please check the application");
				}
			}
	
	}
	
