package com.objects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import pack.generic.webDriverUtility;

public class CreateNewUser extends webDriverUtility{
	WebDriver driver;
	public CreateNewUser(WebDriver driver) { 
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(name="username")
	WebElement userEdt1;
	@FindBy(name="passwordText")
	WebElement passEdt1;
	@FindBy(name="active")
	WebElement enableEdt;
	@FindBy(name="passwordTextRetype")
	WebElement passretypeEdt;
	
	@FindBy(name="firstName")
	WebElement firstEdt;
	@FindBy(name="lastName")
	WebElement lastEdt;
	@FindBy(id="right9")
	WebElement chkboxEdt;
	
	@FindBy(id="right12")
	WebElement chkboxEdt1;
	@FindBy(id="right13")
	WebElement chkboxEdt2;
	@FindBy(id="right2")
	WebElement chkboxEdt3;
	@FindBy(id="right1")
	WebElement chkboxEdt4;
	@FindBy(xpath ="/html/body/div/form/table/tbody/tr[4]/td/input[1]")
	WebElement crtuser;
	
	public WebElement createuser() {
		return crtuser;
	}
	public WebElement getuser() {
		return userEdt1;
	}
	public WebElement getpass() {
		return passEdt1;
	}
	public WebElement getpassre() {
		return passretypeEdt;
	}
	public WebElement getenabl() {
		return enableEdt;
	}
	public WebElement getchkbox() {
		return chkboxEdt;
	}
	public WebElement getchkbox1() {
		return chkboxEdt1;
	}
	public WebElement getchkbox2() {
		return chkboxEdt2;
	}
	public WebElement getchkbox3() {
		return chkboxEdt3;
	}
	public WebElement getchkbox4() {
		return chkboxEdt4;
	}
	public void createUser(String contactName,String passW,String userN,String last,String text) {
		userEdt1.sendKeys(userN);
		passEdt1.sendKeys(passW);
		passretypeEdt.sendKeys(passW);
		select(enableEdt,text);
		firstEdt.sendKeys(contactName);
		lastEdt.sendKeys(last);
		waitforElementToBeClickable(driver,chkboxEdt);
		Actions action = new Actions(driver);
		
		//chkboxEdt.click();
		waitforElementToBeClickable(driver,crtuser);
		crtuser.click();
		
	
	}
	public void createUser1(String contactName,String passW,String userN,String last,String text) {
		userEdt1.sendKeys(userN);
		passEdt1.sendKeys(passW);
		passretypeEdt.sendKeys(passW);
		select(enableEdt,text);
		firstEdt.sendKeys(contactName);
		lastEdt.sendKeys(last);
		waitforElementToBeClickable(driver,chkboxEdt);
		Actions action = new Actions(driver);
		
		chkboxEdt1.click();
		chkboxEdt2.click();
		chkboxEdt3.click();
		chkboxEdt4.click();
		waitforElementToBeClickable(driver,crtuser);
		crtuser.click();
		
	
	}
}

