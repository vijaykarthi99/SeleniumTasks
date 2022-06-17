package com.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdactinhotelTAsk10 {
	
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\JavaClassProjectsEclipse\\SeleniumTasks\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("http://adactinhotelapp.com/");
		driver.manage().window().maximize();
		
		//insert id="username"
//		WebElement txtUseName = driver.findElement(By.id("username"));
//		
//		txtUseName.sendKeys("Vijay_99");
		
		// insert valeu "password"
		
//		WebElement txtpassword = driver.findElement(By.id("password"));
//		
//		txtpassword.sendKeys("12345678912@");
//		
//		WebElement txtloginforgot = driver.findElement(By.xpath("//div[@ class='login_forgot']"));
//		txtloginforgot.click();
		
//		WebElement txtemailaddrecovery = driver.findElement(By.id("emailadd_recovery"));
//		txtemailaddrecovery.sendKeys("vijaymani@gmail.com");
		
		///Click()
		WebElement btnNewlogin = driver.findElement(By.xpath("//strong[text()='Go to Build 2 ']"));
		
		btnNewlogin.click();
		WebElement txtUseName = driver.findElement(By.id("username"));
		
		txtUseName.sendKeys("test username");
		WebElement txtpassword = driver.findElement(By.id("password"));
		
		txtpassword.sendKeys("test password");
		
WebElement btnNewlogin1 = driver.findElement(By.xpath("//strong[text()='Go to Build 2 ']"));
		
		btnNewlogin1.click();
		
		
		
		
		
		
		
	}

}
