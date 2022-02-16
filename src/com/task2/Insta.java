package com.task2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Insta {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Saranya R.S\\eclipse-workspace\\Chrome\\driver\\chromedriver.exe");
		WebDriver insta = new ChromeDriver();
	    insta.get("https://www.instagram.com/accounts/login/?hl=en) login page");
	String title = insta.getTitle();
	         System.out.println(title);
	String url = insta.getCurrentUrl();
	        System.out.println(url);
	        Thread.sleep(4000);
   WebElement txtUserName = insta.findElement(By.xpath("//input[@aria-label='Phone number, username, or email']"));
	         txtUserName.sendKeys("Ybhdsfh_hbr");
   WebElement txtpass = insta.findElement(By.xpath("//input[@aria-label='Password']"));
            txtpass.sendKeys("uhehafiae");
    WebElement btnLogin = insta.findElement(By.xpath("//div[text()='Log In']"));
    btnLogin.click();
    insta.manage().window().maximize();	
    Thread.sleep(2000);
	insta.close();	}
}

