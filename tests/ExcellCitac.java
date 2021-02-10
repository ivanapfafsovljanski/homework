package tests;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcellCitac {

	FileInputStream fis;
	XSSFWorkbook wb;
	XSSFSheet sheet;
	XSSFRow row;
	XSSFCell cell;
	File fajl;
	
	
	public ExcellCitac(String NazivFajla) throws IOException {
		this.fajl =new File(NazivFajla);
		this.fis = new FileInputStream (fajl);
		this.wb = new XSSFWorkbook(fis);
	}
	public String getStingData(String sheetName, int rowNumber, int cellNumber) {
		this.sheet = wb.getSheet(sheetName);
		this.row = sheet.getRow(rowNumber-1);
		this.cell = row.getCell(cellNumber-1);
		return cell.getStringCellValue();	
	}
	public int getIntData(String sheetName, int rowNumber, int cellNumber) {
		this.sheet = wb.getSheet(sheetName);
		this.row = sheet.getRow(rowNumber-1);
		this.cell = row.getCell(cellNumber-1);
		return (int)cell.getNumericCellValue();	
	}
	public String getLogOutData(String sheetName, int rowNumber, int cellNumber) {
		this.sheet = wb.getSheet(sheetName);
		this.row = sheet.getRow(rowNumber-1);
		this.cell = row.getCell(cellNumber-1);
		return cell.getStringCellValue();	
	}
	
	
	
	
}
