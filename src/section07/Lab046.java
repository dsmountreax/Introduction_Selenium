package section07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lab046 {
	static String url1      = "https://login.salesforce.com";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 
		 driver.get(url1);    // Hit Url salesforce
		 driver.findElement(By.cssSelector("[class='input r4 wide mb16 mt8 username']")).sendKeys("usuario");
		 driver.findElement(By.cssSelector("input[id='password']")).sendKeys("12345");
		 driver.findElement(By.xpath("//input[@id='Login']")).click();
	}

}
