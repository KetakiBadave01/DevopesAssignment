package testngDemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import helper.PropertiesReadUti;

public class PropertiesFileGoogleRead {
  @Test
  public void readFile() throws IOException 
  {
	  PropertiesReadUti p1=new PropertiesReadUti();
	  
	  WebDriver driver=new ChromeDriver();
	  driver.get(p1.getData("url"));
	  
	  
	  Assert.assertTrue(driver.getTitle().contains(p1.getData("title")),"Title not matched");
	  System.out.println("Title is matched");
	  driver.findElement(By.name(p1.getData("name"))).sendKeys(p1.getData("input"),Keys.ENTER);
	  
	  
	  
	  
	  
	  
	  /*
	  //File
	  
	  File f1=new File("./"+"\\config.properties");//it shows location of file
	  
	  //read in a stream
	  
	  FileInputStream fs=new FileInputStream(f1);
	  
	  //properties file
	  Properties p1=new Properties();
	  
	  p1.load(fs);
	  
	  System.out.println("Url is:"+p1.getProperty("url"));
	  System.out.println("title is:"+p1.getProperty("title"));
*/
  }
}
