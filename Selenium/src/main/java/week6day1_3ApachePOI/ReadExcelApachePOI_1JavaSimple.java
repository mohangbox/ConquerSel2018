package week6day1_3ApachePOI;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelApachePOI_1JavaSimple {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		// Pre-req: 1) Create a folder with in your project (eclipse) and name it as
		// data
		// 2) Create a xlsx file with in that folder with required columns and rows

		// a) Open the Excel from the path ./data/TC001.xlsx **********|Call workbook method & Create instance  
		XSSFWorkbook wBook = new XSSFWorkbook("./data/TC001.xlsx");

		// b) Go to the sheet (first sheet) **********|Call sheet method & Create instance
		XSSFSheet sheet = wBook.getSheetAt(0);

		// c) Find the number of rows in the sheet
		int rowCount = sheet.getLastRowNum();
		System.out.println("No of Rows: " + rowCount);

		// d) Go to header row
		XSSFRow headerRow = sheet.getRow(0);

		// e) find the number of columns
		int columnCount = headerRow.getLastCellNum();
		System.out.println("No of Column: " + columnCount);

		for (int j = 1; j <= rowCount; j++) {

			// f) Go to first data row
			XSSFRow firstRow = sheet.getRow(j);
			for (int i = 0; i < columnCount; i++) {

				// g) Go to first cell of that row
				XSSFCell cell = firstRow.getCell(i);

				// h) Print the content of that cell
				String stringCellValue = cell.getStringCellValue();
				System.out.println(stringCellValue);
			}
		}
	}
}
