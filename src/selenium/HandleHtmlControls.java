package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandleHtmlControls {

	public static void main(String[] args) throws Exception {
		// how to handle html controls
		// WebDriverManager.chromedriver().setup();

		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\zakir\\Downloads\\chromedriver_win32");
//		 ChromeOptions ob=new ChromeOptions();
//		ob.addArguments("--remote-allow-origins=*");
		WebDriver driver = new FirefoxDriver();
		// driver.manage().window().maximize();

		driver.get("https://www.hyrtutorials.com/p/basic-controls.html");

		Thread.sleep(3000);
		driver.findElement(By.id("femalerb")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("englishchbx")).click();
		Thread.sleep(3000);
		WebElement hindiChk = driver.findElement(By.id("hindichbx"));
		hindiChk.click(); // check
		Thread.sleep(3000);
		if (hindiChk.isSelected())
			hindiChk.click(); // uncheck
		Thread.sleep(3000);
		driver.findElement(By.id("registerbtn")).click();
		System.out.println(driver.findElement(By.id("msg")).getText());

		Thread.sleep(3000);
		driver.findElement(By.linkText("Click here to navigate to the home page")).click();

	}

}
