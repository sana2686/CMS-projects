package com.crm.ClientManagementSystem.GenericLibrary;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class SeliniumUtility {
	public void launchChromeBrowser(WebDriver d) {
		d=new ChromeDriver();
		
		
	}
	public void maximizeBrowser(WebDriver d) {
		d.manage().window().maximize();
		
	}
	public void implicitWait(WebDriver d) {
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	public void navtoApp(WebDriver d,String url) {
		d.get(url);
	}
	
	
	//below method is used for laub=nch browser maximie the broeser and implicit wait
	/*public void browserMaximizeImplicit(WebDriver d) {
		d=new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		
	}*/
	
	public void mousehover(WebDriver d,WebElement adrress) {
		Actions a=new Actions(d);
		a.moveToElement(adrress).perform();
	}
	public void closeBrowser(WebDriver d){
		d.quit();
	}
	public void handledropdownByVisibletext(WebElement address,String text) {
		
		Select s=new Select(address);
		s.selectByVisibleText(text);
	}

}
