package pageObjectModel.TestCase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import pageObjectModelPages.LoginPage;
import pageObjectModelPages.NewLoginPage;

public class BaseClass {
  public WebDriver driver;
  public LoginPage lp;
  public NewLoginPage np;
  @BeforeClass
  public void setUp() {
	  driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  
	  lp=new LoginPage(driver);
	  //np = new NewLoginPage(driver);
	  np=PageFactory.initElements(driver, NewLoginPage.class);
  }
  
  @AfterClass
  public void tearDown() {
	  driver.quit();
  }
}
