package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BAsics {
public static void main(String[] args) throws Exception {
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\zakir\\Downloads\\geckodriver-v0.33.0-win64\\geckodriver.exe");
// ChromeOptions ob=new ChromeOptions();
//	ob.addArguments("--remote-allow-origins=*");
	WebDriver driver = new FirefoxDriver();
	//driver.manage().window().maximize();
	
	driver.get("https://www.google.co.in/");

	Thread.sleep(3000);
	driver.findElement(By.id("femalerb")).click();
	Thread.sleep(3000);
	driver.findElement(By.id("englishchbx")).click();
	Thread.sleep(3000);
	WebElement hindiChk = driver.findElement(By.id("hindichbx"));
	hindiChk.click(); // check
	Thread.sleep(3000);
	if(hindiChk.isSelected())
		hindiChk.click(); //uncheck
	Thread.sleep(3000);
	driver.findElement(By.id("registerbtn")).click();
	System.out.println(driver.findElement(By.id("msg")).getText());
	Thread.sleep(3000);
	driver.findElement(By.linkText("Click here to navigate to the home page")).click();
	
}
}
