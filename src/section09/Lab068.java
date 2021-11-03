package section09;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lab068 {

	final static String url = "https://rahulshettyacademy.com/seleniumPractise/#/";

	public static void main(String[] args) throws InterruptedException {

		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver89\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		String[] itemsNeeded= {"Cucumber","Brocolli","Beetroot"};
				
		driver.get(url);
		Thread.sleep(2000);
		List<WebElement> products=driver.findElements(By.cssSelector("h4.product-name"));
		
		
		for(int i=0; i<products.size(); i++)
		{
			String name=products.get(i).getText();
			System.out.println(name);
			
			List<String> itemsNeededList=Arrays.asList(itemsNeeded);
			
			if(itemsNeededList.contains(name))
			{
				driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
				//break;
			}

	}
}
}