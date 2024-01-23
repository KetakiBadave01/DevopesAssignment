package pageObjectModelQ2.TestCase;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTestQ2 extends BaseClassQ2 {
  @Test(priority=1)
  public void verifyUrl() {
	  String url=lp.getUrl();
	  Assert.assertTrue(url.contains("facebook"),"Url is invalid");
	  System.out.println("Url is valid:"+url);
  
  }
	  
	  @Test(priority=2)
	  public void verifyTitle() {
		  String title=lp.getAppTitle();
		  Assert.assertTrue(title.contains("Facebook"),"Title is not matched!");
	      System.out.println("title is matched!");
	  

  }
	  @Test(priority=3)
	  public void verifyLogin() {
		  lp.doLogin("badaveketaki1@gmail.com", "Ketaki@123");
		  Assert.assertTrue(driver.getCurrentUrl().contains("facebook"),"login failed");
	      System.out.println("Login Successful!");

		  
	  }

	  
	  
}
