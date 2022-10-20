package day1.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenPageAssign {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\workspace\\Salenium\\executable\\chromedriver.exe");
		WebDriver drive=new ChromeDriver();
				drive.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		drive.get("http://opensource-demo.orangehrmlive.com");
				WebElement userNameInputField=drive.findElement(By.name("username"));
		userNameInputField.sendKeys("admin");
				WebElement password=drive.findElement(By.name("password"));
		password.sendKeys("Admin123");
				drive.findElement(By.className("oxd-button oxd button--medium--mainorangehrem-login-button")).click();
	
	}
	

}
