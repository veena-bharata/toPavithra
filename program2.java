package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class program2 {
  @Test
  public void f() throws InterruptedException {
	  System.setProperty("webdriver.gecko.driver","C:\\Users\\veena\\Documents\\testingSDET9\\try1\\driver\\geckodriver.exe");					
		WebDriver driver = new FirefoxDriver();
driver.manage().timeouts().implicitlyWait(50, TimeUnit.MICROSECONDS);
		
		driver.get("http://localhost:8082");
		Thread.sleep(500);
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();

		driver.close();
  }
}
