package AdvancedXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Child {
	WebDriver driver;
  @Test
  public void childxpath()throws Exception {
	  
	//*[@id="txtUsername"]//following::input[1]
		
			System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
			driver =new ChromeDriver();
			driver.manage().window().maximize() ;	
			driver.get("https://opensource-demo.orangehrmlive.com/");
			
			Thread.sleep(5000);
			findElement(By.xpath("//div[@class='']//child::*[1]")).sendKeys("Admin");
			findElement(By.xpath("//div[@class='']//child::*[2]")).sendKeys("admin123");
			
			
			
		}
		
		
		 public  WebElement findElement(By by) throws Exception 
			{
						
				WebElement elem = driver.findElement(by);  
				
				if (driver instanceof JavascriptExecutor) 
				{
				 ((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid red'", elem);
			 
				}
				return elem;
	  
  }
}
