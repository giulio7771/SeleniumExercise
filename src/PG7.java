import java.awt.Desktop.Action;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class PG7 {
	public static void execute() {
		String baseUrl = "https://getbootstrap.com/docs/4.0/components/buttons/";
		System.setProperty("webdriver.chrome.driver", "Libraries\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get(baseUrl);
		WebElement link_Home = driver.findElement(By.xpath("/html/body/div/div/main/div[2]/button[1]"));
		WebElement td_Home = driver.findElement(By.xpath("/html/body/div/div/main/div[2]/button[1]"));

		Actions builder = new Actions(driver);
		//Action mouseOverHome = builder.moveToElement(link_Home).build();

		
		String bgColor = td_Home.getCssValue("background-color");
		System.out.println("Before hover: " + bgColor);
		builder.moveToElement(link_Home).build().perform();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		bgColor = td_Home.getCssValue("background-color");
		System.out.println("After hover: " + bgColor);
		//driver.close();
	}
}
