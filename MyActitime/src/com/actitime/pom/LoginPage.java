package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	@FindBy (id="username")
	private WebElement userName;
	
	@FindBy (name="pwd")
	private WebElement password;
	
	@FindBy (id="loginButton")
	private WebElement btnClick;
	
	public LoginPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	
	}
	
	public void login(String un,String pwd){
		userName.sendKeys(un);
		password.sendKeys(pwd);
	}
	
	public void clickButton(){
		btnClick.click();
	}
	
}
