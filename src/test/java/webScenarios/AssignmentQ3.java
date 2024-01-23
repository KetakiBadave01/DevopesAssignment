package webScenarios;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class AssignmentQ3 {
   public static void main(String[] args) throws InterruptedException {
      WebDriver driver=new ChromeDriver();
      driver.get("https://www.amazon.in");
      System.out.println("Title is:"+driver.getTitle());
       
      //Identify select based dropdown
      WebElement ele=driver.findElement(By.name("url"));
       
      //Select Base
    //When dropdown is designed with <select> tag
      //use Select class from selenium
     
      Select dd=new Select(ele);
     System.out.println("Is dropdown supports multiple selection?:"+dd.isMultiple());
    
     //single selection
     dd.selectByIndex(2);
     Thread.sleep(2000);
     dd.selectByVisibleText("Jewellery");
     Thread.sleep(2000);
     dd.selectByValue("search-alias=dvd");
    
     //print all options from the drop down
     List<WebElement> allOptions=dd.getOptions();
     System.out.println("Total options are:"+allOptions.size());
     for(WebElement i:allOptions)
     {
   	  System.out.println(i.getText());
   	  if(i.getText().contains("Video Games"))
   	  {
   		  i.click();
   		  break;
   	  }
     }
     }

}
