package com.Day2Tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBookTask2 {
	
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"D:\\JavaClassProjectsEclipse\\SeleniumTasks\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");
		

		WebElement txtUserName = driver.findElement(By.xpath("//input[@id='email']"));
	
		txtUserName.sendKeys("Vijay");

		
		WebElement txtPassword = driver.findElement(By.xpath("//input[@id='pass']"));
		
		txtPassword.sendKeys("123456781234445");
		
WebElement btnClick = driver.findElement(By.xpath("//button[@value='1']"));
		
		btnClick.click();


	}


}
