package com.atmecs.newtour.testscript;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.atmecs.newtour.page.LoginFunction;
import com.atmecs.newtour.testsuit.TestBase;

public class LinkTest extends LoginFunction {
	@Test
	public void link() {
		driver.get(url);
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title,"Mercury Tours" );
		List<WebElement> findElements = driver.findElements(By.tagName("a"));
		for (WebElement x : findElements) {
			System.out.println(x.getText() + " - " + x.getAttribute("href"));

			count++;
		}
		System.out.println("link count:" + count);

	}

}
