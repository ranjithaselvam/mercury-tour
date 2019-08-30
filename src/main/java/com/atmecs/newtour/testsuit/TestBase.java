package com.atmecs.newtour.testsuit;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class TestBase {
	protected static WebDriver driver;

	public static FileInputStream stream;
	public Properties property = new Properties();

	public static Properties property1 = new Properties();

	public static Properties property2 = new Properties();

	protected int count = 0;
	protected String url;
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

	@AfterTest
	public void close() {
		driver.close();
	}
}
