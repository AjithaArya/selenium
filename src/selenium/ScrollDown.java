package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScrollDown {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:\\Users\\zakir\\Downloads\\geckodriver-v0.33.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement  element= driver.findElement(By.linkText("Create a Page"));
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",element);
		System.out.println("TO GET ELEME4NT_"+element.getText());
		Thread.sleep(5000);

	}

}
