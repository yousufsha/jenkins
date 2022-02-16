package com.task1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreensText {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Saranya R.S\\eclipse-workspace\\ChromeButton\\driver\\chromedriver.exe");
		WebDriver grns = new ChromeDriver();
		grns.get("http://greenstech.in/selenium-course-content.html");
		
		WebElement btn = grns.findElement(By.id("overview-tab"));
		btn.click();
		
		Thread.sleep(3000);
		WebElement para = grns.findElement(By.xpath("(//p[contains(text(),'Greens Technologies')])[1]"));
		String text = para.getText();
		System.out.println(text);	
		
	}
}
