package selenium;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ScreenShot {
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
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver();
		driver.get("http://183.82.103.245/nareshit/login.php");
		// File
		TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
		File sourceFile = takesScreenshot.getScreenshotAs(OutputType.FILE);
		File destFile = new File("./Screenshots/img1.jpg");

		// FileUtils.copyFile(sourceFile,destFile);
		System.out.println("Screenshot saved successfully");

		driver.findElement(By.name(txt_username)).sendKeys(Username);
		driver.findElement(By.name(txt_password)).sendKeys(password);
		driver.findElement(By.name(txt_longinbt)).click();
		Thread.sleep(3000);
		WebElement element = driver.findElement(By.linkText(txt_pimbtn));
		Actions ac = new Actions(driver);
		ac.moveToElement(element).perform();
		driver.findElement(By.linkText(txt_addempbtn)).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText(txt_logout)).click();
		System.out.println(" logout completed");
		Thread.sleep(3000);
	}

}
