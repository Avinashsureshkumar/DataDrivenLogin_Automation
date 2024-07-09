package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageobjects.LoggedinPage;
import pageobjects.LoginPage;
import testbase.BaseClass;

public class Tc__001validLogin extends BaseClass{
	@Test(groups="master")
	public void Tc_001() throws InterruptedException {
		logger.info("Test case Tc__001validLogin started");
		LoginPage lp = new LoginPage(driver);
		lp.username(p.getProperty("username"));
		lp.pass(p.getProperty("password"));
		lp.clicklogin();
		LoggedinPage lin = new LoggedinPage(driver);
		String confmsf = lin.confmsg();
		Assert.assertEquals(confmsf, "Congratulations student. You successfully logged in!");
		Thread.sleep(3000);
		lin.logout();
		logger.info("Test case Tc__001validLogin finshed");

		
		
	}
}
