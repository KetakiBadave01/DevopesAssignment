package datadrivenTest;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class UsingArray {
	/*
	@DataProvider(name="testdata1")//to achieve data driven testing means it run 4 time whatever data you provide
	//two D array we use here
	public Object[][] testData()
	{
		Object data[][]= {{"Admin","admin123"},{"Sarang","test123"},{"Admin","admin123"},{"Pooja","test123"}};
	    return data;//here  we return 2 D array so method type is Object[][]
	}
	*/
  @Test(dataProvider="testdata1",dataProviderClass = CustomeData.class)//jar dusrya class madhe jar test data asel tar ase pass karayche( dataProvider=classname.class)
  public void loginTest(String un,String psw) {
	  System.out.println("User name is:"+un);
	  System.out.println("Password is:"+psw);
  }
}
