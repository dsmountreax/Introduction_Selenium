package section08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lab051 {
	static String url1      = "https://rahulshettyacademy.com/dropdownsPractise/";

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		 System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get(url1);    // Hit URL Flight Practice
		 driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXTaction")).click();
		 driver.findElement(By.xpath("//a[@value='BLR']")).click();
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("(//a[@text='Chennai (MAA)'])[2]")).click();
		 
		 
		 
}
}