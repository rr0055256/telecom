package com.actitime.scripts;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.actitime.pom.LoginPage;
import com.actitime.pom.LogoutPage;

public class LoginLogout {
	WebDriver driver;
	@BeforeClass
	public void driverInitialization(){
		driver = new FirefoxDriver();
		driver.get("http://demo.actitime.com");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	@AfterClass
	public void driverClose(){
		driver.close();
	}
	
	@Test
	public void testActitimeLogin(){
	
		LoginPage lp = new LoginPage(driver);
		lp.login("admin", "manager");
		lp.clickButton();
		Reporter.log("Login successful!",true);
	}
	
	@Test
	public void testActitimeLogout(){
		
		LogoutPage lop = new LogoutPage(driver);
		lop.clickLogout();
	}
}
