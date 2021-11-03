package section06;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lab034 {
    public static void main(String[] args) {
        String url       = "http://facebook.com";
       

        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get(url);    // Hit Url of Salesforce
        driver.findElement(By.id("email")).sendKeys("hello");
        driver.findElement(By.name("pass")).sendKeys("123456");
        driver.findElement(By.xpath("//button[@data-testid='royal_login_button']")).click();

        // tagName[@attribute='value']
        // button[@data-testid='royal_login_button']
        // Remember $(#Loginjkl) y $x("//button[@data-testid='royal_login_button']")
    }
}



