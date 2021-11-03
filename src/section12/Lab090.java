package section12;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lab090 {

	final static String url = "https://rahulshettyacademy.com/AutomationPractice";

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver89\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);

		System.out.println(driver.findElements(By.tagName("a")).size());
		WebElement footerdriver = driver.findElement(By.cssSelector("table[class='gf-t']")); // limitar el scope a un
																								// elemento.

		System.out.println(footerdriver.findElements(By.tagName("a")).size());

		WebElement columndriver = driver.findElement(By.cssSelector("table[class='gf-t'] tbody tr td"));
		System.out.println(columndriver.findElements(By.tagName("a")).size());

		for (int i = 1; i < columndriver.findElements(By.tagName("a")).size(); i++) {
			String clickonlink = Keys.chord(Keys.CONTROL, Keys.ENTER); // importante similar a crtl + click
			columndriver.findElements(By.tagName("a")).get(i).sendKeys(clickonlink);
			Thread.sleep(5000);

		}

		Set<String> abc = driver.getWindowHandles();
		Iterator<String> it = abc.iterator();

		while (it.hasNext()) {
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
		}

		Thread.sleep(5000);
		driver.close();
		driver.quit();

	}

}