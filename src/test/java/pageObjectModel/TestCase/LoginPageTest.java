package pageObjectModel.TestCase;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjectModelPages.LoginPage;

public class LoginPageTest extends BaseClass {
  @Test(priority=1)
  public void verifyUrl() {
	  //LoginPage lp=new LoginPage();// login page cha object aapan base class madhe create karun ya page var nusta call kela ahe jar base class madhe nasta kela create tar ya page var pratek test case sathi vegla create karat basav lagla asta
	  String url=lp.getUrl();
	  Assert.assertTrue(url.contains("hrmlive"),"Url is invalid");
	  System.out.println("Url is valid:"+url);
  }
  
  
  @Test(priority=2)
  public void verifyTitle() {
	  String title=lp.getAppTitle();
	  Assert.assertTrue(title.contains("OrangeHRM"),"Title is not matched!");
      System.out.println("title is matched!");
  }
  
  @Test(priority=3)
  public void verifyLogin() {
	  lp.doLogin("Admin", "admin123");
	  Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"),"login failed");
      System.out.println("Login Successful!");

	  
  }
}
