package section08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Lab048 {
	static String url1      = "https://rahulshettyacademy.com/dropdownsPractise/";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get(url1);    // Hit Url salesforce
		 //dropdown with select tag
		 WebElement staticDropdown=driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		 Select dropdown= new Select(staticDropdown);
		 dropdown.selectByIndex(1);
		 System.out.println(dropdown.getFirstSelectedOption().getText());
		 dropdown.selectByVisibleText("USD");
		 System.out.println(dropdown.getFirstSelectedOption().getText());
		 dropdown.selectByValue("AED");
		 System.out.println(dropdown.getFirstSelectedOption().getText());
		 
		 
		 
	}

}
