package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class KeyboardActivites {

	public static void main(String[] args) throws Exception {
		// KeyBoard Activites using WebDriver predefined webbased keyboard action purpose
		 WebDriver driver = new FirefoxDriver();
		 driver.get("https://www.google.com");
		 driver.findElement(By.name("q")).sendKeys("facebook");
		 Thread.sleep(3000);
		 driver.findElement(By.name("q")).sendKeys(Keys.ARROW_DOWN);
		 driver.findElement(By.name("q")).sendKeys(Keys.ARROW_DOWN); 
		 driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		 
		 

	}

}

