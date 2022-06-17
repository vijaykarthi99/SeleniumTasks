package com.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationDemoTask9 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"D:\\JavaClassProjectsEclipse\\SeleniumTasks\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://demo.automationtesting.in/Register.html");

		WebElement txtFirstname = driver.findElement(By.name("First Name"));

		txtFirstname.sendKeys("vijaymani");

		WebElement txtLastname = driver.findElement(By.name("Last Name"));

		txtLastname.sendKeys("Ganesan");

		WebElement txtAdress = driver.findElement(By.name("Adress"));

		txtAdress.sendKeys("Salem-637504");

	
		WebElement txtLanguage = driver.findElement(By.id("submitbtn"));

		txtLanguage.click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
