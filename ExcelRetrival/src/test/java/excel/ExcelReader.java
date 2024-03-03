package excel;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {

	public static void main(String[] args) throws IOException {
		String path = "./src/test/resources/testData.xlsx";
		XSSFWorkbook wb = new XSSFWorkbook(path);
		XSSFSheet sheet = wb.getSheetAt(0);
		
		int totalRows = sheet.getPhysicalNumberOfRows();
		int totalCol = sheet.getRow(0).getPhysicalNumberOfCells();
		
		System.out.println("Total Rows: " + totalRows + " Total cols: " + totalCol);

		for(int row = 0;row<totalRows;row++) {
			for(int col = 0;col<totalCol;col++) {
				System.out.print(sheet.getRow(row).getCell(col).getStringCellValue() + " ");
			}
			System.out.println();
		}
		
		/*
		 * System.out.println(sheet.getRow(0).getCell(0).getStringCellValue());
		 * System.out.println(sheet.getRow(0).getCell(1).getStringCellValue());
		 * System.out.println(sheet.getRow(1).getCell(0).getStringCellValue());
		 * System.out.println(sheet.getRow(1).getCell(1).getStringCellValue());
		 * System.out.println(sheet.getRow(2).getCell(0).getStringCellValue());
		 * System.out.println(sheet.getRow(2).getCell(1).getStringCellValue());
		 */
	}

}
