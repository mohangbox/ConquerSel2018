package week6day1_3ApachePOI;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelApachePOI_2Java_FileExtension {

	public static void main(String[] args) throws IOException {

		// 1. USER DEFINED WORKBOOK NAME AND SHEET NAME
		String fileName = "TC001.xlsx";
		String sheetName = "Sheet1";

		// 2. FIND DEFAULT DIRCTORY IN THE DATA SHEET FILE AND ADD FEW FOLDER
		String filePath = System.getProperty("user.dir") + "\\Data\\";
		System.out.println(filePath);

		// 3. INITIALIZE COMMON NAME FOR VARIABLE
		Workbook dataWorkbook = null;

		// 4. GET INPUT FILE STREAM TO FILE HSSF & XSSF
		FileInputStream inputStream = new FileInputStream(new File(filePath + fileName));

		// 5. FIND FILE EXTENSION
		String fileExtensionName = fileName.substring(fileName.indexOf("."));
		if (fileExtensionName.equals(".xlsx")) {
			dataWorkbook = new XSSFWorkbook(inputStream);
		} else if (fileExtensionName.equals(".xls")) {
			dataWorkbook = new HSSFWorkbook(inputStream);
		}

		// 6. GET SHEET NAME
		Sheet dataSheet = dataWorkbook.getSheet(sheetName);

		// 7. FIND ROW NO# & COLUMN NO#
		int rowCount = dataSheet.getLastRowNum();
		int cellCount = dataSheet.getRow(0).getLastCellNum();

		// 8. GET AND PRINT ROW VALUES
		for (int i = 1; i <= rowCount; i++) {
			Row row = dataSheet.getRow(i);

			// 9. GET AND PRINT COLUMN VALUE
			for (int j = 0; j < cellCount; j++) {
				Cell cell = row.getCell(j);
				System.out.print(cell.getStringCellValue() + " || ");
			}
			System.out.println();
		}
	}
}
