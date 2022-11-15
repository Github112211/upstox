package assertions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class P_1equal {
@Test
public void TC1() {
	System.setProperty("webdriver.chrome.driver", "E:\\java\\selenium\\chromedriver_win32 (2)\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://upstox.com/");
	String actT="Trading - Online Share Market Trading App in India Stock Platform";
	String expT = driver.getTitle();
	Assert.assertEquals(actT, expT,"Both tittle are same");

}
}
