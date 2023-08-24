package hrms.packages.TestScript;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import hrms.packages.lib.General;

public class Tc003 {
	@Test
	public void deleteEmp(){
		DOMConfigurator.configure("log4j.xml");
		General ge=new General();
		ge.openApplication();
		ge.loginApplication();
		ge.pimMenu();
		ge.enterFrame();
		ge.delemp();
		ge.exitFrame();
		ge.logout();
		ge.closeApplication();
	}

}
