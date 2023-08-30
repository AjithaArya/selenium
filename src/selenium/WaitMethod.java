package selenium;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitMethod {
public static void main(String[] args) throws Exception {
	WebDriver driver= new FirefoxDriver();
	driver.get("http://183.82.103.245/nareshit/login.php");
	driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
	driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
	// Explicity Wait
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(2));
	
	  wait.until(ExpectedConditions.elementToBeClickable(By.xpath(
	  "//input[@type='Submit']")));
	  driver.findElement(By.xpath("//input[@type='Submit']")).click();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	  driver.switchTo().frame("rightMenu");
	  driver.findElement(By.xpath("//input[@value='Add']")).click();
	  driver.findElement(By.name("txtEmpFirstName")).sendKeys("Anamika");
	  driver.findElement(By.name("txtEmpLastName")).sendKeys("Wait");
	 // upload image  using WebDriver
	 WebElement fileinput= driver.findElement(By.xpath("//input[@type='file'][@name='photofile']"));
fileinput.sendKeys("C:\\Users\\zakir\\Downloads\\log4j.txt");
driver.switchTo().defaultContent();
Thread.sleep(3000);
System.out.println("File upload sucessful");
driver.findElement(By.linkText("Logout")).click();
driver.close();
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	

}
