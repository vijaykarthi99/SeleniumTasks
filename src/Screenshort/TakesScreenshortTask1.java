package Screenshort;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.DriverManager;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TakesScreenshortTask1 {

	public static void main(String[] args) throws AWTException, IOException {

		System.setProperty("webdriver.chrome.driver",
				"D:\\JavaClassProjectsEclipse\\SeleniumTasks\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.navigate().to("https://amazon.in");

		WebElement txtGmail = driver.findElement(By.id("twotabsearchtextbox"));
		txtGmail.sendKeys("moto g40 fusion mobile");

		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

		WebElement btnNew = driver
				.findElement(By.xpath("//span[text()='MOTOROLA G40 Fusion (Frosted Champagne, 128 GB) (6 GB RAM)']"));
		btnNew.click();

		robot.keyPress(KeyEvent.VK_PAGE_DOWN);

		robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
		TakesScreenshot t = (TakesScreenshot) driver;
		File as = t.getScreenshotAs(OutputType.FILE);
		System.out.println(as);

		FileUtils.copyFile(as, new File("D:\\Vijay\\SeleniumScrShot\\amazon.jpeg"));

	}

}
