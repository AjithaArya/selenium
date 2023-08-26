package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
	static String Username = "nareshit";
	static String password = "nareshit";
	static String title1 = "OrangeHRM - New Level of HR Management s";
	static String title2 = "OrangeHRM";
	static String txt_username = "txtUserName";
	static String txt_password = "txtPassword";
	static String txt_longinbt = "Submit";
	static String txt_clearbtn = "clear";
	static String txt_pimbtn = "PIM";
	static String txt_addempbtn = "Add Employee";
	static String txt_logout = "Logout";

	public static void main(String[] args) throws Exception {
		// dropDown -> select class-> .selectByVisibleText(3types of methods)

		WebDriver driver = new FirefoxDriver();
		driver.get("http://183.82.103.245/nareshit/login.php");
		driver.findElement(By.name(txt_username)).sendKeys(Username);
		driver.findElement(By.name(txt_password)).sendKeys(password);
		driver.findElement(By.name(txt_longinbt)).click();
		Thread.sleep(3000);
driver.switchTo().frame("rightMenu");
		Select listselect = new Select(driver.findElement(By.name("loc_code")));
		listselect.selectByValue("0");
		driver.findElement(By.name("loc_name")).sendKeys("1387");
		driver.findElement(By.xpath("input[@value='Search']")).click();
		driver.switchTo().defaultContent();
		driver.findElement(By.linkText( txt_logout )).click();
		driver.close();
		
	}

}
