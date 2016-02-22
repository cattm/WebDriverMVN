package com.sssl.gitmvnwebdriver;


	import java.util.concurrent.TimeUnit;
	import org.junit.*;
	import static org.junit.Assert.*;
	import org.openqa.selenium.*;
	import org.openqa.selenium.firefox.FirefoxDriver;


	public class AccessTest {

			  private WebDriver driver;
			  private String baseUrl;
			  private StringBuffer verificationErrors = new StringBuffer();

			  @Before
			  public void setUp() throws Exception {
			    driver = new FirefoxDriver();
			    baseUrl = "http://www.edgewordstraining.co.uk/";
			    //baseUrl = "http://localhost/";
			    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			  }

			  @Test
			  public void testMyfirst() throws Exception {
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

			  @After
			  public void tearDown() throws Exception {
			    driver.quit();
			    String verificationErrorString = verificationErrors.toString();
			    if (!"".equals(verificationErrorString)) {
			      fail(verificationErrorString);
			    }
			  }

}

