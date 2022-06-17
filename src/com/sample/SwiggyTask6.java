package com.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwiggyTask6 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"D:\\JavaClassProjectsEclipse\\SeleniumTasks\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.swiggy.com/");
		// find id="location"
		WebElement txtLocation = driver.findElement(By.id("location"));

		// insert location
		txtLocation.sendKeys("Customs Colony, Thoraipakkam");

	}
}
