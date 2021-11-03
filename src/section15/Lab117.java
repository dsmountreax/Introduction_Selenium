package section15;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


public class Lab117 {

	final static String page = "https://rahulshettyacademy.com/seleniumPractise/#/offers";

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver89\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(page);
	
		driver.findElement(By.cssSelector("input#search-field")).sendKeys("Rice");
		WebElement table=driver.findElement(By.cssSelector("table.table.table-bordered"));
		List<WebElement> items=table.findElements(By.cssSelector("td:nth-child(1)"));
		List<WebElement> resultados=items.stream().filter(s->s.getText().contains("Rice")).collect(Collectors.toList());
		
		/*
		if ((resultados.size())==(items.size())) {
			System.out.println("Si se encontraron resultados");
		} else
		{
			System.out.println("No se encontraron resultados");
		}
		 */
		
		Assert.assertEquals(resultados.size(), items.size());
		
		Thread.sleep(10000);
		driver.close();
		driver.quit();
		
	}

	
	
	
	

}
