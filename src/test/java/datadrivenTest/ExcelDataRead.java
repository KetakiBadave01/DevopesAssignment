package datadrivenTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.*;
import org.testng.annotations.Test;

public class ExcelDataRead {

@Test
  public void dataRead() throws IOException {
	  File f1=new File("./"+"\\TestData\\Data.xlsx");
	  FileInputStream fs=new FileInputStream(f1);
	  
	  //wb-->sheet-->row-->cell-->data
	  XSSFWorkbook wb=new XSSFWorkbook(fs);
	  //total number and columns have astil tar use this technique
	 //number of rows
	  int rows=wb.getSheet("userdata").getPhysicalNumberOfRows();//if you are get complete count then use getPhysicalNumberOfRows()
		System.out.println("Number of rows are:"+rows);

	  
	  //number of cells
		int cells=wb.getSheet("userdata").getRow(0).getPhysicalNumberOfCells();
		
		System.out.println("Number of column:"+cells);

	  
	  //create array as per file size
		Object data[][]=new Object[rows-1][cells];
		
	  //we want to skip heading only want data then this is the logic we follow
	  //read data from file and save it in array
		for(int r=1;r<rows;r++) {
			for(int c=0;c<cells;c++) {
				data[r-1][c]=wb.getSheet("userdata").getRow(r).getCell(c).getStringCellValue();
				System.out.println(data[r-1][c]);

			}
		}
	  
	  
	  
	  
	//**************************************************************************************//
	  
	  
	  //read single entry
	//  String value=wb.getSheet("userdata").getRow(4).getCell(0).getStringCellValue();
	//	System.out.println(value);


	
	  
	  
//***********************************************************************************//	  
	  
	  
	  
	  
	  
	  //its lengthy process we can write in one line aslo so var dusri method lihili
	 /* 
	 XSSFSheet sheet1= wb.getSheet("userdata");
	XSSFRow row1= sheet1.getRow(2);
	XSSFCell cell1=row1.getCell(0);
	String value=cell1.getStringCellValue();
	System.out.println(value);
	*/
	 
  }
}
