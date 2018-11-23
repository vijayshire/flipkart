package TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import commonFunctions.ScreenShot;
import flipkartFunctions.ClsLogin;
import flipkartFunctions.ClsMyAccountMenus;

public class CheckMyAccountOptions {
	ScreenShot src = new ScreenShot();
	public WebDriver driver;
	ClsLogin ObjClsLogin_CheckMyAccountOptions = new ClsLogin();
	ClsMyAccountMenus ObjMyAccountMenus_CheckMyAccountOptions = new ClsMyAccountMenus();
	
  @Test
  public void f() throws InterruptedException {
	  
     ObjClsLogin_CheckMyAccountOptions.txtbx_username(driver).sendKeys("9158833338");
	 ObjClsLogin_CheckMyAccountOptions.txtbx_password(driver).sendKeys("Successive1");
	 ObjClsLogin_CheckMyAccountOptions.btn_login(driver).click();
	 Thread.sleep(10000);
	 ObjMyAccountMenus_CheckMyAccountOptions.MyAccount(driver,"Orders").click();
  }
  
@BeforeClass()
  

  public void setUp() {

		driver = src.setup(this.getClass().getSimpleName());
	}

  
  @AfterMethod
  
  public void aterMethod()
  
  {
	  driver.quit();
	  
  }
}
