package com.Day2Tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolsTak4 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"D:\\JavaClassProjectsEclipse\\SeleniumTasks\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://toolsqa.com/automation-practice-form");

		WebElement btnhomepage = driver.findElement(By.xpath("//a[@class='btn btn-primary-shadow btn-block']"));

		btnhomepage.click();

		WebElement btnenrol = driver.findElement(By.xpath("//a[@class='href=\"/selenium-training?q=banner#enroll-form\"']"));

		btnenrol.click();
		

		WebElement txtAdress = driver.findElement(By.xpath("//textarea[@nmae='firstName']"));

		txtAdress.sendKeys("Vijaymani");

		WebElement txtEmail = driver.findElement(By.xpath("//input[@name='lastName']"));

		txtEmail.sendKeys("Ganesan");
		WebElement txtPhone = driver.findElement(By.xpath("//input[@name='email']"));

		txtPhone.sendKeys("vijaymani@gmail.com");
		WebElement txtGender = driver.findElement(By.xpath("//input[@name='mobile']"));

		txtPhone.sendKeys("7865890043");
		WebElement txtCricket = driver.findElement(By.id("checkbox1"));

		txtCricket.click();
		
		
		
		
		WebElement btnclick = driver.findElement(By.id("submitbtn"));

		btnclick.click();
		
		
		
		
		

	}
	
	
}
