package com.train;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Train {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Saranya R.S\\eclipse-workspace\\ChromeButton\\driver\\chromedriver.exe");
	WebDriver train = new ChromeDriver();
	train.get("https://www.cleartrip.com/trains");
	String title = train.getTitle();
	System.out.println(title);
	String url = train.getCurrentUrl();
	System.out.println(url);
	WebElement fromSt = train.findElement(By.id("from_station"));
	fromSt.sendKeys("Chennai");
	WebElement toSt = train.findElement(By.id("to_station"));
	toSt.sendKeys("Tirunelveli");
	WebElement date = train.findElement(By.xpath("//input[@title='Journey date']"));
	date.sendKeys("14/01/2022");
	WebElement btnSrch = train.findElement(By.xpath("//button[@id='trainFormButton']"));
	btnSrch.click();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
		
		
		
		
		
		
		
	
	
	
	}
		
}
