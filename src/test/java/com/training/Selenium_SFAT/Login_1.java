package com.training.Selenium_SFAT;

import org.openqa.selenium.By;

public class Login_1 extends setUtility {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		launchBrowser();
		gotoSalesforceURL();
		gotoLoginSF();
		System.out.println("Logged in successfully.Home page is displaying");
	//	gotoHometab();
		
		}

}
