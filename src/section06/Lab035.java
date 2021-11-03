package section06;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lab035 {
    public static void main(String[] args) {
    	
        String url       = "http://facebook.com";
       

        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get(url);    // Hit Url of Salesforce
        /*driver.findElement(By.xpath("//input[@data-testid='royal_email']")).sendKeys("correo@falso.com");
        driver.findElement(By.xpath("//input[@data-testid='royal_pass']")).sendKeys("Pass");
        driver.findElement(By.xpath("//button[@data-testid='royal_login_button']")).click();*/ 
        //Css tagName[attribute='value']
        
        driver.findElement(By.cssSelector("input[data-testid='royal_email']")).sendKeys("correo@falso.com");
        driver.findElement(By.cssSelector("input[data-testid='royal_pass']")).sendKeys("Pass");
        driver.findElement(By.cssSelector("button[data-testid='royal_login_button']")).click();
        
        /*Css
        tagName#id- Css
        input#username
        tagname.classname*/
        
    }
}

