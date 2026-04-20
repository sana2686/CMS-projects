package com.crm.ClientManagementSystem.GenericLibrary;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileUtils {
	public String readDataFromPropertyFile(String key) throws IOException {
		FileInputStream fis=new FileInputStream(ipathConstant.propertypath);
		Properties p=new Properties();
		p.load(fis);
		String data = p.getProperty(key);
		return data;

	}
	public String readdatafromexcel(String sheet,int row,int cell) throws IOException {
		FileInputStream fis=new FileInputStream(ipathConstant.excelpath);
		Workbook wb = WorkbookFactory.create(fis);
		String data = wb.getSheet(sheet).getRow(row).getCell(cell).getStringCellValue();
		return data;
		
		
	}
	public double readdatafromexcelNumeric(String sheet,int row,int cell) throws IOException {
		FileInputStream fis=new FileInputStream(ipathConstant.excelpath);
		Workbook wb = WorkbookFactory.create(fis);
		double data = wb.getSheet(sheet).getRow(row).getCell(cell).getNumericCellValue();
		return data;
		
		
	}

}
