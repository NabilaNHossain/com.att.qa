package objects;

import org.apache.commons.io.serialization.ValidatingObjectInputStream;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commonActions.CommonA;

public class SigninPage {
	
	public SigninPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@id='userID']")
	WebElement UserId;
	@FindBy(xpath = "//input[@id='password']")
	WebElement Password;
	@FindBy(xpath = "//button[@id='signin']")
	WebElement signInButtonElement;
	@FindBy(xpath = "//*[@id='rememberMe']")
	public void inputId(CommonA commonA, String value) {
		commonA.inputText(UserId, value);
	}

	public void inputPassword(CommonA commonA, String value) {
		commonA.inputText(Password, value);
	}

	public void signIn(CommonA commonA) {
		commonA.click(signInButtonElement);
	}
 
	public void checkSaveUserIdBox (CommonA commonA, char willSaveUserIdinfo) {
		CommonA
	}
}