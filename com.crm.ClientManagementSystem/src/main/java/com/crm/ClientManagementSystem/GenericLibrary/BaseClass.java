package com.crm.ClientManagementSystem.GenericLibrary;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import ObjectRepository.Homepages;
import ObjectRepository.LoginPage;

public class BaseClass {
	public static WebDriver d;
	public FileUtils f=new FileUtils(); 
	SeliniumUtility sutil=new SeliniumUtility();

	@BeforeSuite
	public void connectingwithdatabase() throws IOException {
		Reporter.log("database connected",true);
	}
	
	@BeforeTest
	public void launchBrowser() throws IOException {
		//SeliniumUtility sutil=new SeliniumUtility();
		//sutil.browserMaximizeImplicit(d);// this method is used for launch browser maximize browser and implicitwait
		//sutil.launchChromeBrowser(d); //this method is used for launching browser only
		d=new ChromeDriver();
		sutil.maximizeBrowser(d); // this method is used for maximize the browser only
		sutil.implicitWait(d);   //this method is used for implicitwait only
		FileUtils f=new FileUtils();
		String URL = f.readDataFromPropertyFile("url");
		sutil.navtoApp(d, URL);
		
		Reporter.log("launch the Browser sucessfully",true);
	}
	@BeforeMethod
	public void logintoCMS() throws IOException {
    String un = f.readDataFromPropertyFile("username");
    LoginPage lp=new LoginPage(d);
    lp.getUntbx().sendKeys(un);
    String pw = f.readDataFromPropertyFile("password");
    lp.getPwtbx().sendKeys(pw);
    lp.getLgbtx().click();
		Reporter.log("logged in sucessfully",true);
	}
	@AfterMethod
	public void logoutCMS() {
		Homepages hp=new Homepages(d);
		WebElement element = hp.getProfile();
		sutil.mousehover(d, element);
		hp.getSignout().click();
		Reporter.log("logged out sucessfully",true);
	}
	@AfterTest
	public void closeBrowser() {
		sutil.closeBrowser(d);
		Reporter.log("close the browser sucessfully",true);
	}
	@AfterSuite
	public void disconnectedWithDatabase() {
		Reporter.log("database is disconnected sucessfully",true);
	}
	

}
