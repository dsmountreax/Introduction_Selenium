package section11;


import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;


public class Lab084 {

	final static String url = "https://rahulshettyacademy.com/loginpagePractise/#";
	static String email="";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver89\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.findElement(By.cssSelector("a.blinkingText")).click();
		Set<String> windows=driver.getWindowHandles();
		Iterator<String> it=windows.iterator();
		String parentId=it.next();
		String childId=it.next();
		driver.switchTo().window(childId);
		email=driver.findElement(By.xpath("//p[@class='im-para red']//a")).getText();
		driver.switchTo().window(parentId);
		driver.findElement(By.id("username")).sendKeys(email);
		
		
		
		
	}

}