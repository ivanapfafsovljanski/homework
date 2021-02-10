package domaci19januar;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Domaci1 {

	public static void main(String[] args) throws IOException {
		//Dodati èitanje i pisanje podataka iz excel fajla u zadatke koje ste dobili za domaæi 29.12.2020. 

		File fajl = new File("data/domaci.xlsx");
		
		FileOutputStream fos = new FileOutputStream(fajl);
		
		
		XSSFWorkbook wb = new XSSFWorkbook();
		XSSFSheet sheet = wb.createSheet("Domaci1");
		
		
		Racun29122020 noviRacun = new Racun29122020("123-65987-23");
		//da ne unosim peške
		double stanjeNaRacunu = noviRacun.getStanje();
		
		for (int i = 1; i <= 10; i++) {
			XSSFRow red0 = sheet.createRow(0);
			XSSFRow red = sheet.createRow(i);
			XSSFCell polje0 = red0.createCell(0);
			XSSFCell polje = red.createCell(0);
			
			polje0.setCellValue("Sanje na Raèunu " + noviRacun.getBrojRacuna());
			stanjeNaRacunu = 250 * i - i * 20; 
			polje.setCellValue(stanjeNaRacunu);
			
		}
		wb.write(fos);
		wb.close();
		fos.close();
		
		
		FileInputStream fis = new FileInputStream(fajl);
		XSSFWorkbook wbi = new XSSFWorkbook(fis);
		sheet = wbi.getSheet("Domaci1");
		
		for (int i = 0; i <= sheet.getLastRowNum(); i++) {
			XSSFRow row = sheet.getRow(i);
			XSSFCell stanjeRacuna = row.getCell(0);
			if (i == 0) {
				System.out.println(stanjeRacuna.getStringCellValue());
			}
			else {
				System.out.println(stanjeRacuna.getNumericCellValue());
			}
			
		}
		
		
		System.out.println("Kraj programa");
	}

}
