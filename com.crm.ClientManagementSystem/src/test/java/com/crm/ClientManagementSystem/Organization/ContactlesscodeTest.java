package com.crm.ClientManagementSystem.Organization;

import java.io.IOException;

import org.testng.annotations.Test;

import com.crm.ClientManagementSystem.GenericLibrary.BaseClass;
import com.crm.ClientManagementSystem.GenericLibrary.FileUtils;
import com.crm.ClientManagementSystem.GenericLibrary.Javautility;

import ObjectRepository.ContactPage;
import ObjectRepository.Homepages;

public class ContactlesscodeTest extends BaseClass{
	
	
	@Test
	public void create_new() throws IOException, InterruptedException {
		Homepages hp=new Homepages(d);
		hp.getContactelement().click();
		ContactPage cp=new ContactPage(d);
		cp.getPlusicon().click();
		FileUtils f=new FileUtils();
		String lastname = f.readdatafromexcel("contacts", 1, 1);
		String orgname = f.readdatafromexcel("contacts", 1, 2);
		String title = f.readdatafromexcel("contacts", 1, 3);
		String dept = f.readdatafromexcel("contacts", 1, 4);
		String mallingstate = f.readdatafromexcel("contacts", 1, 5);
		String otherstate = f.readdatafromexcel("contacts", 1, 6);
		String mallingcity = f.readdatafromexcel("contacts", 1, 7);
		String othercity = f.readdatafromexcel("contacts", 1, 8);
		String mallingcountry = f.readdatafromexcel("contacts", 1, 9);
		String othercountry = f.readdatafromexcel("contacts", 1, 10);
		String desp = f.readdatafromexcel("contacts", 1, 11);
		Thread.sleep(2000);
		Javautility j=new Javautility();
		int number = j.genarateRandom(20);
		cp.createcontact(d, " Administrator", lastname, orgname+" "+number, title, dept, mallingstate, otherstate, mallingcity, othercity, mallingcountry, othercountry, desp);
		Thread.sleep(2000);



		
		
		
	}
	

	

}

	




