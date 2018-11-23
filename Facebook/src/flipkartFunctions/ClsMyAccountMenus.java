package flipkartFunctions;


import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ClsMyAccountMenus {
	
	public WebElement Element;
	
	public WebElement MyAccount(WebDriver driver,String str) throws InterruptedException {
		Actions act = new Actions(driver);
		Element = driver.findElement(By.xpath("//*[@id=\"container\"]/div/header/div[1]/div/div[3]/div[1]/div"));
		act.moveToElement(Element).build().perform();
		Thread.sleep(10000);
		Element = driver.findElement(By.xpath("//*[@id=\"container\"]/div/header/div[1]/div/div[3]/div[1]/div/div/div/div/div/div[2]/div/ul"));
		List<WebElement> lst = Element.findElements(By.tagName("li"));
		
		for(WebElement li : lst) {
			
			if(li.getText().equals(str)) {
				
				System.out.println(li.getText());
				return li;
			}
						
		}
		 
		System.out.println("i Shoult get executed");
		return Element;
	}

}
