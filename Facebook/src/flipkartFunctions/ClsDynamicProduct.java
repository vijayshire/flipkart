package flipkartFunctions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class ClsDynamicProduct {
	public WebElement Element;
	
	public WebElement NumberOfDynamicProducts(WebDriver driver) throws InterruptedException {
		
		//Thread.sleep(10000);
		//Element = driver.findElement(By.xpath("//div[@class='_1r-M-1']//a[contains(@href,'mi-55')]//img[2]"));
		
		WebDriverWait wait=new WebDriverWait(driver, 20);
		Element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"container\"]/div/div[1]/div[2]/div[1]/div/div[1]/div[1]/div[2]/div/a")));
		return Element;
	}
		
		
	

}
