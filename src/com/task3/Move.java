   package com.task3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Move {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Saranya R.S\\eclipse-workspace\\ChromeButton\\driver\\chromedriver.exe");
		WebDriver move = new ChromeDriver();
		move.manage().window().maximize();
		move.get("https://www.t-mobile.com/?src=spr&rdpage=%2F");
		
		Thread.sleep(3000);
		WebElement phn = move.findElement(By.xpath("//a[@class='nav__link ng-tns-c59-15']"));
		Actions actions = new Actions (move);
		actions.moveToElement(phn).perform();
		
		WebElement mob5g = move.findElement(By.xpath("//span[text()='5G phones']"));
		mob5g.click();
		
		WebElement txt = move.findElement(By.xpath("//a[text()=' Do Not Sell My Personal Information']"));
		String detail = txt.getText();
		System.out.println(detail);
	}
}
