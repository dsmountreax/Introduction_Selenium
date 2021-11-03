package section05;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;

public class Demo {

	public static void main(String[] args) {
		String path=System.getProperty("user.dir");
		String pathChrome=path+"\\drivers\\Chrome\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",pathChrome);
		//ChromeOptions options=new ChromeOptions();
		//options.addArguments("headless");
		//WebDriver driver = new ChromeDriver(options);
		System.out.println(pathChrome);
		WebDriver driver = new ChromeDriver();
		driver.get("http://google.com");			//Hit Url on the browser
		System.out.println(driver.getTitle());		//validate if your page title is correct 
		System.out.println(driver.getCurrentUrl()); //validate if you are landed on correct Url
		//System.out.println(driver.getPageSource()); //print page source
		// Class 25 
		driver.get("http://yahoo.com");
		driver.navigate().back();
		driver.navigate().forward();
		driver.close();									//It closes current browser
		driver.quit();	//It closes all the browsers open by Selenium script
	}

}
