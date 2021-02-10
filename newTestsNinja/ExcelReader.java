package newTestsNinja;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
	File file;
	FileInputStream fis;
	XSSFWorkbook wb;
	XSSFSheet sheet;
	XSSFRow row;
	XSSFCell cell;
	public ExcelReader(String namefile) throws IOException {
		this.file = new File(namefile);
		this.fis = new FileInputStream(file);
		this.wb = new XSSFWorkbook(fis);
	}
	public String usernameValue(String sheetName, int rowNum, int cellNum) {
		sheet = wb.getSheet(sheetName);
		row = sheet.getRow(rowNum-1);
		cell = row.getCell(cellNum-1);
		return cell.getStringCellValue();
	}
	public int passwordValue(String sheetName, int rowNum, int cellNum) {
		sheet = wb.getSheet(sheetName);
		row = sheet.getRow(rowNum-1);
		cell = row.getCell(cellNum-1);
		return (int) cell.getNumericCellValue();
	}	
	
}
