package com.crm.ClientManagementSystem.Organization;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.crm.ClientManagementSystem.GenericLibrary.BaseClass;
import com.crm.ClientManagementSystem.GenericLibrary.FileUtils;
import com.crm.ClientManagementSystem.GenericLibrary.ListernerImplementation;
import com.crm.ClientManagementSystem.GenericLibrary.SeliniumUtility;

import ObjectRepository.Homepages;
import ObjectRepository.OrganizationPage;
import ObjectRepository.contact_page;
@Listeners(ListernerImplementation.class)

public class Contacts_module extends BaseClass {
	@Test
	public void Create() throws IOException, InterruptedException {
		
		Homepages hp=new Homepages(d);
		hp.getContactelement().click();
		contact_page op=new contact_page(d);
		op.getPlusicon().click();
		FileUtils f=new FileUtils();
		
		String lastname = f.readdatafromexcel("contacts", 1, 1);

		String orgname = f.readdatafromexcel("contacts", 1, 2);
		WebElement address = op.getAdmin();
		SeliniumUtility s=new SeliniumUtility();
		s.handledropdownByVisibletext(address, " Administrator");
		
		String title = f.readdatafromexcel("contacts", 1, 3);
		
		String dept = f.readdatafromexcel("contacts", 1, 4);
		String mallingstate = f.readdatafromexcel("contacts", 1, 5);
		
		
		String otherstate = f.readdatafromexcel("contacts", 1, 6);
		String mallingcity = f.readdatafromexcel("contacts", 1, 7);
		String othercity = f.readdatafromexcel("contacts", 1, 8);
		String mallingcountry = f.readdatafromexcel("contacts", 1, 9);
		String othercountry = f.readdatafromexcel("contacts", 1, 10);
		String desp = f.readdatafromexcel("contacts", 1, 11);
		op.getLastname().sendKeys(lastname);
		Thread.sleep(2000);

		op.getOrgname().sendKeys(orgname);
		Thread.sleep(2000);

		op.getTitle().sendKeys(title);
		Thread.sleep(2000);

		op.getDept().sendKeys(dept);
		Thread.sleep(2000);

		op.getMallingstate().sendKeys(mallingstate);
		Thread.sleep(2000);

		op.getOtherstate().sendKeys(otherstate);
		Thread.sleep(2000);

		op.getMallingcity().sendKeys(mallingcity);
		Thread.sleep(2000);

		op.getOthercity().sendKeys(othercity);
		Thread.sleep(2000);

		op.getMallingcountry().sendKeys(mallingcountry);
		Thread.sleep(2000);

		op.getOthercountry().sendKeys(othercountry);
		Thread.sleep(2000);

		op.getDesp().sendKeys(desp);
		Thread.sleep(2000);
		

		
		
				
		
		
		
		
		
	
	

}
}