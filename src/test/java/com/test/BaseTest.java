package com.test;

import java.io.File;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
	 protected static WebDriver driver;

	    @BeforeMethod
	    public void setup() {
	        driver = new ChromeDriver();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	        driver.manage().window().maximize();
	        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	    }

	    @AfterMethod
	    public void tearDown() {
	        if (driver != null) {
	            driver.quit();
	        }
	    }

		public static String captureScreenshot(String testName) {
		    try {
		        String filePath = System.getProperty("user.dir") + "/screenshots/Excel/" + testName + ".png";
		        File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		        File destFile = new File(filePath);
		        FileUtils.copyFile(srcFile, destFile);
		        System.out.println(destFile.getAbsolutePath()); // return full path
		        return destFile.getAbsolutePath();
		    } catch (Exception e) {
		        e.printStackTrace();
		        return null;
		    }
		}
}
