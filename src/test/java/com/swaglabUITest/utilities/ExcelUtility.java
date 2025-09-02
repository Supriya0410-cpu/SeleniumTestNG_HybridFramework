package com.swaglabUITest.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Serializable;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.microsoft.schemas.office.visio.x2012.main.CellType;

public class ExcelUtility {

	public static XSSFWorkbook  wb ;//declare global bcz we need to use outside try block
	
	
	public  static String getStringData(String Sheetname, int row ,int cell )
	{
		
		//create object of file class
		//File f1= new File(System.getProperty("user.dir")+"//TestDataExcel//data.xlsx");
		File f1= new File(System.getProperty("user.dir")+"//TestData//TestData.xlsx");
		FileInputStream fs;
		//create object of fileInputStream
		try {
			fs = new FileInputStream(f1);
			
			//wb-->sheet-->row-->cell-->data
			//Create object of WorkBook [here we write this starement inside try bcz fs object and delare fs as a local
			wb = new XSSFWorkbook (fs);
			
		} catch (FileNotFoundException e) {
		 System.out.println("File not found");
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		} 
		
		
	return	wb.getSheet(Sheetname).getRow(row).getCell(cell).getStringCellValue();
	//bczof return we enter XSSFRichTextString this retuen type
	}
	
	
	public static String getAllTypeData(String Sheetname, int row, int cell)
	{
		//create file object
		
		File f1= new File(System.getProperty("user.dir")+"//TestDataExcel//data.xlsx");
		
		
		//create Filestream Object
		try {
			FileInputStream fs = new FileInputStream(f1);
			
			wb = new XSSFWorkbook (fs);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//read the data as per type
		XSSFCell cellvalue=	wb.getSheet(Sheetname).getRow(row).getCell(cell);
		
		//get the type of that cell that
		
		//Comparable<org.apache.poi.ss.usermodel.CellType> celltype=cellvalue.getCellType();
		
		org.apache.poi.ss.usermodel.CellType celltype1=cellvalue.getCellType();
		
		String data=null;
		
		switch(celltype1)
		{
		case STRING:
			data=cellvalue.getStringCellValue();
			break;
		case NUMERIC:
				double d=cellvalue.getNumericCellValue();
				data=String.valueOf(d);
				break;
		case BOOLEAN: 
			boolean b=cellvalue.getBooleanCellValue();
			data=String.valueOf(b);
			break;
		default:
			break;
		}
		
		return data;
		
		
		
		
		
		
	}
}
