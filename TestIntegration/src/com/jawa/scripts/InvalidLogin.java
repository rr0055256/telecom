package com.jawa.scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

import com.jawa.pom.BasePage;
import com.jawa.pom.LoginPage;

public class InvalidLogin {
	WebDriver driver;
	
  @Test
  public void f() {
	  LoginPage lp = new LoginPage(driver);
	  lp.loginActivity("admin", "man");
	  lp.isErrorMessageDisplayed();
	 
  }
  @BeforeClass
  public void beforeClass() {
	  driver = new FirefoxDriver();
	  driver.get("http://demo.actitime.com");
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }

  @Test
	public void logout()
	{
		BasePage logout=new BasePage(driver);
		logout.performLogout();
	}
}