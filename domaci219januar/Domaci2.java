package domaci219januar;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRangeCopier;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Domaci2 {

	public static void main(String[] args) throws IOException {
		
		File fajl = new File("data/domaci2.xlsx");
		FileOutputStream fos = new FileOutputStream(fajl);
		XSSFWorkbook wb = new XSSFWorkbook();
		XSSFSheet sheet = wb.createSheet("dovaci2");
		
		Automobil29122020[] nizAutomobila = new Automobil29122020[5];
		nizAutomobila[0] = new Automobil29122020("KIA", "Stonic", 123321456, "Ivana Pfaf-Šovljanski");
		nizAutomobila[1] = new Automobil29122020("BMW", "GT328i", 658987425, "Nedeljko Šovljanski");
		nizAutomobila[2] = new Automobil29122020("Suzuki", "Swift", 932587147, "Slavko Šovljanski");
		nizAutomobila[3] = new Automobil29122020("Yugo", "Koral", 3254569, "Dušan Šovljanski");
		nizAutomobila[4] = new Automobil29122020("Yugo", "Koral - kabrio", 748953, "Miloš Šovljanski");
		
		for (int i = 0; i < nizAutomobila.length; i++) {
			XSSFRow row = sheet.createRow(i);
			
			XSSFCell marka = row.createCell(0);
			XSSFCell model = row.createCell(1);
			XSSFCell brojSasije = row.createCell(2);
			XSSFCell imeVlasnika = row.createCell(3);
			if (i == 0) {
				marka.setCellValue("MARKA");
				model.setCellValue("MODEL");
				brojSasije.setCellValue("BROJ ŠASIJE");
				imeVlasnika.setCellValue("IME VLASNIKA");
			}
			else {
				marka.setCellValue(nizAutomobila[i-1].getMarka());
				model.setCellValue(nizAutomobila[i-1].getModel());
				//kolonu za broj šasije u excel-u je potrebno foramatirati na Number inaèe æe unete brojeve prikazivati 
				//kao eksponente
				brojSasije.setCellValue(nizAutomobila[i-1].getSerijskiBroj());
				imeVlasnika.setCellValue(nizAutomobila[i-1].getVlasnik());
			}
			
		}
		wb.write(fos);
		wb.close();
		fos.close();
		//System.out.println("kraj programa"); za proveru upisa
		
		FileInputStream fis = new FileInputStream(fajl);
		 wb = new XSSFWorkbook(fis);
		sheet = wb.getSheet("dovaci2");
		
		for (int i = 0; i < sheet.getLastRowNum(); i++) {
			XSSFRow row = sheet.getRow(i);
			
			XSSFCell marka = row.getCell(0);
			XSSFCell model = row.getCell(1);
			XSSFCell brojSasije = row.getCell(2);
			XSSFCell imeVlasnika = row.getCell(3);
			
			System.out.print(marka.getStringCellValue() + ",      ");
			System.out.print(model.getStringCellValue() + ",      ");
			
			if (i == 0) {
				System.out.print(brojSasije.getStringCellValue() + ",      ");
			}
			else
				System.out.print(brojSasije.getNumericCellValue() + ",      ");
			
			
			System.out.println(imeVlasnika.getStringCellValue());
		}
		
	}

	
	
}
