package com.QA.Util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase 
{
 public static WebDriver driver;
 public static Properties prop;
 
 public TestBase()
 {
	 try
	 {
		 prop=new Properties();
		 FileInputStream fis=new FileInputStream("E:/seleniumBDDFrameWork/com.CucumberBDD.Selenium.POM/src/main/java/com/QA/Config/config.properties");
		 prop.load(fis); 
	 }
	 catch(IOException e)
	 {
		 e.getMessage();
	 }
 }
 public static void initialization()
 {
	 WebDriverManager.firefoxdriver().setup();
	 driver=new FirefoxDriver();
	 
	 driver.manage().window().maximize();
	 driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT,TimeUnit.SECONDS);
	 driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
	 
	 driver.get(prop.getProperty("url")); 
 }
}
