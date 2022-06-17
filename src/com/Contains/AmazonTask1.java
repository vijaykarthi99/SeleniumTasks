package com.Contains;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonTask1 {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"D:\\JavaClassProjectsEclipse\\SeleniumTasks\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();

		WebElement LastText = driver.findElement(By.xpath("//a[contains(text(),'Conditions of Use & Sale')]"));

		String text = LastText.getText();
		System.out.println(text);

	}

}
