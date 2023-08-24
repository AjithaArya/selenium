package hrms.packages.TestScript;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import hrms.packages.lib.General;

public class Tc001 {
@Test
public void tc001() {
	//public static void main(String[] args) {
	DOMConfigurator.configure("log4j.xml");
	General ge=new General();
	ge.openApplication();
	ge.loginApplication();
	ge.logout();
	ge.closeApplication();
	}


}
