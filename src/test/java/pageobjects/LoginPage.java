package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
@FindBy(xpath="//input[@id='username']")
WebElement username;
@FindBy(xpath="//input[@id='password']")
WebElement password;
@FindBy(xpath="//button[@id='submit']")
WebElement btlogin;
@FindBy(xpath="//div[@id='error']")
WebElement error;

public void username(String name) {
	username.sendKeys(name);
}
public void pass(String pass) {
	password.sendKeys(pass);
}
public void clicklogin() {
	btlogin.click();
}
public String err() {
	String err = error.getText();
	return err;
	}
public boolean errdisplay() {
	boolean errdis = error.isDisplayed();
	return errdis;
}







}
