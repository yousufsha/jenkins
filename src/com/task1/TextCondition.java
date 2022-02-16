package com.task1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextCondition {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Saranya R.S\\eclipse-workspace\\ChromeButton\\driver\\chromedriver.exe");
		WebDriver amazon =new ChromeDriver();
		amazon.get("https://www.amazon.in/");
		
		WebElement loc = amazon.findElement(By.xpath("//a[text()='Conditions of Use & Sale']"));
		String text = loc.getText();
		
		System.out.println(text);
		
	}

}