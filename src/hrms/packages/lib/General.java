package hrms.packages.lib;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.hrms.utility.Log;

public class General extends Global {
	@BeforeClass
	public void openApplication() {
		driver = new FirefoxDriver();
		driver.get(url);
		System.out.println(" openApplication");
		Reporter.log("OpenApplication");
		Log.info(" openApplication info");
//		Log.error(" openApplication error");
//		Log.warn("openApplicationwarn");
//		Log.log("openApplicationlog");
//		Log.debug("openApplicationdebug");
	}

	@Test
	public void loginApplication() {
		driver.findElement(By.name(txt_Loginame)).sendKeys(un);
		driver.findElement(By.name(txt_loginpassword)).sendKeys(pwd);
		driver.findElement(By.name(txt_loginbtn)).click();
		System.out.println(" login application completed");
		Reporter.log("login application completed");
		Log.info(" loginApplication info");
//		Log.error(" loginApplication error");
//		Log.warn("loginApplication warn");
//		Log.log("loginApplication log");
//		Log.debug("loginApplication debug");
	}

	@Test
	public void logout() {
		driver.findElement(By.linkText(txt_logout)).click();
		System.out.println(" logout completed");
		Reporter.log("logout button completed");
		Log.info(" logoutCompleted info");
//		Log.error(" logoutCompleted error");
//		Log.warn("logoutCompleted warn");
//		Log.log("logoutCompleted log");
//		Log.debug("logoutCompleted debug");
	}

	@AfterClass
	public void closeApplication() {
		driver.close();
		System.out.println(" close application");
		Reporter.log("close Application");
		Log.info(" closeApplication info");
//		Log.error(" closeApplication error");
//		Log.warn("closeApplication warn");
//		Log.log("closeApplication log");
//		Log.debug("closeApplicatio debug");

	}

	public void pimMenu() {
		Actions ac = new Actions(driver);
		ac.moveToElement(driver.findElement(By.linkText(txt_pim))).perform();
		ac.moveToElement(driver.findElement(By.linkText(txt_add_employees))).perform();
		System.out.println(" perform mouse over function");
		Reporter.log("click on pim mouseover");
		Log.info("  pimMenu info");
//		Log.error("  pimMenu error");
//		Log.warn(" pimMenu warn");
//		Log.log(" pimMenu log");
//		Log.debug(" pimMenu debug");
	}

	public void addemp() {
		driver.findElement(By.xpath(txt_addemp)).click();
		driver.findElement(By.name(txt_lastname)).sendKeys(lastName);
		driver.findElement(By.name(txt_firsttname)).sendKeys(firstName);
		driver.findElement(By.id(txt_savebtn)).click();
		System.out.println(" click on add employee");
		Reporter.log(" add new employee");
		Log.info("  addemp info");
//		Log.error("  addemp error");
//		Log.warn("addemp warn");
//		Log.log(" addemp log");
//		Log.debug(" addemp debug");
	}

	public void enterFrame() {
		driver.switchTo().frame(txt_enterFrameid);
		System.out.println(" connected");
		System.out.println("enter framecompleted");
		Reporter.log(" Enter frame completed");
		Log.info("  addemp info");
//		Log.error("  addemp error");
//		Log.warn("addemp warn");
//		Log.log(" addemp log");
//		Log.debug(" addemp debug");
		

	}

	public void exitFrame() {
		driver.switchTo().defaultContent();
		System.out.println("exitframecompleted");
		Reporter.log(" Exit frame completed");
		System.out.println("Exit Frame");
		Reporter.log(" Exitrame completed");
		Log.info("  exitFrame info");
//		Log.error(" exitFrame error");
//		Log.warn("exitFrame warn");
//		Log.log("exitFrame log");
//		Log.debug(" exitFrame debug");
	}

	public void delemp() {

		driver.findElement(By.name(txt_checkBox)).click();
		driver.findElement(By.xpath(txt_delBtn)).click();
		System.out.println(" Delete Employee Completed");
		Reporter.log(" delete employee completed");
		Log.info("  exitFrame info");
//		Log.error(" exitFrame error");
//		Log.warn("exitFrame warn");
//		Log.log("exitFrame log");
//		Log.debug(" exitFrame debug");
	}
}
