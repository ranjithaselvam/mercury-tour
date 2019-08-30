package com.atmecs.newtour.page;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.PublicKey;

import org.openqa.selenium.By;

import com.atmecs.newtour.testsuit.TestBase;

public class LoginFunction extends TestBase
{
    public static void gotoLoginpage() throws IOException
    {
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
