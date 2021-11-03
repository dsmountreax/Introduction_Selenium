package section10;

import java.util.Arrays;
import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Lab075 {
	final static String url = "https://rahulshettyacademy.com/seleniumPractise/#/";

	public static void main(String[] args) throws InterruptedException {

		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver89\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		WebDriverWait w=new WebDriverWait(driver,5);//explicit wait
		
		
		
		
		String[] itemsNeeded = { "Cucumber", "Brocolli", "Beetroot", "Carrot" };

		driver.get(url);
		Thread.sleep(3000);
		addItems(driver,itemsNeeded);
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		driver.findElement(By.xpath("//button[@type='button']")).click();
		//Thread.sleep(3000);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@class='promoCode']")));
		driver.findElement(By.xpath("//input[@class='promoCode']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("button[class='promoBtn']")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.className("promoInfo"))); // Condiciones esperadas
		System.out.println(driver.findElement(By.className("promoInfo")).getText());
		
		Thread.sleep(20000);
		driver.quit();

	}

	public static void addItems(WebDriver driver, String[] itemsNeeded) {
		int j = 0;

		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));

		for (int i = 0; i < products.size(); i++) {

			// String name=products.get(i).getText();
			String[] name = products.get(i).getText().split("-");
			String formattedName = name[0].trim(); // Elimina los espacios en blanco
			List<String> itemsNeededList = Arrays.asList(itemsNeeded);

			if (itemsNeededList.contains(formattedName)) {
				j++;
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();

				// break;
				// Thread.sleep(6000);

				if (j == itemsNeeded.length) {
					break;
				}
			}
		}
		
	}

}
