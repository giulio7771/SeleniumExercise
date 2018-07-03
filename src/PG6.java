import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class PG6 {
	public static void execute() {
		String baseUrl = "https://getbootstrap.com/docs/4.0/components/buttons/";
		System.setProperty("webdriver.chrome.driver", "Libraries\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://facebook.com");
		
		WebElement field = driver.findElement(By.id("email"));
		
		Actions builder = new Actions(driver);
		Action acao = builder.moveToElement(field).click().keyDown(field, Keys.SHIFT).sendKeys(field, "hell").keyUp(field, Keys.SHIFT).doubleClick().contextClick().build();
		acao.perform();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.close();
		driver.quit();

	}
}
