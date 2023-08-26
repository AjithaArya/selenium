package com.hrms.pages;

import org.testng.Reporter;

import com.hrms.utility.Log;
import com.hrms.utilitypom.Basic;

public class VerifyPage extends Basic{
	public static void verifyPage() {
		if(driver.getTitle().equals("OrangeHRM - New Level of HR Management")){
			Reporter.log("Verify page is completed");
			
		}
		else {
			Reporter.log("Title not Matched"+driver.getTitle());
			Log.info("Sucessful completed verify page");
		}
		
	}

}
