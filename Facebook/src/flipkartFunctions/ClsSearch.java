package flipkartFunctions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ClsSearch {
	
	private WebElement Element;
	
		
	public WebElement txtbox_search(WebDriver driver) {
		
		System.out.println("I am called..But there is Gadbad in your code");
		
		Element = driver.findElement(By.xpath("//*[@id=\"container\"]/div/header/div[1]/div/div[2]/form/div/div[1]/div/input"));
		return Element;
		
	}
	
	public WebElement btn_clickSearch(WebDriver driver) {
		
		Element = driver.findElement(By.xpath("//*[@id=\"container\"]/div/header/div[1]/div/div[2]/form/div/div[2]/button"));
		return Element;
		
		
	}

}
