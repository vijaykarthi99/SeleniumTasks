package com.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstragramTask8 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"D:\\JavaClassProjectsEclipse\\SeleniumTasks\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.instagram.com/accounts/login/?hl=en) login page");
	

		// feed the id="username" //input[@name='username']
		
		WebElement txtUsername = driver.findElement(By.name("username"));

		txtUsername.sendKeys("Vijay_99");

		// feed the id="pass"
	
		WebElement txtpassword = driver.findElement(By.name("password"));
		txtpassword.sendKeys("vijay@1239#3219");
driver.close();

		// to Click

		// WebElement txtsubmit = driver.findElement(By.id("submit"));
		// txtsubmit.click();
	}

}
