package com.sbk.jenkins;

/**
 * @author smita
 *
 */

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sbk.util.DriverUtil;

public class JenkinsDemo
{
	WebDriver driver;
	@BeforeClass
	public void setUp(){
		driver = DriverUtil.getDriver();
	}
	@Test
	public void testGoogleSearch(){
		//it will open the goggle page

		driver.get("http://google.in"); 
		//we expect the title “Google “ should be present 

		String Expectedtitle = "Google";
		//it will fetch the actual title 

		String Actualtitle = driver.getTitle();
		System.out.println("Before Assetion " + Expectedtitle + Actualtitle);

		//it will compare actual title and expected title
		Assert.assertEquals(Actualtitle, Expectedtitle);

		//print out the result
		System.out.println("After Assertion " + Expectedtitle + Actualtitle + " Title matched ");

	}
	@AfterClass
	public void tearDown(){
		driver.quit();
	}
}
