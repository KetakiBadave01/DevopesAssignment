package testngDemo;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class TestDemo3_Priority {
  @Test(priority=1,description="This is First test case")
  public void registerTest() {
	  System.out.println("This is register test");
  }
  
  
  @Test(priority=2,description="This is Second test case")
  public void loginTest() {
	  System.out.println("This is Login test");
  }

  
  @Test(priority=3,description="This is Third test case")
  public void searchProductTest() {
	  System.out.println("This is Search Product test");
  }
  
  
  
  @Test(priority=4,description="This is Fourth test case")
  public void addToCartTest() {
	  System.out.println("This is Add To Cart test");
  }


}
