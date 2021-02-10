package newTestsNinja;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ExcellWriter {
	File file;
	FileOutputStream fos;
	XSSFWorkbook wb;
	XSSFSheet sheet;
	XSSFRow row;
	XSSFCell cell;
	WebDriver driver;
	
	public ExcellWriter(String namefile, WebDriver driver) throws IOException {
		this.driver = driver;
		this.file = new File(namefile);
		this.fos = new FileOutputStream(file);
		this.wb = new XSSFWorkbook();
	}
	public void adding3Items() throws IOException {
		XSSFSheet sheet = wb.createSheet("Names of 3 items");
		XSSFRow row0 = sheet.createRow(0);
		XSSFCell cell0 = row0.createCell(0);
		String item1 = driver.findElement(By.xpath("//*[@id=\"main\"]/div[2]/ul/li[1]/a/h2")).getText();
		cell0.setCellValue(item1);
		
		XSSFRow row1 = sheet.createRow(1);
		XSSFCell cell1 = row1.createCell(0);
		String item3 = driver.findElement(By.xpath("//*[@id=\"main\"]/div[2]/ul/li[3]/a/h2")).getText();
		cell1.setCellValue(item3);
		
		XSSFRow row2 = sheet.createRow(2);
		XSSFCell cell2 = row2.createCell(0);
		String item7 = driver.findElement(By.xpath("//*[@id=\"main\"]/div[2]/ul/li[7]/a/h2")).getText();
		cell2.setCellValue(item7);
		wb.write(fos);
	}
	
	
}
