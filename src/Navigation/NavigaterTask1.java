package Navigation;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigaterTask1 {
	public static void main(String[] args) throws AWTException, InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"D:\\JavaClassProjectsEclipse\\SeleniumTasks\\Driver\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://accounts.google.com/signin/v2/identifier?flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		
		WebElement txtGmail = driver.findElement(By.xpath("//input[@type='email']"));
		txtGmail.sendKeys("aaaaaaaaaaaa");
		
		WebElement btnNext = driver.findElement(By.xpath("//span[text()='Next']"));
		btnNext.click();
//		Thread.sleep(6000);
//		driver.navigate().back();
		
		driver.navigate().refresh();
		
		WebElement btnNew = driver.findElement(By.xpath("(//span[@jsname='V67aGc'])[2]"));
		btnNew.click();
		
		
		
		Robot robot = new Robot();
		//DOWN
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		//Enter
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		driver.navigate().back();

	}

}
