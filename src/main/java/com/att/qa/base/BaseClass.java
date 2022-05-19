package com.att.qa.base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import commonActions.CommonA;
import io.github.bonigarcia.wdm.WebDriverManager;
import objects.CreateNewAcoountPage;
import objects.MainPage;
import objects.SigninPage;

public class BaseClass {
	public static WebDriver driver;
	protected  MainPage mainPage;
	protected CommonA commonA;
	protected SigninPage signinPage;
	

	@BeforeMethod 
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.get("https://www.att.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		initClasses();
	}

	@AfterMethod
	public void cleaningUp() {
		driver.quit();
	}

	private void initClasses() {
		mainPage = new MainPage(driver);
		commonA = new CommonA(); 
		signinPage = new SigninPage(driver);
	}
}
