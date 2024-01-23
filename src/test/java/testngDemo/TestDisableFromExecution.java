package testngDemo;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class TestDisableFromExecution {
  @Test
  public void testCase1() 
  {
	System.out.println("This is test case 1");  
  }
  
  @Test
  public void testCase2() 
  {
		System.out.println("This is test case 2");  
  
  }
  
  @Test(enabled=false)//ji test case aaplyala disable karyachi ahe tyala apan hi (enabled=false) vaprayche 
  public void testCase3() 
  {
		System.out.println("This is test case 3");  
	  
  }
  
  @Test
  public void testCase4() {
	  System.out.println("This is test case 4");
  }
}
