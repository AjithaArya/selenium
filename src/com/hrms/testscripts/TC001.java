package com.hrms.testscripts;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.hrms.pages.LoginPage;
import com.hrms.pages.LogoutPage;
import com.hrms.utilitypom.Basic;

public class TC001 {
	@Test
	public static void tcoo1() {
		DOMConfigurator.configure("log4j.xml");
		Basic.openApplication();
		LoginPage.login("nareshit", "nareshit");
		LogoutPage.logout();
		Basic.closeApplication();

		
	}

}
