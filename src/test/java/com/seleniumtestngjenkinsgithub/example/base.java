package com.seleniumtestngjenkinsgithub.example;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class base {
private WebDriver driver;
	
	public base(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebDriver chromeDriverConnection() {
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/webdrivers/chromedriver.exe");
		
		driver = new ChromeDriver();
		return driver;
	}
	
	public WebElement findElement(By locator) {
		return driver.findElement(locator);
	}
	
	public List<WebElement> findElements(By locator){
		return driver.findElements(locator);
	}
	
	public String getText(WebElement element) {
		return element.getText();
	}
	
	public String getText(By locator) {
		return driver.findElement(locator).getText();
	}
	
	public void type(String text, By locator) {
		driver.findElement(locator).sendKeys(text);
	}
	
	public void click(By locator) {
		driver.findElement(locator).click();
	}
	
	public Boolean isDisplayed(By locator) {
		try {
			return driver.findElement(locator).isDisplayed();
		} catch (org.openqa.selenium.NoSuchElementException e) {
			System.out.println(e.getMessage());
			return false;
		}		
	}
	
	public Boolean isSelected(By locator) {
		try {
			return driver.findElement(locator).isSelected();
		} catch (org.openqa.selenium.NoSuchElementException e) {
			System.out.println(e.getMessage());
			return false;
		}
	}

	public Boolean isEnabled(By locator) {
		try {
			return driver.findElement(locator).isEnabled();
		} catch (org.openqa.selenium.NoSuchElementException e) {
			System.out.println(e.getMessage());
			return false;
		}
	}
	
	public void NavigateTo(String url) {
		driver.get(url);
	}
}
