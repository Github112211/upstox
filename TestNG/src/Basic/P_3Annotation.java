package Basic;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class P_3Annotation {
@BeforeClass
public void openbrowser() {
	Reporter.log("Open the appln",true);
}
@BeforeMethod
public void login() {
	Reporter.log("Login into appln",true);
}
@Test
public void verifyID() {
	Reporter.log("TC1 is running",true);
}
@AfterMethod 
public void logout(){
	Reporter.log("Log out from appln",true);	
}
@AfterClass
public void closebrowser() {
	Reporter.log("Close the browser",true);
}
}
