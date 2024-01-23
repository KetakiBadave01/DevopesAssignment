package webHandlingSolutions;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorDemo {

	public static void scrollDown(WebDriver driver) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	      
	    System.out.println("page scroll is done");

	}

	public static void scrollUp(WebDriver driver) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
	    js.executeScript("window.scrollTo(document.body.scrollHeight,0)");

	}
	
	public static void scrollToElement(WebDriver driver,WebElement ele) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		    js.executeScript("arguments[0].scrollIntoView()",ele);
		    
		    
		    System.out.println("Page scrolled till the seleced Element ");
		    

	}

	
	
	
	public static void main(String[] args) throws InterruptedException {
    WebDriver driver=new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.get("https://www.amazon.in/");

    
    /*
     * JavaScriptExecutor is interface in selenium to handle javascript event
     */
    
    //To create new alert
    JavascriptExecutor js=(JavascriptExecutor) driver;
    //executeScript navachya method ne apan javascript che script tyat lihayche
    js.executeScript("alert('I am an Javascript alert')");
    
    
   Thread.sleep(2000);
   
   //handle alert
   
  Alert alt=driver.switchTo().alert();
  System.out.println("Alert text is:"+alt.getText());
  
  //ok
  alt.accept();
  
    
   /*Interview que :
    * To get title of the webpage how many ways?
    * 1.getTitle()
    * 2.using JavascriptExecutor 
    */
  //getTitle
    System.out.println(driver.getTitle());
    
    //JavascriptExecutor
    String title=js.executeScript("return document.title").toString();
    System.out.println("Title is:"+title);
    
    
     WebElement ele=driver.findElement(By.xpath("(//h2[@class='as-title-block-left'])[2]"));
//    js.executeScript("arguments[0].scrollIntoView()",ele);
    
    
   // System.out.println("Page scrolled till the seleced Element ");
    
     scrollDown(driver);
    
    Thread.sleep(2000);
    
   scrollUp(driver);
    
    
   
    
    
    
    
    
    
    
    
    
    
    
    
    //Scroll
  //  js.executeScript("window.scrollTo(0,6000)");
  //  System.out.println("page scroll is done");
    
    
    //To Scroll Till end/height of the page
    //js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
      
    //System.out.println("page scroll is done");
    
    //Thread.sleep(2000);
    //scroll Up syntax
  //  js.executeScript("window.scrollTo(document.body.scrollHeight,0)");
    

	}

}
