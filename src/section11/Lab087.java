package section11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Lab087 {

	final static String url = "https://jqueryui.com/droppable/";
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver89\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		System.out.println(driver.findElements(By.tagName("iframe")).size());
		driver.switchTo().frame(0); // indica el indice del frame. 
		//driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']"))); // entrar en frame con locator
		driver.findElement(By.cssSelector("div[id='draggable'] p")).click();// no se puede seleccionar porque esta en un frame
		Actions a =new Actions(driver);
		WebElement source=driver.findElement(By.id("draggable"));
		WebElement target=driver.findElement(By.id("droppable"));
		a.dragAndDrop(source,target).build().perform();
		driver.switchTo().defaultContent();// te devuelve al contenido original 
		
		
	}

}