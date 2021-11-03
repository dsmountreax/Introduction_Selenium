package section06;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lab036 {
    public static void main(String[] args) {
    	
      
        String url2		 = "https://www.rediff.com/";
       

        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get(url2);    // Hit Url of rediff
        driver.findElement(By.cssSelector("a[title*='Sign in']")).click();
        driver.findElement(By.xpath("//input[contains(@id,'login')]")).sendKeys("usuario");
        driver.findElement(By.cssSelector("input#password")).sendKeys("goodbye");
        driver.findElement(By.cssSelector("input.signinbtn")).click();
        
      // Regular expression xpath
      // tagName[@contains(@attribute,'value')]
      //Css
      //tagName[Attribute*='value']
      //input[name*='username']
        
    }
}