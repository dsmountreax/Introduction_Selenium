package section05;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Laboratorio004 {

	public static void main(String[] args) {
		String path=System.getProperty("user.dir");
		String pathChrome=path+"\\drivers\\Chrome\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",pathChrome);

		WebDriver driver = new ChromeDriver();
		driver.get("http://facebook.com");			//Hit Url of facebook
		driver.findElement(By.id("email")).sendKeys("This is my first code");
	}

}
