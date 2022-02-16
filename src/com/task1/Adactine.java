package com.task1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Adactine {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Saranya R.S\\eclipse-workspace\\ChromeButton\\driver\\chromedriver.exe");
		WebDriver adac = new ChromeDriver();
		adac.get("https://adactinhotelapp.com/");
		
		WebElement loc = adac.findElement(By.xpath("//p[contains(text(),'Adactin Launches The Adactin Hotel App! ')]"));
		String text = loc.getText();
		System.out.println(text);
	}
}
