package flipkartFunctions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ClsLogin {
	
	private WebElement Element;
	
	public WebElement txtbx_username(WebDriver driver) throws InterruptedException {
		
				
		if (driver.findElement(By.xpath("html/body/div[2]/div/div/div/div/div[2]")).isEnabled()) {
		
		  driver.findElement(By.xpath("html/body/div[2]/div/div/button")).click();}
		
		driver.findElement(By.xpath(".//*[@id='container']/div/header/div[1]/div/div[3]/div[1]/div/a")).click();
		
		
		Element = driver.findElement(By.xpath("html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input"));
		
		return Element;
		
		
}
	
	public WebElement txtbx_password(WebDriver driver) {
	
	Element = driver.findElement(By.xpath("html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input"));
		
	return Element;
	}
	
	public WebElement btn_login(WebDriver driver) {
		
		Element = driver.findElement(By.xpath("html/body/div[2]/div/div/div/div/div[2]/div/form/div[3]/button"));
			
		return Element;
		
		}
	
	}
