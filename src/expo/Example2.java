package expo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example2 {
	static String url1      = "https://rahulshettyacademy.com/dropdownsPractise/";

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String path=System.getProperty("user.dir");
		String pathChrome=path+"\\drivers\\Chrome\\chromedriver.exe";
		 System.setProperty("webdriver.chrome.driver", pathChrome);
		 WebDriver driver = new ChromeDriver();
		 driver.get(url1);    // Hit URL Flight Practice
		 //driver.findElement(By.id("autosuggest")).click();
		 driver.findElement(By.id("autosuggest")).sendKeys("Ind");
		 //Thread.sleep(6000);
		 List<WebElement> options =driver.findElements(By.cssSelector("li[class='ui-menu-item'] a")); 
				
		 for(WebElement option:options)
		 {
			 System.out.println(option.getText());
			 
			 if (option.getText().equalsIgnoreCase("India"))
			 {
				 option.click();
				 break;
				 
			 }
			 
		 }
				 
		
		 
		 
		 
}
}