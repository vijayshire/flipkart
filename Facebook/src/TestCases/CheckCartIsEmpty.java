package TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import commonFunctions.ScreenShot;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import flipkartFunctions.ClsCart;
import flipkartFunctions.ClsLogin;

public class CheckCartIsEmpty{
	ScreenShot src = new ScreenShot();
	public WebDriver driver ;
	 
	ClsLogin ObjClsLogin_CheckCartEmpty = new ClsLogin();
	ClsCart ObjClsCart_CheckCartEmpty = new ClsCart();
	@Test
	
	public void f() throws InterruptedException {
		
		ObjClsLogin_CheckCartEmpty.txtbx_username(driver).sendKeys("9158833338");
		ObjClsLogin_CheckCartEmpty.txtbx_password(driver).sendKeys("Successive1");
		ObjClsLogin_CheckCartEmpty.btn_login(driver).click();
		Thread.sleep(10000);
		ObjClsCart_CheckCartEmpty.btn_clickoncart(driver).click();
		System.out.println("Test Success");
		
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
