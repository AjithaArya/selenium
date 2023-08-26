package com.hrms.pages;

import com.hrms.utility.Log;
import com.hrms.utilitypom.Basic;

public class ExitFrame  extends Basic{

	//  no object only Functionality
	public static void exitFrame() {
		 driver.switchTo().defaultContent();
		 Log.info("Sucessful completed Exit Frame");
	}
}
