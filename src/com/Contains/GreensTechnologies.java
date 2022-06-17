package com.Contains;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreensTechnologies {
public static void main(String[] args)  {
	System.setProperty("webdriver.chrome.driver", "D:\\JavaClassProjectsEclipse\\SeleniumTasks\\Driver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("http://www.greenstechnologys.com/selenium-placement-training-in-chennai.html");
	WebElement click1 = driver.findElement(By.id("overview-tab"));
	click1.click();
	
	
	WebElement TxtPara = driver.findElement(By.xpath("//p[contains(text(),'Greens Technologies')]"));
	
	String text = TxtPara.getText();
	System.out.println(text);
	
}
}
