package com.atmecs.newtour.link;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.atmecs.newtour.test.NewTourDemo;

public class LinkTest extends NewTourDemo {
	@Test
	public void link() {
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
