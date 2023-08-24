package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Keyboard_Rc {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\zakir\\Downloads\\geckodriver-v0.33.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(5000);
		driver.findElement(By.name("q")).sendKeys("selenium");
		Thread.sleep(5000);
		driver.findElement(By.name("q")).sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(5000);
		driver.findElement(By.name("q")).sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(5000);
		driver.findElement(By.name("q")).sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(5000);
		driver.findElement(By.name("q")).sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(5000);
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		Thread.sleep(5000);
		driver.manage().window().maximize();
		driver.findElement(By.id("search")).sendKeys("Hyr Tutorial",Keys.ENTER);
	


	}

}
