package com.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SnapdealTask7 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"D:\\JavaClassProjectsEclipse\\SeleniumTasks\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.snapdeal.com/login");

		// find id="userName"

		WebElement txtUsername = driver.findElement(By.id("userName"));

		// to send value

		txtUsername.sendKeys("vijaymani@gmail.com");

	}

}
