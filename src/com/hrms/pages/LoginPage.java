package com.hrms.pages;

import org.openqa.selenium.By;
import org.testng.Reporter;

import com.hrms.utility.Log;
import com.hrms.utilitypom.Basic;

public class LoginPage extends Basic{
	// pom model  developed script  objectives and functionality(method) same class
	// objectives0locaters
	 static By txt_loginname=By.name("txtUserName");
	 static By txt_loginpassword=By.name("txtPassword");
	 static By btn_login=By.name("Submit");
	 // functionaltes
	 public static void login(String un, String pwd) {
		 driver.findElement(txt_loginname).sendKeys(un);
		 driver.findElement( txt_loginpassword).sendKeys(pwd);
		 driver.findElement(btn_login).click();
		 Reporter.log("login completed");
		 Log.info("Sucessful completed login applcation");
		 
	 }

}
