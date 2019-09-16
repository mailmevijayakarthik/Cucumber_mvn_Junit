package stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.safari.SafariDriver;

public class BaseStepDef {
	
public BaseStepDef() {
	// TODO Auto-generated constructor stub
}

protected static WebDriver driver ;
	
	
public WebDriver createDriver(String browser) {
	if(browser.equalsIgnoreCase("Chrome")) {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/lib/chromedriver");
		driver= new ChromeDriver();
	 }else if (browser.equalsIgnoreCase("safari")) {
		driver= new SafariDriver();
	}else if (browser.equalsIgnoreCase("mobilechrome")) {
		
	
	}
	
return driver;
	
}

public static WebDriver getDriver() {
	
	
	return driver;
	
}

}
