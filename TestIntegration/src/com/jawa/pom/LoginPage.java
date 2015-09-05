package com.jawa.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class LoginPage {

	//identifying web elements with find by annotation
	
	@FindBy(id="username")
	private WebElement userName;
	
	@FindBy(xpath="//input[@type='password']")
	private WebElement password;
	
	@FindBy(id="loginButton")
	private WebElement loginButton;
	
	@FindBy(xpath="//span[contains(text(),'invalid')]")
	private WebElement errMsg;
	
	
	public LoginPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	public void loginActivity(String un,String pwd){
		userName.sendKeys(un);
		password.sendKeys(pwd);
		loginButton.click();
	}
	
	public void isErrorMessageDisplayed(){
		boolean b = errMsg.isDisplayed();
		SoftAssert sa = new SoftAssert();
		if(b==true){
			sa.fail();
		}
		else{
			Assert.assertTrue(b);
		}
		sa.assertAll();
	}
}	