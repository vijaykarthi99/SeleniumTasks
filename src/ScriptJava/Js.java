package ScriptJava;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Js {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"D:\\JavaClassProjectsEclipse\\SeleniumTasks\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/");
		driver.manage().window().maximize();

		WebElement txtname = driver.findElement(By.id("email"));
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		
		executor.executeScript("arguments[0].setAttribute('value','Vijay')", txtname);
		Object name = executor.executeScript("return arguments[0].getAttribute('value')", txtname);
		System.out.println(name);

		WebElement txtpass = driver.findElement(By.id("pass"));
		executor.executeScript("arguments[0].setAttribute('value','vijay12456#@!')", txtpass);
		Object pass = executor.executeScript("return arguments[0].getAttribute('value')", txtpass);
		System.out.println(pass);

		WebElement btnlogin = driver.findElement(By.name("login"));
		executor.executeScript("arguments[0].click()", btnlogin);

	}
}
