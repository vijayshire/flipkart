package TestCases;

import java.awt.List;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.Test;
import commonFunctions.ScreenShot;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import flipkartFunctions.ClsLogin;
import flipkartFunctions.ClsSearch;
import flipkartFunctions.ClsLogout;

public class SearchProductAndSelect {
	ScreenShot src = new ScreenShot();
	public WebDriver driver;
	ClsLogin ObjClsLogin_SearchProductAndSelect = new ClsLogin();
	ClsSearch ObjClsSearch_SearchProductAndSelect = new ClsSearch();
	ClsLogout ObjClsLogout_SearchProductAndSelect = new ClsLogout();
	
	@Test
	public void f() throws InterruptedException {
		// System.setProperty("webdriver.chrome.driver", "G:\\chromedriver.exe");
		 //driver = new ChromeDriver();
		// driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		// driver.get("https://www.flipkart.com");
		
		ObjClsLogin_SearchProductAndSelect.txtbx_username(driver).sendKeys("9158833338");
		ObjClsLogin_SearchProductAndSelect.txtbx_password(driver).sendKeys("Successive1");
		ObjClsLogin_SearchProductAndSelect.btn_login(driver).click();
		Thread.sleep(10000);
		ObjClsSearch_SearchProductAndSelect.txtbox_search(driver).sendKeys("Iphone for Sneha");
		ObjClsSearch_SearchProductAndSelect.btn_clickSearch(driver).click();
		ObjClsLogout_SearchProductAndSelect.link_mousehover(driver).click();
		
				
		
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
