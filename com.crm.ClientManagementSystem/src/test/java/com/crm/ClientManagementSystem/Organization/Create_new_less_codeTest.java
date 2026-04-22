package com.crm.ClientManagementSystem.Organization;

import java.io.IOException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.crm.ClientManagementSystem.GenericLibrary.BaseClass;
import com.crm.ClientManagementSystem.GenericLibrary.FileUtils;
import com.crm.ClientManagementSystem.GenericLibrary.Javautility;
import com.crm.ClientManagementSystem.GenericLibrary.ListernerImplementation;


import ObjectRepository.Homepages;
import ObjectRepository.OrganizationPage;
@Listeners(ListernerImplementation.class)
public class Create_new_less_codeTest extends BaseClass {
	@Test
	public void Create() throws IOException {
		
		Homepages hp=new Homepages(d);
		hp.getOrgelement().click();
		OrganizationPage op=new OrganizationPage(d);
		op.getPlusicon().click();
		FileUtils f=new FileUtils();
		String orgname = f.readdatafromexcel("testdata",1, 1);
		String email = f.readdatafromexcel("testdata", 1, 2);
		String billaddress = f.readdatafromexcel("testdata", 1, 3);
		String shipaddress = f.readdatafromexcel("testdata", 1, 4);
		String billcity = f.readdatafromexcel("testdata", 1, 5);
		String shipcity = f.readdatafromexcel("testdata", 1, 6);
		String billstate = f.readdatafromexcel("testdata", 1, 7);
		String shipstate = f.readdatafromexcel("testdata", 1, 8);
		String billcountry = f.readdatafromexcel("testdata", 1, 9);
		String shipcountry = f.readdatafromexcel("testdata", 1, 10);
		String desp = f.readdatafromexcel("testdata", 1,11);
		Javautility j=new Javautility();
		int number = j.genarateRandom(25);
		op.createorganization(d, orgname+"  "+number, email, "Engineering", billaddress, shipaddress, billcity, shipcity, billstate, shipstate, billcountry, shipcountry, desp);
	} 

}



