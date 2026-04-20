package com.crm.ClientManagementSystem.Organization;

import java.io.IOException;

import org.testng.annotations.Test;

import com.crm.ClientManagementSystem.GenericLibrary.BaseClass;
import com.crm.ClientManagementSystem.GenericLibrary.FileUtils;

import ObjectRepository.OrganizationPage;

public class practice extends  BaseClass {
	@Test
	public void practice() throws IOException {
		FileUtils f=new FileUtils();
		String data = f.readdatafromexcel("Testdata",1, 1);
		System.out.println(data);
	
	}

}
