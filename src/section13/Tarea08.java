package section13;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tarea08 {

	final static String url = "https://rahulshettyacademy.com/AutomationPractice";

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver89\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		
		WebElement autocomplete = driver.findElement(By.id("autocomplete"));
		autocomplete.sendKeys("Uni");
		Thread.sleep(3000);

		for (int i = 0; i < 6; i++) {
			autocomplete.sendKeys(Keys.DOWN);
			//System.out.println(i);

			if (i == 5) {
				autocomplete.sendKeys(Keys.ENTER);
			}
		}
		//Repasar sibling y parent child
		System.out.println(autocomplete.getAttribute("value"));
		
		Thread.sleep(5000);
		driver.close();
		driver.quit();

	}

}