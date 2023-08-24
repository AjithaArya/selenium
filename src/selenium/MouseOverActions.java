package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOverActions {
	public static String un = "nareshit";
	public static String pwd = "nareshit";
	public static String url = "http://183.82.103.245/nareshit/login.php";

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\zakir\\Downloads\\geckodriver-v0.33.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://183.82.103.245/nareshit/login.php");
		// to get Current Url
		String currentUrl = driver.getCurrentUrl();
		System.out.println("current url:" + currentUrl);
		// to get Title of Application
		String title = driver.getTitle();
		System.out.println(" Title of the Page" + title);
		// To get pageSource
		String pagesource = driver.getPageSource();
		System.out.println("Page Source" + pagesource);
		// verifyTitle of webA pplication
		if (driver.getTitle().equals("OrangeHRM - New Level of HR Management")) {
			System.out.println(" Title mateched:" + driver.getTitle());

		} else {
			System.out.println(" TitleNot Matched:");

		}
		if (driver.getCurrentUrl().equals(url)) {
			System.out.println("Current url matched:");
		} else {
			System.out.println("Url  not Matched");
		}
		System.out.println("Current Url is" + driver.getCurrentUrl());
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(3000);
		// write implicitwait applicable to whole page wait up to specified time element
		// findout before its executed before
		//
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.name("txtUserName")).sendKeys(un);
		Thread.sleep(3000);
		// driver.findElement(By.name("txtPassword")).sendKeys(pwd);
		// Thread.sleep(3000);
		driver.findElement(By.name("Submit")).click();
		// Alert pop up or small box appear on window control popups its are not part
		// webelement

		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		driver.findElement(By.name("txtPassword")).sendKeys(pwd);	
		Thread.sleep(3000);
		 driver.findElement(By.name("Submit")).click();
		 System.out.println("ALERT Completed:" + alert.getText());

		/*
		 * // Mouseover--> Action_>driver-> actionreferance->MoveToElement, //
		 * click,doubleClick,RightClic(contextclick)->loctor->Perform.
		 *  // actions ac= new Actions(driver); //
		 * ac.moveToElement(driver.findElement(By.id("menu_admin_viewLocations"))).click
		 * ().perform(); //
		 * ac.doubleClick(driver.findElement(By.id("searchLocation_name"))).perform();
		 * // ac.contextClick(RightClick)(driver.findElement(By.xpath("//span[.='right
		 * // clickme']"))).perform(); WebElement element =
		 * driver.findElement(By.linkText("PIM")); Actions ac = new Actions(driver);
		 * ac.moveToElement(element).perform();
		 * System.out.println(" pim menu is related  to move to element action");
		 * driver.findElement(By.linkText("Add Employee")).click(); // frame is webpage
		 * is embed another webpage is called frame at time only one // webpage can
		 * access go to another webpage switch to another frame // frame two types 1.
		 * enter frame driver.switchTo.frame(frameid/framename/ // frameindex=start with
		 * zero/); // to exit frame driver.switchTo().defaultContent(); // enter frame
		 * driver.switchTo().frame("rightMenu"); driver.findElement(By.xpath(
		 * "//*[@id=\"standardView\"]/div[3]/div[1]/input[1]")).click();
		 * driver.findElement(By.name("txtEmpLastName")).sendKeys("ownwe");
		 * driver.findElement(By.name("txtEmpFirstName")).sendKeys("Tenant");
		 * driver.findElement(By.id("btnEdit")).click(); // exit Frame
		 * =driver.switchTo.defaultContent(); driver.switchTo().defaultContent();
		 * System.out.println("exit frame"); Thread.sleep(3000);
		 * driver.findElement(By.xpath("//*[@id=\"option-menu\"]/li[3]/a")).click();
		 * System.out.println(" logout button clicked"); Thread.sleep(3000);
		 * driver.close(); System.out.println("Close Current Window");
		 * 
		 * System.out.println(" close the application");
		 */
	}

}
