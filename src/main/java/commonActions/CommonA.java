package commonActions;

import static org.testng.Assert.fail;
import java.time.Duration;

import javax.lang.model.element.Element;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import com.att.qa.base.BaseClass;

public class CommonA {
	WebDriverWait wait = new WebDriverWait(BaseClass.driver, Duration.ofSeconds(10));

	public void click(WebElement element) {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(element));
			element.click();
			Reporter.log("Element is clicking.");
		} catch (Exception e) {
			e.printStackTrace();
			Reporter.log("Element is unable to click : " + element + "\n" + e.getMessage() + "<br>");
			Assert.fail();
		}

	}

	public void inputText(WebElement element, String text) {
		try {
			wait.until(ExpectedConditions.visibilityOf(element));
			element.sendKeys(text);
			Reporter.log(text + " : value passed to element :" + element + "<br>");
		} catch (Exception e) {
			e.printStackTrace();
			Reporter.log("Element is not found to pass the value :  " + element + "\n" + e.getMessage() + "<br>");
		}
	}

	public String getUrl() {
		String currentUrl = BaseClass.driver.getCurrentUrl();
		Reporter.log("Current URL is " + currentUrl  + "<br>");
		return currentUrl;
	}
}
