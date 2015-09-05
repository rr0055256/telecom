package com.jawa.scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.jawa.pom.BasePage;
import com.jawa.pom.LoginPage;

public class ValidLogin {
	
	public WebDriver driver;
	
	@BeforeClass
	public void openBrowser(){
		driver = new FirefoxDriver();
		driver.get("http://demo.actitime.com");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	@AfterClass
	public void close(){
		driver.close();
	}
	
	@Test
	public void test() {
		LoginPage lp = new LoginPage(driver);
		lp.loginActivity("admin", "manager");
	}
	
	@Test
	public void testLogout(){
		BasePage bp = new BasePage(driver);
		bp.performLogout();
	}
}