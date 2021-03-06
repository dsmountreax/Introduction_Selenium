package section14;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


public class Lab108 {

	final static String page = "https://rahulshettyacademy.com/AutomationPractice/";

	public static void main(String[] args) throws MalformedURLException, IOException, InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Work\\chromedriver89\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(page);
		List<WebElement> links = driver.findElements(By.cssSelector("li[class='gf-li'] a"));
		
		for (WebElement link : links) {
			String url = link.getAttribute("href");

			HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
			conn.setRequestMethod("HEAD");
			conn.connect();
			int respCode = conn.getResponseCode();
			System.out.println(respCode);
			
			if (respCode > 400) {
				System.out.println("The link with the Text " + link.getText()+" is broken with code "+respCode);
				Assert.assertTrue(false);
			}

		}

		Thread.sleep(10000);
		driver.close();
		driver.quit();
	}

}
