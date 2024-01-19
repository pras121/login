package AdvancedXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Contains {
	WebDriver driver;
  @Test
  public void Containsxpath() throws Exception{
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://opensource-demo.orangehrmlive.com/");
	  
	  Thread.sleep(2000);
	  
	  driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();	
	
		driver.findElement(By.xpath("//*[text()='Admin']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Nationa')]")).click();
	  
	  
  }
}
