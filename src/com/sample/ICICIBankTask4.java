package com.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ICICIBankTask4 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"D:\\JavaClassProjectsEclipse\\SeleniumTasks\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		// page Open
		driver.get("https://infinity.icicibank.com/corp/Login.jsp");

		// id="HDisplay1.Rb14.C2"
		WebElement txtUserId = driver.findElement(By.xpath("//input[@type='text']"));
		// insert value
		txtUserId.sendKeys("1289034");
		WebElement click = driver.findElement(By.id("HDisplayDefault.Rb14.C3"));
		click.click();

		WebElement txtuser = driver.findElement(By.name("AuthenticationFG.USER_PRINCIPAL"));
		txtuser.sendKeys("anand");

		// id="password"

		WebElement txtPassword = driver.findElement(By.xpath("//input[@id='AuthenticationFG.ACCESS_CODE']"));

		// click

		// insert
		txtPassword.sendKeys("Vijay@123vj");

		WebElement click1 = driver.findElement(By.xpath("//input[@name='Action.VALIDATE_CREDENTIALS']"));
		click1.click();

		// Close Page
		// driver.quit();

	}

}
