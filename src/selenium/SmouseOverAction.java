package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class SmouseOverAction {
	 static String Username="nareshit";
	 static String password="nareshit";
	 static String title1="OrangeHRM - New Level of HR Management";
	 static String title2="OrangeHRM";
	 static String txt_username ="txtUserName";
	 static String txt_password="txtPassword";
	 static String txt_longinbt="Submit";
	 static String txt_clearbtn="clear";
	 static String txt_pimbtn="PIM";
	static String txt_addempbtn="Add Employee";
	static String txt_logout="Logout";
	
	public static void main(String[] args) throws Exception {
	 WebDriver driver=new FirefoxDriver();
	 driver.get("http://183.82.103.245/nareshit/login.php");
	driver.manage().window().maximize();
	// verify= Actual  compares expected;
	
	if(driver.getTitle().equals(title1)) {
		System.out.println("Title  Matched");
	}
	else {
		System.out.println("Title not matched");
		
	}
	driver.findElement(By.name(txt_username)).sendKeys(Username);
	driver.findElement(By.name(txt_password)).sendKeys(password);
	driver.findElement(By.name(txt_longinbt)).click();
	Thread.sleep(3000);
	System.out.println("Login Completed");
	if(driver.getTitle().equals(title2)) {
		System.out.println("Title  Matched");
	}
	else {
		System.out.println("Title not matched");
	}
	WebElement ele=driver.findElement(By.linkText(txt_pimbtn));
	/*
	 * Actions ac=new Actions(driver); ac.moveToElement(ele).perform();
	 * driver.findElement(By.linkText(txt_addempbtn)).click(); Thread.sleep(3000);
	 * driver.findElement(By.linkText(txt_logout)).click();
	 * System.out.println(" logout completed"); Thread.sleep(3000);
	 */
	driver.findElement(By.name(txt_username)).sendKeys(Username);
	driver.findElement(By.name(txt_password)).sendKeys(password);
   driver.findElement(By.name(txt_clearbtn)).click();
	Thread.sleep(3000);
   driver.close();
   System.out.println("close Application");
	}}


