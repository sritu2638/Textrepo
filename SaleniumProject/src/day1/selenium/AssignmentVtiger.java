package day1.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentVtiger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\workspace\\Salenium\\executable\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("http://demo.vtiger.com");
		String expectedTitle="Free Online CRM Demo";
	
		
		
		String actualTitle = driver.getTitle();
		System.out.println("excepted title is "+expectedTitle);
		System.out.println("actual Title is:"+actualTitle);
		if(actualTitle.equals(expectedTitle)) {
			System.out.println("validation is passed");
		}else {
			System.out.println("validation is faild");
		}

	}

}
