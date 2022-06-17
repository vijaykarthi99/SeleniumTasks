package DoubleClickTask1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GreensCartTask1 {
	public static void main(String[] args) throws AWTException, InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"D:\\JavaClassProjectsEclipse\\SeleniumTasks\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.navigate().to("http://greenscart.in/#/login?returnUrl=%2F");
		Thread.sleep(3000);

		WebElement txtName = driver.findElement(By.xpath("(//input[@type='text'])[1]"));

		txtName.sendKeys("vijaymani.1699@gmail.com");

		WebElement txtpass = driver.findElement(By.xpath("(//input[@type='password'])[1]"));

		txtpass.sendKeys("Greens@123");

		WebElement btnlogin = driver.findElement(By.xpath("(//input[@type='submit'])[2]"));

		btnlogin.click();
Thread.sleep(3000);

//Robot robot = new Robot();
		
		WebElement btnmobil = driver.findElement(By.id("typeahead-basic"));

		btnmobil.sendKeys("Apple iPhone 12 Pro Max");
		
				
		WebElement btnsearch = driver.findElement(By.xpath("//button[@class='btn btn-outline-secondary']"));

		btnsearch.click();
		Thread.sleep(3000);
		
		WebElement btncart = driver.findElement(By.xpath("//button[text()='Add to cart']"));

		btncart.click();
		
		
		
		
//	
//	robot.keyPress(KeyEvent.VK_TAB);
//	robot.keyRelease(KeyEvent.VK_TAB);
	
	Thread.sleep(3000);
	
	WebElement go = driver.findElement(By.xpath("(//a[@class=\"nav-link\"])[8]"));
go.click();



	WebElement btngift = driver.findElement(By.xpath("(//button[@type='button'])[4]"));

	btngift.click();
	Thread.sleep(5000);
//	WebElement code1 = driver.findElement(By.xpath("//span[text()='GRNSHIP']"));
	Actions actions = new Actions(driver);
//	actions.doubleClick(code1).perform();
//	
	
	WebElement code2 = driver.findElement(By.xpath("//span[text()='FLAT1000']"));
	
	actions.doubleClick(code2).perform();
	
//	WebElement code3 = driver.findElement(By.xpath("//span[text()='GRNSHIP']"));
//	actions.doubleClick(code3).perform();
	Thread.sleep(3000);

WebElement cancel = driver.findElement(By.xpath("//span[text()='×']"));
	
	actions.contextClick(cancel).perform();
	
WebElement remove = driver.findElement(By.xpath("//div[text()='Remove Promo Code ']"));
	
	actions.click(remove).perform();
	
	
	
	
	
	
	
	
	
	
	

	
	}

}
