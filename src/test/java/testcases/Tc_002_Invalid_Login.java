package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageobjects.LoginPage;
import testbase.BaseClass;

public class Tc_002_Invalid_Login extends BaseClass{
	@Test(groups="master")
public void Tc_002() {
		logger.info("Test case Tc_002_Invalid_Login Started");
	LoginPage lp = new LoginPage(driver);
	lp.username("123");
	lp.pass("123456");
	lp.clicklogin();
	boolean err = lp.errdisplay();
	Assert.assertEquals(err, true);
	logger.info("Test case Tc_002_Invalid_Login finished");
	
}
}
