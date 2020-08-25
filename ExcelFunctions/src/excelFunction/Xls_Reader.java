package excelFunction;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Xls_Reader {
	
	String path;
	
	public Xls_Reader(String path)
	{
		this.path=path;
	}
	
	public String getCellData(String sheetName, int rowNum, int colNum) throws IOException
	{
		
		FileInputStream file= new FileInputStream(path);
		
		XSSFWorkbook wb= new XSSFWorkbook(file); //Workbook		
		
		XSSFSheet sheet=wb.getSheet(sheetName); //Sheet
				
		int rows=sheet.getPhysicalNumberOfRows();
		
		XSSFRow row=sheet.getRow(rowNum);		
		
		int cols=row.getLastCellNum();
		
		XSSFCell cell=row.getCell(colNum);
		
		String data=cell.getStringCellValue();
		
		return data;
		
	}

}
