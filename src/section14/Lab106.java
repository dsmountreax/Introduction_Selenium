package section14;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lab106 {

	final static String url="https://rahulshettyacademy.com/AutomationPractice/";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver89\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
		driver.get(url);
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println("Este es el numero de links en la pagina: "+links.size());
		
		List<String> enlaces=new ArrayList<String>();
		
		//Broken Url
		
		for(WebElement link:links)
		{
			enlaces.add(link.getAttribute("href"));
	
		}
		
		for(String enlace:enlaces)  
			{
			  System.out.println(enlace);    
			}  
		
	}

}
