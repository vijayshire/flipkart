package flipkartFunctions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ClsLogout {
	
	private WebElement Element ;
	
	public WebElement link_mousehover(WebDriver driver) throws InterruptedException {
		
     	System.out.println("I am Logout called");
		Actions act = new Actions(driver);
		Element = driver.findElement(By.xpath("//*[@id=\"container\"]/div/header/div[1]/div/div[3]/div[1]/div"));
		System.out.println("After Xpath");
		act.moveToElement(Element).build().perform();
		Element = driver.findElement(By.xpath("//div[@class='_2k0gmP'][text()='Logout']"));
		System.out.println("Logging Out...");
		return Element;
	}
	
	
	}
