package section08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;



public class Lab049 {
	static String url1      = "https://rahulshettyacademy.com/dropdownsPractise/";

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		 System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get(url1);    // Hit URL Flight Practice
		 driver.findElement(By.cssSelector("div#divpaxinfo.paxinfo")).click();
		 //Thread.sleep(2000);
		 //driver.findElement(By.id("hrefIncAdt")).click();
			 Thread.sleep(2000);
			 
			 /*
			  * int i =1;
			 
			 while(i<5)
			 {
				 driver.findElement(By.cssSelector("span#hrefIncAdt.pax-add.pax-enabled")).click();
				 i++;
			 }
			 */
			 
			 System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
			 for(int i=1; i<5; i++)
			 {
				 driver.findElement(By.cssSelector("span#hrefIncAdt.pax-add.pax-enabled")).click();
				 Thread.sleep(1000);
				 
			 }
			 
		 driver.findElement(By.id("btnclosepaxoption")).click();
		 System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		 
	}

}
