package com.hrms.pages;

import org.openqa.selenium.By;
import org.testng.Reporter;

import com.hrms.utility.Log;
import com.hrms.utilitypom.Basic;

public class DeleteEmployee extends Basic	 {
	static By btn_checkbox=By.name("chkLocID[]");
	static By btn_delete=By.xpath("//input[@value='Delete']");
	public static void deleteEmp() {
		driver.findElement(btn_checkbox).click();
		driver.findElement( btn_delete).click();
		Reporter.log("DeleteEmployee completed");
		Log.info("Suceesful  completed deleteEmp");
	}

}
