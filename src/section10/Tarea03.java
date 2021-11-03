package section10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Tarea03 {
	final static String url = "https://www.itgeared.com/demo/1506-ajax-loading.html";

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver89\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		WebDriverWait w=new WebDriverWait(driver,5);		//explicit wait
		
		driver.get(url);
		driver.findElement(By.xpath("//a[@href='javascript: void(0);loadAjax();']")).click();
	
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div#results")));
		
		System.out.println(driver.findElement(By.cssSelector("div#results")).getText());
		
	}
}