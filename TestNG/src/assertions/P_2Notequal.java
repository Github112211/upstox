package assertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class P_2Notequal {
@Test
public void TC1() {
	String actT="hi";
	String excpT="Hello";
	Assert.assertNotEquals(actT, excpT);
}
}
