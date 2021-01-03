package com.training.Selenium_SFAT;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Testcase_6 extends setUtility{

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		launchBrowser();
		gotoSalesforceURL(); 
		gotoLoginSF();
		gotoHometab();
		Thread.sleep(8000);
		driver.findElement(By.xpath("//p[contains(text(),'Lightning Experience is the next generation of Salesforce.')]"));
		driver.findElement(By.xpath("//a[@id='tryLexDialogX']")).click();
		editProfileAbout();
		createNewPost();
		attachFile();
		cropPhoto();
		quitBrowser();
	}
	public static void editProfileAbout() throws Exception{
		WebElement username=driver.findElement(By.xpath("//a[contains(text(),'Leena sh')]"));
		clickObj(username,"Leena Sh");
		//img[@title='Edit Profile']
		WebElement useredit= driver.findElement(By.xpath("//img[@title='Edit Profile']"));
		clickObj(useredit,"Edit Profile");
		Thread.sleep(3000);
		int size = driver.findElements(By.tagName("iframe")).size();
		System.out.println(size);
		driver.switchTo().frame(2);
		//driver.switchTo().frame(driver.findElement(By.id("//iframe[@id='contactInfoContentId']")));
		//System.out.println(driver.findElement(By.xpath("//body[@data-id='mce_0']/p")).getText());
		waitExplicitly1(driver,driver.findElement(By.xpath("//a[contains(text(),'About')]")));
		System.out.println("Clicked on About tab");
		driver.findElement(By.xpath("//a[contains(text(),'About')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='lastName']")).clear();
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("sh1");
		driver.findElement(By.xpath("//input[@value='Save All']")).click();
		driver.switchTo().defaultContent();
		System.out.println("Test Pass :Lastname is updated in AboutTab");
		System.out.println(driver.findElement(By.xpath("//span[@id='userNavLabel']")).getText());
	}
	
	public static void createNewPost() throws Exception{
		waitExplicitly1(driver,driver.findElement(By.xpath("//a[@id='publisherAttachTextPost']")));
		driver.findElement(By.xpath("//a[@id='publisherAttachTextPost']")).click();
		Thread.sleep(3000);
		int size = driver.findElements(By.tagName("iframe")).size();
		System.out.println(size);
		WebElement objFrame= driver.findElement(By.xpath("//iframe[@class='cke_wysiwyg_frame cke_reset']"));
		Thread.sleep(3000);
		driver.switchTo().frame(objFrame);
		System.out.println("Switch to Post Frame");
		WebElement objPost=driver.findElement(By.xpath("//body[contains(text(),'Share an update, @mention someone...')]"));
		objPost.sendKeys("My second Post");
		Thread.sleep(5000);
		
		driver.switchTo().defaultContent();
//		Thread.sleep(3000);
		waitExplicitly1(driver,driver.findElement(By.xpath("//input[@id='publishersharebutton']")));
		driver.findElement(By.xpath("//input[@id='publishersharebutton']")).click();
		Thread.sleep(7000);
		System.out.println("Test Passed :Post is shared");
	}
	public static void attachFile() throws Exception{
		waitExplicitly1(driver,driver.findElement(By.linkText("File")));
		driver.findElement(By.linkText("File")).click();
		Thread.sleep(3000);
		waitExplicitly1(driver,driver.findElement(By.xpath("//a[normalize-space()='Upload a file from your computer']")));
		
		driver.findElement(By.xpath("//a[normalize-space()='Upload a file from your computer']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@id='chatterFile']")).sendKeys("C:\\Users\\sagar\\Desktop\\SumOFDigits.txt");
		waitExplicitly1(driver,driver.findElement(By.xpath("//input[@id='publishersharebutton']")));
		driver.findElement(By.xpath("//input[@id='publishersharebutton']")).click();
		System.out.println("Test PAssed : SumOFDIGITS.txt file is attached");
	}
	public static void cropPhoto() throws Exception{
		waitExplicitly1(driver,driver.findElement(By.xpath("//span[@id='userThumbnailPhoto']//img[@class='chatter-avatarStyle']")));
		driver.findElement(By.xpath("//span[@id='userThumbnailPhoto']//img[@class='chatter-avatarStyle']")).click();
		Thread.sleep(6000);
	
		WebElement  Mousehover = driver.findElement(By.id("displayBadge"));   
	
		clickObj(Mousehover, "Add Photo");
	
		System.out.println("Passed");
	
		WebElement objFrame1= driver.findElement(By.xpath("//iframe[@id='uploadPhotoContentId']"));
		
		driver.switchTo().frame(objFrame1);
		Thread.sleep(5000);
		waitExplicitly1(driver,driver.findElement(By.xpath("//input[@id='j_id0:uploadFileForm:uploadInputFile']")));
		driver.findElement(By.xpath("//input[@id='j_id0:uploadFileForm:uploadInputFile']")).sendKeys("C:\\Users\\sagar\\Desktop\\test.jpeg");
	
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='j_id0:uploadFileForm:uploadBtn']")).click();
	
		Thread.sleep(4000);
		 Actions actions = new Actions(driver); 
		 actions.clickAndHold(driver.findElement(By.xpath("//div[@class='imgCrop_selArea']"))); 
		 actions.moveToElement(driver.findElement(By.xpath("//div[@class='imgCrop_selArea']")), 4, 5); 
		 
		 actions.perform(); 
		 Thread.sleep(250); //note the sleep here. magic sleep.
		 actions.release(driver.findElement(By.xpath("//div[@class='imgCrop_selArea']"))); 
		 actions.perform();
	
			waitExplicitly1(driver,driver.findElement(By.xpath("//input[@id='j_id0:j_id7:save']")));
			driver.findElement(By.xpath("//input[@id='j_id0:j_id7:save']")).click();
		driver.switchTo().defaultContent();
		System.out.println("Test Pass: Image is cropped for Profile pic");
	}
}
