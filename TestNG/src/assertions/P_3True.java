package assertions;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class P_3True {
@Test
public void TC1() {
	Reporter.log("TC1 is running");
	boolean actT = true;
	Assert.assertTrue(actT);
}
}
