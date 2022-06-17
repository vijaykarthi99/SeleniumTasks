package org.alerts;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Alertsboxs {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"D:\\JavaClassProjectsEclipse\\SeleniumTasks\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://demo.automationtesting.in/Alerts.html");

		driver.manage().window().maximize();

//		Actions action = new Actions(driver);
//		WebElement btn1 = driver.findElement(By.xpath("//a[contains(text(),'Alert with T')]"));
//		action.click(btn1).perform();
//		Robot robot = new Robot();
//
//		robot.keyPress(KeyEvent.VK_TAB);
//		robot.keyRelease(KeyEvent.VK_TAB);
//		robot.keyPress(KeyEvent.VK_ENTER);
//		robot.keyRelease(KeyEvent.VK_ENTER);
//
//		Alert alert = driver.switchTo().alert();
//		alert.sendKeys("Vijaymanigandan");
//		alert.accept();
//		WebElement txtbox = driver.findElement(By.id("demo1"));
//
//		String text = txtbox.getText();
//		System.out.println(text);

		
		
		
		
		
		
		
		
		
		
		
		
		
		 WebElement c1 = driver.findElement(By.xpath("(//a[@class='analystic'])[3]"));
		 c1.click();
		
		 WebElement c2 = driver
		 .findElement(By.xpath("//button[text()='click the button to demonstrate the prompt box ']"));
		 c2.click();
		
		 Alert al = driver.switchTo().alert();
		 al.sendKeys("praveekumar");
		 al.accept();
		 WebElement txt =
		 driver.findElement(By.xpath("//p[contains(text(),'Hello')]"));
		 String txt1 = txt.getText();
		
		 System.out.println(txt1);
		

	}

}









