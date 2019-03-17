package common;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
	private WebDriver driver;

	public WebDriver getPage() {
		return driver;
	}

	public void setup() {
		ChromeOptions options = new ChromeOptions();
		options.setHeadless(Config.headless);
		System.setProperty("webdriver.chrome.driver", Config.chromeDrive);
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
	}

	public void get() {
		driver.get(Config.enderecoSite);
	}

	public void sendKey(WebElement elemento, String key) {
		elemento.sendKeys(key);
	}

	public void click(WebElement elemento) {
		elemento.click();
	}

	public void subimit(WebElement elemento) {
		elemento.submit();
	}

	public void clickJs(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("var evt = document.createEvent('MouseEvents');"
				+ "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);"
				+ "arguments[0].dispatchEvent(evt);", element);
	}

	public boolean isVisible() {
		boolean exists = true;
		try {
			getPage().findElement(By.xpath("//*[@id='contentContainer']/div[3]/div/div"));
		} catch (NoSuchElementException e) {
			exists = false;
		}
		return exists;
	}

	public void aguarElemento(By by) {
		WebDriverWait wait = new WebDriverWait(getPage(), 7000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(by));
	}
}
