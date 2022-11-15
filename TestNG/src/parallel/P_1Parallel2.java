package parallel;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class P_1Parallel2 {
@Test
public void TC2() {
	System.setProperty("webdriver.chrome.driver", "E:\\java\\selenium\\chromedriver_win32 (2)\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://upstox.com/");
	
}
}
