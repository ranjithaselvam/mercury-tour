package com.atmecs.newtour.test;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTourDemo {
	protected WebDriver driver;

	public FileInputStream stream;
	public Properties property = new Properties();

	public Properties property1 = new Properties();

	public Properties property2 = new Properties();

	protected int count = 0;
	String url;
	String browserName;

	@BeforeTest
	public void setup() throws IOException {
		stream = new FileInputStream(
				"C:\\Users\\ranjitha.selvam\\eclipse-workspace\\NewtoursDemoAut\\src\\test\\resources\\Testdata\\config.properties");
		property.load(stream);

		url = property.getProperty("url");
		browserName = property.getProperty("browsername");

		switch (browserName) {
		case "chrome":
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\ranjitha.selvam\\eclipse-workspace\\NewtoursDemoAut\\lib\\chromedriver.exe");
			driver = new ChromeDriver();
			break;
		case "Firefox":
			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\ranjitha.selvam\\eclipse-workspace\\NewtoursDemoAut\\lib\\geckodriver.exe");
			driver = new FirefoxDriver();
			break;
		case "IE":
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\ranjitha.selvam\\eclipse-workspace\\NewtoursDemoAut\\lib\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			break;

		}
		driver.get(url);

	}

}
	

	
	