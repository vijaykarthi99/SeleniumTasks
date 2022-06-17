package adactinHotel;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;

import java.util.Set;

import javax.sql.rowset.WebRowSet;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class BaseClass {
	public static WebDriver driver;

	public void launchURL(String url) {
		
		driver = new ChromeDriver();
		driver.get(url);
		driver.navigate();
		driver.manage().window().maximize();
	}

	public WebElement findLocator(String locator, String value) {

		WebElement element = null;
		switch (locator) {

		case "id":

			element = driver.findElement(By.id(value));
			break;
		case "name":

			element = driver.findElement(By.name(value));
			break;
		case "xpath":

			element = driver.findElement(By.xpath(value));
			break;

		default:
			break;
		}
		return element;

	}

	public void userName(WebElement element, String data) {
		element.sendKeys(data);
	}

	public void userPass(WebElement element1, String data1) {
		element1.sendKeys(data1);
	}

	public void btnLogin(WebElement element) {
		element.click();
	}

	public void createNewUserName(WebElement element, String data, WebElement element2, String data2) {
		element.sendKeys(data);
		element2.sendKeys(data2);
	}

	public void mobile(WebElement element, String no) {
		element.sendKeys(no);
	}

	public void Password(WebElement element, String pass) {
		element.sendKeys(pass);
	}

	public void sendKeys(WebElement element, String sendkeys) {
		element.sendKeys(sendkeys);
	}

	public void dropAndDown(WebElement element) {
		Select select = new Select(element);
		List<WebElement> options = select.getOptions();

	}

	public void windowHandle() {
		String w1 = driver.getWindowHandle();
		System.out.println(w1);
		Set<String> w2 = driver.getWindowHandles();
		System.out.println(w2);
		for (String win : w2) {
			if (!(win.equals(w2))) {
				driver.switchTo().window(win);
			}

		}

	}
	
	
	public void screenshot(String srclocation) throws IOException {
		TakesScreenshot src = (TakesScreenshot) driver;
		File as = src.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(as, new File(srclocation));

	}
	
	public void date() {
		Date date = new Date();
		System.out.println(date);
				
	}
	
	public void mouseOverAction() {
		
		

	}
	
	public void js(String string) {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].setAttribute('value','txtvalue')", string);
		executor.executeScript("return.getAttribute('')", string);

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
