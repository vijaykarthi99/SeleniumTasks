package com.Contains;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdactinTask2 {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "D:\\JavaClassProjectsEclipse\\SeleniumTasks\\Driver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("http://adactinhotelapp.com/");
	WebElement textFirst = driver.findElement(By.xpath("//p[contains(text(),'Adactin Launches The Adactin Hotel App!')]"));
	String text = textFirst.getText();
	System.out.println(text);
}
}
