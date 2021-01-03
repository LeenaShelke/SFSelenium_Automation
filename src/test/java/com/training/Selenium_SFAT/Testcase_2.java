package com.training.Selenium_SFAT;

public class Testcase_2 extends setUtility{

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		launchBrowser();
		gotoSalesforceURL();
		gotoLoginSF();
		gotoHometab();
		quitBrowser();
		System.out.println("Logged in successfully.Test case is passed");
	}

}
