package com.atmecs.newtour.booking;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.atmecs.newtour.login.Login;

public class Booking extends Login{
	@Test
	public void register() {

		driver.findElement(By.xpath(property1.getProperty("loc_type_xpath_rbtn"))).click();
		WebElement select1 = driver.findElement(By.xpath(property1.getProperty("loc_passenger_xpath_slt")));
		Select s1 = new Select(select1);
		s1.selectByIndex(1);
		WebElement select2 = driver.findElement(By.xpath(property1.getProperty("loc_departingfrom_xpath_slt")));
		Select s2 = new Select(select2);
		s2.selectByValue("Paris");
		WebElement select3 = driver.findElement(By.xpath(property1.getProperty("loc_on_xpath_slt")));
		Select s3 = new Select(select3);
		s3.selectByIndex(5);
		WebElement select4 = driver.findElement(By.xpath(property1.getProperty("loc_dday_xpath_slt")));
		Select s4 = new Select(select4);
		s4.selectByIndex(10);
		WebElement select5 = driver.findElement(By.xpath(property1.getProperty("loc_arriving_xpath_slt")));
		Select s5 = new Select(select5);
		s5.selectByIndex(2);
		WebElement select6 = driver.findElement(By.xpath(property1.getProperty("loc_returning_xpath_slt")));
		Select s6 = new Select(select6);
		s6.selectByIndex(5);
		WebElement select7 = driver.findElement(By.xpath(property1.getProperty("loc_rday_xpath_slt")));
		Select s7 = new Select(select7);
		s7.selectByIndex(7);

		driver.findElement(By.xpath(property1.getProperty("loc_serviceclass_xpath_rbtn"))).click();
		WebElement select8 = driver.findElement(By.xpath(property1.getProperty("loc_airline_xpath_slt")));
		Select s8 = new Select(select8);
		s8.selectByIndex(2);
		driver.findElement(By.xpath(property1.getProperty("loc_continue1_xpath_btn"))).click();
	}

}
