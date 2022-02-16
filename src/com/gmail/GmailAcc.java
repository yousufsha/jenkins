package com.gmail;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class GmailAcc {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Saranya R.S\\eclipse-workspace\\ChromeButton\\driver\\chromedriver.exe");
		WebDriver acc = new ChromeDriver();
		acc.get("https://accounts.google.com/signup/v2/webcreateaccount?hl=en&flowName=GlifWebSignIn&flowEntry=SignUp");
		String title = acc.getTitle();
		System.out.println(title);
		String url = acc.getCurrentUrl();
		System.out.println(url);
		WebElement txtFirstName = acc.findElement(By.xpath("//input[@id='firstName']"));
		txtFirstName.sendKeys("yousuf");
		WebElement txtLastName = acc.findElement(By.xpath("//input[@id='lastName']"));
		txtLastName.sendKeys("Shameem");
		WebElement txtUserMail = acc.findElement(By.xpath("//input[@autocomplete='username']"));
		txtUserMail.sendKeys("sxckjudch8745b474");
		WebElement TxtNewPass = acc.findElement(By.xpath("//input[@autocomplete='new-password'][1]"));
		TxtNewPass.sendKeys("1230987asdfg");
		WebElement txtConfmPass = acc.findElement(By.xpath("//input[@name='ConfirmPasswd']"));
		txtConfmPass.sendKeys("1230987asdfg");
		String attribute = txtConfmPass.getAttribute("value");
		System.out.println(attribute);
		WebElement boxShowPass = acc.findElement(By.xpath("//input[@id='i3']"));
		boxShowPass.click();
		WebElement btnNxt = acc.findElement(By.xpath("//span[@jsname='V67aGc'][3]"));
		btnNxt.click();	
	}

}
