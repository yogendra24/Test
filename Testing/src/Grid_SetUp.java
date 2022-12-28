import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class Grid_SetUp {
	public static WebDriver driver;
 
	public static void main(String[]  args) throws MalformedURLException, InterruptedException{
		// System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		//Define desired capabilities
				DesiredCapabilities cap=new DesiredCapabilities();
				cap.setBrowserName("chrome");
				cap.setPlatform(Platform.WINDOWS);
				
				//Chrome option  
				ChromeOptions options = new ChromeOptions();
				options.merge(cap);
				options.setHeadless(true);
				
				
				//Hub URL
				String huburl ="http://192.168.0.105:8090/wd/hub";
				 
				// Create driver with hub address and capability
				WebDriver driver=new RemoteWebDriver(new URL(huburl), options);
				 
				//Test case
				driver.get("https://www.findmyfare.com/");
				 
				System.out.println("Title is "+driver.getTitle());
				 
				driver.close();
				
				
				
				
				
				
				
				
				/*
				 * String URL = "http://artoftesting.com"; String Node
				 * ="http://192.168.0.105:8090/wd/hub"; DesiredCapabilities cap =
				 * DesiredCapabilities.chrome(); driver = new RemoteWebDriver(new URL(Node),
				 * cap); driver.navigate().to(URL); Thread.sleep(5000); driver.quit();
				 */
 	}		
}