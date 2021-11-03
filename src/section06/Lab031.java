package section06;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lab031 {
	
	
	 
	public static void main(String[] args) {
		
		String url="http://facebook.com";
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get(url);			//Hit Url of Salesforce
		//driver.findElement(By.cssSelector("#u_0_d_Gc")).click(); //Remeber Selector
		
		//Facebook Xpath
		//$x("//*[@id='u_0_a_bg']/div[3]/a")
		//Salesforce css style
		//$("#Login")
		
	}

}