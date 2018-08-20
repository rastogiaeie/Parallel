package parallel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class test1 {
	static
	{
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public WebDriver driver;
	@Parameters({"myBrowser"})
	@Test
	public void test(String myBrowser)
	
	{
		
		if(myBrowser.equalsIgnoreCase("Firefox"))
		{
			Reporter.log(myBrowser,true);
			driver=new FirefoxDriver();
			Reporter.log("firefox lounch",true);
			driver.get("https://www.google.com");
			
		}
		else
		{
			Reporter.log(myBrowser,true);
			driver=new ChromeDriver();
			Reporter.log("chrome lounch",true);
			driver.get("https://www.google.com");
		}
		
		
		
		
	}

}
