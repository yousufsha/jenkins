package com.amazon;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PhoneSearch {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Saranya R.S\\eclipse-workspace\\ChromeButton\\driver\\chromedriver.exe");
    WebDriver drive = new ChromeDriver();
    drive.get("https://www.amazon.in/");
    drive.manage().window().maximize();
	
	WebElement txtPhnSrch = drive.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
	txtPhnSrch.sendKeys("motorola zplay");
	
	WebElement btnSrch = drive.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
	btnSrch.click();
	
	WebElement clickPhn = drive.findElement(By.xpath("//span[text()='Motorola Other for Moto Z, Moto Z Play, Moto Z2 Force - Black']"));
	clickPhn.click();
	
	String pwid = drive.getWindowHandle();
	System.out.println(pwid);
	
	Set<String> allWid = drive.getWindowHandles();
	System.out.println(allWid);
	
	for (String eachWindoe : allWid) {
		if (pwid!=eachWindoe) {
			drive.switchTo().window(eachWindoe);
		}
	}
	WebElement addCart = drive.findElement(By.id("add-to-cart-button"));
	addCart.click();
	
	drive.findElement(By.xpath("(//span[text()=' Skip '])[2]"));
	
	drive.switchTo().window(pwid);
	WebElement onePlus = drive.findElement(By.xpath("(//a[@target='_blank'])[13]"));
	onePlus.click();
	
//	drive.quit();
	}
}
