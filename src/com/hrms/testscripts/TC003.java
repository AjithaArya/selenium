package com.hrms.testscripts;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.hrms.pages.AddEmployess;
import com.hrms.pages.DeleteEmployee;
import com.hrms.pages.EnterFrame;
import com.hrms.pages.ExitFrame;
import com.hrms.pages.LoginPage;
import com.hrms.pages.LogoutPage;
import com.hrms.pages.VerifyPage;
import com.hrms.utilitypom.Basic;

public class TC003 {
	@Test
	public static void tc003() {
		DOMConfigurator.configure("log4j.xml");
		Basic.openApplication();
		VerifyPage.verifyPage();
		LoginPage.login("nareshit","nareshit");
		AddEmployess.pimMenu();
		EnterFrame.enterFrame();
		DeleteEmployee.deleteEmp();
		ExitFrame.exitFrame();
		LogoutPage.logout();
		Basic.closeApplication();
		
	}

}
