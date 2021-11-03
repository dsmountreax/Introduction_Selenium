package section08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lab064 {
	final static String url1 = "https://rahulshettyacademy.com/AutomationPractice/";

	public static void main(String[] args) throws InterruptedException {

		// TODO Auto-generated method stub
		String text = "Enrique";
		String path=System.getProperty("user.dir");
		String pathChrome=path+"\\drivers\\Chrome\\chromedriver.exe";

		System.setProperty("webdriver.chrome.driver", pathChrome);

		WebDriver driver = new ChromeDriver();

		driver.get(url1);
		driver.findElement(By.cssSelector("input#name.inputs")).sendKeys(text);
		driver.findElement(By.cssSelector("input#alertbtn.btn-style")).click();

		// Snipet sysout then ctrl+space
		Thread.sleep(3000);
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();

		driver.findElement(By.cssSelector("input#confirmbtn.btn-style")).click();
		System.out.println(driver.switchTo().alert().getText());
		Thread.sleep(3000);
		driver.switchTo().alert().dismiss();
		driver.close();
	}
}
