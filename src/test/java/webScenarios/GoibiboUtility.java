package webScenarios;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoibiboUtility {
    public static void gobibo(WebDriver driver,String loc) {
	List<WebElement> list1=driver.findElements(By.xpath("//ul[@class='sc-12foipm-40 gqpBlv']//span[@class='autoCompleteTitle ']"));
    System.out.println("Total Options are:"+list1.size());
    
    for(WebElement i:list1)
    {
    	System.out.println(i.getText());
    	if(i.getText().contains(loc)) {
    		i.click();
    		break;
    	}
    }
    
    
}
}