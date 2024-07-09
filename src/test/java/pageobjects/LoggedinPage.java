package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoggedinPage extends BasePage{

	public LoggedinPage(WebDriver driver) {
		super(driver);
		
	}

	@FindBy(xpath="//strong[contains(text(),'Congratulations student. You successfully logged i')]")
	WebElement conmsg;
	@FindBy(xpath="//a[contains(text(),'Log out')]")
	WebElement btlogout;
	
	public String confmsg() {
		String msg = conmsg.getText();
		return msg;
	}
	public void logout() {
		btlogout.click();
	}
}
