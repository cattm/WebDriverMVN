package com.sssl.gitmvnwebdriver;

import static org.junit.Assert.fail;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;


public class AccessTestNG {
  private WebDriver driver;
  private String baseUrl;
  private StringBuffer verificationErrors = new StringBuffer();

  @Test
  public void f() {
	driver.get(baseUrl + "/webdriver/");
	    //driver.get(baseUrl + "/phpsite1/");
	driver.findElement(By.cssSelector("span")).click();
	driver.findElement(By.id("username")).clear();
	driver.findElement(By.id("username")).sendKeys("EwordspOBB");
	driver.findElement(By.id("password")).clear();
    driver.findElement(By.id("password")).sendKeys("Millichamp1");
	driver.findElement(By.linkText("Submit")).click();
	driver.findElement(By.cssSelector("li.last > a > span")).click();  	  	  
  }
  @BeforeTest
  public void beforeTest() {
	driver = new FirefoxDriver();
	baseUrl = "http://www.edgewordstraining.co.uk/";
	    //baseUrl = "http://localhost/";
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @AfterTest
  public void afterTest() {
	driver.quit();
	String verificationErrorString = verificationErrors.toString();
	if (!"".equals(verificationErrorString)) {
	  fail(verificationErrorString);
	}
  }

}
