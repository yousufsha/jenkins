package com.task4;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot {
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Saranya R.S\\eclipse-workspace\\ChromeButton\\driver\\chromedriver.exe");
		WebDriver page = new ChromeDriver();
		page.manage().window().maximize();
		page.get("https://www.moneycontrol.com/markets/fno-market-snapshot");
		
		Thread.sleep(5000);
		WebElement fno = page.findElement(By.xpath("(//div[@class='leftD'])[2]"));
		Thread.sleep(5000);
		File s = fno.getScreenshotAs(OutputType.FILE);
		File d = new File("D:\\linux\\MC.png");
		FileUtils.copyFile(s, d);
	}
}
