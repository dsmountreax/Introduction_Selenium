package section08;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HM001 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		mensaje();
	}
	
	static void idAuto() throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver89\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
	
	//driver.findElement(By.name("pw")).sendKeys("123456");
	//driver.findElement(By.className("button r4 wide primary")).click(); // Error compound class
	
	driver.get("https://www.amazon.com/");
	driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
	/*<span id="nav-link-accountList-nav-line-1" 
	 * 		class="nav-line-1 nav-progressive-content">
	 * Hola, Identifícate
	 * </span>
	 */
	driver.findElement(By.id("ap_email")).sendKeys("dsvisage@gmail.com");
	/*<input type="email" 
	 *maxlength="128" 
	 *id="ap_email" 
	 *name="email" 
	 *tabindex="1" 
	 *class="a-input-text a-span12 auth-autofocus auth-required-field" 
	 *xpath="1"> 
	 */
	driver.findElement(By.id("continue")).click();
	/*<input id="continue" 
	 * tabindex="5" 
	 * class="a-button-input" 
	 * type="submit" 
	 * aria-labelledby="continue-announce" 
	 * xpath="1">
	 */
	driver.findElement(By.id("ap_password")).sendKeys("Amazon1234");
	  /* <input type="password" 
	   * maxlength="1024" 
	   * id="ap_password" 
	   * name="password" 
	   * tabindex="2" 
	   * class="a-input-text a-span12 auth-autofocus auth-required-field" 
	   * xpath="1">
	   */
	driver.findElement(By.id("signInSubmit")).click();
	/*<input 
	 * id="signInSubmit" 
	 * tabindex="5" 
	 * class="a-button-input" 
	 * type="submit" 
	 * aria-labelledby="auth-signin-button-announce" 
	 * xpath="1">
	 */
	
	//driver.findElement(By.xpath("//a[@id='nav-item-signout']")).
	/* <span 
	 * class="nav-line-2 nav-long-width" 
	 * xpath="1">
	 * Account &amp; Lists
	 * <span 
	 * class="nav-icon nav-arrow null" 
	 * style="visibility: visible;">
	 * </span>
	 * </span>
	 */
	
	
	Thread.sleep(6000);
	driver.close();	
	}
	
	static void nameAuto() throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
	
	//driver.findElement(By.className("button r4 wide primary")).click(); // Error compound class
	
	driver.get("https://www.amazon.com/");
	driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
	/*<span id="nav-link-accountList-nav-line-1" 
	 * 		class="nav-line-1 nav-progressive-content">
	 * Hola, Identifícate
	 * </span>
	 */
	driver.findElement(By.name("email")).sendKeys("dsvisage@gmail.com");
	/*<input type="email" 
	 *maxlength="128" 
	 *id="ap_email" 
	 *name="email" 
	 *tabindex="1" 
	 *class="a-input-text a-span12 auth-autofocus auth-required-field" 
	 *xpath="1"> 
	 */
	driver.findElement(By.id("continue")).click();
	/*<input id="continue" 
	 * tabindex="5" 
	 * class="a-button-input" 
	 * type="submit" 
	 * aria-labelledby="continue-announce" 
	 * xpath="1">
	 */
	driver.findElement(By.name("password")).sendKeys("Amazon1234");
	  /* <input type="password" 
	   * maxlength="1024" 
	   * id="ap_password" 
	   * name="password" 
	   * tabindex="2" 
	   * class="a-input-text a-span12 auth-autofocus auth-required-field" 
	   * xpath="1">
	   */
	driver.findElement(By.id("signInSubmit")).click();
	/*<input 
	 * id="signInSubmit" 
	 * tabindex="5" 
	 * class="a-button-input" 
	 * type="submit" 
	 * aria-labelledby="auth-signin-button-announce" 
	 * xpath="1">
	 */
	Thread.sleep(6000);
	driver.close();	
	}
	
	static void classAuto() throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
	
	//driver.findElement(By.className("button r4 wide primary")).click(); // Error compound class
	
	driver.get("https://www.amazon.com/");
	driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
	/*<span id="nav-link-accountList-nav-line-1" 
	 * 		class="nav-line-1 nav-progressive-content">
	 * Hola, Identifícate
	 * </span>
	 */
	driver.findElement(By.name("email")).sendKeys("dsvisage@gmail.com");
	/*<input type="email" 
	 *maxlength="128" 
	 *id="ap_email" 
	 *name="email" 
	 *tabindex="1" 
	 *class="a-input-text a-span12 auth-autofocus auth-required-field" 
	 *xpath="1"> 
	 */
	driver.findElement(By.className("a-button-input")).click();
	/*<input id="continue" 
	 * tabindex="5" 
	 * class="a-button-input" 
	 * type="submit" 
	 * aria-labelledby="continue-announce" 
	 * xpath="1">
	 */
	driver.findElement(By.name("password")).sendKeys("Amazon1234");
	  /* <input type="password" 
	   * maxlength="1024" 
	   * id="ap_password" 
	   * name="password" 
	   * tabindex="2" 
	   * class="a-input-text a-span12 auth-autofocus auth-required-field" 
	   * xpath="1">
	   */
	driver.findElement(By.className("a-button-input")).click();
	/*<input 
	 * id="signInSubmit" 
	 * tabindex="5" 
	 * class="a-button-input" 
	 * type="submit" 
	 * aria-labelledby="auth-signin-button-announce" 
	 * xpath="1">
	 */
	Thread.sleep(6000);
	driver.close();	
	}
	
	static void cssSelectorAuto() throws InterruptedException
	{
		  //Css
	      //tagName[Attribute*='value']
	      //input[name*='username']
	     
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
	
	//driver.findElement(By.className("button r4 wide primary")).click(); // Error compound class
	
	driver.get("https://www.amazon.com/");
	driver.findElement(By.cssSelector("span[id*='nav-link-accountList-nav-line-1']")).click();
	/*<span id="nav-link-accountList-nav-line-1" 
	 * 		class="nav-line-1 nav-progressive-content">
	 * Hola, Identifícate
	 * </span>
	 */
	driver.findElement(By.cssSelector("input[id*='ap_email']")).sendKeys("dsvisage@gmail.com");
	/*<input type="email" 
	 *maxlength="128" 
	 *id="ap_email" 
	 *name="email" 
	 *tabindex="1" 
	 *class="a-input-text a-span12 auth-autofocus auth-required-field" 
	 *xpath="1"> 
	 */
	driver.findElement(By.cssSelector("input[id*='continue']")).click();
	/*<input id="continue" 
	 * tabindex="5" 
	 * class="a-button-input" 
	 * type="submit" 
	 * aria-labelledby="continue-announce" 
	 * xpath="1">
	 */
	driver.findElement(By.cssSelector("input[id*='ap_password']")).sendKeys("Amazon1234");
	  /* <input type="password" 
	   * maxlength="1024" 
	   * id="ap_password" 
	   * name="password" 
	   * tabindex="2" 
	   * class="a-input-text a-span12 auth-autofocus auth-required-field" 
	   * xpath="1">
	   */
	driver.findElement(By.cssSelector("input[id*='signInSubmit']")).click();
	/*<input 
	 * id="signInSubmit" 
	 * tabindex="5" 
	 * class="a-button-input" 
	 * type="submit" 
	 * aria-labelledby="auth-signin-button-announce" 
	 * xpath="1">
	 */
	Thread.sleep(6000);
	driver.close();	
	}

	static void xpathAuto() throws InterruptedException
	{
		  // Regular expression xpath
		  // //tagName[@attribute='value']
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.amazon.com/");
	driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']")).click();
	/*<span id="nav-link-accountList-nav-line-1" 
	 * 		class="nav-line-1 nav-progressive-content">
	 * Hola, Identifícate
	 * </span>
	 */
	driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("dsvisage@gmail.com");
	/*<input type="email" 
	 *maxlength="128" 
	 *id="ap_email" 
	 *name="email" 
	 *tabindex="1" 
	 *class="a-input-text a-span12 auth-autofocus auth-required-field" 
	 *xpath="1"> 
	 */
	driver.findElement(By.xpath("//input[@id='continue']")).click();
	/*<input id="continue" 
	 * tabindex="5" 
	 * class="a-button-input" 
	 * type="submit" 
	 * aria-labelledby="continue-announce" 
	 * xpath="1">
	 */
	driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("Amazon1234");
	  /* <input type="password" 
	   * maxlength="1024" 
	   * id="ap_password" 
	   * name="password" 
	   * tabindex="2" 
	   * class="a-input-text a-span12 auth-autofocus auth-required-field" 
	   * xpath="1">
	   */
	driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
	/*<input 
	 * id="signInSubmit" 
	 * tabindex="5" 
	 * class="a-button-input" 
	 * type="submit" 
	 * aria-labelledby="auth-signin-button-announce" 
	 * xpath="1">
	 */
	Thread.sleep(6000);
	driver.close();	
	}

	static void seleccionar(int option) throws InterruptedException
	{
		
		switch(option){
		case 1:
			idAuto();
			break; 
		case 2:
			nameAuto();
			break;
		case 3:
			classAuto();
			break;
		case 4:
			cssSelectorAuto();
			break;
		case 5:
			xpathAuto();
			break; 
		default:
		    System.out.println("Por favor escriba una opcion valida");
		    mensaje();
		    
		}
	}

	static void mensaje() throws InterruptedException
	{
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		
		System.out.printf("%s%n%n","Escriba la opcion de Locator que desea probar"); 
		//System.out.printf("%-20s%-3s%n",1,"numero2"); //printf para tabular
		System.out.printf("Opcion\t%s%n1\t%s%n2\t%s%n3\t%s%n4\t%s%n5\t%s%n%n","Locator","Id","Name","Class","CssSelector","Xpath");
		System.out.print("Opcion: ");
		 int option = entrada.nextInt(); 
		 seleccionar(option);
	}
}
