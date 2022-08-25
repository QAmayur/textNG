package framework;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class UtilityforFrameworks {
	
	
	public void excelwrite(int sheetno,int row,int cell,String data) throws IOException {
	File path	= new File("C:\\Users\\Dinesh\\Desktop\\mayur\\excel1.xlsx");
	FileInputStream load = new FileInputStream(path);
    XSSFWorkbook workbook=new XSSFWorkbook(load);
    XSSFSheet sheet= workbook.getSheetAt(sheetno);
    FileOutputStream input  = new FileOutputStream(path);
    sheet.createRow(row).createCell(cell).setCellValue(data);
    workbook.write(input);
	}
	public static void main(String[] args) throws IOException {
		UtilityforFrameworks re=	new UtilityforFrameworks();
		re.excelwrite(0, 1, 1, "teju");
	}
	

}
