package section14;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.commons.io.FileUtils;

public class Lab105 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String path=System.getProperty("user.dir");
		System.out.println(path);
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\Work\\chromedriver89\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://google.com");
		
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src,new File(path+"\\src\\section14\\screenshot.png"));//FileUtils
		
	}

}
