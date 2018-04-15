package week6day1_4POI_Project;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelModify {
	
    public static void main(String...strings) throws IOException{

    String fileName = "data.xlsx";
    String sheetName = "Create_Account";
    String filePath = System.getProperty("user.dir")+"\\src\\excelExportAndFileIO\\";
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

    for (int i = 0; i < rowCount+1; i++) 
    {
        Row row = dataSheet.getRow(i);
        for (int j = 0; j < row.getLastCellNum(); j++) 
        {
            System.out.print(row.getCell(j).getStringCellValue()+"|| ");
        }

        System.out.println();
    }   
  
    
  }
}