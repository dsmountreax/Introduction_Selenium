package section08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Tarea01 {
	static String url1 = "https://rahulshettyacademy.com/AutomationPractice/";

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver89\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(url1); // Hit URL Flight Practice
		Assert.assertFalse(driver.findElement(By.cssSelector("input#checkBoxOption1")).isSelected());
		driver.findElement(By.cssSelector("input#checkBoxOption1")).click();
		Assert.assertTrue(driver.findElement(By.cssSelector("input#checkBoxOption1")).isSelected());
		driver.findElement(By.cssSelector("input#checkBoxOption1")).click();
		Assert.assertFalse(driver.findElement(By.cssSelector("input#checkBoxOption1")).isSelected());
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
	}
}