package section06;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lab029 {
	
	
	 
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		//driver.get("https://login.salesforce.com");			//Hit Url of Salesforce
		//driver.findElement(By.id("username")).sendKeys("hello");
		//driver.findElement(By.name("pw")).sendKeys("123456");
		//driver.findElement(By.className("button r4 wide primary")).click(); // Error compound class
		driver.get("http://facebook.com");
		//driver.findElement(By.className("inputtext")).sendKeys("joder");
		driver.findElement(By.name("login")).click();
		
		

	}

}