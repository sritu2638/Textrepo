package day1.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//step 1
		System.setProperty("webdriver.chrome.driver","D:\\workspace\\Salenium\\executable\\chromedriver.exe");
		WebDriver drive=new ChromeDriver();
		//step 2
		drive.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		drive.get("http://demo.actitime.com/");
		//step 3
		WebElement userNameInputField=drive.findElement(By.id("username"));
		userNameInputField.sendKeys("admin");
		//step 4
		WebElement password=drive.findElement(By.name("pwd"));
		password.sendKeys("manager");
		//step5
		drive.findElement(By.id("loginButton")).click();
		//step6
		String exceptedTitle="actiTIME-Enter Time-Track";
		String actualTitle=drive.getTitle();
		System.out.println("excepted Title is"+exceptedTitle);
		System.out.println("actuel Title is :"+actualTitle);
		if(actualTitle.equals(exceptedTitle))
		{
			System.out.println("login validation is passed");
			
		}else
		{
			System.out.println("login validation is failed");
			
		}
		drive.findElement(By.id("logoutLink")).click();
		
		
		
		
		
		

	}

}
