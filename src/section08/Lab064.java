package section08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lab064 {
	final static String url1 = "https://rahulshettyacademy.com/AutomationPractice/";

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		String text = "Enrique";

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver89\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get(url1);
		driver.findElement(By.cssSelector("input#name.inputs")).sendKeys(text);
		driver.findElement(By.cssSelector("input#alertbtn.btn-style")).click();

		// Snipet sysout then ctrl+space
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		driver.findElement(By.cssSelector("input#confirmbtn.btn-style")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().dismiss();
	}
}
