package tests;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class program5 {
  @Test
  public void f() throws InterruptedException, AWTException {
	  
	  System.setProperty("webdriver.gecko.driver","C:\\Users\\veena\\Documents\\testingSDET9\\try1\\driver\\geckodriver.exe");					
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.MICROSECONDS);
		
		driver.get("http://www.flipkart.com");
		/* to close the popup just click on the page */
		 Actions actions = new Actions(driver);
		 actions.moveByOffset(100, 100).click().perform();
		 	
		
			Thread.sleep(500);
			/* click on the deals of the day  */
			driver.findElement(By.linkText("VIEW ALL")).click();
			Thread.sleep(500);
			/* getting the first item */
			String item = 	driver.findElement(By.xpath("//div/div[2]/div[1]/a/div[2]")).getText();
			System.out.println(item);		
		   
		
		   }
  }

