import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.FindElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PG10 {
	public static void execute() {
		System.setProperty("webdriver.chrome.driver", "Libraries\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("C:/Users/ggiovanella/eclipse-workspace/SeleniumTesting/src/paginaAlert.html");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		WebElement linkElement = driver.findElement(By.linkText("this is a link"));
		Actions builder = new Actions(driver);
		// 1 approach failed
		// builder.moveToElement(driver.findElement(By.linkText("this is a
		// link"))).contextClick().sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.RETURN).build().perform();

		// 2 approach failed
		// builder.moveToElement(linkElement);
		// builder.contextClick(linkElement).build().perform();
		// WebDriverWait wait = new WebDriverWait(driver, 5);
		// By locator = By.partialLinkText("Abrir link em uma nova guia");
		// wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		// WebElement elementOpen = driver.findElement(locator);

		// 3 approach failed
		// By locator = By.cssSelector(".context-menu-one.box");
		// WebDriverWait wait = new WebDriverWait(driver, 5);
		// wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		// WebElement menu = driver.findElement(locator);
		// builder.moveToElement(menu).contextClick().build().perform();
		// WebElement menuItem = driver.findElement(By.linkText("Abrir em uma nova
		// guia"));
		// menuItem.click();
		//
		// 4 approach successful

		builder.keyDown(Keys.LEFT_CONTROL).click(linkElement).keyUp(Keys.LEFT_CONTROL).build().perform();

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}

		String mainWindow = driver.getWindowHandle();

		Set<String> s1 = driver.getWindowHandles();

		for (String handle : s1) {
			driver.switchTo().window(handle);
		}

		try {
			Thread.sleep(1500);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		WebElement link2 = driver.findElement(By.linkText("this is a link"));
		builder.keyDown(Keys.LEFT_CONTROL).click(link2).keyUp(Keys.LEFT_CONTROL).build().perform();

		s1 = driver.getWindowHandles();


		for (String handle : s1) {
			driver.switchTo().window(handle);
		}

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		driver.close();
		driver.quit();
	}
}
