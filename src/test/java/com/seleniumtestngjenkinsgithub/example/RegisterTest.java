package com.seleniumtestngjenkinsgithub.example;

import org.testng.annotations.Test;
import com.seleniumtestngjenkinsgithub.example.RegisterPage;
import org.testng.annotations.BeforeMethod;
import static org.junit.Assert.assertEquals;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;

public class RegisterTest {
	private WebDriver driver;
	RegisterPage registerPage;
	
	@BeforeMethod
	public void beforeMethod() {
		registerPage = new RegisterPage(driver);
		driver = registerPage.chromeDriverConnection();
		
		registerPage.NavigateTo("http://newtours.demoaut.com/mercurywelcome.php");
	}

	@Test
	public void registerPage() throws InterruptedException {
		registerPage.registerUser();
		assertEquals("Note: Your user name is merida2020.", registerPage.registeredMessage());
	}

	@AfterMethod
	public void afterMethod() {
		driver.close();
	}

}
