package com.calculatorTest;

import static org.testng.Assert.assertEquals;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.options.BaseOptions;

public class AdditionTest {
	
	public AndroidDriver driver;
	
	@BeforeClass
    public void setUp() throws MalformedURLException {
        BaseOptions options = new BaseOptions()
            .amend("platformName", "Android")
            .amend("appium:platformVersion", "13")
            .amend("appium:deviceName", "R7KTA00EARD")
            .amend("appium:appPackage","com.sec.android.app.popupcalculator")
            .amend("appium:appActivity", "com.sec.android.app.popupcalculator.Calculator")
            .amend("appium:automationName", "UiAutomator2")
            .amend("appium:ensureWebviewsHavePages", true)
            .amend("appium:nativeWebScreenshot", true)
            .amend("appium:newCommandTimeout", 3600)
            .amend("appium:connectHardwareKeyboard", true);

        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), options);
    }

	
  @Test
  public void addTwoNumbers() {
	  
	
      WebElement one = driver.findElement(By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_01"));
      one.click();
      
      WebElement plus = driver.findElement(By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_add"));
      plus.click();
      
      WebElement two = driver.findElement(By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_02"));
      two.click();
      
     
      
      String result = driver.findElement(By.id("com.sec.android.app.popupcalculator:id/calc_tv_result")).getText().toString();
  
      String expectedValues = "3";
      
      assertEquals(result, expectedValues, "Values should be equal");
      
      
  }
  
  
  @AfterClass
  public void tearDown() {
      // Quit the driver
      if (driver != null) {
     driver.quit();
      }
  }
  
  
}
