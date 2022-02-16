package com.task2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IciciDebug {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Saranya R.S\\eclipse-workspace\\Chrome\\driver\\chromedriver.exe");
	WebDriver icici = new ChromeDriver();
	icici.manage().window().maximize();
	icici.get("https://infinity.icicibank.com/corp/AuthenticationController?FORMSGROUP_ID__=AuthenticationFG&__START_TRAN_FLAG__=Y&FG_BUTTONS__=LOAD&ACTION.LOAD=Y&AuthenticationFG.LOGIN_FLAG=1&BANK_ID=ICI");	
	Thread.sleep(3000);
	String title = icici.getTitle();
	System.out.println(title);
	String currentUrl = icici.getCurrentUrl();
	System.out.println(currentUrl);
	WebElement txtUserName = icici.findElement(By.name("DUMMY1"));
	txtUserName.click();
	WebElement txtuser = icici.findElement(By.xpath("//input[@name='AuthenticationFG.USER_PRINCIPAL']"));
	txtuser.sendKeys("yousuf shameem");
	WebElement txtpass = icici.findElement(By.xpath("//input[@name='AuthenticationFG.ACCESS_CODE']"));
//	Thread.sleep(3000);
	txtpass.sendKeys("yousuf@123");
	WebElement btnlog = icici.findElement(By.xpath("//input[@onclick='return feba.js.adaptive.icici.onLoginSubmit(this.id);']"));
	btnlog.click();
//   icici.quit();
	}

}
