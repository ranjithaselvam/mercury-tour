package com.atmecs.newtour.login;

import java.io.FileInputStream;
import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.atmecs.newtour.test.NewTourDemo;

public class Login extends NewTourDemo {
	@Test
	public void login() throws IOException {
		stream = new FileInputStream(
				"C:\\Users\\ranjitha.selvam\\eclipse-workspace\\NewtoursDemoAut\\src\\test\\resources\\locators\\path.properties");
		property1.load(stream);
		stream = new FileInputStream(
				"C:\\Users\\ranjitha.selvam\\eclipse-workspace\\NewtoursDemoAut\\src\\test\\resources\\locators\\data.properties");
		property2.load(stream);
		driver.findElement(By.xpath(property1.getProperty("loc_uname_xpath_txt")))
				.sendKeys(property2.getProperty("username"));
		driver.findElement(By.xpath(property1.getProperty("loc_pwd_xpath_txt")))
				.sendKeys(property2.getProperty("password"));
		driver.findElement(By.xpath(property1.getProperty("loc_login_xpath_btn"))).click();
	}

}
