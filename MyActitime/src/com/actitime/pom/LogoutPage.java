package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPage {
	
	//defining web element for logout
	@FindBy(id="logoutLink")
	WebElement logout;
	//initializing web elements
	public LogoutPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	public void clickLogout(){
		logout.click();
	}
}
