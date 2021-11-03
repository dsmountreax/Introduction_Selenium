package section12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Tarea06B {

	final static String url = "https://rahulshettyacademy.com/AutomationPractice";
	static String label="";
	static String alert="";

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver89\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		
		WebElement checkbox=driver.findElement(By.cssSelector("input[value='option3']"));
		checkbox.click();
		
		label=driver.findElement(By.cssSelector("label[for='honda']")).getText();
		System.out.println(label);
		
		WebElement staticDropdown=driver.findElement(By.id("dropdown-class-example"));
		Select dropdown=new Select(staticDropdown);
		dropdown.selectByVisibleText(label);
		
		driver.findElement(By.cssSelector("input#name.inputs")).sendKeys(label);
		
		driver.findElement(By.id("alertbtn")).click();
		alert=driver.switchTo().alert().getText();
		System.out.println(alert);
		driver.switchTo().alert().accept();
		
		System.out.println(alert.split("Hello")[1].trim().split(",")[0]);
		
		if(label.equals((alert.split("Hello")[1].trim().split(",")[0])))
		{
			System.out.println("It's present");
		}else
		{
			System.out.println("It does not present");
		}
				
		Thread.sleep(5000);
		driver.close();
		driver.quit();
		
	}

}