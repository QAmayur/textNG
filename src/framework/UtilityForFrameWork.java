package framework;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class UtilityForFrameWork {
	
	public String Excelread(int sheetno,int row,int cell) throws IOException {
	File path=new File ("C:\\Users\\Dinesh\\Desktop\\mayur\\excel1.xlsx");
	FileInputStream load=new FileInputStream(path);
    XSSFWorkbook workbook=new XSSFWorkbook(load);
    XSSFSheet sheetno1= workbook.getSheetAt(sheetno);
	return sheetno1.getRow(row) .getCell(cell).getStringCellValue();
   }
	public static void main(String[] args) throws IOException {
		UtilityForFrameWork ref=	new UtilityForFrameWork();
	System.out.println(ref.Excelread(0,0,0));
	System.out.println(ref.Excelread(0,0,1));
	System.out.println(ref.Excelread(0,0,2));
	
	}

}
