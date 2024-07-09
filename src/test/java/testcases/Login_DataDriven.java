package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageobjects.LoggedinPage;
import pageobjects.LoginPage;
import testbase.BaseClass;
import utilities.LoginData;

public class Login_DataDriven extends BaseClass{
	@Test(dataProvider="logintest" , dataProviderClass=LoginData.class , groups = "master")
public void Tc_002(String username ,String password, String result) {
		logger.info("Test case Tc_002 started");
		try {
		LoggedinPage loggedinpage = new LoggedinPage(driver);
		LoginPage lp = new LoginPage(driver);
		logger.info("Test case Tc_002 entering username");
		lp.username(username);
		logger.info("Test case Tc_002 entering password");
		lp.pass(password);
		logger.info("Test case Tc_002 clicking login");
		lp.clicklogin();
		if(result.equalsIgnoreCase("valid")) {
		    if(loggedinpage.confmsg().equals("Congratulations student. You successfully logged in!")) {
				loggedinpage.logout();
				Assert.assertTrue(true);
			}
			else {
				Assert.assertTrue(false);
			}
		}
	   if(result.equalsIgnoreCase("Invalid")) {
		   if(lp.errdisplay()==true) {
			   Assert.assertTrue(true);
		   }else {
			   Assert.fail();
		   }
	   }}catch(Exception e) {
		  e.printStackTrace();
		  Assert.fail();
	   }
		
		}
			
		}
			
		
	

	
	
	
	
