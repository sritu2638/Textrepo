package assignment.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipKart2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String chromeExePath=System.getProperty("user.dir")+"\\executable\\chromedriver.exe";
		System.setProperty("webdriver.driver.chrome",chromeExePath);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("http://www.flipkart.com");
		

	}

}
