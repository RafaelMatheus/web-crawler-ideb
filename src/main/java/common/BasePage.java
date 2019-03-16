package common;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import webcrawler.Config;

public class BasePage {
	private WebDriver driver;

	public WebDriver getPage() {
		return driver;
	}

	public void setup() {
		System.setProperty("webdriver.chrome.driver", Config.chromeDrive);
		driver = new ChromeDriver();
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
		js.executeScript("var evt = document.createEvent('MouseEvents');" + 
		"evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);" + 
				"arguments[0].dispatchEvent(evt);", element);
	}
}
