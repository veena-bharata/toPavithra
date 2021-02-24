package com.test;

import org.testng.annotations.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

//import com.crm.autodesk.objectrrepositorylib.Home;
//import com.crm.autodesk.objectrrepositorylib.Login;
import com.objects.CreateNewUser;
import com.objects.Home1;
import com.objects.Logn;
import com.objects.baseTestActi;

import pack.generic.fileUtility;
import pack.generic.javaUtility;
import pack.generic.webDriverUtility;
//extends baseTestActi
public class TC1Test  {

	javaUtility jlib = new javaUtility();
	fileUtility flib = new fileUtility();
	webDriverUtility wlib = new webDriverUtility();

	@Test
	public void createUser() throws Throwable {
		/* common data */
		int randomNum = jlib.generateRNum();
		String userName = flib.getPropertyKey("username");
		String passWord = flib.getPropertyKey("password");
		String URL = flib.getPropertyKey("url");
		String BROWSER = flib.getPropertyKey("browser");

		/* test data */
		String contactName = flib.getPropertyKey("contact") + randomNum;
		String lastName = flib.getPropertyKey("last") + randomNum;
		String userN = flib.getPropertyKey("user") + randomNum;
		String passW = flib.getPropertyKey("pass") + randomNum;
		String text = flib.getPropertyKey("tex");
		WebDriver driver = null;
		
		/* step 1 : login to APP */
		 
		
		 System.setProperty("webdriver.gecko.driver",
		  "C:\\Users\\veena\\Documents\\testingSDET9\\try1\\driver\\geckodriver.exe");
		  
		 //WebDriver driver = null;
		 if(BROWSER.equalsIgnoreCase("firefox")) { driver=
		  new FirefoxDriver(); } else if(BROWSER.equalsIgnoreCase("chrome")) { driver =
		  new ChromeDriver(); } else if(BROWSER.equalsIgnoreCase("ie")) { driver = new
		  InternetExplorerDriver(); }
		 
		 wlib.waitForHTMLDOM(driver); driver.get(URL);
		 
		 /* step 1 : login to APP */
		  Logn lp = new Logn(driver);
		  lp.loginToApp(); 
		 /* step 2 : navigate to User page
		 */
		Home1 hp = new Home1(driver);
		hp.getusrLnk().click();
		/* navigate to create new user */
		hp.getCNew().click();
		/* step 4 : create new user with data */
		CreateNewUser cnu = new CreateNewUser(driver);
		cnu.createUser1(contactName, passW, userN, lastName, text);

		hp.getlogLnk().click();
		// driver.close();
	}
}
