package pageObjectModelPagesQ2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class LoginPageQ2 {
	private WebDriver driver;//Encapsulation=Data+Function
     public LoginPageQ2(WebDriver driver)//baseclass driver //initialize driver//it is constructor
      {
         this.driver=driver;	
     }
     //locator
    private By user=By.id("email");
    private By pass=By.id("pass");
    private By loginbtn=By.name("login");
    //public Methods-this public method perform Actions
    public void doLogin(String username,String password) {
    	driver.findElement(user).sendKeys(username);
    	driver.findElement(pass).sendKeys(password);
    	driver.findElement(loginbtn).click();
    }
    public String getUrl() {
    	return driver.getCurrentUrl();
    }
    public String getAppTitle() {
    	return driver.getTitle();
    }

    }
