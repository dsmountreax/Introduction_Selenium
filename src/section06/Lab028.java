package section06;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lab028 {
	
	
	 
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://facebook.com");			//Hit Url of facebook
		driver.findElement(By.id("email")).sendKeys("This is my first code");
		driver.findElement(By.name("pass")).sendKeys("12345");
		driver.findElement(By.linkText("¿Has olvidado la contraseña?")).click();

	}

}