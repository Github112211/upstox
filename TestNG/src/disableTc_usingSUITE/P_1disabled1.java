package disableTc_usingSUITE;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class P_1disabled1 {
	@Test
	public void TC1() {
		Reporter.log("TC1 is running", true);
		Assert.fail();
	}
	@Test
	public void TC2() {
		Reporter.log("TC2 is running", true);
	}
	@Test
	public void TC3() {
		Reporter.log("TC3 is running", true);
	}
}
