package section08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//TestNg

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Lab057 {
	static String url1 = "https://rahulshettyacademy.com/dropdownsPractise/";

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\Work\\chromedriver89\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(url1); // Hit URL Flight Practice
		Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='ctl00_mainContent_chk_friendsandfamily']")).isSelected());
		/*System.out.println(
				driver.findElement(By.cssSelector("input[id*='ctl00_mainContent_chk_friendsandfamily']")).isSelected());*/
		driver.findElement(By.cssSelector("input[id*='ctl00_mainContent_chk_friendsandfamily']")).click();
		// <input id="ctl00_mainContent_chk_friendsandfamily" type="checkbox"
		// name="ctl00$mainContent$chk_friendsandfamily" class="">
		System.out.println(
				driver.findElement(By.cssSelector("input[id*='ctl00_mainContent_chk_friendsandfamily']")).isSelected());
		Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='ctl00_mainContent_chk_friendsandfamily']")).isSelected());
		//AssertEquals(string, string) 
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
	}
}