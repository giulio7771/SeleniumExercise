import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PG8 {
	public static void execute() {
		System.setProperty("webdriver.chrome.driver", "Libraries\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.guru99.com/upload-download-file-selenium-webdriver.html");
		driver.findElement(By.linkText("Home")).click();
		
	}
	
}
