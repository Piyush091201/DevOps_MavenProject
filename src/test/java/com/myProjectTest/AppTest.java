
package com.myProjectTest;

import com.myProject.App;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.*;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;


public class AppTest {
	


	@Test
	public void testlogin() {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("https://google.com");
		Assert.assertEquals(driver.getTitle(),"Google");
		driver.close();
	}
	
}

	



