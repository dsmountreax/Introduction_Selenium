package section15;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


public class Lab114 {

	final static String page = "https://rahulshettyacademy.com/seleniumPractise/#/offers";

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver89\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(page);
		
		driver.findElement(By.xpath("//span[text()='Veg/fruit name']/following-sibling::span")).click();
		WebElement table=driver.findElement(By.cssSelector("table.table.table-bordered"));
		List<WebElement> topItems=table.findElements(By.cssSelector("td:nth-child(1)")); // Belleza td[2] css children
		List<String> original=topItems.stream().map(s->s.getText()).collect(Collectors.toList());
		List<String> itemsSort=original.stream().sorted().collect(Collectors.toList());
		
		Assert.assertTrue(original.equals(itemsSort));
		
		List<String> price=topItems.stream().filter(s->s.getText().contains("Beans"))
				.map(s->getPriceVeggie(s))
				.collect(Collectors.toList());
		
		price.stream().forEach(s->System.out.println(s));
		
		// siblings and text with xpath
		//WebElement s=table.findElement(By.xpath("//*[contains(text(),'Beans')]"));  // xpath con texto  //*[text()='Beans']" xpath con contains//*[contains(text(),'Get started ')]"
		//String precio=s.findElement(By.xpath("following-sibling::td[1]")).getText(); //xpath sibiling "following-sibling::td[1]"  
		
		Thread.sleep(10000);
		driver.close();
		driver.quit();
	}

	
	private static String getPriceVeggie(WebElement s) {
		
		String pricesVeggies=s.findElement(By.xpath("following-sibling::td[1]")).getText(); //moverse al siguiente sibiling
		
		return pricesVeggies;
	}
	

}
