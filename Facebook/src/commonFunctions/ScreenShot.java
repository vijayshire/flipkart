package commonFunctions;
import flipkartFunctions.*;
import TestCases.*;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.AbstractWebDriverEventListener;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class ScreenShot extends AbstractWebDriverEventListener{
	
    public static String st ;
    public static int i=0;
	public File outputFile;
	public WebDriver driver1;
	public ScreenShot eventListener;
	public EventFiringWebDriver driver;
	public String appURL = "https://www.flipkart.com";
	public String testCaseName;
	public void beforeNavigateTo(String url, WebDriver driver1)  {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Before navigating to: '" + url + "'");
				
	}

	public void afterNavigateTo(String url, WebDriver driver1) {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Navigated to:'" + url + "'");
		i++;
		this.takeSnapShot(driver1, ""+st+"\\Step"+i+".png");
	}

	public void beforeClickOn(WebElement element, WebDriver driver1) {
		System.out.println("Trying to click on: ");
		
		}

	public void afterClickOn(WebElement element, WebDriver driver1) {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Clicked on: " + element.toString());
		i++;
		this.takeSnapShot(driver1, ""+st+"\\Step"+i+".png");
	}

	public void onException(Throwable error, WebDriver driver1) {
		System.out.println("Error occurred: " + error);
	}

	public WebDriver setup(String testName) {
		
		
		testCaseName = testName;
		// Initializing instance of Firefox WebDriver
		
		String timeStamp = new SimpleDateFormat("yyyyMMdd").format(Calendar.getInstance().getTime());
		outputFile = new File("C://Users//vijay//eclipse-workspace//Facebook//test-output//vijay-report//"+timeStamp);
		if (!outputFile.exists()) {
			outputFile.mkdir();
			System.out.println("Folder created " + outputFile);
		}
	    st = outputFile.getAbsolutePath();
        outputFile = new File(st+"//"+testCaseName);
        if (!outputFile.exists()) {
			outputFile.mkdir();
			System.out.println("Test CaseFolder created " + outputFile);
			
		}
        st =""+ outputFile;
                
	    System.setProperty("webdriver.chrome.driver", "G:\\chromedriver.exe");
		 driver1 = new ChromeDriver();
		 		 
		 driver1.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		 //driver.get("https://www.flipkart.com");
		// Initializing EventFiringWebDriver using Firefox WebDriver instance
		driver = new EventFiringWebDriver(driver1);

		// Now create object of EventListerHandler to register it with EventFiringWebDriver
		eventListener = new ScreenShot();

		((EventFiringWebDriver) driver).register(eventListener);
	
		driver.manage().window().maximize();
		driver.get(appURL);
	    i = 0;
		return driver;
	}
	
	public void takeSnapShot(WebDriver driver1,String fileWithPath){

        //Convert web driver object to TakeScreenshot

        TakesScreenshot scrShot =((TakesScreenshot)driver1);

        //Call getScreenshotAs method to create image file

                File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);

            //Move image file to new destination

                File DestFile=new File(fileWithPath);

                //Copy file at destination

                try {
					FileUtils.copyFile(SrcFile, DestFile);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

    }

	
	
}




