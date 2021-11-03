package section12;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lab095 {

	final static String url = "https://www.path2usa.com/travel-companions";

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver89\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.findElement(By.id("travel_date")).click();
		driver.findElement(By.cssSelector("th.next")).click();
		List<WebElement> dates=driver.findElements(By.className("day"));
		
		for(WebElement date:dates)
		{
			String text=date.getText();
			
			if(text.equalsIgnoreCase("23")) //equalIgnoreCase revisa si son igual ignorando mayusculas 
			{
				date.click();
				break;
			}
			
		}
		
		Thread.sleep(10000);
		driver.close();
		driver.quit();

	}

}