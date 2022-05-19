package objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commonActions.CommonA;

public class MainPage {
	public MainPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	


	@FindBy(xpath = "//span[@id='z1-profile-text']")
	public  WebElement accountElement;
	public void clickAccount(CommonA commonA) {
		commonA.click(accountElement);
	}
	
	@FindBy(xpath = "//span[text()='Go to my account']")
	public WebElement goToMyAccountElement;

	
	public void clickMyAccount(CommonA commonA) {
		commonA.click(goToMyAccountElement);
	}
}
