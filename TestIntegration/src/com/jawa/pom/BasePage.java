package com.jawa.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
	
	@FindBy(id="logoutLink")
	private WebElement logout;
	
	public BasePage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	public void performLogout(){
		logout.click();
	}
}
