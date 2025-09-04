package TESTNG_FRAMEWORK.DataDrivenTesting;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CustomeData {

	
	
	
	@DataProvider(name="mydata")
	public Object[][] testdata()
	{
		Object[][] data= {{"amit", "amit123"},{"sujeet","sujeet123"},{"Admin","admin123"},{"sujata","sujata123"}};
	return data;
	}
	
	
	@DataProvider(name="HRMdata")
	public Object[][] testdata2()
	{
		Object[][] data= {{"Admin", "admin123"},{"sujeet","sujeet123"},{"Admin","admin123"},{"sujata","sujata123"}};
	return data;
	}
	
	@Test(dataProvider="exceldata")
	public Object[][] skipheading() throws IOException
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
		return arr; 
	}
}
