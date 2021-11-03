package section13;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Lab099 {

	final static String url = "https://rahulshettyacademy.com/AutomationPractice";
	static int total = 0;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver89\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,600)");
		Thread.sleep(3000);
		js.executeScript("document.querySelector('.tableFixHead').scrollTop=120");

		List<WebElement> amounts = driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));

		int subtotal = 0;
		//Enrique Inicio
		for (WebElement amount : amounts) {
			subtotal += Integer.parseInt(amount.getText());
		}
		//Enrique Final
		/*Rahul
		 * int sum=0;
		 for(inti=0;i<values.size();i++)
		 {
		 	sum=sum+Integer.parseInt(values.get(i).getText());
		 }
		 
		 */
		total = subtotal;

		System.out.println(total);
		
		int totalAmount=Integer.parseInt(driver.findElement(By.cssSelector("div.totalAmount")).getText().split(":")[1].trim());
		
		if(total==totalAmount)
		{
			System.out.println("La suma es correcta");
		} else
		{
			System.out.println("La suma no es correcta");
		}
		
		Assert.assertEquals(totalAmount, total); //failure or success of test. 
		

		Thread.sleep(10000);
		driver.close();
		driver.quit();

	}

}