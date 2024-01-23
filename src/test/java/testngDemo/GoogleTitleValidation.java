package testngDemo;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleTitleValidation {
  @Test
  public void titleValidation() {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.google.com");
	  
	  String actTitle=driver.getTitle();
	  
	  /*ji apan if else chi condition java madhe lihito tase 
	   * testNG Framework madhe Assert use kartat ani else chi condition
	   * varti fail madhe lihito
	   */
	  Assert.assertEquals(actTitle, "Google","Fail:Title not matched!");
	  System.out.println("Pass:Title matched!");
  }
}
