package com.task4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleAndRightClick {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Saranya R.S\\eclipse-workspace\\ChromeButton\\driver\\chromedriver.exe");
		WebDriver dblrit = new ChromeDriver();
		dblrit.manage().window().maximize();
		dblrit.get("http://greenscart.in/#/");
		
		Thread.sleep(2000);
		WebElement txtUser = dblrit.findElement(By.xpath("//input[@formcontrolname='loginEmailId']"));
		Actions actions = new Actions(dblrit);
		actions.sendKeys(txtUser,"usufshameem47@gmail.com").perform();		

		WebElement txtPass = dblrit.findElement(By.xpath("//input[@formcontrolname='loginPassword']"));
		actions.sendKeys(txtPass,"Greenscart@47").perform();		
		
		Thread.sleep(4000);
		WebElement btnLogin = dblrit.findElement(By.xpath("//input[@value='Login']"));
		btnLogin.click();
		
		Thread.sleep(4000);
		WebElement txtSrch = dblrit.findElement(By.xpath("//input[@placeholder='Search Products']"));
		actions.sendKeys(txtSrch,"Apple Iphone 12").perform();
		
		Thread.sleep(4000);
		WebElement btnSrch = dblrit.findElement(By.xpath("(//button[@type='button'])[2]"));
		btnSrch.click();
		
		Thread.sleep(4000);
		WebElement imgIphn = dblrit.findElement(By.xpath("(//img[@tabindex='0'])[1]"));
		imgIphn.click();
		
		WebElement btnBuy = dblrit.findElement(By.xpath("//button[text()='Buy Now']"));
		btnBuy.click();

		WebElement btnGift = dblrit.findElement(By.xpath("//button[text()='ADD GIFT CODE']"));
		btnGift.click();
		
		Actions dbl = new Actions(dblrit);		
		
		WebElement btnCopun = dblrit.findElement(By.xpath("//span[text()='GRN10']"));
		dbl.doubleClick(btnCopun).perform();
		
		WebElement xClick = dblrit.findElement(By.xpath("//span[text()='×']"));
		dbl.contextClick(xClick).perform();	
		WebElement btnRemove = dblrit.findElement(By.xpath("//div[text()='Remove Promo Code ']"));
		btnRemove.click();
	}
}
