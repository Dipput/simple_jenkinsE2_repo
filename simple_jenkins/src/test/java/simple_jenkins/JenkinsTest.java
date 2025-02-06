package simple_jenkins;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;
@Test

public class JenkinsTest {

	
	public void jenkinsTest()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demowebshop.tricentis.com");
		Reporter.log("Jenkins Test Class executed",true);
		Reporter.log("Demo class got executed",true);
	}
}
