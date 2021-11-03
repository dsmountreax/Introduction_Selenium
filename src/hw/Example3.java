package hw;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.google.common.base.Function;

public class Example3 {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test();
		}
	
	
public static void test(){
	String url="https://www.google.com";
	String path=System.getProperty("user.dir");
	String pathChrome=path+"\\drivers\\Chrome\\chromedriver.exe";
	System.setProperty("webdriver.chrome.driver", pathChrome);
	 WebDriver driver = new ChromeDriver();
	 driver.get(url);
	 driver.findElement(By.name("q")).sendKeys("Prueba");
	 driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
	 driver.findElement(By.cssSelector("span.SJajHc.NVbCr")).click();
	 
	 
	 //Fluent Wait 
	 Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofSeconds(1)).ignoring(NoSuchElementException.class);
	   
	   WebElement element = wait.until(new Function<WebDriver, WebElement>() {
	     public WebElement apply(WebDriver driver) {
	    	 
	    	 WebElement linkElement=driver.findElement(By.cssSelector("h3.LC20lb.DKV0Md"));
	    	 
	    	 if(linkElement.isEnabled())
	    	 {
	    		 System.out.println("El elemento ha sido hallado");
	    	 }
	    	 
	    	 return linkElement;
	     }
	   });
	   
	   element.click();
	   
	   driver.close();
	   driver.quit();
}
}
