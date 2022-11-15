package flags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class P_4timesout {
	@Test(timeOut = 8000)
		public void TC1() {
		Reporter.log("running TC1", true);	
	}

}
