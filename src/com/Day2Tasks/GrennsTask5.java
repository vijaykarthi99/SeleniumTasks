package com.Day2Tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GrennsTask5 {


		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver",
					"D:\\JavaClassProjectsEclipse\\SeleniumTasks\\Driver\\chromedriver.exe");

			WebDriver driver = new ChromeDriver();

			driver.get("http://greenstech.in/selenium-course-content.html");

			WebElement btnclick = driver.findElement(By.id("heading20"));

			btnclick.click();

			WebElement btnclick2 = driver.findElement(By.xpath("//span[@class='fas fa-arrow-right']"));

			btnclick2.click();

		}
	
}
