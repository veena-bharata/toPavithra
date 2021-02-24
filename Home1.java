package com.objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home1 {
	
		public Home1(WebDriver driver) {             //Rule -4
			PageFactory.initElements(driver, this);
		}

		@FindBy(xpath = "//[@class='label']//[text()='User']")
		private WebElement userImg;
		
		@FindBy(linkText = "Users")
	    private WebElement usrLnk;
		
		@FindBy(xpath ="//input[@value='Create New User']")
	    private WebElement CNewuse;
		@FindBy(linkText = "Logout")
	    private WebElement logLnk;
		
		public WebElement getCNew() {
			return CNewuse;
		}
		public WebElement getlogLnk() {
			return logLnk;
		}
		public WebElement getusrLnk() {
			return usrLnk;
		}
}
