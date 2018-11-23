package flipkartFunctions;

import java.lang.reflect.Method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import commonFunctions.ScreenShot;

public class ClsCart {
	
	private WebElement Element;
	public  WebElement btn_clickoncart(WebDriver driver) throws InterruptedException {
		
		Thread.sleep(10000);
		Element = driver.findElement(By.xpath("//*[@id=\"container\"]/div/header/div[1]/div/div[3]/a"));
		
		return Element;
		
			
	}

}
