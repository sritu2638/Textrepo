package day1.selenium;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalanderHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String driverPath=System.getProperty("user.dir")+"\\executable\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",driverPath);
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://www.makemytrip.com");
		try {
			driver.findElement(By.cssSelector("li[data-cy='outsideModel']")).click();
	
		}catch(NoSuchElementException e)
		{
		}
		driver.findElement(By.cssSelector("label[for='departure']")).click();
		driver.findElement(By.cssSelector("div.dayPicker-months>*:last-child>.DayPicker-body>div:nth-of-type(2)>*:nth-child(2)>"
				+ "div>p")).click();
				
		}
	}


