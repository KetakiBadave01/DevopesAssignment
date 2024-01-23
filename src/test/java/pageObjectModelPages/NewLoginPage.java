package pageObjectModelPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
//He page factory class  ne karat ahe dusra pahila kela hota toh locator way ne hota 
public class NewLoginPage {
    
	private WebDriver driver;
 
 
 //initialize driver
   public NewLoginPage(WebDriver driver)//base class
   {
	   this.driver=driver;
   }
   
   
   //locators
   
   private @FindBy(name="username")
          WebElement un;
   private @FindBy(name="password")
           WebElement pass;
   private @FindBy(xpath="//button[@type='submit']")
           WebElement btn;
   
   
   //actions
   public String getUrl() {
	   return driver.getCurrentUrl();
   }
   
   public String getAppTitle() {
	   return driver.getTitle();
   }
   
   public void doLogin(String username,String password) {
	   un.sendKeys(username);
	   pass.sendKeys(password);
	   btn.click();
   }
}
