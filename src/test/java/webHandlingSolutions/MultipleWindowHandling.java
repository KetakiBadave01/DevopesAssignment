package webHandlingSolutions;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindowHandling {

	public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        
        //Main Page
        
        String parentId=driver.getWindowHandle();
        System.out.println(parentId);
        
        driver.findElement(By.linkText("OrangeHRM, Inc")).click();
        
        //child page
        Set<String> allId=driver.getWindowHandles();
        System.out.println(allId);
      
        /*
         * Ask driver to switch based on id
         * if Id's are not same then switch
         */
        //parentid not equal child id then we can switch into next window that is th logic given below
    
        for(String childId:allId) {
        	if(!parentId.equals(childId)) {
        		//child window
        		driver.switchTo().window(childId);
        		driver.findElement(By.name("EmailHomePage")).sendKeys("test@gmail.com");
        		
        		//driver.close();//close child window
        		//driver.quit();//close all open window
        	}
        }
        //parent
        driver.switchTo().window(parentId);
        driver.findElement(By.name("username")).sendKeys("Admin");
	}

}
