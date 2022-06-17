package MouseOver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SprintTask2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"D:\\JavaClassProjectsEclipse\\SeleniumTasks\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.t-mobile.com/?src=spr&rdpage=/");
		driver.manage().window().maximize();

		Thread.sleep(6000);
		WebElement btnclick = driver.findElement(By.className("tntOverlayCloseBtn"));
		btnclick.click();

		WebElement popup = driver.findElement(By.xpath("//button[text()='Accept']"));
		popup.click();

		WebElement element = driver.findElement(By.xpath("//a[text()='Phones & devices']"));

		Actions actions = new Actions(driver);

		actions.moveToElement(element).perform();

		// WebElement elementClick = driver.findElement(By.xpath("//a[text()='5G
		// phones']"));

		WebElement btnclick2 = driver.findElement(By.xpath("//a[text()='5G phones']"));

		btnclick2.click();

		WebElement txtcopy = driver.findElement(By.xpath("//a[text()=' Do Not Sell My Personal Information']"));
		String text = txtcopy.getText();
		System.out.println(text);

	}

}
