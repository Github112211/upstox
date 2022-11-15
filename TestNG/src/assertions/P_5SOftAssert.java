package assertions;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class P_5SOftAssert {
@Test
public void TC1() {
	String actT="hi";
	String ecpT="Hello";
	SoftAssert sa=new SoftAssert();
	sa.assertEquals(actT, ecpT);
	Reporter.log("Hi  I'm from Soft assert",true);
	sa.assertAll();
}
@Test
public void TC2() {
	Reporter.log("Hi  I'm from TC2",true);
}
}
