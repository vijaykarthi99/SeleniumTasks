package com.Day2Tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationtestingTask3 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"D:\\JavaClassProjectsEclipse\\SeleniumTasks\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://demo.automationtesting.in/Register.html");

		WebElement txtFirstname = driver.findElement(By.xpath("//input[@placeholder='First Name']"));

		txtFirstname.sendKeys("vijaymani");

		WebElement txtLastname = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));

		txtLastname.sendKeys("Ganesan");

		WebElement txtAdress = driver.findElement(By.xpath("//textarea[@ng-model='Adress']"));

		txtAdress.sendKeys("Salem-637504");

		WebElement txtEmail = driver.findElement(By.xpath("//input[@ng-model='EmailAdress']"));

		txtEmail.sendKeys("vijaymani@gmail.com");
		WebElement txtPhone = driver.findElement(By.xpath("//input[@ng-model='Phone']"));

		txtPhone.sendKeys("7865890043");
		WebElement txtGender = driver.findElement(By.xpath("//input[@value='Male']"));

		txtGender.click();
		WebElement txtCricket = driver.findElement(By.id("checkbox1"));

		txtCricket.click();
		
		WebElement txtMovies = driver.findElement(By.id("checkbox2"));

		txtMovies.click();
		
		WebElement txtHockey = driver.findElement(By.id("checkbox3"));

		txtHockey.click();
		WebElement txtLanguage = driver.findElement(By.id("msdd"));

		txtLanguage.click();
		
		
		WebElement btnclick = driver.findElement(By.id("submitbtn"));

		btnclick.click();
		
		
		
		
		

	}

}
