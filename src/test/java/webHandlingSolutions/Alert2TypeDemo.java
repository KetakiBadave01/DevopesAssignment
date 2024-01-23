package webHandlingSolutions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert2TypeDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		//alert2
	      driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
	      
	    //alert appear
	      Thread.sleep(2000);
	      
	    //alert Handling
	      Alert alt2=driver.switchTo().alert();
	      System.out.println("Text of the alert:"+alt2.getText());
	      
	    //cancle
	     // alt2.dismiss();
	      
	      //ok
	      alt2.accept();
	      
	    //result
	      WebElement result=driver.findElement(By.id("result"));
	      System.out.println("Alert1 Result is:"+result.getText());

	}

}
