package com.mytra;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mytra {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Saranya R.S\\eclipse-workspace\\ChromeButton\\driver\\chromedriver.exe");
		WebDriver shop = new ChromeDriver();
		shop.get("https://www.myntra.com/register?referer=https://www.myntra.com/");
		String url = shop.getCurrentUrl();
		System.out.println(url);
		String title = shop.getTitle();
		System.out.println(title);
		WebElement txtPhnNo = shop.findElement(By.xpath("//input[@type='tel']"));
		txtPhnNo.sendKeys("7010008451");
		WebElement btnSub = shop.findElement(By.xpath("//div[@class='submitBottomOption']"));
		btnSub.click();
		shop.manage().window().maximize();
		shop.close();			
	}

}
