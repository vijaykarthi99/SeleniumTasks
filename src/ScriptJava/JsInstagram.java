package ScriptJava;

import java.time.Duration;
import org.openqa.selenium.*;
//import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
	
public class JsInstagram {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"D:\\JavaClassProjectsEclipse\\SeleniumTasks\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.instagram.com/accounts/login/?hl=en");
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(150));
		WebElement txtname = driver.findElement(By.name("username"));
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].setAttribute('value','vijaymani$insta')", txtname);
		Object name = executor.executeScript("return arguments[0].getAttribute('value')", txtname);
		System.out.println(name);

		WebElement txtpass = driver.findElement(By.name("password"));
		executor.executeScript("arguments[0].setAttribute('value','atsni$inamyajiv')", txtpass);
		Object pass = executor.executeScript("return arguments[0].getAttribute('value')", txtpass);
		System.out.println(pass);

		WebElement btnlogin = driver.findElement(By.xpath("//div[text()='Log In']"));
		executor.executeScript("arguments[0].click()",btnlogin);
		
//		WebElement btnlogin = driver.findElement(By.xpath("//span[text()='Sign up']"));
//		executor.executeScript("arguments[0].click()",btnlogin);
//		driver.navigate().back();
		

	}

}
