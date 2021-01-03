package com.training.Selenium_SFAT;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.server.handler.SwitchToFrame;

public class Chatter_tab extends setUtility{

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		launchBrowser();
		gotoSalesforceURL();
		gotoLoginSF();
		Thread.sleep(3000);
		gotoChattertab();
		handleLightenningwindow();
		//createNewPost();
		//deletePost();
		//editPost();
		attachFile();
	}
	public static void attachFile() throws Exception{
		waitExplicitly1(driver,driver.findElement(By.linkText("File")));
		driver.findElement(By.linkText("File")).click();
		Thread.sleep(3000);
		
		//WebElement fileattach = driver.findElement(By.cssSelector("#chatterLinkFileAction"));
		//fileattach.click();
		driver.findElement(By.xpath("//a[normalize-space()='Upload a file from your computer']")).click();
		Thread.sleep(3000);
		//driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='chatterFindExistingContentContentId']")));
			
		//driver.findElement(By.xpath("//span[normalize-space()='Attach']")).click();
		driver.findElement(By.xpath("//input[@id='chatterFile']")).sendKeys("C:\\Users\\sagar\\Desktop\\SumOFDigits.txt");
			
		
	//	driver.switchTo().defaultContent();
//		Thread.sleep(3000);
		waitExplicitly1(driver,driver.findElement(By.xpath("//input[@id='publishersharebutton']")));
		driver.findElement(By.xpath("//input[@id='publishersharebutton']")).click();
	//	Thread.sleep(000);
		System.out.println("File is attached");
	}
public static void createNewPost() throws Exception{
	
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
	//driver.switchTo().frame(1);
//	driver.findElement(By.xpath("//a[contains(@class,'cke_button cke_button__italic')]")).click();
	//Thread.sleep(3000);
	driver.switchTo().defaultContent();
//	Thread.sleep(3000);
	waitExplicitly1(driver,driver.findElement(By.xpath("//input[@id='publishersharebutton']")));
	driver.findElement(By.xpath("//input[@id='publishersharebutton']")).click();
	Thread.sleep(7000);
	System.out.println("Post is shared");
}
public static void deletePost() throws Exception
	{
//	Thread.sleep(3000);
	waitExplicitly1(driver,driver.findElement(By.xpath("//a[@id='spillovermenu0D54x000007pBVH']")));
	WebElement dropArrow = driver.findElement(By.xpath("//a[@id='spillovermenu0D54x000007pBVH']"));
	dropArrow.click();
	Thread.sleep(3000);
	WebElement chkDelete= driver.findElement(By.xpath("//div[@class='zen-select zen-open']//a[@title='Delete this post'][normalize-space()='Delete']"));
	String str=driver.findElement(By.xpath("//p[normalize-space()='My second Post']")).getText();
	chkDelete.click();
	Thread.sleep(4000);
	Alert Ok_Alert = driver.switchTo().alert();
	 String alertText = Ok_Alert.getText();
	 System.out.println("Alert text is " + alertText);
	 Thread.sleep(2000);
	 Ok_Alert.accept();
	System.out.println(str +" is deleted");
	}
public static void editPost() throws Exception{
	
	waitExplicitly1(driver,driver.findElement(By.xpath("//a[@id='spillovermenu0D54x000007pBV2']")));
	WebElement dropArrow = driver.findElement(By.xpath("//a[@id='spillovermenu0D54x000007pBV2']"));
	dropArrow.click();
	Thread.sleep(3000);
	WebElement chkEdit= driver.findElement(By.xpath("//div[@class='zen-select zen-open']//a[@title='Edit this post'][normalize-space()='Edit']"));
	chkEdit.click();
	Thread.sleep(3000);
	waitExplicitly1(driver,driver.findElement(By.cssSelector("#quickActionContainerFocusPoint")));
	//WebElement activeEle = driver.findElement(By.xpath("//div[@id='quickActionContainerContent']"));

	waitExplicitly1(driver,driver.findElement(By.xpath("//iframe[@title='Rich Text Editor, quickActionRichTextEditor']")));
	WebElement objFrame= driver.findElement(By.xpath("//iframe[@title='Rich Text Editor, quickActionRichTextEditor']"));
	Thread.sleep(3000);
	
	driver.switchTo().frame(objFrame);
	WebElement editText=driver.findElement(By.xpath("//p[normalize-space()='My first PostSecond post is edited']"));
	editText.clear();
	editText.sendKeys("Second post is edited");
	driver.switchTo().defaultContent();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@title='Save']")).click();
	System.out.println("Post is edited");
}
}