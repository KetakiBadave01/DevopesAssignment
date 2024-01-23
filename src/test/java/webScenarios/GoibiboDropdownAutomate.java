package webScenarios;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GoibiboDropdownAutomate {

	public static void main(String[] args) {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
	
		WebDriver driver=new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.goibibo.com/flights/");
        
        //close icon
        driver.findElement(By.xpath("//span[@class='logSprite icClose']")).click();
        //from
        driver.findElement(By.xpath("//p[@class='sc-12foipm-20 bhnHeQ'][1]")).click();
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("pun");
        GoibiboUtility.gobibo(driver, "Pune, India");
        
        System.out.println("--------------------");
        
        //to
        driver.findElement(By.xpath("//span[text()='To']//following-sibling::input")).sendKeys("mu");
        GoibiboUtility.gobibo(driver, "Munich, Germany");
         
       }
}