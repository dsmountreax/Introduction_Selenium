package section11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;


public class Tarea05 {

	final static String url = "https://the-internet.herokuapp.com";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver89\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		
		driver.findElement(By.linkText("Nested Frames")).click();
		
		driver.switchTo().frame(0); 	
		driver.switchTo().frame(1);
		System.out.println(driver.findElement(By.id("content")).getText());
		driver.switchTo().defaultContent(); 
	}
}