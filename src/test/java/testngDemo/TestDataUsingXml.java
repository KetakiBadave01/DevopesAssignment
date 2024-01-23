package testngDemo;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


import org.testng.annotations.Test;

public class TestDataUsingXml {
     @Parameters({"un","pass"})
  @Test
  public void loginTest(String un,String pass) {
	  System.out.println("User Name is:"+un);
	  System.out.println("Password is:"+pass);
	  

  }
}
