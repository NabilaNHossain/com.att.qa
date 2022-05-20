package commonActions;

import static org.testng.Assert.fail;

import java.security.PublicKey;
import java.time.Duration;

import javax.lang.model.element.Element;

import org.apache.hc.client5.http.psl.PublicSuffixMatcher;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import com.att.qa.base.BaseClass;

import net.bytebuddy.matcher.BooleanMatcher;

public class CommonA {
	WebDriverWait wait = new WebDriverWait(BaseClass.driver, Duration.ofSeconds(10));

	public void click(WebElement element) {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(element));
			element.click();
			Reporter.log("Element is clicking.");
		} catch (Throwable e) {
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
		} catch (Throwable e) {
			e.printStackTrace();
			Reporter.log("Element is not found to pass the value :  " + element + "\n" + e.getMessage() + "<br>");
		}
	}

	public String getUrl() {
		String currentUrl = BaseClass.driver.getCurrentUrl();
		Reporter.log("Current URL is " + currentUrl + "<br>");
		return currentUrl;
	}

	public void selectByValue(WebElement element, String value) {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(element));
			Select select = new Select(element);
			select.selectByValue(value);
			Reporter.log(value + " :value has been selected from the element " + element + "<br>");
		} catch (Throwable e) {
			e.printStackTrace();
			Reporter.log("locator doesn't match for :" + element + "\n" + e.getMessage() + "<br>");
			Assert.fail();
		}
		}
		
		public boolean isSelected(WebElement element) {
	boolean status = false;
	try {
		wait.until(ExpectedConditions.visibilityOf(element));
		status =element.isSelected();
		if(status) {
			Reporter.log(element + " : is selected "+ "<br>" );
					} else {
						Reporter.log(element + " :is not selected  " + "<br>");
					}
	} catch (Throwable e) {
		e.printStackTrace();
		Reporter.log("Element  not found " + element + "\n" + e.getMessage() + "<br>");
		Assert.fail();
	}
	return status;
		}
	}

