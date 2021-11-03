package section08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Tarea02 {
	static String url1 = "https://www.cleartrip.com";
	static String message = "";

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver89\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(url1); // Hit URL Flight Practice
		// Thread.sleep(4000);
		driver.findElement(By.cssSelector("i.icon.ir.datePicker")).click();
		driver.findElement(By.cssSelector("a.ui-state-default.ui-state-highlight.ui-state-active")).click();

		WebElement staticDropdown = driver.findElement(By.id("Adults"));
		Select dropdown = new Select(staticDropdown);
		dropdown.selectByIndex(1);

		WebElement staticDropdown2 = driver.findElement(By.id("Childrens"));
		Select dropdown2 = new Select(staticDropdown2);
		dropdown2.selectByIndex(1);

		driver.findElement(By.cssSelector("a#MoreOptionsLink.weak")).click();
		driver.findElement(By.id("AirlineAutocomplete")).sendKeys("Indigo");
		driver.findElement(By.id("SearchBtn")).click();
		message = driver.findElement(By.id("homeErrorMessage")).getText();
		System.out.println(message);

	}
}