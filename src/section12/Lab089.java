package section12;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Lab089 {

	final static String url = "https://rahulshettyacademy.com/AutomationPractice";
	static int count=0;
	static int countFoot=0;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver89\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		count=driver.findElements(By.tagName("a")).size();
		System.out.println(count);
		WebElement footerdriver=driver.findElement(By.cssSelector("table[class='gf-t']"));
		countFoot=footerdriver.findElements(By.tagName("a")).size();
		System.out.println(countFoot);
		
		
		Thread.sleep(5000);
		driver.close();
		driver.quit();
		
		
		
	}

}