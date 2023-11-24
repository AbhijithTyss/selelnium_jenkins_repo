package jenkins;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ParameterTest {
	public static WebDriver driver;
	@Test
	public void test() {
		String BROWSER = System.getProperty("browser");
		if (BROWSER.equalsIgnoreCase("chrome")) {
			driver=new ChromeDriver();
			Reporter.log("Test executed in Chrome",true);
		}else if(BROWSER.equalsIgnoreCase("firefox")) {
			driver=new FirefoxDriver();
			Reporter.log("Test executed in firefox",true);
		}else if(BROWSER.equalsIgnoreCase("edge")) {
			driver=new EdgeDriver();
			Reporter.log("Test executed in Edge",true);
		}
	}
}
