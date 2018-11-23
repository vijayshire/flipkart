package TestCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import commonFunctions.ScreenShot;
import commonFunctions.ScreenShots;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import static org.junit.Assert.*;
import static org.testng.Assert.assertTrue;
import flipkartFunctions.ClsLogin;

public class LoginToFlipkart {
	
	WebDriver driver;
	
	ScreenShot src = new ScreenShot();
	 
	ClsLogin ObjClsLogin_LoginToFlipkart = new ClsLogin();
  @Test
  public void f() throws InterruptedException {
	  
	  ObjClsLogin_LoginToFlipkart.txtbx_username(driver).sendKeys("9158833338");
	  
	  ObjClsLogin_LoginToFlipkart.txtbx_password(driver).sendKeys("Successive1");
	  ObjClsLogin_LoginToFlipkart.btn_login(driver).click();
	  	 	  
  }
  
    
  @AfterMethod
  
  public void aterMethod()
  
  {
	  driver.quit();
	  
  }
  
  @BeforeClass()
  

  public void setUp() {

		driver = src.setup(this.getClass().getSimpleName());
	}

}
