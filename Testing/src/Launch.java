import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class Launch {
//git chekout dev1
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creating a driver object referencing WebDriver interface
        WebDriver driver;
         
        //Setting the webdriver.chrome.driver property to its executable's location
        System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
        //WebDriverManager.chromedriver().setup();
        //Instantiating driver object
        driver = new ChromeDriver();
         
        //Using get() method to open a webpage
        driver.get("http://artoftesting.com");
         
	}

}
