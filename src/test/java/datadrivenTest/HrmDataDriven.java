package datadrivenTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class HrmDataDriven {
  

	 // @Test(dataProvider="testdata1",dataProviderClass=CustomeData.class)
	  @Test(dataProvider="ExcelData",dataProviderClass=CustomeData.class)

	  public void loginTest(String un,String psw) {
			  
			  WebDriver driver=new ChromeDriver();
		      
		      //Global Wait
		      // kahi veli script open hota pan apan taklela data disat nahi karan te page load hot aste tyathi wait use karyacg time duration lavaycha
		      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		      driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		      
		      
		      //driver.findElement(By.name("Ketaki")).click();
		      //username
		      driver.findElement(By.name("username")).sendKeys(un);
		      
		      //Password
		      driver.findElement(By.name("password")).sendKeys(psw);
		      
		      
		      driver.findElement(By.className("orangehrm-login-button")).click(); 
		      
		      //validation
		      Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"),"Login failed");
		      System.out.println("login pass");
		      
		      //dropdown
		      //driver.findElement(By.className("oxd-userdropdown-icon")).click();
		      
		  }

  }

