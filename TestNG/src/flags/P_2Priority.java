package flags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class P_2Priority {
@Test(priority = 2)
public void TC1() {
	Reporter.log("TC1 is Running",true);
}
@Test(priority = 1)
public void TC2() {
	Reporter.log("TC2 is running",true);
}
@Test(priority = 3)
public void TC3() {
	Reporter.log("TC3 is Running", true);
}
}
