package com.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBookTask1 {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"D:\\JavaClassProjectsEclipse\\SeleniumTasks\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");
		// id="email"

		WebElement txtUserName = driver.findElement(By.id("email"));
		// insert
		txtUserName.sendKeys("Vijay");

		// id="pass"
		WebElement txtPassword = driver.findElement(By.id("pass"));
		// insert
		txtPassword.sendKeys("12345678@");

	}

}
