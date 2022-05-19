package testPackage;

import org.testng.annotations.Test;

import com.att.qa.base.BaseClass;

import objects.MainPage;

public class TestAtt extends BaseClass {
	@Test
	public void invalidSignInTestMethod() {
		mainPage.clickAccount(commonA);
		mainPage.clickMyAccount(commonA);
		signinPage.inputId(commonA, "nabilahossain");  
		signinPage.inputPassword(commonA,"naomI1234");
		signinPage.signIn(commonA);
		
	}
}
