package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertPOpups {
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

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://183.82.103.245/nareshit/login.php");
	driver.findElement(By.name(txt_username)).sendKeys(Username);
	//driver.findElement(By.name(txt_password)).sendKeys(Username);
	driver.findElement(By.name(txt_longinbt)).click();
Alert a= driver.switchTo().alert();

	}

}
