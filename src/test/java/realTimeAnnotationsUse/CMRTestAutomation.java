package realTimeAnnotationsUse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CMRTestAutomation {
  @Test
  public void crmTest() {
	  
	  WebDriver driver=new ChromeDriver();
      driver.get("https://automationplayground.com/crm/");
      
      //sign in
      driver.findElement(By.linkText("Sign In")).click();
      
      //login
      //email
      driver.findElement(By.id("email-id")).sendKeys("test@gmail.com");
      
      //password
      driver.findElement(By.id("password")).sendKeys("test123");
      
      //submit
      driver.findElement(By.id("submit-id")).click();
      
      //close
      driver.quit();
  }
}
