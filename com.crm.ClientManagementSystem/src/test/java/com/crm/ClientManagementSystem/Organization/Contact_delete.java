package com.crm.ClientManagementSystem.Organization;

import org.testng.annotations.Test;

import com.crm.ClientManagementSystem.GenericLibrary.BaseClass;

import ObjectRepository.ContactPage;
import ObjectRepository.Homepages;

public class Contact_delete extends BaseClass {
	@Test
	public void delete() throws InterruptedException {
		Homepages hp=new Homepages(d);
		hp.getContactelement().click();
		ContactPage cp=new ContactPage(d);
		cp.getSelect().click();
		cp.getDelete().click();
		Thread.sleep(4000);
		
	}

}
