package com.hrms.pages;

import org.testng.Reporter;

import com.hrms.utility.Log;
import com.hrms.utilitypom.Basic;

public class EnterFrame extends Basic{
	// obj
	static String txt_enterFrame="rightMenu";
	public static void  enterFrame() {
		driver.switchTo().frame(txt_enterFrame);
//		
	Reporter.log("EnterFrame: webpage inside one more page is called Frame");
	Log.info("Enter Enter Frame completed Sucessful");
	}

}
