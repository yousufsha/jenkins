package com.task3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DropAndDrag {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Saranya R.S\\eclipse-workspace\\ChromeButton\\driver\\chromedriver.exe");
		WebDriver drop = new ChromeDriver();
		drop.manage().window().maximize();
		drop.get("https://demo.guru99.com/test/drag_drop.html");
		
		WebElement s1 = drop.findElement(By.xpath("(//a[@class='button button-orange'])[5]"));
		WebElement d1 = drop.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		
		WebElement s2 = drop.findElement(By.xpath("(//a[@class='button button-orange'])[4]"));
		WebElement d2 = drop.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
		
		WebElement s3 = drop.findElement(By.xpath("(//a[@class='button button-orange'])[6]"));
		WebElement d3 = drop.findElement(By.xpath("(//li[@class='placeholder'])[3]"));

		WebElement s4 = drop.findElement(By.xpath("(//a[@class='button button-orange'])[4]"));
		WebElement d4 = drop.findElement(By.xpath("(//li[@class='placeholder'])[4]"));
		
		Actions actions = new Actions(drop);
		
		actions.dragAndDrop(s1, d1).perform();
		actions.dragAndDrop(s2, d2).perform();
		actions.dragAndDrop(s3, d3).perform();
		actions.dragAndDrop(s4, d4).perform();
	}

}
