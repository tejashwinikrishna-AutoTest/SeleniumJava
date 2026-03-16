package onlinejavatraining;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingExcel {

	public static void main(String[] args) throws Exception {
 
		//specify the location of excel file
		File src =new File("C:\\Users\\Tejaswini\\Downloads\\Training Materials (2)\\Training Materials\\Short Notes.xlsx");
	    
		//load the file
		FileInputStream fis=new FileInputStream(src);
		
		//load work book
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		
		//load Work Sheet
		XSSFSheet sh=wb.getSheet("Sheet1");
		
		//print the loaded sheet nmae
		System.out.println(sh.getSheetName());
		
		//print merged cell from excel sheet
		System.out.println(sh.getRow(0).getCell(0).getStringCellValue());
	
		//print how to get the cmd to find java version
		System.out.println(sh.getRow(1).getCell(2).getStringCellValue());
		
		//print float/double value from excel sheet
		//System.out.println(sh.getRow(2).getCell(1).getNumericCellValue());
		
		//print total number of rows
		System.out.println("total number of rows : "+sh.getPhysicalNumberOfRows());
		
		//print total number of columns
		System.out.println("total coulmns : "+sh.getRow(2).getLastCellNum());
		
	
	}

}
