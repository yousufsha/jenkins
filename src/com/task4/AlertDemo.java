package com.task4;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemo {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Saranya R.S\\eclipse-workspace\\ChromeButton\\driver\\chromedriver.exe");
		WebDriver alrt = new ChromeDriver();
		alrt.manage().window().maximize();
		
		alrt.get("http://demo.automationtesting.in/Alerts.html");
		Thread.sleep(2000);
		
		Robot robot = new Robot();
		
		for (int i = 1; i < 15; i++) {
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		}
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		
		WebElement btnPromptBox = alrt.findElement(By.xpath("//button[contains(text(),'demonstrate')]"));
		btnPromptBox.click();
		
		Alert alert = alrt.switchTo().alert();
		alert.sendKeys("Mohamed Yousuf Shameem");
		alert.accept();
		
		Thread.sleep(3000);
		
		WebElement txt = alrt.findElement(By.xpath("//*[@id=\"demo1\"]"));
		String text = txt.getText();
		System.out.println(text);
		
//		alrt.close();
		
	}

}
