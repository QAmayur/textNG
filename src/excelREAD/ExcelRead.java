package excelREAD;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {

	
	public static void main(String[] args) throws IOException {

		//get path of excel file
		File path=new File("C:\\Users\\Dinesh\\Desktop\\mayur\\excel1.xlsx");
	   
		//load excel file
		FileInputStream load =new FileInputStream(path);
		
		//workbookof excel
        XSSFWorkbook workbook= new XSSFWorkbook(load);
        
        //getsheet from workbook where we want to read
          XSSFSheet sheet=  workbook.getSheetAt(0);
          
       //get cell to read datat from it 
        String data = sheet.getRow(0).getCell(0).getStringCellValue();
          System.out.println(data);
	}
	}
