package week6day1_4POI_Project;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import org.junit.Test;

import methodTypes.Login;

public class POI_EXCEL_Account_Create extends Login{
	@Test
	public void Create_Accounts() throws InterruptedException, IOException {

	String fileName = "data.xlsx";
	String sheetName = "Create_Account";
	String filePath = System.getProperty("user.dir")+"\\src\\main\\java\\week6day1_4POI_Project\\";
	Workbook dataWorkbook = null;
		    
	FileInputStream inputStream = new FileInputStream(new File(filePath+fileName));
		    
	String fileExtensionName = fileName.substring(fileName.indexOf("."));
	if(fileExtensionName.equals(".xlsx")){
	  	dataWorkbook = new XSSFWorkbook(inputStream);
	 }
	else if(fileExtensionName.equals(".xls")){
		dataWorkbook = new HSSFWorkbook(inputStream);
	}
		    
	Sheet dataSheet = dataWorkbook.getSheet(sheetName);
	int rowCount = dataSheet.getLastRowNum()-dataSheet.getFirstRowNum();

	for (int i = 1; i < rowCount+1; i++) 
	{
	  Row row = dataSheet.getRow(i);
	  
	  	loginApp();
	  	
		click(locateElement("xpath", "//*[contains(text(), 'CRM/SFA')]"));
		click(locateElement("xpath", "//a[text()='Accounts']"));
		click(locateElement("xpath", "//a[text()='Create Account']"));
		type(locateElement("xpath", "//input[@id='accountName']"), row.getCell(1).getStringCellValue());
		selectDropDownUsingVisibleText(locateElement("xpath", "//select[@name='industryEnumId']"), row.getCell(2).getStringCellValue());
		selectDropDownUsingText(locateElement("xpath", "//select[@name='currencyUomId']"), row.getCell(3).getStringCellValue());
		selectDropDownUsingVisibleText(locateElement("xpath", "//select[@name='dataSourceId']"), row.getCell(4).getStringCellValue());
		selectDropDownUsingVisibleText(locateElement("xpath", "//select[@name='marketingCampaignId']"), row.getCell(5).getStringCellValue());
		type(locateElement("xpath", "//input[@id='primaryPhoneNumber']"), row.getCell(6).getStringCellValue());
		type(locateElement("xpath", "//input[@id='generalCity']"), row.getCell(7).getStringCellValue());
		type(locateElement("xpath", "//input[@id='primaryEmail']"), row.getCell(8).getStringCellValue());
		selectDropDownUsingVisibleText(locateElement("xpath", "//select[@id='generalCountryGeoId']"), row.getCell(9).getStringCellValue());
		selectDropDownUsingVisibleText(locateElement("xpath", "//select[@name='generalStateProvinceGeoId']"), row.getCell(10).getStringCellValue());
		click(locateElement("xpath", "//input[@type='submit']"));
		String getText = getText(locateElement("xpath", "//*[contains(text(), '"+row.getCell(1).getStringCellValue()+"')]"));
		String numberOnly= getText.replaceAll("[^0-9]", "");
		System.out.println("Convert text is  :"+numberOnly);
		
		click(locateElement("xpath", "//a[text()='Find Accounts']"));
		type(locateElement("xpath", "(//input[@name='accountName'])[2]"), row.getCell(1).getStringCellValue());
		type(locateElement("xpath", "//input[@name='id']"), numberOnly);
		click(locateElement("xpath", "//button[text()='Find Accounts']"));
		verifyPartialText(locateElement("xpath", "(//div[@class='x-grid3-body'])/div[1]"), numberOnly);
		
		closeApp();	
		}   	
	}
}