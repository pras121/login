package AdvancedXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AbsoluteXpath {
	WebDriver driver;
  @Test
  public void Xpath()throws Exception {
	  
	  System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize() ;	
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
            Thread.sleep(2000);
		
	
		//UserName
		driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[2]/div[2]/form/div[2]/input")).sendKeys("Admin");
			
		//Password
		driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[2]/div[2]/form/div[3]/input")).sendKeys("admin123");
		
		//Login
		driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[2]/div[2]/form/div[5]/input")).click();
			
		
	}
	
}
