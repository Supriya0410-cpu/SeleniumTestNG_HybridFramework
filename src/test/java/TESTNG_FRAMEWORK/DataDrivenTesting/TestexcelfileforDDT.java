package TESTNG_FRAMEWORK.DataDrivenTesting;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class TestexcelfileforDDT {
 /*
	@Test(enabled=false)
  public void testexcelfile() throws IOException {
		
		//file path 
		File f1 = new File(System.getProperty("user.dir") +"//TestDataExcel//data.xlsx");
		
		//create FileStream Object
		
		FileInputStream fs = new FileInputStream(f1);
		
		//for single row data 
		
		//Excelfile: Wb-->sheet-->row-->cell-->data [this rule is imp remember this]
		  XSSFWorkbook wb=new XSSFWorkbook(fs);
		  
		// XSSFSheet sheet1= wb.getSheet("userdata");
		 
		//XSSFRow rownum= sheet1.getRow(2);
		
		//XSSFCell cellnum=rownum.getCell(1);
		
		//String cellno1val=cellnum.getStringCellValue();
		//System.out.println(cellno1val);
		
		
		// for this change roe num and cell num according to you and first find 
		//row value then cell value imp 
		
		
		//find this data in one line 
		  
		String cell1row2val=  wb.getSheet("userdata").getRow(2).getCell(1).getStringCellValue();
		System.out.println(cell1row2val);
  }
	
	// for the all record in the sheet get 
	@Test
	public void allSheet() throws IOException
	{
		//file path 
		File f1 = new File(System.getProperty("user.dir") +"//TestDataExcel//data.xlsx");
		
		//create FileStream Object
		
		FileInputStream fs = new FileInputStream(f1);
		
	
		
		//Excelfile: Wb-->sheet-->row-->cell-->data [this rule is imp remember this]
		  XSSFWorkbook wb=new XSSFWorkbook(fs);
		  
		  //number of physicalrows--means actual row count present in sheet
		  
		int row=  wb.getSheet("DDT").getPhysicalNumberOfRows();
		  System.out.println("total rows are:"+row);
		  
		  
		  //number of physicalcell--means actual cell count present in sheet
		  
		 int cell= wb.getSheet("DDT").getRow(0).getPhysicalNumberOfCells();
		 System.out.println("total number of cells"+cell);
		 
		  //create storage with Array
		 
		 Object [][] arr= new Object [row][cell];
		 
		 
		 
		 //read the file data and store it into array
		 
		 for(int i=0;i<row;i++)// this is for row 
		 {
			 for(int j=0;j<cell;j++)
			 {
				 
				arr[i][j]= wb.getSheet("userdata").getRow(i).getCell(j).getStringCellValue();
				System.out.print(arr[i][j]+"    ");
			 }
			 System.out.println();
		 }
		 
		 
		 
		 
		 
		  
	}*/
	
	@Test
	public void skipheading() throws IOException
	{
		//file path 
		File f1 = new File(System.getProperty("user.dir") +"//TestDataExcel//data.xlsx");
		
		//create FileStream Object
		
		FileInputStream fs = new FileInputStream(f1);
		
	
		
		//Excelfile: Wb-->sheet-->row-->cell-->data [this rule is imp remember this]
		  XSSFWorkbook wb=new XSSFWorkbook(fs);
		  
		  //number of physicalrows--means actual row count present in sheet
		  
		int row=  wb.getSheet("DDT").getPhysicalNumberOfRows();
		  System.out.println("total rows are:"+row);
		  
		  
		  //number of physicalcell--means actual cell count present in sheet
		  
		 int cell= wb.getSheet("DDT").getRow(0).getPhysicalNumberOfCells();
		 System.out.println("total number of cells"+cell);
		 
		  //create storage with Array
		 
		 Object [][] arr= new Object [row][cell];
		 
		 
		 
		 //read the file data and store it into array
		 //here i=1 bcz of the i actual value start from 1 
		 for(int i=1;i<row-1;i++)// this is for row 
		 {
			 for(int j=0;j<cell;j++)//not change j bcz j colo num 1 
			 {
				 //only for i we need first j
				arr[i-1][j]= wb.getSheet("DDT").getRow(i).getCell(j).getStringCellValue();
				System.out.print(arr[i-1][j]+"    ");
			 }
			 System.out.println();
		 }
		 
	}
	
	
	
	
}
