package section15;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


public class Lab113 {

	final static String page = "https://rahulshettyacademy.com/seleniumPractise/#/offers";

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver89\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(page);
		
		driver.findElement(By.xpath("//span[text()='Veg/fruit name']/following-sibling::span")).click();
		WebElement table=driver.findElement(By.cssSelector("table.table.table-bordered"));
		List<WebElement> topItems=table.findElements(By.cssSelector("td:nth-child(1)")); // Belleza td[2]
		List<String> original=topItems.stream().map(s->s.getText()).collect(Collectors.toList());
		List<String> itemsSort=original.stream().sorted().collect(Collectors.toList());
		
		/*
		 List<String> original=new ArrayList<String>();
		for(WebElement topItem:topItems)
		{
			original.add(topItem.getText());
			System.out.println(topItems.size());
			List<String> itemsSort=original.stream().sorted().collect(Collectors.toList());
			
			itemsSort.stream().forEach(s->System.out.println(s));
		
		if(original.equals(itemsSort))
		{
			System.out.println("Son iguales");
		}else {
			System.out.println("Son diferentes");
		}
		}
		*/
		
		Assert.assertTrue(original.equals(itemsSort));
		
		Thread.sleep(10000);
		driver.close();
		driver.quit();
	}

}
