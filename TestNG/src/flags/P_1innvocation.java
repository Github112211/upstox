package flags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class P_1innvocation {
@Test(invocationCount = 5)
public void TC1() {
	Reporter.log("TC1 is running",true);
}
}
