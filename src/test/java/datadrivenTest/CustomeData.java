package datadrivenTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CustomeData {

	

	@DataProvider(name="testdata1")//to achieve data driven testing means it run 4 time whatever data you provide
	//two D array we use here
	public Object[][] testData()
	{
		Object data[][]= {{"Admin","admin123"},{"Sarang","test123"},{"Admin","admin123"},{"Pooja","test123"}};
	    return data;//here  we return 2 D array so method type is Object[][]
	}
	
	
	@DataProvider(name="ExcelData")
	public Object[][] file() {
		  XSSFWorkbook wb;
		  Object data[][]=null;
			  File f1=new File("./"+"\\TestData\\Data.xlsx");
			  FileInputStream fs;
			try {
				fs = new FileInputStream(f1);
				//wb-->sheet-->row-->cell-->data
				  wb=new XSSFWorkbook(fs);
				  
				  //total number and columns have astil tar use this technique
					 //number of rows
					  int rows=wb.getSheet("userdata").getPhysicalNumberOfRows();//if you are get complete count then use getPhysicalNumberOfRows()
						System.out.println("Number of rows are:"+rows);

					  
					  //number of cells
						int cells=wb.getSheet("userdata").getRow(0).getPhysicalNumberOfCells();
						
						System.out.println("Number of column:"+cells);

					  
					  //create array as per file size
						  data=new Object[rows-1][cells];
						
					  
					  //read data from file and save it in array
						for(int r=1;r<rows;r++) {
							for(int c=0;c<cells;c++) {
								data[r-1][c]=wb.getSheet("userdata").getRow(r).getCell(c).getStringCellValue();
								//System.out.println(data[r-1][c]);

							}
						}
					  
					  
				
					  
					
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			  
			  return data;
			
	

}
}