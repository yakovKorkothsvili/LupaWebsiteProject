/**
 * 
 */
package baseClass;


import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;


/**
 * @author yakov
 *
 */
public class BaseClass {
 
	static String HomePageURL="https://www.lupa.co.il/";
	public static WebDriver driver;
	 protected JavascriptExecutor js;
	 protected Actions act;
	 protected String Email="jsmhoni@gmail.com";
	 protected String Emailpassword="PM:uj4yVu-!nRGw";
	
	//@Parameters("Chrome")
	@BeforeTest
	protected void Setup() {
		  String Browser="Chrome";
		  
		if (Browser.equals("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		else if (Browser.equals("Edge")) {
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}
		timeout();
        js=(JavascriptExecutor)driver;
        act=new Actions(driver);
		driver.get(HomePageURL);
		driver.manage().window().maximize();
		driver.findElement(By.id("Layer_1")).click();
		driver.findElement(By.xpath("//div[@aria-label='close']")).click();

	}
	@AfterTest
	protected void AfterTest() {
		//driver.quit();
	}
	

	protected void clickOnFunction(WebElement ElementFunction) {
		 js.executeScript("arguments[0].click();", ElementFunction);
		}
	
	public void sendKeysTo(WebElement Element, String Keys) {
		Element.sendKeys(Keys);
	}
	public void Goback() {
		driver.navigate().back();
	}
	public void clickOnElement(WebElement Element) {
		Element.click();
	}
	
	protected String takeTextUsingJS(WebElement Element) {
	String a=(String) js.executeScript("return arguments[0].innerHTML;", Element);
	return a;
	}
	protected void timeout() {
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}
	

     
}
