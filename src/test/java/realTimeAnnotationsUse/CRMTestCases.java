package realTimeAnnotationsUse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CRMTestCases extends BaseClass {
	
   
  @Test(priority=1)
  public void signinlinkValidation() {
	driver.findElement(By.linkText("Sign In")).click();  
  }
  
  
  @Test(priority=2)
  public void loginValidation() {
	  //email
      driver.findElement(By.id("email-id")).sendKeys("test@gmail.com");
      
      //password
      driver.findElement(By.id("password")).sendKeys("test123");
      
      //submit
      driver.findElement(By.id("submit-id")).click();
     
      //Validation
     Assert.assertTrue(driver.getCurrentUrl().contains("customers"),"Login Failed");
     System.out.println("Login Completed!");
  }
  @AfterClass
  public void tearDown() {
	  driver.quit();
  }
}
