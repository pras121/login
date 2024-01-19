package AdvancedXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OR_AND {
	WebDriver driver;

	//<input name="txtUsername" id="txtUsername" type="text">
	
	//input[@name='txtUsername'  and  @id='txtUsername']
	
	String Login_Xpath="//*[@type='submit' or @name='btnReset']";
	String 	Login1_Xpath1="//input[@type='submit' and @id='btnLogin']";
  @Test
  public void orxpath()throws Exception {
	  
	  System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize() ;	
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		findElement(By.name("username")).sendKeys("Admin");
		findElement(By.name("password")).sendKeys("admin123");
		
		findElement(By.xpath(Login1_Xpath1)).click();			
		
		    

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
