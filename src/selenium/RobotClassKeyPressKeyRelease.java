package selenium;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class RobotClassKeyPressKeyRelease {

	public static void main(String[] args) throws Exception {
		// Robot class doing mouse and keyboard actions with help of
		// KeyPress()/KeyRelease()methods;/ import package Java.awt.Robotpackage

		WebDriver driver = new FirefoxDriver();
		driver.get("http://183.82.103.245/nareshit/login.php");
		driver.manage().window().maximize();
		/*
		 * perform TAB/ENTER FUNCTIONS
		 * driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
		 * driver.findElement(By.name("txtPassword")).sendKeys("nareshit"); // perform
		 * TAB/ ENTER using keyboard Actions Robot r = new Robot();
		 * r.keyPress(KeyEvent.VK_TAB); r.keyRelease(KeyEvent.VK_TAB);
		 * r.keyPress(KeyEvent.VK_ENTER); r.keyRelease(KeyEvent.VK_ENTER);
		 * Thread.sleep(3000); System.out.println("LoginComplkted");
		 * driver.findElement(By.linkText("Logout"));
		 * System.out.println("logout completed"); r.keyPress(KeyEvent.VK_ENTER);
		 * r.keyRelease(KeyEvent.VK_ENTER); driver.quit();
		 * System.out.println("closeApplication");
		 */// PERFORM Alert Functions
		driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
		// TAB/ ENTER using keyboard Actions
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		System.out.println("nLogin not Complted");
		Alert a= driver.switchTo().alert();
		System.out.println(a.getText());
		a.accept();
		driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Actions ac= new Actions(driver);
		ac.moveToElement(driver.findElement(By.linkText("PIM"))).perform();
		ac.moveToElement(driver.findElement(By.linkText("Add Employee"))).perform();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		System.out.println(" moveover completed");
		
		
		
	}

}
