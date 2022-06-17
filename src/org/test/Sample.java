package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver",
			"D:\\JavaClassProjectsEclipse\\SeleniumTasks\\Driver\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();
	driver.navigate().to("https://www.amazon.in/");
	driver.manage().window().maximize();
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone13",Keys.ENTER);
	WebElement rate = driver.findElement(By.xpath("(//span[text()='4.7 out of 5 stars'])[1]"));
	System.out.println(rate.getAttribute("a-icon-alt"));
	System.out.println(rate.getText());
	
}
}

