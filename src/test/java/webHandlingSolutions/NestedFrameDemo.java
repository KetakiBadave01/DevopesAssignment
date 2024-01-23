package webHandlingSolutions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFrameDemo {
 /*
  * Nested Frame madhe aka frame chya aat dusri frame aste tymule pratek veli top chi frame hi parent aste ani baki child so apan top chi frame la pahila yeych tyannatr left cha logic lihayche
  * middle sathi pan pahile top la yyech mag middle .
  * saglyasathi pahile parent che logic mag child.
  **/
	public static void main(String[] args) {
       WebDriver driver=new ChromeDriver();
       driver.get("https://the-internet.herokuapp.com/nested_frames");
       //top frame
     //  driver.switchTo().frame("frame-top");
      // driver.switchTo().frame(0);
      
       //left
       //driver.switchTo().frame("frame-left");
       
       //seperate lihinyapekshya aka line madhe lihile tari chalte
       driver.switchTo().frame(0).switchTo().frame("frame-left");
 
      
       
       
              //text  tithe space ahe LEFT chya side la tymule normalize-space method use keli
       String text1=driver.findElement(By.xpath("//body[normalize-space()='LEFT']")).getText();
       System.out.println("Left Frame Text:"+text1);
       
       System.out.println("**********Left frame source**********");
       System.out.println(driver.getPageSource());
       
    
       
       System.out.println("*************");
    
       //come back to top frame
       driver.switchTo().defaultContent();
       
       
     //left-->middle
       
       driver.switchTo().frame(0);//top frame

       driver.switchTo().frame("frame-middle");
       String text2=driver.findElement(By.id("content")).getText();
       System.out.println("middle frame text:"+text2);

       
       //right
       System.out.println("*************");
       
       //come back to top frame
       driver.switchTo().defaultContent();
       
       driver.switchTo().frame(0);
       
       driver.switchTo().frame("frame-right");
       System.out.println("Right frame Source is:");
       System.out.println(driver.getPageSource());
       String text3=driver.findElement(By.xpath("//body[normalize-space()='RIGHT']")).getText();
       System.out.println("middle frame text:"+text3);
       
       
       
       
       //Bottom
      System.out.println("*************");
       
       //come back to top frame
       driver.switchTo().defaultContent();
       driver.switchTo().frame(1);
       System.out.println("Bottom frame Source is:");
       System.out.println(driver.getPageSource());




	}

}
