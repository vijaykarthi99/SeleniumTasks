package WindowsHandling;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"D:\\JavaClassProjectsEclipse\\SeleniumTasks\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		WebElement escap = driver.findElement(By.xpath("//button[text()='✕']"));
		escap.click();
		WebElement search = driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']"));
		search.sendKeys("mobiles",Keys.ENTER);
		WebElement selectMobile = driver.findElement(By.xpath("//div[text()='POCO X4 Pro 5G (Laser Blue, 128 GB)']"));
		selectMobile.click();
		
		String pwin1 = driver.getWindowHandle();
		System.out.println(pwin1);
		Set<String> cwin2 = driver.getWindowHandles();
		System.out.println(cwin2);
		for (String win : cwin2) {
			
			if (!(pwin1.equals(win))) {
				driver.switchTo().window(win);
		
			}
			
		}
		
		WebElement changeRam = driver.findElement(By.xpath("//div[text()='8 GB']"));
		changeRam.click();
	}


}