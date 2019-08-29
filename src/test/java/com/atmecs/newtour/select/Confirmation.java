package com.atmecs.newtour.select;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.atmecs.newtour.test.NewTourDemo;

public class Confirmation extends NewTourDemo {
	@Test
	public void selectFlight() throws InterruptedException {
		driver.findElement(By.xpath(property1.getProperty("loc_depart_xpath_rbtn"))).click();
		driver.findElement(By.xpath(property1.getProperty("loc_return_xpath_rbtn"))).click();
		driver.findElement(By.xpath(property1.getProperty("loc_continue2_xpath_btn"))).click();

		

		driver.findElement(By.xpath(property1.getProperty("loc_fstname1_xpath_txt")))
				.sendKeys(property2.getProperty("p1fn"));
		driver.findElement(By.xpath(property1.getProperty("loc_lstname1_xpath_txt")))
				.sendKeys(property2.getProperty("p1ln"));
		WebElement select9 = driver.findElement(By.xpath(property1.getProperty("loc_meal1_xpath_slt")));
		Select s9 = new Select(select9);
		s9.selectByIndex(3);

		driver.findElement(By.xpath(property1.getProperty("loc_fstname2_xpath_txt")))
				.sendKeys(property2.getProperty("p2fn"));
		driver.findElement(By.xpath(property1.getProperty("loc_lstname2_xpath_txt")))
				.sendKeys(property2.getProperty("p2ln"));
		WebElement select10 = driver.findElement(By.xpath(property1.getProperty("loc_meal2_xpath_slt")));
		Select s10 = new Select(select10);
		s10.selectByIndex(3);
		WebElement select11 = driver.findElement(By.xpath(property1.getProperty("loc_cardtype_xpath_slt")));
		Select s11=new Select(select11);
		s11.selectByIndex(2);
		driver.findElement(By.xpath(property1.getProperty("loc_number_xpath_txt"))).sendKeys(property2.getProperty("ccn"));
		driver.findElement(By.xpath(property1.getProperty("loc_cfname_xpath_txt"))).sendKeys(property2.getProperty("ccfn"));
		driver.findElement(By.xpath(property1.getProperty("loc_cmname_xpath_txt"))).sendKeys(property2.getProperty("ccmn"));
		driver.findElement(By.xpath(property1.getProperty("loc_clname_xpath_txt"))).sendKeys(property2.getProperty("ccln"));
		driver.findElement(By.xpath(property1.getProperty("loc_tiKlsstrl_xpath_btn"))).click();
		driver.findElement(By.xpath(property1.getProperty("loc_address_xpath_txt"))).sendKeys(property2.getProperty("address"));
		driver.findElement(By.xpath(property1.getProperty("loc_city_xpath_txt"))).sendKeys(property2.getProperty("city"));
		driver.findElement(By.xpath(property1.getProperty("loc_state_xpath_txt"))).sendKeys(property2.getProperty("state"));
		driver.findElement(By.xpath(property1.getProperty("loc_zipcode_xpath_txt"))).sendKeys(property2.getProperty("postalcode"));
		WebElement select12 = driver.findElement(By.xpath(property1.getProperty("loc_country_xpath_slt")));
		Select s12=new Select(select12);
		s12.selectByIndex(5);
		driver.findElement(By.xpath(property1.getProperty("loc_deliveryadd_xpath_chkb"))).click();
		driver.findElement(By.xpath(property1.getProperty("loc_securepurchase_xpath_btn"))).click();
		Thread.sleep(2000);
		driver.close();
		
	}
}


