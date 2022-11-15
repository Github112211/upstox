package Basic;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class P_2Emailable_Report {
@Test
public void TC1() {
	Reporter.log("TC1 is Running");
}
@Test
public void TC2() {
	Reporter.log("TC2 is running");
}
}
