package pageObjectModelQ2.TestCase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import pageObjectModelPages.LoginPage;
import pageObjectModelPagesQ2.LoginPageQ2;

public class BaseClassQ2 {

	
	 public WebDriver driver;
	  public LoginPageQ2 lp;
	  @BeforeClass
	  public void setUp() {
		  driver=new ChromeDriver();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		  driver.get("https://www.facebook.com/");
		  
		  lp=new LoginPageQ2(driver);
	  }
	  
	  @AfterClass
	  public void tearDown() {
		  driver.quit();
	  }
}
