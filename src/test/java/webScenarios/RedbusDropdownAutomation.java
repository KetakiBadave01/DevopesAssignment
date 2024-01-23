package webScenarios;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class RedbusDropdownAutomation {

	public static void main(String[] args) {
		
		//Notification remove karayche asel tar he ase use karayche
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		WebDriver driver=new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.redbus.in/");
        
        //from
        WebElement fromele=driver.findElement(By.id("src"));
        fromele.click();
        fromele.sendKeys("pun");
       
        
        List<WebElement> list1=driver.findElements(By.xpath("//ul[@class='sc-dnqmqq eFEVtU']//li//text[@class='placeHolderMainText']"));
        System.out.println("Total Options are:"+list1.size());
        
        for(WebElement i:list1)
        {
        	System.out.println(i.getText());
        	if(i.getText().contains("Viman Nagar")) {
        		i.click();
        		break;
        	}
        }
        
        //to
        WebElement toele=driver.findElement(By.id("dest"));
        toele.click();
        toele.sendKeys("del");
        
        
         List<WebElement>list2=driver.findElements(By.xpath("//ul[@class=\"sc-dnqmqq eFEVtU\"]//li//text[@class='placeHolderMainText']"));
         System.out.println("Total Options are:"+list2.size());
         
         for(WebElement i:list2)
         {
         	System.out.println(i.getText());
         	if(i.getText().contains("Badarpur")) {
         		i.click();
         		break;
         	}
         }
        
         
}


	}


