package com.Day2Tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class AmazionTask1 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"D:\\JavaClassProjectsEclipse\\SeleniumTasks\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.in/");
		// find id="location"
		WebElement txtLocation = driver.findElement(By.id("twotabsearchtextbox"));

		// insert location
		txtLocation.sendKeys("iphone");
		
		// find id="location"
				WebElement btnclick = driver.findElement(By.id("nav-search-submit-button"));

				// insert location
				btnclick.click();
	}
}


