package section08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Lab062 {

	static String url1 = "https://www.spicejet.com/";
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver89\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(url1);
		
		//driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXTaction")).click();						  
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@text='Chennai (MAA)'])[2]")).click();
		
		driver.findElement(By.xpath("//a[contains(@class,'ui-state-default ui-state-highlight')]")).click();
		
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))
		{
			System.out.print("it's disable");
				Assert.assertTrue(false);	
		} else
		{
			Assert.assertTrue(true);
		}
		
		driver.findElement(By.cssSelector("input[id*='ctl00_mainContent_chk_SeniorCitizenDiscount']")).click();
		
		driver.findElement(By.cssSelector("div#divpaxinfo.paxinfo")).click();
		WebElement staticDropdown=driver.findElement(By.cssSelector("select#ctl00_mainContent_ddl_Adult.wMed1s.required"));
		Select dropdown=new Select(staticDropdown);
		dropdown.selectByIndex(4);
		
		//driver.findElement(By.cssSelector("select#ctl00_mainContent_DropDownListCurrency")).click();
		WebElement staticDropdown2=driver.findElement(By.cssSelector("select#ctl00_mainContent_DropDownListCurrency"));
		Select dropdown2=new Select(staticDropdown2);
		dropdown2.selectByIndex(5);
		
		driver.findElement(By.cssSelector("input#ctl00_mainContent_btn_FindFlights")).click();
		
		
	}

}
