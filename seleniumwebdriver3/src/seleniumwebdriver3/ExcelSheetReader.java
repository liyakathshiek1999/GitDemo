package seleniumwebdriver3;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelSheetReader {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream file = new FileInputStream("C:\\Users\\asif\\Documents\\First&Lastname.xlsx");
		XSSFWorkbook book = new XSSFWorkbook(file);
		XSSFSheet sheet = book.getSheet("sheet1");
		int r=sheet.getLastRowNum();
        System.out.println(r);
        int c=sheet.getRow(0).getLastCellNum();//sheet count=2
        System.out.println(c);
        System.out.println(sheet.getRow(2).getCell(0));
        System.out.println(sheet.getRow(3).getCell(1));
        for(int i=0; i<c; i++) {
        	System.out.println(sheet.getRow(0).getCell(i));//first row
        	
        }
        System.out.println("----------------------");
        for (int i=0; i<r; i++) {
            for (int j=0; j<c; j++) {
            	System.out.print(sheet.getRow(i).getCell(j) +" ");
            }
            System.out.println();
        }
        
        
	}

}
