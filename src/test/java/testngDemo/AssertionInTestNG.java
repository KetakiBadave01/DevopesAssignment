package testngDemo;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionInTestNG {
  @Test(priority=1)
  public void hardAssertionTest() {
	  String act="Selenium WebDriver is WebUI Automation library";
	  
	  String exp="WebUI Test";
	  
	  
	  //assertEquals()
	  
	  //Assert.assertEquals(act, exp,"Fail:Strings are not equal");
	  //System.out.println("Pass:Strings are equal");
	  
	  
	  
	  //assertTrue()
	  
	  //Assert.assertTrue(act.contains(exp),"Fail:Actual string doesn't contains webui");
	  //System.out.println("Actual string contains WebUI");
	  
	  
	  
	  //assertFalse():-Expect Fail condition  condition False=True   and condition True=False
	  Assert.assertFalse(act.contains(exp),"Fail:Actual string contains WebUI Test");
	  System.out.println("pass:Actual string not contains WebUI Test");
	  System.out.println("Hard Assertion is completed!");

	  
	
  }
  
  @Test(priority=2)
  public void softAssertionTest() {
	  
	  
	  SoftAssert sf=new SoftAssert();
	  
	  int a=100,b=200;
	  
	  //assertEquals()
	//  sf.assertEquals(a, b, "Fail:Number are not Equal");
	//  System.out.println("Pass:Numbers are equal");
	 // System.out.println("This is soft assertion test case");

	//  sf.assertTrue(a==b,"Fail:Number are not equals");
	//  System.out.println("Pass:Numbers are equal");
	// System.out.println("This is soft assertion test case");
 
	  Assert.assertFalse(a==b,"Fail:Number are  equals");
      System.out.println("Pass:Numbers are not equal");
      System.out.println("This is soft assertion test case");
	  
      sf.assertAll();
	  
  }
}
