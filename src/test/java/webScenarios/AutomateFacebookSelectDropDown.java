package webScenarios;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import helper.Utility;

public class AutomateFacebookSelectDropDown {

	//reusable script/method
	
//	public static void selectBasedDropdown(WebElement ele,String value)
//	{
//		 Select dd=new Select(ele);
//	      System.out.println("Is dropdown supports multiple selection?:"+dd.isMultiple());
	      
//	      List<WebElement> allOptions=dd.getOptions();
	      
//	      System.out.println("Total Options are:"+allOptions.size());
	      
	      //for(WebElement i:allOptions) {
	    	//  System.out.println(i.getText());
	    	  //if(i.getText().contains(value)) {
	    		 // i.click();
	    		 // break;
	    	  //}
	      //}
	    
	//}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
	      driver.get("https://www.facebook.com/");
	      System.out.println("Title is:"+driver.getTitle());
	      driver.findElement(By.linkText("Create new account")).click();
	     
	      //Identify select based dropdown
	      WebElement ele=driver.findElement(By.id("day"));
      	  Utility.selectBasedDropdown(ele,"28");
	     // Select dd=new Select(ele);
	      //System.out.println("Is dropdown supports multiple selection?:"+dd.isMultiple());
	      
	     // List<WebElement> allOptions=dd.getOptions();
	      
	      //System.out.println("Total Options are:"+allOptions.size());
	      
	      //for(WebElement i:allOptions) {
	    	//  System.out.println(i.getText());
	    	  //if(i.getText().contains("27")) {
	    		//  i.click();
	    		 // break;
	    	  //}
	      //}
	      //dd.selectByIndex(11);
	      
	      //month dropdown
	      WebElement ele1=driver.findElement(By.id("month"));
	      Utility.selectBasedDropdown(ele1,"Mar");
	      
	      
	      //year drop down
	      
	      WebElement ele2=driver.findElement(By.id("year"));
	      Utility.selectBasedDropdown(ele2,"2012");
	      
	      
	}

}
