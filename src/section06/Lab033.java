package section06;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lab033 {
	
	
	 
	public static void main(String[] args) {
		
		
		String url1="https://login.salesforce.com";
		String respuesta="";
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get(url1);			//Hit Url of Salesforce
		driver.findElement(By.id("username")).sendKeys("hello");
		driver.findElement(By.name("pw")).sendKeys("123456");
		driver.findElement(By.xpath("//*[@id=\'Login\']")).click();
		respuesta=driver.findElement(By.cssSelector("#error")).getText();
		System.out.println("la " + respuesta);
		//Remember $(#Loginjkl) y $("#Login")
	}
}