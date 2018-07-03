import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PG9 {

	public static void execute() {
		System.setProperty("webdriver.chrome.driver", "Libraries\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("C:/Users/ggiovanella/eclipse-workspace/SeleniumTesting/src/paginaAlert.html");
		driver.manage().window().maximize();
		WebElement idElement = driver.findElement(By.name("text"));
		idElement.sendKeys("Gatuno is here");
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		
		driver.findElement(By.name("enviar")).click();
		
		
	
		Alert alert;
		while (true) {
			try {
				alert = driver.switchTo().alert();
				String alertMSN = alert.getText();
				System.out.println(alertMSN);
				break;
			} catch (Exception x) {
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		alert.accept();
		driver.close();
		driver.quit();
		

	}
}
