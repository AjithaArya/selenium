package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitStatments {

	public static void main(String[] args) throws Exception {
		// Explicity Wait to communicate to WebDriver wait until expected condition fullfield wait the certain time.
		System.setProperty("webdriver.gecko.driver","C:\\Users\\zakir\\Downloads\\geckodriver-v0.33.0-win64/geckodriver.exe");
		WebDriver  driver= new FirefoxDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
		driver.findElement(By.name("username")).sendKeys("Admin");
		//driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.findElement(By.name("password")).sendKeys("admin123");
	WebElement element=driver.findElement(By.name("username"));
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("argument[0].click();",element);
WebElement ele2=driver.findElement(By.className("oxd-topbar-header-title"));
/*
 * WebDriverWait wait = new WebDriverWait(driver,10);
 * wait.until(ExpectedConditions.elementToBeClickable(ele2));
 * System.out.println("verify Title_" + ele2.getText());
 */
	
	

	}

}
