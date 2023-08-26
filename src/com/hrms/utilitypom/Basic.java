package com.hrms.utilitypom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;

public class Basic {
	public  static WebDriver driver;
	public static void openApplication() {
		driver = new FirefoxDriver();
		driver.get("http://183.82.103.245/nareshit/login.php");
		Reporter.log("OpenApplication");// to print  html reports
		
	}
	public static void closeApplication() {
		driver.close();
		
	}

}
