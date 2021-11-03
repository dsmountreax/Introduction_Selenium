package section11;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class Tarea04 {

	final static String url = "https://the-internet.herokuapp.com/windows";
	static String message01 ="";
	static String message02 ="";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver89\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		
		driver.findElement(By.cssSelector("a[target='_blank']")).click();
		

		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		String parentId = it.next();
		String childId = it.next();
		driver.switchTo().window(childId);
		message01 = driver.findElement(By.xpath("//div[@class='example']//h3")).getText();
		System.out.println(message01);
		driver.switchTo().window(parentId);
		message02=driver.findElement(By.cssSelector("div[class='example'] h3")).getText();
		System.out.println(message02);

	}

}