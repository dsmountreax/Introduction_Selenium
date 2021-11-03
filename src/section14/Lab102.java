package section14;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Lab102 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//SSL certifications
		//Desired Capabilities=
		DesiredCapabilities ch=DesiredCapabilities.chrome();
		//ch.acceptInsecureCerts();
		//ch.setCabability(name Capability,value);
		ch.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		ch.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		//General Chrome profile
		ChromeOptions c=new ChromeOptions();
		//General chrome profile + desired Capabilties
		c.merge(ch);
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver89\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(c);
		driver.get("www.google.com");
		

	}

}
