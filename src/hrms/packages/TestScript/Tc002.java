package hrms.packages.TestScript;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import hrms.packages.lib.General;

public class Tc002 {
	@Test
	public void mouseover() {
		DOMConfigurator.configure("log4j.xml");
		General ge = new General();
		ge.openApplication();
	//	ge.loginApplication();
		ge.loginApplication();
		ge.pimMenu();

		ge.enterFrame();
		ge.addemp();
		ge.exitFrame();

		//ge.logout();
		ge.closeApplication();

	}

}
