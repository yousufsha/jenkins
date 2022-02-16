package com.demoautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoAutomation {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Saranya R.S\\eclipse-workspace\\ChromeButton\\driver\\chromedriver.exe");
		WebDriver demo = new ChromeDriver();
		demo.get("http://demo.automationtesting.in/Register.html");
		String title = demo.getTitle();
		System.out.println(title);
		String url = demo.getCurrentUrl();
		System.out.println(url);
		WebElement txtFstName = demo.findElement(By.xpath("//input[@placeholder='First Name']"));
		txtFstName.sendKeys("yousuf");
		WebElement txtLstName = demo.findElement(By.xpath("//input[@placeholder='Last Name']"));
		txtLstName.sendKeys("shameem");
		WebElement txtAdd = demo.findElement(By.xpath("//textarea[@rows='3']"));
		txtAdd.sendKeys("109, barakatha nagar, tirunelveli");
		WebElement txtMail = demo.findElement(By.xpath("//input[@type='email']"));
		txtMail.sendKeys("yousufshameem9@gmail.com");
		WebElement txtPhn = demo.findElement(By.xpath("//input[@type='tel']"));
		txtPhn.sendKeys("7010008454");
		WebElement radioBtu = demo.findElement(By.xpath("//input[@value='Male']"));
		radioBtu.click();
		WebElement checkBox = demo.findElement(By.xpath("//input[@value='Cricket']"));
		checkBox.click();
		WebElement checkBox2 = demo.findElement(By.xpath("//input[@value='Movies']"));
		checkBox2.click();
		WebElement checkBox3 = demo.findElement(By.xpath("//input[@value='Hockey']"));
		checkBox3.click();
		WebElement txtLagu = demo.findElement(By.xpath("//div[@id='msdd']"));
		txtLagu.sendKeys("English");
		WebElement txtSkills = demo.findElement(By.xpath("//select[@id='Skills']"));
		txtSkills.sendKeys("Linux");
		WebElement txtCntry = demo.findElement(By.xpath("//select[@id='countries']"));
		txtCntry.sendKeys("india");
		WebElement txtCnty = demo.findElement(By.xpath("//span[@id='select2-country-container']"));
		txtCnty.sendKeys("india");
		WebElement txtYear = demo.findElement(By.xpath("//select[@id='yearbox']"));
		txtYear.sendKeys("1999");
		WebElement txtMonth = demo.findElement(By.xpath("//select[@placeholder='Month']"));
		txtMonth.sendKeys("06");
		demo.close();
	}
}
