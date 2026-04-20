package com.crm.ClientManagementSystem.Organization;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.crm.ClientManagementSystem.GenericLibrary.BaseClass;
import com.crm.ClientManagementSystem.GenericLibrary.FileUtils;
import com.crm.ClientManagementSystem.GenericLibrary.ListernerImplementation;
import com.crm.ClientManagementSystem.GenericLibrary.SeliniumUtility;

import ObjectRepository.Homepages;
import ObjectRepository.OrganizationPage;
@Listeners(ListernerImplementation.class)

public class CreateOrganization extends BaseClass {
	@Test
	public void Create() throws IOException {
		
		Homepages hp=new Homepages(d);
		hp.getOrgelement().click();
		OrganizationPage op=new OrganizationPage(d);
		op.getPlusicon().click();
		FileUtils f=new FileUtils();
		String orgname = f.readdatafromexcel("testdata",1, 1);
		op.getOrgname().sendKeys(orgname);
		String email = f.readdatafromexcel("testdata", 1, 2);
		op.getEmail().sendKeys(email);
		WebElement address = op.getIndustrydrop();
		SeliniumUtility s=new SeliniumUtility();
		s.handledropdownByVisibletext(address, "Engineering");
		String billaddress = f.readdatafromexcel("testdata", 1, 3);
		String shipaddress = f.readdatafromexcel("testdata", 1, 4);
		String billcity = f.readdatafromexcel("testdata", 1, 5);
		String shipcity = f.readdatafromexcel("testdata", 1, 6);
		String billstate = f.readdatafromexcel("testdata", 1, 7);
		String shipstate = f.readdatafromexcel("testdata", 1, 8);
		String billcountry = f.readdatafromexcel("testdata", 1, 9);
		String shipcountry = f.readdatafromexcel("testdata", 1, 10);
		String desp = f.readdatafromexcel("testdata", 1,11);
		op.getBilladdress().sendKeys(billaddress);
		op.getShipaddress().sendKeys(shipaddress);
		op.getShipcity().sendKeys(shipcity);
		op.getBillcity().sendKeys(billcity);
		op.getBillstate().sendKeys(billstate);
		op.getShipstate().sendKeys(shipstate);
		op.getBillcountry().sendKeys(billcountry);
		op.getShipcountry().sendKeys(shipcountry);
		op.getDesp().sendKeys(desp);	
		op.getSavebtn().click();
	
	}

}
