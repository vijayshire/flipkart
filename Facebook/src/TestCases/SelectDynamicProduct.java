package TestCases;

import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import commonFunctions.ScreenShot;
import commonFunctions.ScreenShots;
import flipkartFunctions.ClsDynamicProduct;
import flipkartFunctions.ClsLogin;

public class SelectDynamicProduct {
	
	ScreenShot src = new ScreenShot();
	
	public WebDriver driver;
		
	ClsLogin ObjClsLogin_SelectDynamicProduct = new ClsLogin();
	ClsDynamicProduct ObjClsDynamicProduct_SelectDynamicProduct = new ClsDynamicProduct();
  @Test
  public void f() throws InterruptedException {
	  
	  
	     ObjClsLogin_SelectDynamicProduct.txtbx_username(driver).sendKeys("9158833338");
		 ObjClsLogin_SelectDynamicProduct.txtbx_password(driver).sendKeys("Successive1");
		 ObjClsLogin_SelectDynamicProduct.btn_login(driver).click();
		 ObjClsDynamicProduct_SelectDynamicProduct.NumberOfDynamicProducts(driver).click();
			  
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
