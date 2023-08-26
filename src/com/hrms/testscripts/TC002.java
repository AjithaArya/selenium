package com.hrms.testscripts;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.hrms.pages.AddEmployess;
import com.hrms.pages.EnterFrame;
import com.hrms.pages.ExitFrame;
import com.hrms.pages.LoginPage;
import com.hrms.utilitypom.Basic;

public class TC002 {
	@Test
	public static void tcoo2() {
		DOMConfigurator.configure("log4j.xml");
		Basic.openApplication();
		LoginPage.login("nareshit", "nareshit");
		AddEmployess.pimMenu();
		EnterFrame.enterFrame();
        AddEmployess.AddEmp();
		ExitFrame.exitFrame();
		Basic.closeApplication();
	}

}
