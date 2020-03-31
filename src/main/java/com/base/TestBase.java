package com.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
protected static WebDriver driver;
protected static Properties config;
public static int i;

public void setUp() throws IOException {
    WebDriverManager.firefoxdriver().setup();
    driver=new FirefoxDriver();
	config = new Properties();
	FileInputStream fis = new FileInputStream(
			System.getProperty("user.dir") + "//src/test//resources//properties//config.properties");
	config.load(fis);
    driver.get(config.getProperty("testsiteurl"));
}
	
}
