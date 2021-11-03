package section07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;


public class Lab044 {

public static void main(String[] args) throws InterruptedException {
// TODO Auto-generated method stub
	String url       = "http://facebook.com";
	
	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");

    WebDriver driver = new ChromeDriver();


    driver.get(url);
    driver.findElement(By.xpath("//button[text()='Entrar']")).click();
    //driver.findElement(By.xpath("//ul[@class='responsive-tabs__list']/li[1]/following-sibling::li[2]")).click();
    //System.out.println(driver.findElement(By.xpath(".//*[@id='tablist1-tab2']/parent::ul")).getAttribute("role"));
}
}