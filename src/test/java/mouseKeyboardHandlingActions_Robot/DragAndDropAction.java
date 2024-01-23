package mouseKeyboardHandlingActions_Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropAction {

	public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://jqueryui.com/droppable/");
        driver.manage().window().maximize();
        //Frame
        driver.switchTo().frame(0);
        
        
        //drag me to my target
        WebElement src=driver.findElement(By.id("draggable"));
        
        //drag here
        WebElement dest=driver.findElement(By.id("droppable"));
        
        Actions act=new Actions(driver);
        act.clickAndHold(src).moveToElement(dest).release().build().perform();
        System.out.println("Action is completed");
        
        //or var lihilay tyanusar pn aapan draganddrop karu shakto ani khali lihile tyanusr hi apan karu shakto
       
        // act.dragAndDrop(src, dest).perform();
	}

}
