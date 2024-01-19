package AdvancedXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Ancestor {
	WebDriver driver;
  @Test
  public void Ancxpath() throws Exception{
	  
	//*[@id="txtUsername"]//following::input[1]
		
			System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
			driver =new ChromeDriver();
			driver.manage().window().maximize() ;	
			driver.get("https://opensource-demo.orangehrmlive.com/");
			
			
			//UserName
			findElement(By.xpath("//*[@name='username']"));
				
			Thread.sleep(5000);
			findElement(By.xpath(" //*[@name='username']//ancestor::div[1] "));
			
				
			Thread.sleep(5000);

			findElement(By.xpath("//*[@name='password']"));
			
			Thread.sleep(5000);
			
			findElement(By.xpath(" //*[@name='password']//ancestor::div[1] "));
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
