package section13;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tarea07 {

	final static String url = "https://rahulshettyacademy.com/AutomationPractice";

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver89\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,600)");
		Thread.sleep(3000);
			
		List<WebElement> rows = driver.findElements(By.cssSelector("table[class='table-display'] tr"));
		//recordar el scope WebElement.findElements(By.tagName("tr")).size();
		System.out.println("The number of rows are: " + rows.size());

		List<WebElement> columns = driver.findElements(By.cssSelector("table[class='table-display'] tr th"));
		//recordar WebElement.findElements(By.tagName("tr")).get(0).findElements(By.tagName("td"));
		System.out.println("The number of columns are: " + columns.size());

		List<WebElement> rows3 = driver.findElements(By.xpath("//table[@class='table-display']//tr[3]//td"));
		//System.out.println("The number of row3 are: " + rows3.size());

		String message = "";
		for (WebElement row : rows3) {
			message += row.getText() + " ";
		}

		System.out.println("This is the content of row " + message);

		Thread.sleep(10000);
		driver.close();
		driver.quit();
	}

}