package testdata;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excelsheet {
	public static Workbook book;
	public static Sheet sheet;
	

	
	public static Object[][] readdata(String sheetname) throws EncryptedDocumentException, IOException{
		

	
		FileInputStream file=new FileInputStream("C:\\Users\\Sowjanya\\eclipse-workspace\\HRManagement\\src\\test\\java\\testdata\\Logindetails.xlsx");

		Workbook book=WorkbookFactory.create(file);
	

    sheet=book.getSheet(sheetname);
	Object[][] data=new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
	for(int i=0;i<sheet.getLastRowNum();i++) {
		
		for(int k=0;k<sheet.getRow(0).getLastCellNum();k++) {
			
			data[i][k]=sheet.getRow(i+1).getCell(k).toString();
			
		}
	}
	return data;

}
}							
