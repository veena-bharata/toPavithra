package com.objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logn {
	public Logn(WebDriver driver) {             //Rule -4
		PageFactory.initElements(driver, this);
	}
	

	@FindBy(name="username")
	WebElement userEdt;
	@FindBy(name="pwd")
	WebElement passEdt;
	
	 @FindBy(id="loginButton")
	    private WebElement loginButon;
	 
	 public WebElement getuserName() {
		 return userEdt;
	 }
	 public WebElement getpass() {
		 return passEdt;
	 }
	    
	 public WebElement getLoginButon() {
			return loginButon;
		}
	 public void loginToApp(String username , String password) {             //Rule -5
			userEdt.sendKeys(username);
			passEdt.sendKeys(password);
			loginButon.click();
		}
		public void loginToApp() {             //Rule -5
			userEdt.sendKeys("admin");
			passEdt.sendKeys("manager");
			loginButon.click();
		}
}
