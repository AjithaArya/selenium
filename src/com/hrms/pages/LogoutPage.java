package com.hrms.pages;

import org.openqa.selenium.By;
import org.testng.Reporter;

import com.hrms.utility.Log;
import com.hrms.utilitypom.Basic;

public class LogoutPage extends Basic {
	static By btn_logout=By.linkText("Logout");
	 public static void logout() {
		 driver.findElement(btn_logout).click();
		 Reporter.log("Logout functionality completed");
		 Log.info("sucessful completed Logoutpage");
		 
		 
	 }

}
